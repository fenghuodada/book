package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.util.C0800d;
import com.ambrose.overwall.R;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p060j$.util.DesugarTimeZone;

/* renamed from: com.google.android.material.datepicker.w */
/* loaded from: classes3.dex */
public final class C7708w extends BaseAdapter {

    /* renamed from: g */
    public static final int f14902g = C7681f0.m4589e(null).getMaximum(4);

    /* renamed from: h */
    public static final int f14903h = (C7681f0.m4589e(null).getMaximum(7) + C7681f0.m4589e(null).getMaximum(5)) - 1;

    /* renamed from: a */
    public final C7706v f14904a;

    /* renamed from: b */
    public final InterfaceC7675d<?> f14905b;

    /* renamed from: c */
    public Collection<Long> f14906c;

    /* renamed from: d */
    public C7673c f14907d;

    /* renamed from: e */
    public final C7666a f14908e;
    @Nullable

    /* renamed from: f */
    public final AbstractC7682g f14909f;

    public C7708w(C7706v c7706v, InterfaceC7675d<?> interfaceC7675d, C7666a c7666a, @Nullable AbstractC7682g abstractC7682g) {
        this.f14904a = c7706v;
        this.f14905b = interfaceC7675d;
        this.f14908e = c7666a;
        this.f14909f = abstractC7682g;
        this.f14906c = interfaceC7675d.m4597y();
    }

    /* renamed from: a */
    public final int m4577a() {
        int i = this.f14908e.f14818e;
        C7706v c7706v = this.f14904a;
        Calendar calendar = c7706v.f14895a;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + c7706v.f14898d;
        }
        return i3;
    }

    @Override // android.widget.Adapter
    @Nullable
    /* renamed from: b */
    public final Long getItem(int i) {
        if (i >= m4577a()) {
            int m4577a = m4577a();
            C7706v c7706v = this.f14904a;
            if (i <= (m4577a + c7706v.f14899e) - 1) {
                Calendar m4591c = C7681f0.m4591c(c7706v.f14895a);
                m4591c.set(5, (i - m4577a()) + 1);
                return Long.valueOf(m4591c.getTimeInMillis());
            }
            return null;
        }
        return null;
    }

    /* renamed from: c */
    public final void m4575c(@Nullable TextView textView, long j, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String format;
        C7671b c7671b;
        boolean z5;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z6 = true;
        if (C7681f0.m4590d().getTimeInMillis() == j) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC7675d<?> interfaceC7675d = this.f14905b;
        Iterator<C0800d<Long, Long>> it = interfaceC7675d.m4601m().iterator();
        while (true) {
            if (it.hasNext()) {
                Long l = it.next().f2500a;
                if (l != null && l.longValue() == j) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        Iterator<C0800d<Long, Long>> it2 = interfaceC7675d.m4601m().iterator();
        while (true) {
            if (it2.hasNext()) {
                Long l2 = it2.next().f2501b;
                if (l2 != null && l2.longValue() == j) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        Calendar m4590d = C7681f0.m4590d();
        Calendar m4589e = C7681f0.m4589e(null);
        m4589e.setTimeInMillis(j);
        if (m4590d.get(1) == m4589e.get(1)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Locale locale = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                format = C7681f0.m4592b("MMMEd", locale).format(new Date(j));
            } else {
                DateFormat dateInstance = DateFormat.getDateInstance(0, locale);
                dateInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                format = dateInstance.format(new Date(j));
            }
        } else {
            Locale locale2 = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                format = C7681f0.m4592b("yMMMEd", locale2).format(new Date(j));
            } else {
                DateFormat dateInstance2 = DateFormat.getDateInstance(0, locale2);
                dateInstance2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                format = dateInstance2.format(new Date(j));
            }
        }
        if (z) {
            format = String.format(context.getString(R.string.mtrl_picker_today_description), format);
        }
        if (z2) {
            format = String.format(context.getString(R.string.mtrl_picker_start_date_description), format);
        } else if (z3) {
            format = String.format(context.getString(R.string.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (this.f14908e.f14816c.mo4594u(j)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = interfaceC7675d.m4597y().iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (C7681f0.m4593a(j) == C7681f0.m4593a(it3.next().longValue())) {
                        z5 = true;
                        break;
                    }
                } else {
                    z5 = false;
                    break;
                }
            }
            textView.setSelected(z5);
            if (z5) {
                c7671b = this.f14907d.f14836b;
            } else {
                if (C7681f0.m4590d().getTimeInMillis() != j) {
                    z6 = false;
                }
                C7673c c7673c = this.f14907d;
                if (z6) {
                    c7671b = c7673c.f14837c;
                } else {
                    c7671b = c7673c.f14835a;
                }
            }
        } else {
            textView.setEnabled(false);
            c7671b = this.f14907d.f14841g;
        }
        if (this.f14909f != null && i != -1) {
            int i2 = this.f14904a.f14897c;
            c7671b.m4608b(textView);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setContentDescription(format);
            return;
        }
        c7671b.m4608b(textView);
    }

    /* renamed from: d */
    public final void m4574d(MaterialCalendarGridView materialCalendarGridView, long j) {
        C7706v m4579c = C7706v.m4579c(j);
        C7706v c7706v = this.f14904a;
        if (m4579c.equals(c7706v)) {
            Calendar m4591c = C7681f0.m4591c(c7706v.f14895a);
            m4591c.setTimeInMillis(j);
            int i = m4591c.get(5);
            m4575c((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter2().m4577a() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f14903h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f14904a.f14898d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r6, @androidx.annotation.Nullable android.view.View r7, @androidx.annotation.NonNull android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            com.google.android.material.datepicker.c r1 = r5.f14907d
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r5.f14907d = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L27
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131558548(0x7f0d0094, float:1.8742415E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r7 = r5.m4577a()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            com.google.android.material.datepicker.v r8 = r5.f14904a
            int r2 = r8.f14899e
            if (r7 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L66
        L5d:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6d
            goto L74
        L6d:
            long r1 = r6.longValue()
            r5.m4575c(r0, r1, r7)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C7708w.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
