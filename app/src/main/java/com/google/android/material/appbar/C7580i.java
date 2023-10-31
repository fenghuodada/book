package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.i */
/* loaded from: classes3.dex */
public class C7580i<V extends View> extends CoordinatorLayout.AbstractC0588c<V> {

    /* renamed from: a */
    public C7581j f14371a;

    /* renamed from: b */
    public int f14372b;

    public C7580i() {
        this.f14372b = 0;
    }

    public C7580i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14372b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: h */
    public boolean mo2724h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        mo4773u(coordinatorLayout, v, i);
        if (this.f14371a == null) {
            this.f14371a = new C7581j(v);
        }
        C7581j c7581j = this.f14371a;
        View view = c7581j.f14373a;
        c7581j.f14374b = view.getTop();
        c7581j.f14375c = view.getLeft();
        this.f14371a.m4772a();
        int i2 = this.f14372b;
        if (i2 != 0) {
            C7581j c7581j2 = this.f14371a;
            if (c7581j2.f14376d != i2) {
                c7581j2.f14376d = i2;
                c7581j2.m4772a();
            }
            this.f14372b = 0;
            return true;
        }
        return true;
    }

    /* renamed from: t */
    public final int m4774t() {
        C7581j c7581j = this.f14371a;
        if (c7581j != null) {
            return c7581j.f14376d;
        }
        return 0;
    }

    /* renamed from: u */
    public void mo4773u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        coordinatorLayout.m12118q(i, v);
    }
}
