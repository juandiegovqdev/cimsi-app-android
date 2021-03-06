package com.cimsi.project.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0003J\b\u0010&\u001a\u00020!H\u0002J\b\u0010\'\u001a\u00020!H\u0002J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0002J\u0012\u0010+\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020/2\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020!H\u0014J\b\u00106\u001a\u00020!H\u0014J\b\u00107\u001a\u00020!H\u0014J\b\u00108\u001a\u00020!H\u0002J\b\u00109\u001a\u00020!H\u0016J\u0010\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020<H\u0002J\u001e\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020%0AH\u0016J\u0016\u0010B\u001a\u00020!2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020%0AH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006C"}, d2 = {"Lcom/cimsi/project/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/cimsi/project/ui/MainActivityContract$View;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "auth$delegate", "Lkotlin/Lazy;", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getDb", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "mAdView", "Lcom/google/android/gms/ads/AdView;", "getMAdView", "()Lcom/google/android/gms/ads/AdView;", "setMAdView", "(Lcom/google/android/gms/ads/AdView;)V", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "getMGoogleSignInClient", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "setMGoogleSignInClient", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)V", "presenter", "Lcom/cimsi/project/ui/MainActivityContract$Presenter;", "getPresenter", "()Lcom/cimsi/project/ui/MainActivityContract$Presenter;", "setPresenter", "(Lcom/cimsi/project/ui/MainActivityContract$Presenter;)V", "configureMap", "", "createMarker", "Lorg/osmdroid/views/overlay/Marker;", "station", "Lcom/cimsi/project/model/Station;", "getFavoriteStationsData", "initializeAdMob", "initializeGoogleSignIn", "initializeUIObjects", "injectDependencies", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onStart", "requestPermissions", "showError", "showMarkerDetails", "markerDetailsDialog", "Lcom/cimsi/project/MarkerDetailsDialog;", "updateMap", "centerPoint", "Lorg/osmdroid/util/GeoPoint;", "stations", "", "updateStations", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.cimsi.project.ui.MainActivityContract.View {
    @javax.inject.Inject()
    public com.cimsi.project.ui.MainActivityContract.Presenter presenter;
    public com.google.android.gms.ads.AdView mAdView;
    public com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    private final kotlin.Lazy auth$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cimsi.project.ui.MainActivityContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.cimsi.project.ui.MainActivityContract.Presenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.ads.AdView getMAdView() {
        return null;
    }
    
    public final void setMAdView(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.ads.AdView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.auth.api.signin.GoogleSignInClient getMGoogleSignInClient() {
        return null;
    }
    
    public final void setMGoogleSignInClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.auth.api.signin.GoogleSignInClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getDb() {
        return null;
    }
    
    private final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getFavoriteStationsData() {
    }
    
    private final void initializeUIObjects() {
    }
    
    private final void initializeGoogleSignIn() {
    }
    
    private final void initializeAdMob() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
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
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final org.osmdroid.views.overlay.Marker createMarker(com.cimsi.project.model.Station station) {
        return null;
    }
    
    @java.lang.Override()
    public void showError() {
    }
    
    private final void showMarkerDetails(com.cimsi.project.MarkerDetailsDialog markerDetailsDialog) {
    }
}