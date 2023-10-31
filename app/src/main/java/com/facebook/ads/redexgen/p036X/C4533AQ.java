package com.facebook.ads.redexgen.p036X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.AQ */
/* loaded from: assets/audience_network.dex */
public final class C4533AQ {
    public static String[] A0C = {"WV1wdoH9jrQVDigahBrbrXyjnekpmiiE", "mIVo7Cnr72P7RKesjBWLJYV7ajvYF70D", "pH5vi4Kbi5SdF2Ft8jCp0yyfmrwCNJ93", "VAiIhwzGtJV", "mutijWrtbdTsRUOKFhZTpXzdiINxdKbV", "iAqM", "YM6GPYhzTMlO14HNxrpVvdDRlTI", "SmN7PcN3RYN"};
    public final int A00;
    public final int A01;
    public final C4548Ag A02;
    public final AbstractC4944HT A03;
    public final Set<InterfaceC4552Ak> A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C4533AQ(C4548Ag c4548Ag, C4548Ag c4548Ag2, Set<InterfaceC4552Ak> set, AbstractC4944HT abstractC4944HT, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
        this.A02 = c4548Ag;
        this.A04 = set;
        this.A03 = abstractC4944HT;
        this.A08 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = z2;
        this.A06 = z3;
        this.A07 = z4 || c4548Ag2.A00 != c4548Ag.A00;
        this.A0A = (c4548Ag2.A03 == c4548Ag.A03 && c4548Ag2.A07 == c4548Ag.A07) ? false : true;
        this.A05 = c4548Ag2.A08 != c4548Ag.A08;
        this.A0B = c4548Ag2.A06 != c4548Ag.A06;
    }

    public final void A00() {
        if (this.A0A || this.A01 == 0) {
            for (InterfaceC4552Ak interfaceC4552Ak : this.A04) {
                interfaceC4552Ak.ACW(this.A02.A03, this.A02.A07, this.A01);
            }
        }
        boolean z = this.A08;
        String[] strArr = A0C;
        if (strArr[1].charAt(12) == strArr[4].charAt(12)) {
            String[] strArr2 = A0C;
            strArr2[3] = "CSJCqnrxZvV";
            strArr2[7] = "Hkj5q7ot6VH";
            if (z) {
                Iterator<InterfaceC4552Ak> it = this.A04.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    String[] strArr3 = A0C;
                    if (strArr3[0].charAt(22) == strArr3[2].charAt(22)) {
                        String[] strArr4 = A0C;
                        strArr4[1] = "CqJcwx9zuxyuReRUn3Ztwbm9rESV0hnU";
                        strArr4[4] = "BsXcrNWYLVI0RgolRvCIuekTJNQNO1r0";
                        if (!hasNext) {
                            break;
                        }
                        it.next().ABu(this.A00);
                    } else if (!hasNext) {
                        break;
                    } else {
                        it.next().ABu(this.A00);
                    }
                }
            }
            if (this.A0B) {
                this.A03.A0U(this.A02.A06.A02);
                for (InterfaceC4552Ak interfaceC4552Ak2 : this.A04) {
                    interfaceC4552Ak2.ACY(this.A02.A05, this.A02.A06.A01);
                }
            }
            boolean z2 = this.A05;
            String[] strArr5 = A0C;
            if (strArr5[1].charAt(12) == strArr5[4].charAt(12)) {
                String[] strArr6 = A0C;
                strArr6[6] = "ZmCtUBpIkW4VOgBlZsMYRrBehzT";
                strArr6[5] = "Qd2F";
                if (z2) {
                    for (InterfaceC4552Ak interfaceC4552Ak3 : this.A04) {
                        interfaceC4552Ak3.ABN(this.A02.A08);
                    }
                }
                if (this.A07) {
                    for (InterfaceC4552Ak interfaceC4552Ak4 : this.A04) {
                        interfaceC4552Ak4.ABs(this.A06, this.A02.A00);
                    }
                }
                if (this.A09) {
                    for (InterfaceC4552Ak listener : this.A04) {
                        listener.ACH();
                    }
                    return;
                }
                return;
            }
        }
        throw new RuntimeException();
    }
}
