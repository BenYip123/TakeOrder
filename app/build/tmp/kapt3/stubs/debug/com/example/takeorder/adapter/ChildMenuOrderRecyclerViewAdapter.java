package com.example.takeorder.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0018\u00010\u0003R\u00020\u00000\u0001:\u0001#B\'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u001c\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J\u001c\u0010\u001f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0013H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/example/takeorder/adapter/ChildMenuOrderRecyclerViewAdapter;", "Lio/realm/RealmRecyclerViewAdapter;", "Lcom/example/takeorder/realm/RealmMenuItems;", "Lcom/example/takeorder/adapter/ChildMenuOrderRecyclerViewAdapter$ChildMenuOrderViewHolder;", "context", "Landroid/content/Context;", "data", "Lio/realm/OrderedRealmCollection;", "menuOrderRecyclerViewCallback", "Lcom/example/takeorder/adapter/MenuOrderRecyclerViewAdapter$MenuOrderRecyclerViewCallback;", "(Landroid/content/Context;Lio/realm/OrderedRealmCollection;Lcom/example/takeorder/adapter/MenuOrderRecyclerViewAdapter$MenuOrderRecyclerViewCallback;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "orderMap", "", "", "getOrderMap", "()Ljava/util/Map;", "setOrderMap", "(Ljava/util/Map;)V", "getItemId", "", "index", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ChildMenuOrderViewHolder", "app_debug"})
public final class ChildMenuOrderRecyclerViewAdapter extends io.realm.RealmRecyclerViewAdapter<com.example.takeorder.realm.RealmMenuItems, com.example.takeorder.adapter.ChildMenuOrderRecyclerViewAdapter.ChildMenuOrderViewHolder> {
    private final android.content.Context context = null;
    private final com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter.MenuOrderRecyclerViewCallback menuOrderRecyclerViewCallback = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TAG = "REALM_RECYCLER_ADAPTER";
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<com.example.takeorder.realm.RealmMenuItems, java.lang.Integer> orderMap;
    
    public ChildMenuOrderRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    io.realm.OrderedRealmCollection<com.example.takeorder.realm.RealmMenuItems> data, @org.jetbrains.annotations.NotNull()
    com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter.MenuOrderRecyclerViewCallback menuOrderRecyclerViewCallback) {
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
    @java.lang.Override()
    public com.example.takeorder.adapter.ChildMenuOrderRecyclerViewAdapter.ChildMenuOrderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.takeorder.adapter.ChildMenuOrderRecyclerViewAdapter.ChildMenuOrderViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int index) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/example/takeorder/adapter/ChildMenuOrderRecyclerViewAdapter$ChildMenuOrderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/takeorder/adapter/ChildMenuOrderRecyclerViewAdapter;Landroid/view/View;)V", "counter", "Landroid/widget/TextView;", "getCounter", "()Landroid/widget/TextView;", "setCounter", "(Landroid/widget/TextView;)V", "decreaseButton", "Landroid/widget/Button;", "getDecreaseButton", "()Landroid/widget/Button;", "setDecreaseButton", "(Landroid/widget/Button;)V", "description", "getDescription", "setDescription", "increaseButton", "getIncreaseButton", "setIncreaseButton", "item", "getItem", "setItem", "price", "getPrice", "setPrice", "app_debug"})
    public final class ChildMenuOrderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView item;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView description;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView price;
        @org.jetbrains.annotations.NotNull()
        private android.widget.Button increaseButton;
        @org.jetbrains.annotations.NotNull()
        private android.widget.Button decreaseButton;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView counter;
        
        public ChildMenuOrderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItem() {
            return null;
        }
        
        public final void setItem(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPrice() {
            return null;
        }
        
        public final void setPrice(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getIncreaseButton() {
            return null;
        }
        
        public final void setIncreaseButton(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getDecreaseButton() {
            return null;
        }
        
        public final void setDecreaseButton(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCounter() {
            return null;
        }
        
        public final void setCounter(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}