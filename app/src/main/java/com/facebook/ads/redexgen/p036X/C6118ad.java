package com.facebook.ads.redexgen.p036X;

import android.content.pm.ApplicationInfo;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.ad */
/* loaded from: assets/audience_network.dex */
public class C6118ad implements InterfaceC43306v {
    public final /* synthetic */ C6113aY A00;

    public C6118ad(C6113aY c6113aY) {
        this.A00 = c6113aY;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        if (Build.VERSION.SDK_INT >= 9) {
            applicationInfo = this.A00.A01;
            if (applicationInfo != null) {
                C6113aY c6113aY = this.A00;
                applicationInfo2 = c6113aY.A01;
                return c6113aY.A08(applicationInfo2.nativeLibraryDir);
            }
            return this.A00.A07(EnumC434176.A07);
        }
        return this.A00.A07(EnumC434176.A05);
    }
}
