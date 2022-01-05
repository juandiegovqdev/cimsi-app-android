package com.cimsi.project.model

data class Station(
    var name: String,
    var latitude: Double,
    var longitude: Double,
    var empty_slots: Int,
    var free_bikes: Int,
    var extra: Extra
)