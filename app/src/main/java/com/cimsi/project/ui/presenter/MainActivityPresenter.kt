package com.cimsi.project.ui.presenter

import com.cimsi.project.api.BikesServiceAPI
import com.cimsi.project.api.NetworkId
import com.cimsi.project.model.Network
import com.cimsi.project.ui.contracts.MainActivityContract
import kotlinx.coroutines.*
import org.osmdroid.util.GeoPoint
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(private val bikesApi: BikesServiceAPI) :
    MainActivityContract.Presenter {

    private lateinit var view: MainActivityContract.View
    private var stationsUpdater: Job? = null

    override fun attach(view: MainActivityContract.View) {
        this.view = view
    }

    override fun loadNetwork(networkId: NetworkId) {
        println("Loading city bikes network of $networkId...")
        CoroutineScope(Dispatchers.IO).launch {
            val response = try {
                bikesApi.loadNetwork(networkId.toString())
            } catch (e: Exception) {
                withContext(Dispatchers.Main) { callFailed(e.message) }
                null
            }

            withContext(Dispatchers.Main) {
                processMapUpdate(response?.network)
            }
        }
    }

    private fun processMapUpdate(network: Network?) = if (network != null) {
        try {
            view.updateMap(
                GeoPoint(network.location!!.latitude, network.location!!.longitude),
                network.stations
            )
        } catch (e: NullPointerException) {
            println("Response is incomplete.")
            callFailed("Response is incomplete.")
        }
    } else {
        println("Response is not available.")
        callFailed("Response is not available.")
    }

    override fun scheduleStationsUpdate(networkId: NetworkId, interval: Long, unit: TimeUnit) {
        stationsUpdater = CoroutineScope(Dispatchers.IO).launch {
            while (isActive) {
                println("Loading city bikes stations of $networkId...")
                val response = try {
                    bikesApi.loadStations(networkId.toString())
                } catch (e: Exception) {
                    withContext(Dispatchers.Main) { callFailed(e.message) }
                    println(e.message)
                    null
                }
                withContext(Dispatchers.Main) {
                    processStationsUpdate(response?.network)
                }
                delay(unit.toMillis(interval))
            }
        }
    }

    private fun processStationsUpdate(network: Network?) = network?.let {
        view.updateStations(network.stations)
    }

    private fun callFailed(message: String?) {
        println("Call to the City Bikes API failed: $message")
        view.showError()
    }

    override fun stopStationsUpdate() {
        runBlocking {
            stationsUpdater?.cancelAndJoin()
            stationsUpdater = null
        }
    }
}