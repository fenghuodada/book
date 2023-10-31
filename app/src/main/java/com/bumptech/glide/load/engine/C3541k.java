package com.bumptech.glide.load.engine;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: com.bumptech.glide.load.engine.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C3541k implements C7417m.InterfaceC7418a {
    public /* synthetic */ C3541k(AnalyticsListener.C6634a c6634a, Exception exc) {
    }

    /* renamed from: a */
    public static /* synthetic */ String m6646a(int i) {
        return i == 1 ? "INITIALIZE" : i == 2 ? "SWITCH_TO_SOURCE_SERVICE" : i == 3 ? "DECODE_DATA" : "null";
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6192R();
    }
}
