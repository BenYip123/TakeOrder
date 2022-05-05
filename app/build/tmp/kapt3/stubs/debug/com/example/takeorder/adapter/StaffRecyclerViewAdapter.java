package com.example.takeorder.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0018\u00010\u0003R\u00020\u00000\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u00102\n\u0010\u001a\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u001c\u0010\u001c\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/takeorder/adapter/StaffRecyclerViewAdapter;", "Lio/realm/RealmRecyclerViewAdapter;", "Lcom/example/takeorder/realm/RealmStaff;", "Lcom/example/takeorder/adapter/StaffRecyclerViewAdapter$StaffViewHolder;", "context", "Landroid/content/Context;", "data", "Lio/realm/OrderedRealmCollection;", "(Landroid/content/Context;Lio/realm/OrderedRealmCollection;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "editStaffDialog", "", "id", "", "username", "password", "role", "getItemId", "index", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "StaffViewHolder", "app_debug"})
public final class StaffRecyclerViewAdapter extends io.realm.RealmRecyclerViewAdapter<com.example.takeorder.realm.RealmStaff, com.example.takeorder.adapter.StaffRecyclerViewAdapter.StaffViewHolder> {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TAG = "REALM_RECYCLER_ADAPTER";
    
    public StaffRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    io.realm.OrderedRealmCollection<com.example.takeorder.realm.RealmStaff> data) {
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
    public com.example.takeorder.adapter.StaffRecyclerViewAdapter.StaffViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.takeorder.adapter.StaffRecyclerViewAdapter.StaffViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int index) {
        return 0L;
    }
    
    private final void editStaffDialog(long id, java.lang.String username, java.lang.String password, java.lang.String role) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/example/takeorder/adapter/StaffRecyclerViewAdapter$StaffViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/takeorder/adapter/StaffRecyclerViewAdapter;Landroid/view/View;)V", "deleteButton", "Landroid/widget/ImageView;", "getDeleteButton", "()Landroid/widget/ImageView;", "setDeleteButton", "(Landroid/widget/ImageView;)V", "editButton", "getEditButton", "setEditButton", "password", "Landroid/widget/TextView;", "getPassword", "()Landroid/widget/TextView;", "setPassword", "(Landroid/widget/TextView;)V", "role", "getRole", "setRole", "staffId", "getStaffId", "setStaffId", "textView5", "getTextView5", "setTextView5", "username", "getUsername", "setUsername", "app_debug"})
    public final class StaffViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView staffId;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView username;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView password;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView role;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView textView5;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView editButton;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView deleteButton;
        
        public StaffViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getStaffId() {
            return null;
        }
        
        public final void setStaffId(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getUsername() {
            return null;
        }
        
        public final void setUsername(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPassword() {
            return null;
        }
        
        public final void setPassword(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getRole() {
            return null;
        }
        
        public final void setRole(@org.jetbrains.annotations.NotNull()
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