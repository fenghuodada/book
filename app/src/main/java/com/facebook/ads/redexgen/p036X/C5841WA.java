package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.WA */
/* loaded from: assets/audience_network.dex */
public final class C5841WA implements InterfaceC4719Di {
    public static byte[] A06;
    public static String[] A07 = {"Jiy", "2wEJIBTa4RvP8yrIwKSodHRjo9", "akcZBAKpF", "EuZb8kUx1OZ", "XeLxT4hCbfpB8vk3L3qpbFThh9kK", "oaj", "R8TqjunyKtvNfOkCV", "nGIequV"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<C4730Dt> A04;
    public final InterfaceC4670Co[] A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{117, 100, 100, 120, 125, 119, 117, 96, 125, 123, 122, 59, 112, 98, 118, 103, 97, 118, 103};
    }

    static {
        A01();
    }

    public C5841WA(List<C4730Dt> list) {
        this.A04 = list;
        this.A05 = new InterfaceC4670Co[list.size()];
    }

    private boolean A02(C5022Ij c5022Ij, int i) {
        if (c5022Ij.A04() == 0) {
            return false;
        }
        if (c5022Ij.A0E() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A48(C5022Ij c5022Ij) {
        InterfaceC4670Co[] interfaceC4670CoArr;
        if (this.A03) {
            if (this.A00 == 2 && !A02(c5022Ij, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c5022Ij, 0)) {
                return;
            }
            int A062 = c5022Ij.A06();
            int A04 = c5022Ij.A04();
            for (InterfaceC4670Co output : this.A05) {
                c5022Ij.A0Y(A062);
                output.AEG(c5022Ij, A04);
            }
            this.A01 += A04;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A4V(InterfaceC4660Ce interfaceC4660Ce, C4733Dw c4733Dw) {
        int i = 0;
        while (true) {
            InterfaceC4670Co[] interfaceC4670CoArr = this.A05;
            String[] strArr = A07;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "6Yign7KSgGvnaQ3UG";
            strArr2[0] = "Q7U";
            if (i < interfaceC4670CoArr.length) {
                C4730Dt c4730Dt = this.A04.get(i);
                c4733Dw.A05();
                InterfaceC4670Co AFD = interfaceC4660Ce.AFD(c4733Dw.A03(), 3);
                AFD.A5V(Format.A0A(c4733Dw.A04(), A00(0, 19, 88), null, -1, 0, Collections.singletonList(c4730Dt.A02), c4730Dt.A01, null));
                this.A05[i] = AFD;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD3() {
        if (this.A03) {
            for (InterfaceC4670Co interfaceC4670Co : this.A05) {
                interfaceC4670Co.AEH(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD4(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A03 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AEK() {
        this.A03 = false;
    }
}
