package com.ambrose.overwall.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.InterfaceC1805a;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;

/* renamed from: com.ambrose.overwall.databinding.h */
/* loaded from: classes.dex */
public final class C2400h implements InterfaceC1805a {
    @NonNull

    /* renamed from: a */
    public final QMUIWindowInsetLayout f5781a;
    @NonNull

    /* renamed from: b */
    public final QMUITopBarLayout f5782b;
    @NonNull

    /* renamed from: c */
    public final QMUIWindowInsetLayout f5783c;
    @NonNull

    /* renamed from: d */
    public final RecyclerView f5784d;

    public C2400h(@NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout, @NonNull QMUITopBarLayout qMUITopBarLayout, @NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout2, @NonNull RecyclerView recyclerView) {
        this.f5781a = qMUIWindowInsetLayout;
        this.f5782b = qMUITopBarLayout;
        this.f5783c = qMUIWindowInsetLayout2;
        this.f5784d = recyclerView;
    }

    @Override // androidx.viewbinding.InterfaceC1805a
    @NonNull
    public final View getRoot() {
        return this.f5781a;
    }
}
