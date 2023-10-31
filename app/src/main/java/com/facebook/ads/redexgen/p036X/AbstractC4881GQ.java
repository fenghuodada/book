package com.facebook.ads.redexgen.p036X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.GQ */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4881GQ implements InterfaceC5570Rj {
    public final C4915Gy A00;
    public final EnumC5575Ro A01;

    public AbstractC4881GQ(C4915Gy c4915Gy, EnumC5575Ro enumC5575Ro) {
        this.A00 = c4915Gy;
        this.A01 = enumC5575Ro;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5570Rj
    public void A3O(Map<InterfaceC5552RR, EnumC5575Ro> map, Map<InterfaceC4886GV, EnumC5562Rb> map2) {
        map.put(this.A00, this.A01);
    }
}
