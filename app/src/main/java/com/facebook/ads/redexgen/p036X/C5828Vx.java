package com.facebook.ads.redexgen.p036X;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Vx */
/* loaded from: assets/audience_network.dex */
public class C5828Vx implements InterfaceC4727Dq {
    public final C5021Ii A00 = new C5021Ii(new byte[4]);
    public final /* synthetic */ C5826Vv A01;

    public C5828Vx(C5826Vv c5826Vv) {
        this.A01 = c5826Vv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4727Dq
    public final void A48(C5022Ij c5022Ij) {
        int i;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        if (c5022Ij.A0E() != 0) {
            return;
        }
        c5022Ij.A0Z(7);
        int A04 = c5022Ij.A04() / 4;
        for (int i2 = 0; i2 < A04; i2++) {
            c5022Ij.A0a(this.A00, 4);
            int A042 = this.A00.A04(16);
            this.A00.A08(3);
            if (A042 == 0) {
                this.A00.A08(13);
            } else {
                int A043 = this.A00.A04(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(A043, new C5831W0(new C5827Vw(this.A01, A043)));
                C5826Vv.A01(this.A01);
            }
        }
        i = this.A01.A05;
        if (i != 2) {
            sparseArray = this.A01.A06;
            sparseArray.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4727Dq
    public final void A8K(C5034Iv c5034Iv, InterfaceC4660Ce interfaceC4660Ce, C4733Dw c4733Dw) {
    }
}
