package com.facebook.ads.redexgen.p036X;

import android.icu.util.TimeZone;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.YP */
/* loaded from: assets/audience_network.dex */
public class C5980YP implements InterfaceC43306v {
    public final /* synthetic */ C5978YN A00;

    public C5980YP(C5978YN c5978yn) {
        this.A00 = c5978yn;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.A00.A07(EnumC434176.A05);
        }
        return this.A00.A03(TimeZone.getDefault().getRawOffset() / 1000.0f);
    }
}
