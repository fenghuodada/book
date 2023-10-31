package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.InterfaceC0883s;

/* renamed from: com.google.android.material.appbar.f */
/* loaded from: classes3.dex */
public final class C7576f implements InterfaceC0883s {

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f14355b;

    /* renamed from: c */
    public final /* synthetic */ boolean f14356c;

    public C7576f(AppBarLayout appBarLayout, boolean z) {
        this.f14355b = appBarLayout;
        this.f14356c = z;
    }

    @Override // androidx.core.view.accessibility.InterfaceC0883s
    /* renamed from: a */
    public final boolean mo4734a(@NonNull View view) {
        this.f14355b.setExpanded(this.f14356c);
        return true;
    }
}
