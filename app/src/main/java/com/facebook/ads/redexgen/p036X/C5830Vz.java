package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vz */
/* loaded from: assets/audience_network.dex */
public final class C5830Vz implements InterfaceC4727Dq {
    public static byte[] A03;
    public static String[] A04 = {"9dIhF2X5qYPGZcPrMQjFeU2FMq4Icb5t", "C7lZKzl2OzNugbLE4QJixcZrlcSgCGI7", "v7kvgcbsYqtq4Ou8B7XlURjv8wkzUozH", "8BzUB2zJ4MAZsKVthH28T9QXZJlG29jD", "wOgdV6BnuyxARX3Rbc0CvFDDXWIKfgjM", "mpBmZ", "f47n1mRwiFyOsV4myeWB5UC2YKJiwKop", "3tKYH9iJUyIyPmbH9Trftcv4NWgUsp5b"};
    public InterfaceC4670Co A00;
    public C5034Iv A01;
    public boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{11, 26, 26, 22, 19, 13, 11, 30, 19, 25, 24, -39, 34, -41, 29, 13, 30, 15, -35, -33};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4727Dq
    public final void A48(C5022Ij c5022Ij) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A5V(Format.A02(null, A00(0, 20, 74), this.A01.A05()));
            this.A02 = true;
        }
        int A042 = c5022Ij.A04();
        this.A00.AEG(c5022Ij, A042);
        InterfaceC4670Co interfaceC4670Co = this.A00;
        if (A04[0].charAt(13) != 'c') {
            throw new RuntimeException();
        }
        A04[0] = "M4wOXnroCREOIcf8T96EgrMDUu9ExHmM";
        interfaceC4670Co.AEH(this.A01.A04(), 1, A042, 0, null);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4727Dq
    public final void A8K(C5034Iv c5034Iv, InterfaceC4660Ce interfaceC4660Ce, C4733Dw c4733Dw) {
        this.A01 = c5034Iv;
        c4733Dw.A05();
        this.A00 = interfaceC4660Ce.AFD(c4733Dw.A03(), 4);
        this.A00.A5V(Format.A0B(c4733Dw.A04(), A00(0, 20, 74), null, -1, null));
    }
}
