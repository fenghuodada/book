package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.os.PowerManager;

/* renamed from: com.facebook.ads.redexgen.X.Yu */
/* loaded from: assets/audience_network.dex */
public class C6011Yu implements InterfaceC43306v {
    public final /* synthetic */ C6008Yr A00;

    public C6011Yu(C6008Yr c6008Yr) {
        this.A00 = c6008Yr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        PowerManager powerManager;
        boolean A04;
        powerManager = this.A00.A00;
        if (powerManager != null && Build.VERSION.SDK_INT >= 7) {
            C6008Yr c6008Yr = this.A00;
            A04 = c6008Yr.A04();
            return c6008Yr.A0F(A04);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
