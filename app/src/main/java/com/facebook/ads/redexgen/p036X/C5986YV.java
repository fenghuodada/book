package com.facebook.ads.redexgen.p036X;

import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.YV */
/* loaded from: assets/audience_network.dex */
public class C5986YV implements InterfaceC43306v {
    public final /* synthetic */ C5982YR A00;

    public C5986YV(C5982YR c5982yr) {
        this.A00 = c5982yr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        telephonyManager = this.A00.A00;
        if (telephonyManager != null) {
            C5982YR c5982yr = this.A00;
            telephonyManager2 = c5982yr.A00;
            return c5982yr.A08(telephonyManager2.getNetworkOperatorName());
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
