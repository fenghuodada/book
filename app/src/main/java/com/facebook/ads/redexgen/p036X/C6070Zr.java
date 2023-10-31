package com.facebook.ads.redexgen.p036X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Zr */
/* loaded from: assets/audience_network.dex */
public class C6070Zr implements InterfaceC43306v {
    public final /* synthetic */ C6060Zh A00;

    public C6070Zr(C6060Zh c6060Zh) {
        this.A00 = c6060Zh;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A07(EnumC434176.A05);
        }
        return this.A00.A08(Build.VERSION.BASE_OS);
    }
}
