package com.cimsi.project.services

import com.cimsi.project.model.FavStation
import com.google.firebase.firestore.Query

class Config {
    companion object {
        var account = ""
        var id = ""
        var displayName = ""
        var email = ""
        var familyName = ""
        var givenName = ""
        var photoUrl = ""
        var stationsIds = mutableListOf<String>()
        var stationsLatitude = mutableListOf<String>()
        var stationsLongitude = mutableListOf<String>()
        var stationsName = mutableListOf<String>()
        var stationsAddress = mutableListOf<String>()
        lateinit var stationsQuery: Query
        var stations = mutableListOf<FavStation>()
    }
}