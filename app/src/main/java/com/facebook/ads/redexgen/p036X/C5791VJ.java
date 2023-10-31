package com.facebook.ads.redexgen.p036X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.VJ */
/* loaded from: assets/audience_network.dex */
public final class C5791VJ implements InterfaceC4889GY {
    public static final C5791VJ A01 = new C5791VJ();
    public final List<C4888GX> A00;

    public C5791VJ() {
        this.A00 = Collections.emptyList();
    }

    public C5791VJ(C4888GX c4888gx) {
        this.A00 = Collections.singletonList(c4888gx);
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
