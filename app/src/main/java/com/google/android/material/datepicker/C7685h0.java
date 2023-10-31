package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.ambrose.overwall.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.h0 */
/* loaded from: classes3.dex */
public final class C7685h0 extends RecyclerView.AbstractC1572e<C7686a> {

    /* renamed from: h */
    public final C7688j<?> f14854h;

    /* renamed from: com.google.android.material.datepicker.h0$a */
    /* loaded from: classes3.dex */
    public static class C7686a extends RecyclerView.AbstractC1597y {

        /* renamed from: b */
        public final TextView f14855b;

        public C7686a(TextView textView) {
            super(textView);
            this.f14855b = textView;
        }
    }

    public C7685h0(C7688j<?> c7688j) {
        this.f14854h = c7688j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final int getItemCount() {
        return this.f14854h.f14861d.f14819f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final void onBindViewHolder(@NonNull C7686a c7686a, int i) {
        String format;
        C7671b c7671b;
        C7686a c7686a2 = c7686a;
        C7688j<?> c7688j = this.f14854h;
        int i2 = c7688j.f14861d.f14814a.f14897c + i;
        c7686a2.f14855b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = c7686a2.f14855b;
        Context context = textView.getContext();
        if (C7681f0.m4590d().get(1) == i2) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2));
        }
        textView.setContentDescription(format);
        C7673c c7673c = c7688j.f14865h;
        Calendar m4590d = C7681f0.m4590d();
        if (m4590d.get(1) == i2) {
            c7671b = c7673c.f14840f;
        } else {
            c7671b = c7673c.f14838d;
        }
        for (Long l : c7688j.f14860c.m4597y()) {
            m4590d.setTimeInMillis(l.longValue());
            if (m4590d.get(1) == i2) {
                c7671b = c7673c.f14839e;
            }
        }
        c7671b.m4608b(textView);
        textView.setOnClickListener(new View$OnClickListenerC7683g0(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    @NonNull
    public final C7686a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new C7686a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
