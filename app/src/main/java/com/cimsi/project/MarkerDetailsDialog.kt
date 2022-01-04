package com.cimsi.project

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.cimsi.project.services.Config
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.marker_details.view.*


class MarkerDetailsDialog : DialogFragment() {

    val db = Firebase.firestore
    var emptySlots = ""
    var freeBikes = ""
    var name = ""
    var address = ""
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
        inflateDialog.address.text = address
        if (Config.stationsLatitude.contains(latitude.toString()) && Config.stationsLongitude.contains(
                longitude.toString()
            )
        ) {
            inflateDialog.btn_save_station.setImageResource(R.drawable.star_selected)
        } else {
            inflateDialog.btn_save_station.setImageResource(R.drawable.star_not_selected)
        }
        inflateDialog.btn_save_station.setOnClickListener {
            if (!Config.stationsLatitude.contains(latitude.toString()) && !Config.stationsLongitude.contains(
                    longitude.toString()
                )
            ) {
                val station = hashMapOf(
                    "id" to Config.id,
                    "name" to name,
                    "address" to address,
                    "latitude" to latitude,
                    "longitude" to longitude
                )
                db.collection("favorite_stations")
                    .add(station)
                    .addOnSuccessListener { documentReference ->
                        inflateDialog.btn_save_station.setImageResource(R.drawable.star_selected)
                        Config.stationsLatitude.add(latitude.toString())
                        Config.stationsLongitude.add(longitude.toString())
                        println("DocumentSnapshot added with ID: ${documentReference.id}")
                    }
                    .addOnFailureListener { e ->
                        println("Error adding document")
                    }
            }
        }
        inflateDialog.btn_go_to_station.setOnClickListener {
            goToLocation()
        }
        return inflateDialog
    }

    private fun goToLocation() {
        println("Latitude: $latitude")
        println("Longitude: $longitude")
        val lat = latitude.toString().replace(",", ".")
        val lon = longitude.toString().replace(",", ".")
        val uri = "http://maps.google.com/maps?daddr=$lat,$lon"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
        val height = (resources.displayMetrics.heightPixels * 0.40).toInt()
        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
    }
}