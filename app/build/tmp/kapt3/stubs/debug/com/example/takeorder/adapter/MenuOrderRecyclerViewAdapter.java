package com.example.takeorder.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0018\u00010\u0003R\u00020\u00000\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/takeorder/adapter/MenuOrderRecyclerViewAdapter;", "Lio/realm/RealmRecyclerViewAdapter;", "Lcom/example/takeorder/realm/RealmMenuCategory;", "Lcom/example/takeorder/adapter/MenuOrderRecyclerViewAdapter$MenuOrderViewHolder;", "context", "Landroid/content/Context;", "data", "Lio/realm/OrderedRealmCollection;", "(Landroid/content/Context;Lio/realm/OrderedRealmCollection;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MenuOrderViewHolder", "app_debug"})
public final class MenuOrderRecyclerViewAdapter extends io.realm.RealmRecyclerViewAdapter<com.example.takeorder.realm.RealmMenuCategory, com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter.MenuOrderViewHolder> {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TAG = "REALM_RECYCLER_ADAPTER";
    
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
    @java.lang.Override()
    public com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter.MenuOrderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.takeorder.adapter.MenuOrderRecyclerViewAdapter.MenuOrderViewHolder holder, int position) {
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
}