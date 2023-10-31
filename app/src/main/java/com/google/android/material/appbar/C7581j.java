package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.appbar.j */
/* loaded from: classes3.dex */
public final class C7581j {

    /* renamed from: a */
    public final View f14373a;

    /* renamed from: b */
    public int f14374b;

    /* renamed from: c */
    public int f14375c;

    /* renamed from: d */
    public int f14376d;

    public C7581j(View view) {
        this.f14373a = view;
    }

    /* renamed from: a */
    public final void m4772a() {
        int i = this.f14376d;
        View view = this.f14373a;
        int top = i - (view.getTop() - this.f14374b);
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f14375c));
    }
}
