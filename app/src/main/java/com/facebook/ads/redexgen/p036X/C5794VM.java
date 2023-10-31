package com.facebook.ads.redexgen.p036X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.VM */
/* loaded from: assets/audience_network.dex */
public final class C5794VM implements InterfaceC4889GY {
    public final long[] A00;
    public final C4888GX[] A01;

    public C5794VM(C4888GX[] c4888gxArr, long[] jArr) {
        this.A01 = c4888gxArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final List<C4888GX> A6B(long j) {
        int A0B = C5038Iz.A0B(this.A00, j, true, false);
        if (A0B != -1) {
            C4888GX[] c4888gxArr = this.A01;
            if (c4888gxArr[A0B] != null) {
                return Collections.singletonList(c4888gxArr[A0B]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final long A6b(int i) {
        boolean z = true;
        C4997IK.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        C4997IK.A03(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final int A6c() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final int A70(long j) {
        int A0A = C5038Iz.A0A(this.A00, j, false, false);
        if (A0A < this.A00.length) {
            return A0A;
        }
        return -1;
    }
}
