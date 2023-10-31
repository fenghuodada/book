package com.google.android.material.datepicker;

import android.view.View;

/* renamed from: com.google.android.material.datepicker.s */
/* loaded from: classes3.dex */
public final class View$OnClickListenerC7702s implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MaterialDatePicker f14890a;

    public View$OnClickListenerC7702s(MaterialDatePicker materialDatePicker) {
        this.f14890a = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialDatePicker materialDatePicker = this.f14890a;
        materialDatePicker.f14806w.setEnabled(materialDatePicker.m4615h().m4599v());
        materialDatePicker.f14804u.toggle();
        materialDatePicker.m4610m(materialDatePicker.f14804u);
        materialDatePicker.m4611l();
    }
}
