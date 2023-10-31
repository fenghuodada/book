package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.BF */
/* loaded from: assets/audience_network.dex */
public final class C4583BF extends C6213cB {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public C4584BG A03;
    public int[] A04;
    public final C5953Xy A05;
    public final C5430PT A06;
    public final C5431PU A07;

    public C4583BF(C5953Xy c5953Xy, C5431PU c5431pu, C5430PT c5430pt) {
        super(c5953Xy);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c5953Xy;
        this.A07 = c5431pu;
        this.A06 = c5430pt;
        this.A01 = -1;
        this.A03 = new C4584BG(this, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0 != 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r0 == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        super.A1J(r17, r18, r19, r20);
     */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41794T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1J(com.facebook.ads.redexgen.p036X.C41874b r17, com.facebook.ads.redexgen.p036X.C41944i r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4583BF.A1J(com.facebook.ads.redexgen.X.4b, com.facebook.ads.redexgen.X.4i, int, int):void");
    }

    @Override // com.facebook.ads.redexgen.p036X.C6213cB, com.facebook.ads.redexgen.p036X.AbstractC41794T
    public final void A1t(int i) {
        A2F(i, this.A02);
    }

    @Override // com.facebook.ads.redexgen.p036X.C6213cB, com.facebook.ads.redexgen.p036X.AbstractC41794T
    public final void A21(C4804F9 c4804f9, C41944i c41944i, int i) {
        this.A03.A0A(i);
        A1L(this.A03);
    }

    public final void A2K(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new C4584BG(this, this.A05);
    }

    public final void A2L(int i) {
        this.A01 = i;
    }

    public final void A2M(int i) {
        this.A02 = i;
    }
}
