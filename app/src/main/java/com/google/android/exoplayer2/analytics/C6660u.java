package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;
import java.util.HashMap;

/* renamed from: com.google.android.exoplayer2.analytics.u */
/* loaded from: classes.dex */
public final /* synthetic */ class C6660u implements C7417m.InterfaceC7418a {
    public /* synthetic */ C6660u(AnalyticsListener.C6634a c6634a, String str, long j, long j2) {
    }

    /* renamed from: a */
    public static void m6129a(int i, HashMap hashMap, String str, int i2, String str2, int i3, String str3, int i4, String str4) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
        hashMap.put(str3, Integer.valueOf(i3));
        hashMap.put(str4, Integer.valueOf(i4));
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.m6207C();
        analyticsListener.m6194P();
        analyticsListener.m6185Y();
    }
}
