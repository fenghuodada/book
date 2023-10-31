package com.ambrose.overwall.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.viewbinding.InterfaceC1805a;
import com.android.tool.util.weight.DrawableTextView;
import com.bitvale.switcher.SwitcherC;
import com.google.android.ads.nativetemplates.TemplateView;
import com.qmuiteam.qmui.widget.QMUIEmptyView;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;

/* renamed from: com.ambrose.overwall.databinding.c */
/* loaded from: classes.dex */
public final class C2395c implements InterfaceC1805a {
    @NonNull

    /* renamed from: a */
    public final QMUIWindowInsetLayout f5755a;
    @NonNull

    /* renamed from: b */
    public final LinearLayout f5756b;
    @NonNull

    /* renamed from: c */
    public final FrameLayout f5757c;
    @NonNull

    /* renamed from: d */
    public final TemplateView f5758d;
    @NonNull

    /* renamed from: e */
    public final QMUIEmptyView f5759e;
    @NonNull

    /* renamed from: f */
    public final QMUIWindowInsetLayout f5760f;
    @NonNull

    /* renamed from: g */
    public final ProgressBar f5761g;
    @NonNull

    /* renamed from: h */
    public final DrawableTextView f5762h;
    @NonNull

    /* renamed from: i */
    public final SwitcherC f5763i;
    @NonNull

    /* renamed from: j */
    public final QMUITopBarLayout f5764j;

    public C2395c(@NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull TemplateView templateView, @NonNull QMUIEmptyView qMUIEmptyView, @NonNull QMUIWindowInsetLayout qMUIWindowInsetLayout2, @NonNull ProgressBar progressBar, @NonNull DrawableTextView drawableTextView, @NonNull SwitcherC switcherC, @NonNull QMUITopBarLayout qMUITopBarLayout) {
        this.f5755a = qMUIWindowInsetLayout;
        this.f5756b = linearLayout;
        this.f5757c = frameLayout;
        this.f5758d = templateView;
        this.f5759e = qMUIEmptyView;
        this.f5760f = qMUIWindowInsetLayout2;
        this.f5761g = progressBar;
        this.f5762h = drawableTextView;
        this.f5763i = switcherC;
        this.f5764j = qMUITopBarLayout;
    }

    @Override // androidx.viewbinding.InterfaceC1805a
    @NonNull
    public final View getRoot() {
        return this.f5755a;
    }
}
