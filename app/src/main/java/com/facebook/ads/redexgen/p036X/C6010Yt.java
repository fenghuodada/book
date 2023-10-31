package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.os.PowerManager;

/* renamed from: com.facebook.ads.redexgen.X.Yt */
/* loaded from: assets/audience_network.dex */
public class C6010Yt implements InterfaceC43306v {
    public final /* synthetic */ C6008Yr A00;

    public C6010Yt(C6008Yr c6008Yr) {
        this.A00 = c6008Yr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        PowerManager powerManager;
        PowerManager powerManager2;
        if (Build.VERSION.SDK_INT >= 23) {
            powerManager = this.A00.A00;
            if (powerManager != null) {
                C6008Yr c6008Yr = this.A00;
                powerManager2 = c6008Yr.A00;
                return c6008Yr.A0F(powerManager2.isDeviceIdleMode());
            }
            return this.A00.A07(EnumC434176.A07);
        }
        return this.A00.A07(EnumC434176.A05);
    }
}
