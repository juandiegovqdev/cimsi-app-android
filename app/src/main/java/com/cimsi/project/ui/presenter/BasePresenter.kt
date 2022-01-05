package com.cimsi.project.ui.presenter

interface BasePresenter<in T> {
    fun attach(view: T)
}