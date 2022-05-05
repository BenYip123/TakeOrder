package com.example.takeorder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\bJ\u001e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/takeorder/SharedPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "preferenceName", "", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "clearSharedPreference", "", "getSharedPrefLong", "", "key_name", "(Ljava/lang/String;)Ljava/lang/Long;", "getSharedPrefString", "saveLogin", "id", "username", "role", "app_debug"})
public final class SharedPreference {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final java.lang.String preferenceName = "user info";
    @org.jetbrains.annotations.Nullable()
    private final android.content.SharedPreferences sharedPref = null;
    
    public SharedPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getSharedPref() {
        return null;
    }
    
    public final void saveLogin(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String role) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSharedPrefString(@org.jetbrains.annotations.NotNull()
    java.lang.String key_name) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getSharedPrefLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key_name) {
        return null;
    }
    
    public final void clearSharedPreference() {
    }
}