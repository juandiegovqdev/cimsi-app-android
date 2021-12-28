package com.cimsi.project.dependencies

import com.cimsi.project.api.BikesServiceAPI
import dagger.Module
import dagger.Provides

@Module
class BikesApiModule {
    @Provides
    fun provideBikesApi(): BikesServiceAPI = BikesServiceAPI.create()
}