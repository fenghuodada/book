package com.facebook.ads.redexgen.p036X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Dy */
/* loaded from: assets/audience_network.dex */
public final class C4735Dy {
    public final int A00;
    public final long A01;

    public C4735Dy(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C4735Dy A00(InterfaceC4659Cd interfaceC4659Cd, C5022Ij c5022Ij) throws IOException, InterruptedException {
        interfaceC4659Cd.AD7(c5022Ij.A00, 0, 8);
        c5022Ij.A0Y(0);
        int id = c5022Ij.A08();
        return new C4735Dy(id, c5022Ij.A0K());
    }
}
