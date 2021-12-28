package com.cimsi.project.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/cimsi/project/ui/MainActivityContract;", "", "Presenter", "View", "app_debug"})
public abstract interface MainActivityContract {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/cimsi/project/ui/MainActivityContract$View;", "", "showError", "", "updateMap", "centerPoint", "Lorg/osmdroid/util/GeoPoint;", "stations", "", "Lcom/cimsi/project/model/Station;", "updateStations", "app_debug"})
    public static abstract interface View {
        
        public abstract void updateMap(@org.jetbrains.annotations.NotNull()
        org.osmdroid.util.GeoPoint centerPoint, @org.jetbrains.annotations.NotNull()
        java.util.List<com.cimsi.project.model.Station> stations);
        
        public abstract void updateStations(@org.jetbrains.annotations.NotNull()
        java.util.List<com.cimsi.project.model.Station> stations);
        
        public abstract void showError();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0004H&\u00a8\u0006\r"}, d2 = {"Lcom/cimsi/project/ui/MainActivityContract$Presenter;", "Lcom/cimsi/project/ui/BasePresenter;", "Lcom/cimsi/project/ui/MainActivityContract$View;", "loadNetwork", "", "networkId", "Lcom/cimsi/project/api/NetworkId;", "scheduleStationsUpdate", "interval", "", "unit", "Ljava/util/concurrent/TimeUnit;", "stopStationsUpdate", "app_debug"})
    public static abstract interface Presenter extends com.cimsi.project.ui.BasePresenter<com.cimsi.project.ui.MainActivityContract.View> {
        
        public abstract void loadNetwork(@org.jetbrains.annotations.NotNull()
        com.cimsi.project.api.NetworkId networkId);
        
        public abstract void scheduleStationsUpdate(@org.jetbrains.annotations.NotNull()
        com.cimsi.project.api.NetworkId networkId, long interval, @org.jetbrains.annotations.NotNull()
        java.util.concurrent.TimeUnit unit);
        
        public abstract void stopStationsUpdate();
    }
}