package com.cimsi.project.model

data class Network(
    var name: String,
    var location: NetworkLocation?,
    var stations: List<Station>
)