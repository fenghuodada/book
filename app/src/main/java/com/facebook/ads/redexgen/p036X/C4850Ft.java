package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ft */
/* loaded from: assets/audience_network.dex */
public final class C4850Ft {
    @Nullable
    public C4850Ft A00;
    @Nullable
    public C4946HV A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C4850Ft(long j, int i) {
        this.A04 = j;
        this.A03 = i + j;
    }

    public final int A00(long j) {
        return ((int) (j - this.A04)) + this.A01.A00;
    }

    public final C4850Ft A01() {
        this.A01 = null;
        C4850Ft c4850Ft = this.A00;
        this.A00 = null;
        return c4850Ft;
    }

    public final void A02(C4946HV c4946hv, C4850Ft c4850Ft) {
        this.A01 = c4946hv;
        this.A00 = c4850Ft;
        this.A02 = true;
    }
}
