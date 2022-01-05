package com.cimsi.project.dependencies

import com.cimsi.project.ui.contracts.MainActivityContract
import com.cimsi.project.ui.presenter.MainActivityPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class ActivityModule {
    @Binds
    abstract fun bindPresenter(presenter: MainActivityPresenter): MainActivityContract.Presenter
}