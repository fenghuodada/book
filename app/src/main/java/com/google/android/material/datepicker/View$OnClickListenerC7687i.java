package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes3.dex */
public final class View$OnClickListenerC7687i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C7710y f14856a;

    /* renamed from: b */
    public final /* synthetic */ C7688j f14857b;

    public View$OnClickListenerC7687i(C7688j c7688j, C7710y c7710y) {
        this.f14857b = c7688j;
        this.f14856a = c7710y;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7688j c7688j = this.f14857b;
        int m10433O0 = ((LinearLayoutManager) c7688j.f14867j.getLayoutManager()).m10433O0() - 1;
        if (m10433O0 >= 0) {
            Calendar m4591c = C7681f0.m4591c(this.f14856a.f14912h.f14814a.f14895a);
            m4591c.add(2, m10433O0);
            c7688j.m4586j(new C7706v(m4591c));
        }
    }
}
