package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C0922g2;
import androidx.core.view.C0995r0;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ambrose.overwall.R;
import com.google.android.material.datepicker.C7688j;
import java.util.Calendar;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.datepicker.y */
/* loaded from: classes3.dex */
public final class C7710y extends RecyclerView.AbstractC1572e<C7711a> {
    @NonNull

    /* renamed from: h */
    public final C7666a f14912h;

    /* renamed from: i */
    public final InterfaceC7675d<?> f14913i;
    @Nullable

    /* renamed from: j */
    public final AbstractC7682g f14914j;

    /* renamed from: k */
    public final C7688j.InterfaceC7693e f14915k;

    /* renamed from: l */
    public final int f14916l;

    /* renamed from: com.google.android.material.datepicker.y$a */
    /* loaded from: classes3.dex */
    public static class C7711a extends RecyclerView.AbstractC1597y {

        /* renamed from: b */
        public final TextView f14917b;

        /* renamed from: c */
        public final MaterialCalendarGridView f14918c;

        public C7711a(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f14917b = textView;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            new C0995r0().m11766e(textView, Boolean.TRUE);
            this.f14918c = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public C7710y(@NonNull ContextThemeWrapper contextThemeWrapper, InterfaceC7675d interfaceC7675d, @NonNull C7666a c7666a, @Nullable AbstractC7682g abstractC7682g, C7688j.C7692d c7692d) {
        int i;
        Calendar calendar = c7666a.f14814a.f14895a;
        C7706v c7706v = c7666a.f14817d;
        if (calendar.compareTo(c7706v.f14895a) <= 0) {
            if (c7706v.f14895a.compareTo(c7666a.f14815b.f14895a) <= 0) {
                int i2 = C7708w.f14902g;
                int i3 = C7688j.f14858o;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i2;
                if (MaterialDatePicker.m4613j(contextThemeWrapper)) {
                    i = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i = 0;
                }
                this.f14916l = dimensionPixelSize + i;
                this.f14912h = c7666a;
                this.f14913i = interfaceC7675d;
                this.f14914j = abstractC7682g;
                this.f14915k = c7692d;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final int getItemCount() {
        return this.f14912h.f14820g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final long getItemId(int i) {
        Calendar m4591c = C7681f0.m4591c(this.f14912h.f14814a.f14895a);
        m4591c.add(2, i);
        return new C7706v(m4591c).f14895a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final void onBindViewHolder(@NonNull C7711a c7711a, int i) {
        C7711a c7711a2 = c7711a;
        C7666a c7666a = this.f14912h;
        Calendar m4591c = C7681f0.m4591c(c7666a.f14814a.f14895a);
        m4591c.add(2, i);
        C7706v c7706v = new C7706v(m4591c);
        c7711a2.f14917b.setText(c7706v.m4578d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c7711a2.f14918c.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && c7706v.equals(materialCalendarGridView.getAdapter2().f14904a)) {
            materialCalendarGridView.invalidate();
            C7708w adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l : adapter2.f14906c) {
                adapter2.m4574d(materialCalendarGridView, l.longValue());
            }
            InterfaceC7675d<?> interfaceC7675d = adapter2.f14905b;
            if (interfaceC7675d != null) {
                for (Long l2 : interfaceC7675d.m4597y()) {
                    adapter2.m4574d(materialCalendarGridView, l2.longValue());
                }
                adapter2.f14906c = interfaceC7675d.m4597y();
            }
        } else {
            C7708w c7708w = new C7708w(c7706v, this.f14913i, c7666a, this.f14914j);
            materialCalendarGridView.setNumColumns(c7706v.f14898d);
            materialCalendarGridView.setAdapter((ListAdapter) c7708w);
        }
        materialCalendarGridView.setOnItemClickListener(new C7709x(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    @NonNull
    public final C7711a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (MaterialDatePicker.m4613j(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.C1579k(-1, this.f14916l));
            return new C7711a(linearLayout, true);
        }
        return new C7711a(linearLayout, false);
    }
}
