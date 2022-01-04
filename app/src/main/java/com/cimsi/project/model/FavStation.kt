package com.cimsi.project.model

import com.google.firebase.firestore.IgnoreExtraProperties

@IgnoreExtraProperties
class FavStation(
    var name: String? = null,
    var address: String? = null,
    var latitude: String? = null,
    var longitude: String? = null,
)