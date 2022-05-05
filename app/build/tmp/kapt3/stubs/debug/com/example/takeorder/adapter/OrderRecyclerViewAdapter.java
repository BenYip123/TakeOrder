package com.example.takeorder.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0018\u00010\u0003R\u00020\u00000\u0001:\u0001\u0019B\u0017\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/example/takeorder/adapter/OrderRecyclerViewAdapter;", "Lio/realm/RealmRecyclerViewAdapter;", "Lcom/example/takeorder/realm/RealmOrders;", "Lcom/example/takeorder/adapter/OrderRecyclerViewAdapter$OrderViewHolder;", "data", "Lio/realm/OrderedRealmCollection;", "(Lio/realm/OrderedRealmCollection;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "getItemId", "", "index", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OrderViewHolder", "app_debug"})
public final class OrderRecyclerViewAdapter extends io.realm.RealmRecyclerViewAdapter<com.example.takeorder.realm.RealmOrders, com.example.takeorder.adapter.OrderRecyclerViewAdapter.OrderViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TAG = "REALM_RECYCLER_ADAPTER";
    
    public OrderRecyclerViewAdapter(@org.jetbrains.annotations.Nullable()
    io.realm.OrderedRealmCollection<com.example.takeorder.realm.RealmOrders> data) {
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
    @java.lang.Override()
    public com.example.takeorder.adapter.OrderRecyclerViewAdapter.OrderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.takeorder.adapter.OrderRecyclerViewAdapter.OrderViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int index) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/example/takeorder/adapter/OrderRecyclerViewAdapter$OrderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/takeorder/adapter/OrderRecyclerViewAdapter;Landroid/view/View;)V", "date", "Landroid/widget/TextView;", "getDate", "()Landroid/widget/TextView;", "setDate", "(Landroid/widget/TextView;)V", "deleteButton", "Landroid/widget/ImageView;", "getDeleteButton", "()Landroid/widget/ImageView;", "setDeleteButton", "(Landroid/widget/ImageView;)V", "editButton", "getEditButton", "setEditButton", "orderId", "getOrderId", "setOrderId", "price", "getPrice", "setPrice", "textView4", "getTextView4", "setTextView4", "textView5", "getTextView5", "setTextView5", "app_debug"})
    public final class OrderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView orderId;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView price;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView date;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView textView4;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView textView5;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView editButton;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView deleteButton;
        
        public OrderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getOrderId() {
            return null;
        }
        
        public final void setOrderId(@org.jetbrains.annotations.NotNull()
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
        public final android.widget.TextView getDate() {
            return null;
        }
        
        public final void setDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextView4() {
            return null;
        }
        
        public final void setTextView4(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextView5() {
            return null;
        }
        
        public final void setTextView5(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getEditButton() {
            return null;
        }
        
        public final void setEditButton(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getDeleteButton() {
            return null;
        }
        
        public final void setDeleteButton(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
    }
}