package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Ev */
/* loaded from: assets/audience_network.dex */
public class RunnableC4790Ev implements Runnable {
    public static String[] A02 = {"PHglGL4XjX34Q6IxLVPE9YioC0GgMwVu", "C2v6p3cvqb8VeZJmls5VVCvxLYipHy3t", "B1N0Tyuu9FQ6QTrTU7ijuANEMG", "iuv0k0UwV2hxTLPIE5sOwikENKEW9q70", "E2s9cNULSafngvXq", "pcZveafGMpvyt6r1oEwZuN", "WTgfgYLlZCoaxL5kkJP8NMEH1L99huZD", "JeTmk3Th2rZrNzRyDKokFPK9mdehXDhr"};
    public final /* synthetic */ RunnableC4792Ex A00;
    public final /* synthetic */ Throwable A01;

    public RunnableC4790Ev(RunnableC4792Ex runnableC4792Ex, Throwable th) {
        this.A00 = runnableC4792Ex;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean A0G;
        boolean A0F;
        boolean A0F2;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A0G = this.A00.A0G(1, this.A01 != null ? 4 : 2, this.A01);
            if (A0G) {
                return;
            }
            A0F = this.A00.A0F(6, 3);
            if (A0F) {
                return;
            }
            A0F2 = this.A00.A0F(7, 0);
            if (!A0F2) {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            String[] strArr = A02;
            if (strArr[3].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "RKKtkNHXa9KnDNNutMsCnoFR2DmhfaHg";
            strArr2[7] = "GRntkGfXke7q4gy1a5nBcYrAffQzlmQw";
        }
    }
}
