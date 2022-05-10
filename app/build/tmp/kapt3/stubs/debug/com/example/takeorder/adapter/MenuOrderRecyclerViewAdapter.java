package com.example.takeorder.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0018\u00010\u0003R\u00020\u00000\u00012\u00020\u0004:\u0002)*B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010\u001e\u001a\u00020\u001f2\n\u0010 \u001a\u00060\u0003R\u00020\u00002\u0006\u0010!\u001a\u00020\u0017H\u0016J\u001c\u0010\"\u001a\u00060\u0003R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0017H\u0016J\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\'j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017`(R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006+"}, d2 = {"Lcom/example/takeorder/adapter/MenuOrderRecyclerViewAdapter;", "Lio/realm/RealmRecyclerViewAdapter;", "Lcom/example/takeorder/realm/RealmMenuCategory;", "Lcom/example/takeorder/adapter/MenuOrderRecyclerViewAdapter$MenuOrderViewHolder;", "Ljava/io/Serializable;", "context", "Landroid/content/Context;", "data", "Lio/realm/OrderedRealmCollection;", "(Landroid/content/Context;Lio/realm/OrderedRealmCollection;)V", "MenuOrderRecyclerViewCallbackImpl", "Lcom/example/takeorder/adapter/MenuOrderRecyclerViewAdapter$MenuOrderRecyclerViewCallback;", "getMenuOrderRecyclerViewCallbackImpl", "()Lcom/example/takeorder/adapter/MenuOrderRecyclerViewAdapter$MenuOrderRecyclerViewCallback;", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "orderMap", "", "Lcom/example/takeorder/realm/RealmMenuItems;", "", "getOrderMap", "()Ljava/util/Map;", "setOrderMap", "(Ljava/util/Map;)V", "getBundle", "Landroid/os/Bundle;", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "toHashMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "MenuOrderRecyclerViewCallback", "MenuOrderViewHolder", "app_debug"})
public final class MenuOrderRecyclerViewAdapter extends io.realm.RealmRecyclerViewAdapter<com.example.takeorder.realm.RealmMenuCategory, com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter.MenuOrderViewHolder> implements java.io.Serializable {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TAG = "REALM_RECYCLER_ADAPTER";
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<com.example.takeorder.realm.RealmMenuItems, java.lang.Integer> orderMap;
    @org.jetbrains.annotations.NotNull()
    private final com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter.MenuOrderRecyclerViewCallback MenuOrderRecyclerViewCallbackImpl = null;
    
    public MenuOrderRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    io.realm.OrderedRealmCollection<com.example.takeorder.realm.RealmMenuCategory> data) {
        super(null, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final void setTAG(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<com.example.takeorder.realm.RealmMenuItems, java.lang.Integer> getOrderMap() {
        return null;
    }
    
    public final void setOrderMap(@org.jetbrains.annotations.NotNull()
    java.util.Map<com.example.takeorder.realm.RealmMenuItems, java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter.MenuOrderRecyclerViewCallback getMenuOrderRecyclerViewCallbackImpl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter.MenuOrderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter.MenuOrderViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<com.example.takeorder.realm.RealmMenuItems, java.lang.Integer> toHashMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Bundle getBundle() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/takeorder/adapter/MenuOrderRecyclerViewAdapter$MenuOrderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/takeorder/adapter/MenuOrderRecyclerViewAdapter;Landroid/view/View;)V", "category", "Landroid/widget/TextView;", "getCategory", "()Landroid/widget/TextView;", "setCategory", "(Landroid/widget/TextView;)V", "childRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getChildRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setChildRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "app_debug"})
    public final class MenuOrderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView category;
        @org.jetbrains.annotations.NotNull()
        private androidx.recyclerview.widget.RecyclerView childRecyclerView;
        
        public MenuOrderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCategory() {
            return null;
        }
        
        public final void setCategory(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getChildRecyclerView() {
            return null;
        }
        
        public final void setChildRecyclerView(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/takeorder/adapter/MenuOrderRecyclerViewAdapter$MenuOrderRecyclerViewCallback;", "", "childPressed", "", "child", "Lcom/example/takeorder/adapter/ChildMenuOrderRecyclerViewAdapter;", "app_debug"})
    public static abstract interface MenuOrderRecyclerViewCallback {
        
        public abstract void childPressed(@org.jetbrains.annotations.NotNull()
        com.example.takeorder.adapter.ChildMenuOrderRecyclerViewAdapter child);
    }
}