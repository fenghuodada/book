package com.facebook.ads.redexgen.p036X;

import android.net.TrafficStats;

/* renamed from: com.facebook.ads.redexgen.X.YL */
/* loaded from: assets/audience_network.dex */
public class C5976YL implements InterfaceC43306v {
    public final /* synthetic */ C5973YI A00;

    public C5976YL(C5973YI c5973yi) {
        this.A00 = c5973yi;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        return this.A00.A06(C43547J.A02(TrafficStats.getMobileTxBytes()));
    }
}
