package com.facebook.ads.redexgen.p036X;

import android.content.pm.ApplicationInfo;

/* renamed from: com.facebook.ads.redexgen.X.ac */
/* loaded from: assets/audience_network.dex */
public class C6117ac implements InterfaceC43306v {
    public static String[] A01 = {"b1sQJ", "SIF58uGHe7qyLmHU2z0R0", "OwOBv3ZEKz2Te88ibAl3d47J53q2OGoK", "esWFBpscKVup9jNI8XCXNCETTdpqRq5Z", "zivB8", "FBi4O7QrEsFNvdqkgZ6MOGJI", "H45EAoAIvQ1szMaGMHC8haArjN6", "w12X6M1S0qfh4A3JJ2wkr2WlTLMqdjE1"};
    public final /* synthetic */ C6113aY A00;

    public C6117ac(C6113aY c6113aY) {
        this.A00 = c6113aY;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo != null) {
            C6113aY c6113aY = this.A00;
            applicationInfo2 = c6113aY.A01;
            return c6113aY.A08(applicationInfo2.publicSourceDir);
        }
        C6113aY c6113aY2 = this.A00;
        String[] strArr = A01;
        if (strArr[4].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "DiCvH";
        strArr2[0] = "OWYZT";
        return c6113aY2.A07(EnumC434176.A07);
    }
}
