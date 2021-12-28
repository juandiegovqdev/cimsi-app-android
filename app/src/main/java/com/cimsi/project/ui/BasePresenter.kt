package com.cimsi.project.ui

interface BasePresenter<in T> {
    fun attach(view: T)
}