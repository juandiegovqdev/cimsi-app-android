package com.cimsi.project.dependencies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/cimsi/project/dependencies/ActivityComponent;", "", "inject", "", "activity", "Lcom/cimsi/project/ui/MainActivity;", "app_debug"})
@dagger.Component(modules = {com.cimsi.project.dependencies.BikesApiModule.class, com.cimsi.project.dependencies.ActivityModule.class})
public abstract interface ActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.cimsi.project.ui.MainActivity activity);
}