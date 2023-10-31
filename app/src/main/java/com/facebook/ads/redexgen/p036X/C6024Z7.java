package com.facebook.ads.redexgen.p036X;

import android.content.pm.PackageManager;

/* renamed from: com.facebook.ads.redexgen.X.Z7 */
/* loaded from: assets/audience_network.dex */
public class C6024Z7 implements InterfaceC43306v {
    public final /* synthetic */ C6012Yv A00;

    public C6024Z7(C6012Yv c6012Yv) {
        this.A00 = c6012Yv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        PackageManager packageManager;
        PackageManager packageManager2;
        packageManager = this.A00.A02;
        if (packageManager != null) {
            C6012Yv c6012Yv = this.A00;
            packageManager2 = c6012Yv.A02;
            return c6012Yv.A0F(packageManager2.isSafeMode());
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
