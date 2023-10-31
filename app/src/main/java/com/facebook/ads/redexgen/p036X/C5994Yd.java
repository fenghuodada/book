package com.facebook.ads.redexgen.p036X;

import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.Yd */
/* loaded from: assets/audience_network.dex */
public class C5994Yd implements InterfaceC43306v {
    public static String[] A01 = {"z8dx8jcAs7HM5esb7c49HgQlCMJUD3t9", "Z27XjLV71jIj1KfRNg7i9pb54cjqos2V", "6E0WXe0HHFnnwQetVOp4LyZJXKm0EhYW", "5n0zxjSh5lrA6YdkKKdKdPto", "m3yiGl3d5h8kg9DGPr7qvl1tLoj9C1EY", "6Zd3QoWt03yEzQBhZFxcVO7q01Uelitn", "t47YK6eEHNb1t1eyBeM4t0RbN9Ph57Vj", "OvhOKFZHGYEQ5NA3UMfcxvSqe0D108CD"};
    public final /* synthetic */ C5982YR A00;

    public C5994Yd(C5982YR c5982yr) {
        this.A00 = c5982yr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        telephonyManager = this.A00.A00;
        if (telephonyManager != null) {
            C5982YR c5982yr = this.A00;
            if (A01[6].charAt(15) != 'y') {
                throw new RuntimeException();
            }
            A01[6] = "Ct76XBGNMfDXyoQyHbEHQKjczjA9HjKg";
            telephonyManager2 = c5982yr.A00;
            return c5982yr.A04(telephonyManager2.getSimState());
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
