package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.C7127q0;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;
import com.google.android.gms.measurement.internal.zzgd;

/* renamed from: com.google.android.exoplayer2.analytics.m */
/* loaded from: classes.dex */
public final /* synthetic */ class C6652m implements C7417m.InterfaceC7418a {
    public /* synthetic */ C6652m(AnalyticsListener.C6634a c6634a, C7127q0 c7127q0, int i) {
    }

    /* renamed from: a */
    public static void m6131a(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzd().zza(str);
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6145x();
    }
}
