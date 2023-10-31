package com.facebook.ads.redexgen.p036X;

import android.content.pm.PackageInfo;

/* renamed from: com.facebook.ads.redexgen.X.Z0 */
/* loaded from: assets/audience_network.dex */
public class C6017Z0 implements InterfaceC43306v {
    public final /* synthetic */ C6012Yv A00;

    public C6017Z0(C6012Yv c6012Yv) {
        this.A00 = c6012Yv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        packageInfo = this.A00.A01;
        if (packageInfo != null) {
            C6012Yv c6012Yv = this.A00;
            packageInfo2 = c6012Yv.A01;
            return c6012Yv.A08(packageInfo2.packageName);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
