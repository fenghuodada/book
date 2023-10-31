package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.AU */
/* loaded from: assets/audience_network.dex */
public final class C4537AU {
    public int A00;
    public int A01;
    public C4548Ag A02;
    public boolean A03;

    public C4537AU() {
    }

    public /* synthetic */ C4537AU(RunnableC4534AR runnableC4534AR) {
        this();
    }

    public static /* synthetic */ int A00(C4537AU c4537au) {
        return c4537au.A01;
    }

    public static /* synthetic */ int A01(C4537AU c4537au) {
        return c4537au.A00;
    }

    public static /* synthetic */ boolean A02(C4537AU c4537au) {
        return c4537au.A03;
    }

    public final void A03(int i) {
        this.A01 += i;
    }

    public final void A04(int i) {
        if (this.A03 && this.A00 != 4) {
            C4997IK.A03(i == 4);
            return;
        }
        this.A03 = true;
        this.A00 = i;
    }

    public final void A05(C4548Ag c4548Ag) {
        this.A02 = c4548Ag;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C4548Ag c4548Ag) {
        return c4548Ag != this.A02 || this.A01 > 0 || this.A03;
    }
}
