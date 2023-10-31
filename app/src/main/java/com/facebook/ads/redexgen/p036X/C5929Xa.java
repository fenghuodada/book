package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* renamed from: com.facebook.ads.redexgen.X.Xa */
/* loaded from: assets/audience_network.dex */
public class C5929Xa implements InterfaceC44188Y {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C5928XZ A01;

    public C5929Xa(C5928XZ c5928xz, AdvertisingId advertisingId) {
        this.A01 = c5928xz;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44188Y
    public final boolean A8Y() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44188Y
    public final String getId() {
        return this.A00.getId();
    }
}
