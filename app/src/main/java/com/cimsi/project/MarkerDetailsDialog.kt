package com.cimsi.project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.marker_details.view.*

class MarkerDetailsDialog : DialogFragment() {

    var emptySlots = ""
    var freeBikes = ""
    var name = ""
    var latitude: Double? = null
    var longitude: Double? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog!!.window?.setBackgroundDrawableResource(R.drawable.round_corner)
        var inflateDialog = inflater.inflate(R.layout.marker_details, container, false)
        inflateDialog.empty_slots.text = emptySlots
        inflateDialog.free_bikes.text = freeBikes
        inflateDialog.name.text = name
        inflateDialog.btn_go_to_station.setOnClickListener {
            goToLocation()
        }
        return inflateDialog
    }

    private fun goToLocation() {
        println("Latitude: $latitude")
        println("Longitude: $longitude")
    }

    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
        val height = (resources.displayMetrics.heightPixels * 0.40).toInt()
        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
    }
}