package com.ambrose.overwall.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.InterfaceC1805a;
import com.android.tool.util.weight.JustifyTextView;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;

/* renamed from: com.ambrose.overwall.databinding.e */
/* loaded from: classes.dex */
public final class C2397e implements InterfaceC1805a {
    @NonNull

    /* renamed from: a */
    public final QMUIWindowInsetLayout f5768a;
    @NonNull

    /* renamed from: b */
    public final QMUITopBarLayout f5769b;
    @NonNull

    /* renamed from: c */
    public final QMUIWindowInsetLayout f5770c;
    @NonNull

    /* renamed from: d */
    public final JustifyTextView f5771d;

    public C2397e(@NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout, @NonNull QMUITopBarLayout qMUITopBarLayout, @NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout2, @NonNull JustifyTextView justifyTextView) {
        this.f5768a = qMUIWindowInsetLayout;
        this.f5769b = qMUITopBarLayout;
        this.f5770c = qMUIWindowInsetLayout2;
        this.f5771d = justifyTextView;
    }

    @Override // androidx.viewbinding.InterfaceC1805a
    @NonNull
    public final View getRoot() {
        return this.f5768a;
    }
}
