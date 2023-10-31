package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.YX */
/* loaded from: assets/audience_network.dex */
public class C5988YX implements InterfaceC43306v {
    public final /* synthetic */ C5982YR A00;

    public C5988YX(C5982YR c5982yr) {
        this.A00 = c5982yr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        if (Build.VERSION.SDK_INT >= 23) {
            telephonyManager = this.A00.A00;
            if (telephonyManager != null) {
                C5982YR c5982yr = this.A00;
                telephonyManager2 = c5982yr.A00;
                return c5982yr.A04(telephonyManager2.getPhoneCount());
            }
            return this.A00.A07(EnumC434176.A07);
        }
        return this.A00.A07(EnumC434176.A05);
    }
}
