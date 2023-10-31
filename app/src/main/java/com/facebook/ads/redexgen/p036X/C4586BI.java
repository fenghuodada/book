package com.facebook.ads.redexgen.p036X;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.BI */
/* loaded from: assets/audience_network.dex */
public final class C4586BI implements InterfaceC5760Uo, Comparator<C4985I8> {
    public static String[] A03 = {"qrCZDebBZXOMsu5PI8FdamZv", "usPTrKdLrE7MLvxS6mJMRwkls4hZpcPz", "BDrpv9J1bckqz2zbQbGMwvdv", "cHdTuf55w1r5Lcr9n47avjSAGBdp9rLc", "v1mI", "NFtkBlX9Mz", "lz", "jBDMosIM65rjrOuIbY8WA7ZUxyDm84U3"};
    public long A00;
    public final long A01;
    public final TreeSet<C4985I8> A02 = new TreeSet<>(this);

    public C4586BI(long j) {
        this.A01 = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(C4985I8 c4985i8, C4985I8 c4985i82) {
        if (c4985i8.A00 - c4985i82.A00 == 0) {
            return c4985i8.compareTo(c4985i82);
        }
        return c4985i8.A00 < c4985i82.A00 ? -1 : 1;
    }

    private void A01(InterfaceC4981I4 interfaceC4981I4, long j) {
        while (this.A00 + j > this.A01) {
            boolean isEmpty = this.A02.isEmpty();
            if (A03[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "3qXh8T5e4LOlD1IWJEc6SNWF";
            strArr[2] = "YJzC3pPkQPrTmiUzc4g95RWz";
            if (!isEmpty) {
                try {
                    interfaceC4981I4.ADx(this.A02.first());
                } catch (C4979I2 unused) {
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4980I3
    public final void ACN(InterfaceC4981I4 interfaceC4981I4, C4985I8 c4985i8) {
        this.A02.add(c4985i8);
        this.A00 += c4985i8.A01;
        A01(interfaceC4981I4, 0L);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4980I3
    public final void ACO(InterfaceC4981I4 interfaceC4981I4, C4985I8 c4985i8) {
        this.A02.remove(c4985i8);
        this.A00 -= c4985i8.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4980I3
    public final void ACP(InterfaceC4981I4 interfaceC4981I4, C4985I8 c4985i8, C4985I8 c4985i82) {
        ACO(interfaceC4981I4, c4985i8);
        ACN(interfaceC4981I4, c4985i82);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5760Uo
    public final void ACQ(InterfaceC4981I4 interfaceC4981I4, String str, long j, long j2) {
        A01(interfaceC4981I4, j2);
    }
}
