package com.example.takeorder.realm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003J&\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J.\u0010 \u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017\u00a8\u0006!"}, d2 = {"Lcom/example/takeorder/realm/RealmMenuItems;", "Lio/realm/RealmObject;", "id", "", "name", "", "price", "description", "category", "Lio/realm/RealmResults;", "Lcom/example/takeorder/realm/RealmMenuCategory;", "itemOrder", "Lcom/example/takeorder/realm/RealmMenuItemsOrders;", "(JLjava/lang/String;JLjava/lang/String;Lio/realm/RealmResults;Lio/realm/RealmResults;)V", "getCategory", "()Lio/realm/RealmResults;", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getItemOrder", "getName", "setName", "getPrice", "setPrice", "delete", "", "insert", "update", "app_debug"})
public class RealmMenuItems extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey()
    private long id;
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.Required()
    private java.lang.String name;
    private long price;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    @io.realm.annotations.LinkingObjects(value = "items")
    private final io.realm.RealmResults<com.example.takeorder.realm.RealmMenuCategory> category = null;
    @org.jetbrains.annotations.Nullable()
    @io.realm.annotations.LinkingObjects(value = "menuItem")
    private final io.realm.RealmResults<com.example.takeorder.realm.RealmMenuItemsOrders> itemOrder = null;
    
    public RealmMenuItems() {
        super();
    }
    
    public RealmMenuItems(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, long price, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    io.realm.RealmResults<com.example.takeorder.realm.RealmMenuCategory> category, @org.jetbrains.annotations.Nullable()
    io.realm.RealmResults<com.example.takeorder.realm.RealmMenuItemsOrders> itemOrder) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getPrice() {
        return 0L;
    }
    
    public final void setPrice(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.RealmResults<com.example.takeorder.realm.RealmMenuCategory> getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.RealmResults<com.example.takeorder.realm.RealmMenuItemsOrders> getItemOrder() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.lang.String name, long price, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String category) {
    }
    
    public final void update(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, long price, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String category) {
    }
    
    public final void delete(long id) {
    }
}