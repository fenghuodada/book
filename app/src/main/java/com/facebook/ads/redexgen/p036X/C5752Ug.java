package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Ug */
/* loaded from: assets/audience_network.dex */
public final class C5752Ug implements InterfaceC6352eX<C5070JX, C5075Jc> {
    public C5749Ud A00;

    public C5752Ug(C5749Ud c5749Ud) {
        this.A00 = c5749Ud;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC6352eX
    public final void A5I(C6349eU<C5070JX, C5075Jc> c6349eU, InterfaceC6338eJ interfaceC6338eJ) {
        int i = C5068JV.A00[interfaceC6338eJ.A7o(c6349eU).ordinal()];
        if (i != 1 && i != 2) {
            return;
        }
        this.A00.A02(c6349eU, interfaceC6338eJ);
    }
}
