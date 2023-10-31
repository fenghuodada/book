package com.facebook.ads.redexgen.p036X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.VI */
/* loaded from: assets/audience_network.dex */
public final class C5790VI implements InterfaceC4889GY {
    public final List<C4888GX> A00;

    public C5790VI(List<C4888GX> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final List<C4888GX> A6B(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final long A6b(int i) {
        C4997IK.A03(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final int A6c() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final int A70(long j) {
        return j < 0 ? 0 : -1;
    }
}
