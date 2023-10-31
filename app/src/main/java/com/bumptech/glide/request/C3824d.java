package com.bumptech.glide.request;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: com.bumptech.glide.request.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C3824d implements C7417m.InterfaceC7418a {
    public /* synthetic */ C3824d(AnalyticsListener.C6634a c6634a, String str) {
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m6454a(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6180b0();
    }
}
