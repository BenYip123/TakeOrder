package com.example.takeorder.realm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00a2\u0006\u0002\u0010\fJ \u0010\u001a\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/example/takeorder/realm/RealmOrders;", "Lio/realm/RealmObject;", "id", "", "total_price", "date", "Ljava/util/Date;", "menuItemOrder", "Lio/realm/RealmResults;", "Lcom/example/takeorder/realm/RealmMenuItemsOrders;", "staff", "Lcom/example/takeorder/realm/RealmStaff;", "(JJLjava/util/Date;Lio/realm/RealmResults;Lio/realm/RealmResults;)V", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getId", "()J", "setId", "(J)V", "getMenuItemOrder", "()Lio/realm/RealmResults;", "getStaff", "getTotal_price", "setTotal_price", "insert", "staff_id", "queryLatest", "", "app_debug"})
public class RealmOrders extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey()
    private long id;
    private long total_price;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date date;
    @org.jetbrains.annotations.Nullable()
    @io.realm.annotations.LinkingObjects(value = "order")
    private final io.realm.RealmResults<com.example.takeorder.realm.RealmMenuItemsOrders> menuItemOrder = null;
    @org.jetbrains.annotations.Nullable()
    @io.realm.annotations.LinkingObjects(value = "orders")
    private final io.realm.RealmResults<com.example.takeorder.realm.RealmStaff> staff = null;
    
    public RealmOrders() {
        super();
    }
    
    public RealmOrders(long id, long total_price, @org.jetbrains.annotations.Nullable()
    java.util.Date date, @org.jetbrains.annotations.Nullable()
    io.realm.RealmResults<com.example.takeorder.realm.RealmMenuItemsOrders> menuItemOrder, @org.jetbrains.annotations.Nullable()
    io.realm.RealmResults<com.example.takeorder.realm.RealmStaff> staff) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final long getTotal_price() {
        return 0L;
    }
    
    public final void setTotal_price(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.RealmResults<com.example.takeorder.realm.RealmMenuItemsOrders> getMenuItemOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.RealmResults<com.example.takeorder.realm.RealmStaff> getStaff() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.takeorder.realm.RealmOrders insert(long total_price, @org.jetbrains.annotations.NotNull()
    java.util.Date date, long staff_id) {
        return null;
    }
    
    public final void queryLatest() {
    }
}