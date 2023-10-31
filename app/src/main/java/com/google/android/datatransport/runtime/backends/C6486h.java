package com.google.android.datatransport.runtime.backends;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: com.google.android.datatransport.runtime.backends.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C6486h implements C7417m.InterfaceC7418a {
    public /* synthetic */ C6486h(AnalyticsListener.C6634a c6634a, float f) {
    }

    /* renamed from: a */
    public static /* synthetic */ String m6311a(int i) {
        return i == 1 ? "OK" : i == 2 ? "TRANSIENT_ERROR" : i == 3 ? "FATAL_ERROR" : i == 4 ? "INVALID_PAYLOAD" : "null";
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6173f0();
    }
}
