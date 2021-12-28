package com.cimsi.project.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000bH\u0014J\b\u0010\u0015\u001a\u00020\u000bH\u0014J\b\u0010\u0016\u001a\u00020\u000bH\u0014J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0 H\u0016J\u0016\u0010!\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0 H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\""}, d2 = {"Lcom/cimsi/project/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/cimsi/project/ui/MainActivityContract$View;", "()V", "presenter", "Lcom/cimsi/project/ui/MainActivityContract$Presenter;", "getPresenter", "()Lcom/cimsi/project/ui/MainActivityContract$Presenter;", "setPresenter", "(Lcom/cimsi/project/ui/MainActivityContract$Presenter;)V", "configureMap", "", "createMarker", "Lorg/osmdroid/views/overlay/Marker;", "station", "Lcom/cimsi/project/model/Station;", "injectDependencies", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStart", "requestPermissions", "showError", "showMarkerDetails", "markerDetailsDialog", "Lcom/cimsi/project/MarkerDetailsDialog;", "updateMap", "centerPoint", "Lorg/osmdroid/util/GeoPoint;", "stations", "", "updateStations", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.cimsi.project.ui.MainActivityContract.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.cimsi.project.ui.MainActivityContract.Presenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.cimsi.project.ui.MainActivityContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.cimsi.project.ui.MainActivityContract.Presenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void injectDependencies() {
    }
    
    private final void requestPermissions() {
    }
    
    private final void configureMap() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void updateMap(@org.jetbrains.annotations.NotNull()
    org.osmdroid.util.GeoPoint centerPoint, @org.jetbrains.annotations.NotNull()
    java.util.List<com.cimsi.project.model.Station> stations) {
    }
    
    @java.lang.Override()
    public void updateStations(@org.jetbrains.annotations.NotNull()
    java.util.List<com.cimsi.project.model.Station> stations) {
    }
    
    private final org.osmdroid.views.overlay.Marker createMarker(com.cimsi.project.model.Station station) {
        return null;
    }
    
    @java.lang.Override()
    public void showError() {
    }
    
    private final void showMarkerDetails(com.cimsi.project.MarkerDetailsDialog markerDetailsDialog) {
    }
    
    public MainActivity() {
        super();
    }
}