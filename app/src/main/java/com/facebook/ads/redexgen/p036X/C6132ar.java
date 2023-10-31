package com.facebook.ads.redexgen.p036X;

import android.content.pm.ApplicationInfo;

/* renamed from: com.facebook.ads.redexgen.X.ar */
/* loaded from: assets/audience_network.dex */
public class C6132ar implements InterfaceC43306v {
    public final /* synthetic */ C6113aY A00;

    public C6132ar(C6113aY c6113aY) {
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
            return c6113aY.A04(applicationInfo2.theme);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
