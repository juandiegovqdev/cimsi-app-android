package com.cimsi.project.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/cimsi/project/ui/MainActivityPresenter;", "Lcom/cimsi/project/ui/MainActivityContract$Presenter;", "bikesApi", "Lcom/cimsi/project/api/BikesServiceAPI;", "(Lcom/cimsi/project/api/BikesServiceAPI;)V", "stationsUpdater", "Lkotlinx/coroutines/Job;", "view", "Lcom/cimsi/project/ui/MainActivityContract$View;", "attach", "", "callFailed", "message", "", "loadNetwork", "networkId", "Lcom/cimsi/project/api/NetworkId;", "processMapUpdate", "network", "Lcom/cimsi/project/model/Network;", "processStationsUpdate", "(Lcom/cimsi/project/model/Network;)Lkotlin/Unit;", "scheduleStationsUpdate", "interval", "", "unit", "Ljava/util/concurrent/TimeUnit;", "stopStationsUpdate", "app_debug"})
public final class MainActivityPresenter implements com.cimsi.project.ui.MainActivityContract.Presenter {
    private com.cimsi.project.ui.MainActivityContract.View view;
    private kotlinx.coroutines.Job stationsUpdater;
    private final com.cimsi.project.api.BikesServiceAPI bikesApi = null;
    
    @java.lang.Override()
    public void attach(@org.jetbrains.annotations.NotNull()
    com.cimsi.project.ui.MainActivityContract.View view) {
    }
    
    @java.lang.Override()
    public void loadNetwork(@org.jetbrains.annotations.NotNull()
    com.cimsi.project.api.NetworkId networkId) {
    }
    
    private final void processMapUpdate(com.cimsi.project.model.Network network) {
    }
    
    @java.lang.Override()
    public void scheduleStationsUpdate(@org.jetbrains.annotations.NotNull()
    com.cimsi.project.api.NetworkId networkId, long interval, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit unit) {
    }
    
    private final kotlin.Unit processStationsUpdate(com.cimsi.project.model.Network network) {
        return null;
    }
    
    private final void callFailed(java.lang.String message) {
    }
    
    @java.lang.Override()
    public void stopStationsUpdate() {
    }
    
    @javax.inject.Inject()
    public MainActivityPresenter(@org.jetbrains.annotations.NotNull()
    com.cimsi.project.api.BikesServiceAPI bikesApi) {
        super();
    }
}