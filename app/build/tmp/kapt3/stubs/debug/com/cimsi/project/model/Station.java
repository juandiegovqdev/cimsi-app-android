package com.cimsi.project.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\u000bH\u00c6\u0003JE\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\bH\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006-"}, d2 = {"Lcom/cimsi/project/model/Station;", "", "name", "", "latitude", "", "longitude", "empty_slots", "", "free_bikes", "extra", "Lcom/cimsi/project/model/Extra;", "(Ljava/lang/String;DDIILcom/cimsi/project/model/Extra;)V", "getEmpty_slots", "()I", "setEmpty_slots", "(I)V", "getExtra", "()Lcom/cimsi/project/model/Extra;", "setExtra", "(Lcom/cimsi/project/model/Extra;)V", "getFree_bikes", "setFree_bikes", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Station {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private double latitude;
    private double longitude;
    private int empty_slots;
    private int free_bikes;
    @org.jetbrains.annotations.NotNull()
    private com.cimsi.project.model.Extra extra;
    
    @org.jetbrains.annotations.NotNull()
    public final com.cimsi.project.model.Station copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, double latitude, double longitude, int empty_slots, int free_bikes, @org.jetbrains.annotations.NotNull()
    com.cimsi.project.model.Extra extra) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Station(@org.jetbrains.annotations.NotNull()
    java.lang.String name, double latitude, double longitude, int empty_slots, int free_bikes, @org.jetbrains.annotations.NotNull()
    com.cimsi.project.model.Extra extra) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final void setLatitude(double p0) {
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final void setLongitude(double p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getEmpty_slots() {
        return 0;
    }
    
    public final void setEmpty_slots(int p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getFree_bikes() {
        return 0;
    }
    
    public final void setFree_bikes(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cimsi.project.model.Extra component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cimsi.project.model.Extra getExtra() {
        return null;
    }
    
    public final void setExtra(@org.jetbrains.annotations.NotNull()
    com.cimsi.project.model.Extra p0) {
    }
}