package com.facebook.ads.redexgen.p036X;

import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Z6 */
/* loaded from: assets/audience_network.dex */
public class C6023Z6 implements InterfaceC43306v {
    public static String[] A01 = {"eOUuWViEzFdpoMILAqmgKfGD", "kQ8zGky5wq3o9AT", "ncGQnuO4sM8XFQVxbr6Mt1Vf36DFujo3", "a4nYvm2BizGaG1Ug1SxTpBLIw0WxQ6vz", "jAlZY9MHNrHTDDv2DRP1sCieuZx8QBhv", "RCRcS7R4oQOTyLjlpIEX5API7Ni0gnf1", "stcG16G11KY1ooFu5mTwbs8KzP9kRkND", "k7goAJY4JhsqFIUQ56a5dCg3eq5QWQcp"};
    public final /* synthetic */ C6012Yv A00;

    public C6023Z6(C6012Yv c6012Yv) {
        this.A00 = c6012Yv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        PackageManager packageManager;
        PackageManager packageManager2;
        PackageManager packageManager3;
        PackageManager packageManager4;
        if (Build.VERSION.SDK_INT >= 26) {
            packageManager = this.A00.A02;
            if (packageManager != null) {
                packageManager2 = this.A00.A02;
                if (packageManager2.getPackageInstaller() != null) {
                    packageManager3 = this.A00.A02;
                    if (packageManager3.getPackageInstaller().getSessionInfo(0) != null) {
                        C6012Yv c6012Yv = this.A00;
                        packageManager4 = c6012Yv.A02;
                        return c6012Yv.A04(packageManager4.getPackageInstaller().getSessionInfo(0).getInstallReason());
                    }
                }
            }
            C6012Yv c6012Yv2 = this.A00;
            EnumC434176 enumC434176 = EnumC434176.A07;
            if (A01[4].charAt(16) != 'D') {
                throw new RuntimeException();
            }
            A01[4] = "aumDgxyAyTkwYeibDzhpdrzSDvCJmfPb";
            return c6012Yv2.A07(enumC434176);
        }
        return this.A00.A07(EnumC434176.A05);
    }
}
