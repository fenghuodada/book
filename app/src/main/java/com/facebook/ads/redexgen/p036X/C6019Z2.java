package com.facebook.ads.redexgen.p036X;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Z2 */
/* loaded from: assets/audience_network.dex */
public class C6019Z2 implements InterfaceC43306v {
    public final /* synthetic */ C6012Yv A00;

    public C6019Z2(C6012Yv c6012Yv) {
        this.A00 = c6012Yv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        PackageInfo packageInfo3;
        packageInfo = this.A00.A01;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                C6012Yv c6012Yv = this.A00;
                packageInfo3 = c6012Yv.A01;
                return c6012Yv.A06(packageInfo3.getLongVersionCode());
            }
            C6012Yv c6012Yv2 = this.A00;
            packageInfo2 = c6012Yv2.A01;
            return c6012Yv2.A04(packageInfo2.versionCode);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
