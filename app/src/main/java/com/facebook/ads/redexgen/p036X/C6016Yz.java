package com.facebook.ads.redexgen.p036X;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Yz */
/* loaded from: assets/audience_network.dex */
public class C6016Yz implements InterfaceC43306v {
    public static String[] A01 = {"zJajY9dZZxYFsLRzsvnBiwQWt0HnizLC", "gzFaheVOcPUMbI38nwUIVYmc91b5uR", "ce0KJPPQByTAaQ9ATxZk2kwW24DeaJ9j", "R6Wiv8wmYaZdmPdgU3hXsutSf", "job2ys34errF3to", "kwK9VFGEGX8wPEd", "j3AidPNHk3dBWfN6HPyZ7", "rfM1O6R1RyyEf1DP"};
    public final /* synthetic */ C6012Yv A00;

    public C6016Yz(C6012Yv c6012Yv) {
        this.A00 = c6012Yv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        packageInfo = this.A00.A01;
        if (packageInfo != null && Build.VERSION.SDK_INT >= 22) {
            C6012Yv c6012Yv = this.A00;
            if (A01[1].length() != 30) {
                throw new RuntimeException();
            }
            A01[6] = "SsABSdrOWb5CHUfmSefeH";
            packageInfo2 = c6012Yv.A01;
            return c6012Yv.A04(packageInfo2.baseRevisionCode);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
