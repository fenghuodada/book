package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.c4 */
/* loaded from: assets/audience_network.dex */
public class C6206c4 implements InterfaceC41734N {
    public static String[] A01 = {"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    public final /* synthetic */ C4804F9 A00;

    public C6206c4(C4804F9 c4804f9) {
        this.A00 = c4804f9;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41734N
    public final void A9z(AbstractC41974l abstractC41974l) {
        boolean A0A;
        abstractC41974l.A0Z(true);
        if (abstractC41974l.A06 != null && abstractC41974l.A07 == null) {
            abstractC41974l.A06 = null;
        }
        abstractC41974l.A07 = null;
        A0A = abstractC41974l.A0A();
        if (!A0A && !this.A00.A1z(abstractC41974l.A0H) && abstractC41974l.A0e()) {
            C4804F9 c4804f9 = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            A01[0] = "BbBTSQcWyeSpGVnm";
            c4804f9.removeDetachedView(abstractC41974l.A0H, false);
        }
    }
}
