package com.cimsi.project.dependencies

import com.cimsi.project.ui.MainActivity
import dagger.Component

@Component(modules = [BikesApiModule::class, ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
}