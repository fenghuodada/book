package com.facebook.ads.redexgen.p036X;

import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Yk */
/* loaded from: assets/audience_network.dex */
public class C6001Yk implements InterfaceC43306v {
    public final /* synthetic */ C5999Yi A00;

    public C6001Yk(C5999Yi c5999Yi) {
        this.A00 = c5999Yi;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        return this.A00.A03(((float) SystemClock.elapsedRealtime()) / 1000.0f);
    }
}
