package com.cimsi.project.ui

import com.cimsi.project.api.NetworkId
import com.cimsi.project.model.Station
import org.osmdroid.util.GeoPoint
import java.util.concurrent.TimeUnit

interface MainActivityContract {
    interface View {
        fun updateMap(centerPoint: GeoPoint, stations: List<Station>)
        fun updateStations(stations: List<Station>)
        fun showError()
    }

    interface Presenter : BasePresenter<View> {
        fun loadNetwork(networkId: NetworkId)
        fun scheduleStationsUpdate(networkId: NetworkId, interval: Long, unit: TimeUnit)
        fun stopStationsUpdate()
    }
}