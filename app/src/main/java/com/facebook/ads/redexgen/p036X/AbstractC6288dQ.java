package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.dQ */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC6288dQ implements InterfaceC39540n {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0D();

    public abstract AbstractC397518 A0E();

    public abstract boolean A0F();

    public final void A00(int i) {
        this.A00 = i;
    }

    public final void A01(long j) {
        this.A01 = j;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39540n
    public final AdPlacementType A7B() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
