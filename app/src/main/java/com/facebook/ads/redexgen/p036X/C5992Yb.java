package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.Yb */
/* loaded from: assets/audience_network.dex */
public class C5992Yb implements InterfaceC43306v {
    public static String[] A01 = {"xn6Y4xiAj5nTE1ZX0fcI9", "IuzZJNTC9Fpz", "Zp9uFgGuFlryeSNHyo4T0p", "eRJH2gjtevDtLFu1wMxFEv", "pTKacr9NdWTXHSX", "3c0ViuxMUKEAC", "2WDSEnCYP4spNEJs", "S3q5Kz3J"};
    public final /* synthetic */ C5982YR A00;

    public C5992Yb(C5982YR c5982yr) {
        this.A00 = c5982yr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        if (Build.VERSION.SDK_INT >= 26) {
            telephonyManager = this.A00.A00;
            if (telephonyManager != null) {
                C5982YR c5982yr = this.A00;
                telephonyManager2 = c5982yr.A00;
                return c5982yr.A0F(telephonyManager2.isDataEnabled());
            }
            return this.A00.A07(EnumC434176.A07);
        }
        C5982YR c5982yr2 = this.A00;
        String[] strArr = A01;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "x95Rh7kgyGSfBF3YHwpGzi";
        strArr2[3] = "73CHLU13D6YvD39ECjSAyL";
        return c5982yr2.A07(EnumC434176.A05);
    }
}
