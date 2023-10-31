package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0w */
/* loaded from: assets/audience_network.dex */
public final class C39630w extends C40512M implements InterfaceC5102K3 {
    public C4525AI A00;
    @Nullable
    public List<C5437Pa> A01;

    public C39630w(C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A00 = new C4525AI(this, 1, null, null, null);
    }

    public final void A22(C5521Qw c5521Qw) {
        C4525AI c4525ai = this.A00;
        if (c4525ai != null) {
            c4525ai.A0d(c5521Qw);
        }
    }

    public C4525AI getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0e(this.A01);
    }
}
