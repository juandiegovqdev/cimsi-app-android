package com.cimsi.project.dependencies

import com.cimsi.project.ui.activities.FavoriteStationsActivity
import com.cimsi.project.ui.activities.MainActivity
import com.cimsi.project.ui.activities.SignInActivity
import dagger.Component

@Component(modules = [BikesApiModule::class, ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
    fun inject(favoriteStationsActivity: FavoriteStationsActivity)
    fun inject(signInActivity: SignInActivity)
}