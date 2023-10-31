package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.YS */
/* loaded from: assets/audience_network.dex */
public class C5983YS implements InterfaceC43306v {
    public static String[] A01 = {"Vh7d3JLClPU6O6M8cwd6Jw", "qoTOEE24iOX0Q2iJnmkuihyFZ58dtUeG", "nAWEC03NDSwq9NkCe2EWt", "lKLCTUg5DoQjO8iCafmP2M1qyzkHzRyN", "zIUGSnqgNQBLElYl1akNx9HRDEYjixyz", "g15BZq0dmNsNcXFZVGLSC", "388jVMFAtK4Tm3JKA9SjxAcbz1TvPoye", "A1Sv5qAzVDWgkr4HaP1"};
    public final /* synthetic */ C5982YR A00;

    public C5983YS(C5982YR c5982yr) {
        this.A00 = c5982yr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        if (Build.VERSION.SDK_INT < 28) {
            return this.A00.A07(EnumC434176.A05);
        }
        C5982YR c5982yr = this.A00;
        String[] strArr = A01;
        if (strArr[4].charAt(18) != strArr[1].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "bZz0x6nk4wqsfLm60KBH7nDut9sP39y5";
        strArr2[3] = "KyjNNUgB1DvvpLcjDLXdCxQbayCmxayp";
        telephonyManager = c5982yr.A00;
        if (telephonyManager != null) {
            C5982YR c5982yr2 = this.A00;
            telephonyManager2 = c5982yr2.A00;
            return c5982yr2.A04(telephonyManager2.getSimCarrierId());
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
