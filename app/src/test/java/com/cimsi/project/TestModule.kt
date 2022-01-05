package com.cimsi.project

import com.cimsi.project.api.BikesServiceAPI
import com.cimsi.project.ui.contracts.MainActivityContract
import com.cimsi.project.ui.presenter.MainActivityPresenter
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class TestModule {
    @Provides
    fun provideBikesApi(): BikesServiceAPI = BikesServiceMock()
}

@Module
abstract class TestModuleBinder {
    @Binds
    abstract fun bindPresenter(presenter: MainActivityPresenter): MainActivityContract.Presenter
}