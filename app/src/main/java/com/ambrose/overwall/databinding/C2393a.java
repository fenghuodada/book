package com.ambrose.overwall.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.InterfaceC1805a;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;

/* renamed from: com.ambrose.overwall.databinding.a */
/* loaded from: classes.dex */
public final class C2393a implements InterfaceC1805a {
    @NonNull

    /* renamed from: a */
    public final QMUIWindowInsetLayout f5744a;
    @NonNull

    /* renamed from: b */
    public final TextView f5745b;
    @NonNull

    /* renamed from: c */
    public final QMUITopBarLayout f5746c;
    @NonNull

    /* renamed from: d */
    public final QMUIWindowInsetLayout f5747d;
    @NonNull

    /* renamed from: e */
    public final TextView f5748e;

    public C2393a(@NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout, @NonNull TextView textView, @NonNull QMUITopBarLayout qMUITopBarLayout, @NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout2, @NonNull TextView textView2) {
        this.f5744a = qMUIWindowInsetLayout;
        this.f5745b = textView;
        this.f5746c = qMUITopBarLayout;
        this.f5747d = qMUIWindowInsetLayout2;
        this.f5748e = textView2;
    }

    @Override // androidx.viewbinding.InterfaceC1805a
    @NonNull
    public final View getRoot() {
        return this.f5744a;
    }
}
