package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.InterfaceC0883s;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.e */
/* loaded from: classes3.dex */
public final class C7575e implements InterfaceC0883s {

    /* renamed from: b */
    public final /* synthetic */ CoordinatorLayout f14350b;

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout f14351c;

    /* renamed from: d */
    public final /* synthetic */ View f14352d;

    /* renamed from: e */
    public final /* synthetic */ int f14353e;

    /* renamed from: f */
    public final /* synthetic */ AppBarLayout.BaseBehavior f14354f;

    public C7575e(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f14354f = baseBehavior;
        this.f14350b = coordinatorLayout;
        this.f14351c = appBarLayout;
        this.f14352d = view;
        this.f14353e = i;
    }

    @Override // androidx.core.view.accessibility.InterfaceC0883s
    /* renamed from: a */
    public final boolean mo4734a(@NonNull View view) {
        this.f14354f.m4793F(this.f14350b, this.f14351c, this.f14352d, this.f14353e, new int[]{0, 0});
        return true;
    }
}
