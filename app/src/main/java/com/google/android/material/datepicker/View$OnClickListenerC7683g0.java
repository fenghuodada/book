package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.g0 */
/* loaded from: classes3.dex */
public final class View$OnClickListenerC7683g0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f14848a;

    /* renamed from: b */
    public final /* synthetic */ C7685h0 f14849b;

    public View$OnClickListenerC7683g0(C7685h0 c7685h0, int i) {
        this.f14849b = c7685h0;
        this.f14848a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7685h0 c7685h0 = this.f14849b;
        C7706v m4580b = C7706v.m4580b(this.f14848a, c7685h0.f14854h.f14863f.f14896b);
        C7688j<?> c7688j = c7685h0.f14854h;
        C7666a c7666a = c7688j.f14861d;
        C7706v c7706v = c7666a.f14814a;
        Calendar calendar = c7706v.f14895a;
        Calendar calendar2 = m4580b.f14895a;
        if (calendar2.compareTo(calendar) < 0) {
            m4580b = c7706v;
        } else {
            C7706v c7706v2 = c7666a.f14815b;
            if (calendar2.compareTo(c7706v2.f14895a) > 0) {
                m4580b = c7706v2;
            }
        }
        c7688j.m4586j(m4580b);
        c7688j.m4585k(1);
    }
}
