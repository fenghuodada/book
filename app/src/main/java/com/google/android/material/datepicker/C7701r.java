package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.InterfaceC0932i0;
import androidx.core.view.WindowInsetsCompat;

/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes3.dex */
public final class C7701r implements InterfaceC0932i0 {

    /* renamed from: a */
    public final /* synthetic */ int f14887a;

    /* renamed from: b */
    public final /* synthetic */ View f14888b;

    /* renamed from: c */
    public final /* synthetic */ int f14889c;

    public C7701r(int i, View view, int i2) {
        this.f14887a = i;
        this.f14888b = view;
        this.f14889c = i2;
    }

    @Override // androidx.core.view.InterfaceC0932i0
    /* renamed from: a */
    public final WindowInsetsCompat mo2619a(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.m11643a(7).f2385b;
        View view2 = this.f14888b;
        int i2 = this.f14887a;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f14889c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return windowInsetsCompat;
    }
}
