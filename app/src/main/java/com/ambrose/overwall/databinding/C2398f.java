package com.ambrose.overwall.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.InterfaceC1805a;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;

/* renamed from: com.ambrose.overwall.databinding.f */
/* loaded from: classes.dex */
public final class C2398f implements InterfaceC1805a {
    @NonNull

    /* renamed from: a */
    public final QMUIWindowInsetLayout f5772a;
    @NonNull

    /* renamed from: b */
    public final QMUIGroupListView f5773b;
    @NonNull

    /* renamed from: c */
    public final QMUITopBarLayout f5774c;

    public C2398f(@NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout, @NonNull QMUIGroupListView qMUIGroupListView, @NonNull QMUITopBarLayout qMUITopBarLayout) {
        this.f5772a = qMUIWindowInsetLayout;
        this.f5773b = qMUIGroupListView;
        this.f5774c = qMUITopBarLayout;
    }

    @Override // androidx.viewbinding.InterfaceC1805a
    @NonNull
    public final View getRoot() {
        return this.f5772a;
    }
}
