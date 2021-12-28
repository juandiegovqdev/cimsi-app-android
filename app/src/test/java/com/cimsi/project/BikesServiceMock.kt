package com.cimsi.project

import com.cimsi.project.api.BikesServiceAPI
import com.cimsi.project.model.Network
import com.cimsi.project.model.NetworkLocation
import com.cimsi.project.model.NetworkResponse
import com.cimsi.project.model.Station

class BikesServiceMock : BikesServiceAPI {
    companion object {
        const val networkName = "sevici"
        val stations = listOf(Station("Station", 0.0, 0.0, 0, 0))
        val location = NetworkLocation(networkName, "ES", 0.0, 0.0)
    }

    override suspend fun loadNetwork(networkId: String): NetworkResponse =
        NetworkResponse(Network(networkName, location, stations))

    override suspend fun loadStations(networkId: String): NetworkResponse =
        NetworkResponse(Network(networkName, null, stations))
}