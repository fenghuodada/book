package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.KX */
/* loaded from: assets/audience_network.dex */
public final class C5130KX implements InterfaceC5470Q7 {
    public static String[] A0C = {"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    @Nullable
    public C5483QK A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC5216Lz A07 = new AbstractC5216Lz() { // from class: com.facebook.ads.redexgen.X.83
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
        /* renamed from: A00 */
        public final void A03(C439585 c439585) {
            Handler handler;
            boolean A0D;
            handler = C5130KX.this.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = C5130KX.this.A0D(EnumC5491QS.A05);
            if (A0D) {
                C5130KX.this.A03();
                C5130KX.this.A06(true, false);
            }
            C5130KX.this.A03 = true;
        }
    };
    public final AbstractC5285N6 A06 = new AbstractC5285N6() { // from class: com.facebook.ads.redexgen.X.82
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
        /* renamed from: A00 */
        public final void A03(C439788 c439788) {
            C5130KX.this.A03();
            C5130KX.this.A06(false, false);
            C5130KX.this.A03 = true;
        }
    };
    public final AbstractC5200Lj A08 = new C439181(this);
    public final AbstractC5160L3 A09 = new AbstractC5160L3() { // from class: com.facebook.ads.redexgen.X.80
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
        /* renamed from: A00 */
        public final void A03(C439484 c439484) {
            boolean z;
            boolean A0D;
            z = C5130KX.this.A02;
            if (z) {
                return;
            }
            A0D = C5130KX.this.A0D(EnumC5491QS.A05);
            if (!A0D) {
                return;
            }
            C5130KX.this.A03();
            C5130KX.this.A06(true, false);
        }
    };
    public final AbstractC5137Ke A0A = new C43897z(this);
    public final Handler A05 = new Handler();
    public final List<InterfaceC5492QT> A0B = new ArrayList();
    public int A00 = AdError.SERVER_ERROR_CODE;

    public C5130KX(boolean z) {
        this.A02 = z;
    }

    public static /* synthetic */ int A00(C5130KX c5130kx) {
        return c5130kx.A00;
    }

    public static /* synthetic */ Handler A01(C5130KX c5130kx) {
        return c5130kx.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<InterfaceC5492QT> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A04(C5130KX c5130kx) {
        c5130kx.A03();
    }

    public static /* synthetic */ void A05(C5130KX c5130kx, boolean z, boolean z2) {
        c5130kx.A06(z, z2);
    }

    public void A06(boolean z, boolean z2) {
        for (InterfaceC5492QT interfaceC5492QT : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            interfaceC5492QT.A3M(z, z2);
        }
    }

    public static /* synthetic */ boolean A07(C5130KX c5130kx) {
        return c5130kx.A03;
    }

    public static /* synthetic */ boolean A08(C5130KX c5130kx) {
        return c5130kx.A02;
    }

    public static /* synthetic */ boolean A09(C5130KX c5130kx) {
        return c5130kx.A04;
    }

    public static /* synthetic */ boolean A0A(C5130KX c5130kx, EnumC5491QS enumC5491QS) {
        return c5130kx.A0D(enumC5491QS);
    }

    public static /* synthetic */ boolean A0B(C5130KX c5130kx, boolean z) {
        c5130kx.A03 = z;
        return z;
    }

    public static /* synthetic */ boolean A0C(C5130KX c5130kx, boolean z) {
        c5130kx.A04 = z;
        return z;
    }

    public boolean A0D(EnumC5491QS enumC5491QS) {
        for (InterfaceC5492QT interfaceC5492QT : this.A0B) {
            if (interfaceC5492QT.A7X() != enumC5491QS) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i) {
        this.A00 = i;
    }

    public final void A0I(InterfaceC5492QT interfaceC5492QT) {
        this.A0B.add(interfaceC5492QT);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5470Q7
    public final void A8o(C5483QK c5483qk) {
        this.A01 = c5483qk;
        c5483qk.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5470Q7
    public final void AFG(C5483QK c5483qk) {
        A03();
        c5483qk.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
