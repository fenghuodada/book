package com.facebook.ads.redexgen.p036X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.VK */
/* loaded from: assets/audience_network.dex */
public final class C5792VK implements InterfaceC4889GY {
    public final C4912Gv A00;
    public final Map<String, C4918H1> A01;
    public final Map<String, C4913Gw> A02;
    public final long[] A03;

    public C5792VK(C4912Gv c4912Gv, Map<String, C4918H1> map, Map<String, C4913Gw> map2) {
        Map<String, C4918H1> emptyMap;
        this.A00 = c4912Gv;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = c4912Gv.A0F();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final List<C4888GX> A6B(long j) {
        return this.A00.A0D(j, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final long A6b(int i) {
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final int A6c() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final int A70(long j) {
        int A0A = C5038Iz.A0A(this.A03, j, false, false);
        if (A0A < this.A03.length) {
            return A0A;
        }
        return -1;
    }
}
