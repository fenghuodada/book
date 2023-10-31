package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.util.C0800d;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes3.dex */
public final class C7695l extends RecyclerView.AbstractC1578j {

    /* renamed from: a */
    public final Calendar f14877a = C7681f0.m4589e(null);

    /* renamed from: b */
    public final Calendar f14878b = C7681f0.m4589e(null);

    /* renamed from: c */
    public final /* synthetic */ C7688j f14879c;

    public C7695l(C7688j c7688j) {
        this.f14879c = c7688j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1578j
    /* renamed from: d */
    public final void mo68d(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v) {
        Long l;
        int i;
        int width;
        if ((recyclerView.getAdapter() instanceof C7685h0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C7685h0 c7685h0 = (C7685h0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            C7688j c7688j = this.f14879c;
            for (C0800d<Long, Long> c0800d : c7688j.f14860c.m4601m()) {
                Long l2 = c0800d.f2500a;
                if (l2 != null && (l = c0800d.f2501b) != null) {
                    long longValue = l2.longValue();
                    Calendar calendar = this.f14877a;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = l.longValue();
                    Calendar calendar2 = this.f14878b;
                    calendar2.setTimeInMillis(longValue2);
                    int i2 = calendar.get(1) - c7685h0.f14854h.f14861d.f14814a.f14897c;
                    int i3 = calendar2.get(1) - c7685h0.f14854h.f14861d.f14814a.f14897c;
                    View mo10318r = gridLayoutManager.mo10318r(i2);
                    View mo10318r2 = gridLayoutManager.mo10318r(i3);
                    int i4 = gridLayoutManager.f3578F;
                    int i5 = i2 / i4;
                    int i6 = i3 / i4;
                    for (int i7 = i5; i7 <= i6; i7++) {
                        View mo10318r3 = gridLayoutManager.mo10318r(gridLayoutManager.f3578F * i7);
                        if (mo10318r3 != null) {
                            int top = mo10318r3.getTop() + c7688j.f14865h.f14838d.f14829a.top;
                            int bottom = mo10318r3.getBottom() - c7688j.f14865h.f14838d.f14829a.bottom;
                            if (i7 == i5 && mo10318r != null) {
                                i = (mo10318r.getWidth() / 2) + mo10318r.getLeft();
                            } else {
                                i = 0;
                            }
                            if (i7 == i6 && mo10318r2 != null) {
                                width = (mo10318r2.getWidth() / 2) + mo10318r2.getLeft();
                            } else {
                                width = recyclerView.getWidth();
                            }
                            canvas.drawRect(i, top, width, bottom, c7688j.f14865h.f14842h);
                        }
                    }
                }
            }
        }
    }
}
