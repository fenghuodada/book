package com.ambrose.overwall.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.InterfaceC1805a;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;

/* renamed from: com.ambrose.overwall.databinding.i */
/* loaded from: classes.dex */
public final class C2401i implements InterfaceC1805a {
    @NonNull

    /* renamed from: a */
    public final QMUIWindowInsetLayout f5785a;
    @NonNull

    /* renamed from: b */
    public final QMUIGroupListView f5786b;
    @NonNull

    /* renamed from: c */
    public final QMUITopBarLayout f5787c;

    public C2401i(@NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout, @NonNull QMUIGroupListView qMUIGroupListView, @NonNull QMUITopBarLayout qMUITopBarLayout) {
        this.f5785a = qMUIWindowInsetLayout;
        this.f5786b = qMUIGroupListView;
        this.f5787c = qMUITopBarLayout;
    }

    @Override // androidx.viewbinding.InterfaceC1805a
    @NonNull
    public final View getRoot() {
        return this.f5785a;
    }
}
