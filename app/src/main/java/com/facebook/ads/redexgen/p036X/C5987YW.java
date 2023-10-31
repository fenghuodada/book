package com.facebook.ads.redexgen.p036X;

import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.YW */
/* loaded from: assets/audience_network.dex */
public class C5987YW implements InterfaceC43306v {
    public static String[] A01 = {"Vo88lINS9S2N5LbTaKf1W2kwN6BIQQdD", "UoAdPktVrqtin724LV50L5", "LFaB2DLRyLVTAupR8IDTAiu1ygiAQNei", "sJjAsr1DYzEdJFVxSj", "YixUmkecZHZtQTXRs3SEpcqVtXLRAsNc", "NCQvJXIWgGsA6V8X34C", "SF2vY0k52k3yZQV1rBM1cg", "e4uMFN1tyFqCHoW3Lf"};
    public final /* synthetic */ C5982YR A00;

    public C5987YW(C5982YR c5982yr) {
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
            return c5982yr.A08(telephonyManager2.getNetworkOperator());
        }
        C5982YR c5982yr2 = this.A00;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A01[5] = "y3WpFIrw6SINDCFjG4EXd7NBg48ZDa";
        return c5982yr2.A07(EnumC434176.A07);
    }
}
