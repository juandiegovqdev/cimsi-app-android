package com.cimsi.project.ui

import android.Manifest
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.cimsi.project.BuildConfig
import com.cimsi.project.MarkerDetailsDialog
import com.cimsi.project.R
import com.cimsi.project.api.NetworkId
import com.cimsi.project.dependencies.BikesApiModule
import com.cimsi.project.dependencies.DaggerActivityComponent
import com.cimsi.project.model.Station
import kotlinx.android.synthetic.main.activity_main.*
import org.osmdroid.config.Configuration
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.overlay.Marker
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContract.View {

    @Inject
    lateinit var presenter: MainActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectDependencies()
        presenter.attach(this)
        requestPermissions()
        configureMap()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.action_about_the_app -> {
            println("CLICKED!")
            true
        }
        R.id.action_my_parking -> {
            println("CLICKED!")
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

    private fun injectDependencies() {
        DaggerActivityComponent.builder()
            .bikesApiModule(BikesApiModule())
            .build()
            .inject(this)
    }

    private fun requestPermissions() {
        val requestCode = 101
        val permissions = arrayOf(
            Manifest.permission.INTERNET,
            Manifest.permission.ACCESS_NETWORK_STATE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
        ActivityCompat.requestPermissions(this, permissions, requestCode)
    }

    private fun configureMap() {
        map.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE)
        map.setMultiTouchControls(true)
        Configuration.getInstance().userAgentValue = BuildConfig.APPLICATION_ID
    }

    override fun onStart() {
        super.onStart()
        presenter.loadNetwork(NetworkId.Sevici)
    }

    override fun onResume() {
        super.onResume()
        map.onResume()
        presenter.scheduleStationsUpdate(
            NetworkId.Sevici,
            resources.getInteger(R.integer.stations_update_interval_seconds).toLong(),
            TimeUnit.SECONDS
        )
    }

    override fun onPause() {
        super.onPause()
        map.onPause()
        presenter.stopStationsUpdate()
    }

    override fun updateMap(centerPoint: GeoPoint, stations: List<Station>) {
        stations
            .map { createMarker(it) }
            .let {
                map.overlays.addAll(it)
                map.invalidate()
            }
        with(map.controller) {
            setZoom(14.5)
            animateTo(centerPoint)
        }
    }

    override fun updateStations(stations: List<Station>) {
        stations
            .map { createMarker(it) }
            .forEach { marker ->
                if (marker in map.overlays) {
                    map.overlays.remove(marker)
                }
                map.overlays.add(marker)
            }
        map.invalidate()
    }

    private fun createMarker(station: Station) = Marker(map).apply {
        position = GeoPoint(station.latitude, station.longitude)
        icon = resources.getDrawable(R.drawable.location, null)
        setOnMarkerClickListener { marker, mapView ->
            val markerDetailsDialog = MarkerDetailsDialog()
            if (station.name.contains("_")) {
                markerDetailsDialog.name = station.name.split("_")[1]
            } else {
                markerDetailsDialog.name = station.name.toString()
            }
            markerDetailsDialog.emptySlots = station.empty_slots.toString()
            markerDetailsDialog.freeBikes = station.free_bikes.toString()
            markerDetailsDialog.latitude = station.latitude
            markerDetailsDialog.longitude = station.longitude
            showMarkerDetails(markerDetailsDialog)
            true
        }
        setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
    }

    override fun showError() = Toast
        .makeText(this, resources.getText(R.string.network_error), Toast.LENGTH_LONG)
        .show()

    private fun showMarkerDetails(markerDetailsDialog: MarkerDetailsDialog) {
        markerDetailsDialog.show(supportFragmentManager, "MyCustomFragment")
    }
}
