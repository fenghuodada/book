package com.google.android.material.datepicker;

import android.view.View;

/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes3.dex */
public final class View$OnClickListenerC7698o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C7688j f14884a;

    public View$OnClickListenerC7698o(C7688j c7688j) {
        this.f14884a = c7688j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7688j c7688j = this.f14884a;
        int i = c7688j.f14864g;
        if (i == 2) {
            c7688j.m4585k(1);
        } else if (i == 1) {
            c7688j.m4585k(2);
        }
    }
}
