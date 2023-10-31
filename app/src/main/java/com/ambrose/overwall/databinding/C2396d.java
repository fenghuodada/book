package com.ambrose.overwall.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.InterfaceC1805a;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;

/* renamed from: com.ambrose.overwall.databinding.d */
/* loaded from: classes.dex */
public final class C2396d implements InterfaceC1805a {
    @NonNull

    /* renamed from: a */
    public final QMUIWindowInsetLayout f5765a;
    @NonNull

    /* renamed from: b */
    public final QMUIGroupListView f5766b;
    @NonNull

    /* renamed from: c */
    public final QMUITopBarLayout f5767c;

    public C2396d(@NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout, @NonNull QMUIGroupListView qMUIGroupListView, @NonNull QMUITopBarLayout qMUITopBarLayout) {
        this.f5765a = qMUIWindowInsetLayout;
        this.f5766b = qMUIGroupListView;
        this.f5767c = qMUITopBarLayout;
    }

    @Override // androidx.viewbinding.InterfaceC1805a
    @NonNull
    public final View getRoot() {
        return this.f5765a;
    }
}
