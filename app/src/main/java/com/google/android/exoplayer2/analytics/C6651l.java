package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.C7159e0;
import com.google.android.exoplayer2.source.C7174j;
import com.google.android.exoplayer2.source.C7184m;
import com.google.android.exoplayer2.util.C7417m;
import com.google.android.exoplayer2.util.InterfaceC7403e;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.analytics.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C6651l implements C7417m.InterfaceC7418a, InterfaceC7403e {
    public /* synthetic */ C6651l() {
    }

    public /* synthetic */ C6651l(AnalyticsListener.C6634a c6634a, C7174j c7174j, C7184m c7184m) {
    }

    /* renamed from: a */
    public static Object m6132a(zzbl zzblVar, int i, List list, int i2) {
        zzh.zzh(zzblVar.name(), i, list);
        return list.get(i2);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7403e
    public void accept(Object obj) {
        ((C7159e0.C7161b) obj).f12866b.release();
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6188V();
    }
}
