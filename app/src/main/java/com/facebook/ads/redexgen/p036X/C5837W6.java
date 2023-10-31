package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.W6 */
/* loaded from: assets/audience_network.dex */
public final class C5837W6 implements InterfaceC4719Di {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC4670Co A03;
    public boolean A04;
    public final C5022Ij A05 = new C5022Ij(10);

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{25, 62, 72, 56, 54, 71, 57, 62, 67, 60, -11, 62, 67, 75, 54, 65, 62, 57, -11, 30, 25, 8, -11, 73, 54, 60, -16, 11, -38, -7, 12, 8, 11, 12, 25, 89, 104, 104, 100, 97, 91, 89, 108, 97, 103, 102, 39, 97, 92, 43};
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A48(C5022Ij c5022Ij) {
        if (!this.A04) {
            return;
        }
        int A04 = c5022Ij.A04();
        int i = this.A00;
        if (i < 10) {
            int min = Math.min(A04, 10 - i);
            System.arraycopy(c5022Ij.A00, c5022Ij.A06(), this.A05.A00, this.A00, min);
            if (this.A00 + min == 10) {
                this.A05.A0Y(0);
                if (73 != this.A05.A0E() || 68 != this.A05.A0E() || 51 != this.A05.A0E()) {
                    Log.w(A00(26, 9, 44), A00(0, 26, 90));
                    this.A04 = false;
                    return;
                }
                this.A05.A0Z(3);
                this.A01 = this.A05.A0D() + 10;
            }
        }
        int min2 = Math.min(A04, this.A01 - this.A00);
        this.A03.AEG(c5022Ij, min2);
        this.A00 += min2;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A4V(InterfaceC4660Ce interfaceC4660Ce, C4733Dw c4733Dw) {
        c4733Dw.A05();
        this.A03 = interfaceC4660Ce.AFD(c4733Dw.A03(), 4);
        this.A03.A5V(Format.A0B(c4733Dw.A04(), A00(35, 15, 125), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD3() {
        int i;
        if (!this.A04 || (i = this.A01) == 0 || this.A00 != i) {
            return;
        }
        this.A03.AEH(this.A02, 1, i, 0, null);
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD4(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A04 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AEK() {
        this.A04 = false;
    }
}
