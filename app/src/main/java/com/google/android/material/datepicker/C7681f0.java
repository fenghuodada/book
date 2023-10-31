package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p060j$.util.DesugarTimeZone;

/* renamed from: com.google.android.material.datepicker.f0 */
/* loaded from: classes3.dex */
public final class C7681f0 {

    /* renamed from: a */
    public static final AtomicReference<C7676d0> f14847a = new AtomicReference<>();

    /* renamed from: a */
    public static long m4593a(long j) {
        Calendar m4589e = m4589e(null);
        m4589e.setTimeInMillis(j);
        return m4591c(m4589e).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m4592b(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DisplayContext displayContext;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        timeZone = TimeZone.getTimeZone("UTC");
        instanceForSkeleton.setTimeZone(timeZone);
        displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
        instanceForSkeleton.setContext(displayContext);
        return instanceForSkeleton;
    }

    /* renamed from: c */
    public static Calendar m4591c(Calendar calendar) {
        Calendar m4589e = m4589e(calendar);
        Calendar m4589e2 = m4589e(null);
        m4589e2.set(m4589e.get(1), m4589e.get(2), m4589e.get(5));
        return m4589e2;
    }

    /* renamed from: d */
    public static Calendar m4590d() {
        Calendar calendar;
        C7676d0 c7676d0 = f14847a.get();
        if (c7676d0 == null) {
            c7676d0 = C7676d0.f14843c;
        }
        java.util.TimeZone timeZone = c7676d0.f14845b;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = c7676d0.f14844a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: e */
    public static Calendar m4589e(@Nullable Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
