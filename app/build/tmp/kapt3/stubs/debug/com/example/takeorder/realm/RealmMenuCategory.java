package com.example.takeorder.realm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/example/takeorder/realm/RealmMenuCategory;", "Lio/realm/RealmObject;", "category", "", "items", "Lio/realm/RealmList;", "Lcom/example/takeorder/realm/RealmMenuItems;", "(Ljava/lang/String;Lio/realm/RealmList;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getItems", "()Lio/realm/RealmList;", "setItems", "(Lio/realm/RealmList;)V", "insert", "", "app_debug"})
public class RealmMenuCategory extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.PrimaryKey()
    private java.lang.String category;
    @org.jetbrains.annotations.Nullable()
    private io.realm.RealmList<com.example.takeorder.realm.RealmMenuItems> items;
    
    public RealmMenuCategory() {
        super();
    }
    
    public RealmMenuCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.Nullable()
    io.realm.RealmList<com.example.takeorder.realm.RealmMenuItems> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.RealmList<com.example.takeorder.realm.RealmMenuItems> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable()
    io.realm.RealmList<com.example.takeorder.realm.RealmMenuItems> p0) {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
    }
}