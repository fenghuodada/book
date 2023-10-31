package com.facebook.ads.redexgen.p036X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.GR */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4882GR implements InterfaceC5570Rj {
    public final EnumC5562Rb A00;
    public final C41714L A01;

    public AbstractC4882GR(C41714L c41714l, EnumC5562Rb enumC5562Rb) {
        this.A01 = c41714l;
        this.A00 = enumC5562Rb;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5570Rj
    public void A3O(Map<InterfaceC5552RR, EnumC5575Ro> map, Map<InterfaceC4886GV, EnumC5562Rb> map2) {
        map2.put(this.A01, this.A00);
    }
}
