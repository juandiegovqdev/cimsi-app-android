package com.cimsi.project.dependencies

import com.cimsi.project.ui.MainActivityContract
import com.cimsi.project.ui.MainActivityPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class ActivityModule {
    @Binds
    abstract fun bindPresenter(presenter: MainActivityPresenter): MainActivityContract.Presenter
}