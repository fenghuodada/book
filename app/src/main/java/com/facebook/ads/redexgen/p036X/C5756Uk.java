package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Uk */
/* loaded from: assets/audience_network.dex */
public final class C5756Uk implements InterfaceC5013Ia {
    public static String[] A05 = {"JbcDsPAiqgb9rsViVRKehTXv1iFS9Alt", "AfEyeuF2jCfkWNmIQlP22Iq9vQ5XDBZo", "cIPTiq2qkEqnYzKxb3sH3HOJO6VigB4N", "bIuwftDwBGArWYVN2grLSP1kPnHfbgfq", "1GGMxn0jatOJtlepcpEnLiyqpa0L6Zpp", "dBndgbsmlMbgteIClih73P1Nf1skDdlq", "kMZcBPwOEd1j6nxu2sFbdi5kLjNzhQnH", "M7tzCbQcNsxxyZ9EacAqZIMXmH340eiG"};
    public long A00;
    public long A01;
    public C4549Ah A02 = C4549Ah.A04;
    public boolean A03;
    public final InterfaceC5000IN A04;

    public C5756Uk(InterfaceC5000IN interfaceC5000IN) {
        this.A04 = interfaceC5000IN;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A58();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            long A7H = A7H();
            if (A05[0].charAt(9) == 'F') {
                throw new RuntimeException();
            }
            A05[0] = "yV0nDN2yEP24GlsqsYFBRUnmoDIsFkRQ";
            A02(A7H);
            this.A03 = false;
        }
    }

    public final void A02(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = this.A04.A58();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5013Ia
    public final C4549Ah A7E() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5013Ia
    public final long A7H() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A58 = this.A04.A58();
            if (A05[0].charAt(9) != 'F') {
                A05[1] = "ixlqsHFDPmeKY4bwdkSegalU4BLtdIOn";
                long j = A58 - this.A00;
                if (this.A02.A01 == 1.0f) {
                    long A00 = C4523AG.A00(j);
                    if (A05[3].charAt(4) != 'j') {
                        A05[0] = "AIwpqv7aDt0R5Z0o8sSBDj22LkfdUh0v";
                        return elapsedSinceBaseMs + A00;
                    }
                    A05[0] = "vgrMGSSY4L8ja71DPmzZRGyrcWnnIJj3";
                    return elapsedSinceBaseMs + A00;
                }
                return elapsedSinceBaseMs + this.A02.A00(j);
            }
            throw new RuntimeException();
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5013Ia
    public final C4549Ah AEf(C4549Ah c4549Ah) {
        if (this.A03) {
            A02(A7H());
        }
        this.A02 = c4549Ah;
        return c4549Ah;
    }
}
