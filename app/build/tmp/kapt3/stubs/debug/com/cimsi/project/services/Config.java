package com.cimsi.project.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/cimsi/project/services/Config;", "", "()V", "Companion", "app_debug"})
public final class Config {
    @org.jetbrains.annotations.NotNull()
    public static final com.cimsi.project.services.Config.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String account = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String id = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String displayName = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String email = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String familyName = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String givenName = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String photoUrl = "";
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<java.lang.String> stationsIds;
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<java.lang.String> stationsLatitude;
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<java.lang.String> stationsLongitude;
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<java.lang.String> stationsName;
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<java.lang.String> stationsAddress;
    public static com.google.firebase.firestore.Query stationsQuery;
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<com.cimsi.project.model.FavStation> stations;
    
    public Config() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R\u001a\u00101\u001a\u000202X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u00a8\u00067"}, d2 = {"Lcom/cimsi/project/services/Config$Companion;", "", "()V", "account", "", "getAccount", "()Ljava/lang/String;", "setAccount", "(Ljava/lang/String;)V", "displayName", "getDisplayName", "setDisplayName", "email", "getEmail", "setEmail", "familyName", "getFamilyName", "setFamilyName", "givenName", "getGivenName", "setGivenName", "id", "getId", "setId", "photoUrl", "getPhotoUrl", "setPhotoUrl", "stations", "", "Lcom/cimsi/project/model/FavStation;", "getStations", "()Ljava/util/List;", "setStations", "(Ljava/util/List;)V", "stationsAddress", "getStationsAddress", "setStationsAddress", "stationsIds", "getStationsIds", "setStationsIds", "stationsLatitude", "getStationsLatitude", "setStationsLatitude", "stationsLongitude", "getStationsLongitude", "setStationsLongitude", "stationsName", "getStationsName", "setStationsName", "stationsQuery", "Lcom/google/firebase/firestore/Query;", "getStationsQuery", "()Lcom/google/firebase/firestore/Query;", "setStationsQuery", "(Lcom/google/firebase/firestore/Query;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAccount() {
            return null;
        }
        
        public final void setAccount(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplayName() {
            return null;
        }
        
        public final void setDisplayName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmail() {
            return null;
        }
        
        public final void setEmail(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFamilyName() {
            return null;
        }
        
        public final void setFamilyName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGivenName() {
            return null;
        }
        
        public final void setGivenName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhotoUrl() {
            return null;
        }
        
        public final void setPhotoUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getStationsIds() {
            return null;
        }
        
        public final void setStationsIds(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getStationsLatitude() {
            return null;
        }
        
        public final void setStationsLatitude(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getStationsLongitude() {
            return null;
        }
        
        public final void setStationsLongitude(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getStationsName() {
            return null;
        }
        
        public final void setStationsName(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getStationsAddress() {
            return null;
        }
        
        public final void setStationsAddress(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.firebase.firestore.Query getStationsQuery() {
            return null;
        }
        
        public final void setStationsQuery(@org.jetbrains.annotations.NotNull()
        com.google.firebase.firestore.Query p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.cimsi.project.model.FavStation> getStations() {
            return null;
        }
        
        public final void setStations(@org.jetbrains.annotations.NotNull()
        java.util.List<com.cimsi.project.model.FavStation> p0) {
        }
    }
}