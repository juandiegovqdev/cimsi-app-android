package com.cimsi.project.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/cimsi/project/api/BikesServiceAPI;", "", "loadNetwork", "Lcom/cimsi/project/model/NetworkResponse;", "networkId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadStations", "Factory", "app_debug"})
public abstract interface BikesServiceAPI {
    @org.jetbrains.annotations.NotNull()
    public static final com.cimsi.project.api.BikesServiceAPI.Factory Factory = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/v2/networks/{id}")
    public abstract java.lang.Object loadNetwork(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String networkId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.cimsi.project.model.NetworkResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/v2/networks/{id}?fields=stations")
    public abstract java.lang.Object loadStations(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String networkId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.cimsi.project.model.NetworkResponse> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/cimsi/project/api/BikesServiceAPI$Factory;", "", "()V", "create", "Lcom/cimsi/project/api/BikesServiceAPI;", "app_debug"})
    public static final class Factory {
        
        private Factory() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.cimsi.project.api.BikesServiceAPI create() {
            return null;
        }
    }
}