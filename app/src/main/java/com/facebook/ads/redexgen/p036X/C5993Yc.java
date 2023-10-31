package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.Yc */
/* loaded from: assets/audience_network.dex */
public class C5993Yc implements InterfaceC43306v {
    public static String[] A01 = {"Zr9pMbCXDOnIQia1rxNbs", "xgHdKmUla89dgoNlEUmYBSdthljERTVN", "t0eJ9CzsilrQTJZ3mBY5uHdLOToWpPD0", "xn7Df6Bsn6N8b", "nuXOesuXOGqaff6jWjDzzwB48Mr7m9Ru", "HD4PNhpjIErL9f7FhF1L2XB0w8jmfy8z", "GFJMAbd7JtPv78Iw3eZ5GKABpr6j7C", "a6D5eDw1EZzTAa7WvhZLV0FGc6KUpGTS"};
    public final /* synthetic */ C5982YR A00;

    public C5993Yc(C5982YR c5982yr) {
        this.A00 = c5982yr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    @SuppressLint({"MissingPermission"})
    public final AbstractC43457A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        int A012;
        if (Build.VERSION.SDK_INT < 17) {
            return this.A00.A07(EnumC434176.A05);
        }
        boolean A0D = C43547J.A0D();
        if (A01[2].charAt(7) != 's') {
            throw new RuntimeException();
        }
        A01[4] = "7cAAgCcjwnswSonydGODzEoLsKghCJb5";
        if (A0D) {
            boolean A0C = C43547J.A0C();
            if (A01[1].charAt(23) == 'I') {
                throw new RuntimeException();
            }
            A01[7] = "A1O8dvsw8NjieGbBncMIJ1M47KAaXmaM";
            if (A0C) {
                return this.A00.A07(EnumC434176.A07);
            }
        }
        telephonyManager = this.A00.A00;
        if (telephonyManager != null) {
            C5982YR c5982yr = this.A00;
            telephonyManager2 = c5982yr.A00;
            A012 = C5982YR.A01(telephonyManager2.getAllCellInfo().get(0));
            return c5982yr.A04(A012);
        }
        C5982YR c5982yr2 = this.A00;
        EnumC434176 enumC434176 = EnumC434176.A07;
        String[] strArr = A01;
        if (strArr[3].length() != strArr[6].length()) {
            String[] strArr2 = A01;
            strArr2[3] = "coCM9MFponCPc";
            strArr2[6] = "NV1iD8UH9ErBba9OnjbAeyrfSpL8qw";
            return c5982yr2.A07(enumC434176);
        }
        return c5982yr2.A07(enumC434176);
    }
}
