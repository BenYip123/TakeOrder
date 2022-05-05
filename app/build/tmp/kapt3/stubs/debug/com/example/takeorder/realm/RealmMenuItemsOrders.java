package com.example.takeorder.realm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/example/takeorder/realm/RealmMenuItemsOrders;", "Lio/realm/RealmObject;", "menuItem", "Lcom/example/takeorder/realm/RealmMenuItems;", "order", "Lcom/example/takeorder/realm/RealmOrders;", "quantity", "", "(Lcom/example/takeorder/realm/RealmMenuItems;Lcom/example/takeorder/realm/RealmOrders;I)V", "getMenuItem", "()Lcom/example/takeorder/realm/RealmMenuItems;", "setMenuItem", "(Lcom/example/takeorder/realm/RealmMenuItems;)V", "getOrder", "()Lcom/example/takeorder/realm/RealmOrders;", "setOrder", "(Lcom/example/takeorder/realm/RealmOrders;)V", "getQuantity", "()I", "setQuantity", "(I)V", "app_debug"})
public class RealmMenuItemsOrders extends io.realm.RealmObject {
    @org.jetbrains.annotations.Nullable()
    private com.example.takeorder.realm.RealmMenuItems menuItem;
    @org.jetbrains.annotations.Nullable()
    private com.example.takeorder.realm.RealmOrders order;
    private int quantity;
    
    public RealmMenuItemsOrders() {
        super();
    }
    
    public RealmMenuItemsOrders(@org.jetbrains.annotations.Nullable()
    com.example.takeorder.realm.RealmMenuItems menuItem, @org.jetbrains.annotations.Nullable()
    com.example.takeorder.realm.RealmOrders order, int quantity) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.takeorder.realm.RealmMenuItems getMenuItem() {
        return null;
    }
    
    public final void setMenuItem(@org.jetbrains.annotations.Nullable()
    com.example.takeorder.realm.RealmMenuItems p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.takeorder.realm.RealmOrders getOrder() {
        return null;
    }
    
    public final void setOrder(@org.jetbrains.annotations.Nullable()
    com.example.takeorder.realm.RealmOrders p0) {
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
    }
}