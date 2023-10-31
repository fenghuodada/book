package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes3.dex */
public final class C7697n extends RecyclerView.AbstractC1583o {

    /* renamed from: a */
    public final /* synthetic */ C7710y f14881a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f14882b;

    /* renamed from: c */
    public final /* synthetic */ C7688j f14883c;

    public C7697n(C7688j c7688j, C7710y c7710y, MaterialButton materialButton) {
        this.f14883c = c7688j;
        this.f14881a = c7710y;
        this.f14882b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1583o
    /* renamed from: a */
    public final void mo4583a(int i, @NonNull RecyclerView recyclerView) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f14882b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1583o
    /* renamed from: b */
    public final void mo4582b(@NonNull RecyclerView recyclerView, int i, int i2) {
        int m10433O0;
        String formatDateTime;
        C7688j c7688j = this.f14883c;
        if (i < 0) {
            m10433O0 = ((LinearLayoutManager) c7688j.f14867j.getLayoutManager()).m10434N0();
        } else {
            m10433O0 = ((LinearLayoutManager) c7688j.f14867j.getLayoutManager()).m10433O0();
        }
        C7710y c7710y = this.f14881a;
        Calendar m4591c = C7681f0.m4591c(c7710y.f14912h.f14814a.f14895a);
        m4591c.add(2, m10433O0);
        c7688j.f14863f = new C7706v(m4591c);
        Calendar m4591c2 = C7681f0.m4591c(c7710y.f14912h.f14814a.f14895a);
        m4591c2.add(2, m10433O0);
        m4591c2.set(5, 1);
        Calendar m4591c3 = C7681f0.m4591c(m4591c2);
        m4591c3.get(2);
        m4591c3.get(1);
        m4591c3.getMaximum(7);
        m4591c3.getActualMaximum(5);
        m4591c3.getTimeInMillis();
        long timeInMillis = m4591c3.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            formatDateTime = C7681f0.m4592b("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
        } else {
            formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f14882b.setText(formatDateTime);
    }
}
