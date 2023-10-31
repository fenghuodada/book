package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.WD */
/* loaded from: assets/audience_network.dex */
public final class C5844WD implements InterfaceC4719Di {
    public static byte[] A0H;
    public static String[] A0I = {"wge6vcbYVd2LlwU9IzXxO7y1yc7Npjql", "e4ah1", "HxlECSCujzZIBhcakhB8llOPpIPg4jPi", "c3jgZ7razfwrLoite54T", "YnWTxT53I9VC0eKuEFoJi1GxqSMOrSIM", "mGJBSiyG9M2YGViPKeXmqCjoZalx0YC5", "VtpTHv8dn8NrwXo7ikKBEmVWKD8j4YCX", "dqOZRsMzwGVkln1A4hbisIXuNnIWGGSy"};
    public static final byte[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public InterfaceC4670Co A07;
    public InterfaceC4670Co A08;
    public InterfaceC4670Co A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final C5021Ii A0D;
    public final C5022Ij A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 49);
            if (A0I[4].charAt(1) != 'n') {
                throw new RuntimeException();
            }
            A0I[4] = "bnluMaXE1Uw3b3JGoNOZfy6HcCqjlXqz";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-120, 124, -66, -47, -48, 124, -67, -49, -49, -47, -55, -59, -54, -61, 124, -99, -99, -97, 124, -88, -97, -118, -118, -83, -67, -68, -101, -82, -86, -83, -82, -69, -18, 15, 30, 15, 13, 30, 15, 14, -54, 11, 31, 14, 19, 25, -54, 25, 12, 20, 15, 13, 30, -54, 30, 35, 26, 15, -28, -54, -26, -11, -11, -15, -18, -24, -26, -7, -18, -12, -13, -76, -18, -23, -72, 16, 36, 19, 24, 30, -34, 28, 31, -29, 16, -36, 27, 16, 35, 28};
    }

    static {
        A06();
        A0J = new byte[]{73, 68, 51};
    }

    public C5844WD(boolean z) {
        this(z, null);
    }

    public C5844WD(boolean z, String str) {
        this.A0D = new C5021Ii(new byte[7]);
        this.A0E = new C5022Ij(Arrays.copyOf(A0J, 10));
        A03();
        this.A0G = z;
        this.A0F = str;
    }

    private void A01() throws C4547Af {
        this.A0D.A07(0);
        if (!this.A0C) {
            int A04 = this.A0D.A04(2) + 1;
            if (A04 != 2) {
                Log.w(A00(22, 10, 24), A00(32, 28, 121) + A04 + A00(0, 22, 43));
                A04 = 2;
            }
            int A042 = this.A0D.A04(4);
            this.A0D.A08(1);
            int sampleRateIndex = this.A0D.A04(3);
            byte[] A07 = C5001IO.A07(A04, A042, sampleRateIndex);
            Pair<Integer, Integer> A03 = C5001IO.A03(A07);
            Format A072 = Format.A07(this.A0A, A00(75, 15, 126), null, -1, -1, ((Integer) A03.second).intValue(), ((Integer) A03.first).intValue(), Collections.singletonList(A07), null, 0, this.A0F);
            this.A05 = 1024000000 / A072.A0C;
            this.A09.A5V(A072);
            this.A0C = true;
        } else {
            C5021Ii c5021Ii = this.A0D;
            String[] strArr = A0I;
            String str = strArr[3];
            String str2 = strArr[1];
            int length = str.length();
            int sampleSize = str2.length();
            if (length == sampleSize) {
                throw new RuntimeException();
            }
            A0I[4] = "gnfbeCT7ETb0BF6eGTwxRLZIMNoo6eBq";
            c5021Ii.A08(10);
        }
        this.A0D.A08(4);
        int A043 = (this.A0D.A04(13) - 2) - 5;
        if (this.A0B) {
            A043 -= 2;
        }
        InterfaceC4670Co interfaceC4670Co = this.A09;
        long j = this.A05;
        if (A0I[0].charAt(1) != 'g') {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[5] = "DPeEZCdjnoP4QwMjUw7HIDON5EObNWtY";
        strArr2[6] = "TWt76gMmW2EkEQM2OhdsBT8X6vSrq3Ij";
        A07(interfaceC4670Co, j, 0, A043);
    }

    private void A02() {
        this.A08.AEG(this.A0E, 10);
        this.A0E.A0Y(6);
        A07(this.A08, 0L, 10, this.A0E.A0D() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 256;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0J.length;
        this.A02 = 0;
        this.A0E.A0Y(0);
    }

    private void A07(InterfaceC4670Co interfaceC4670Co, long j, int i, int i2) {
        this.A03 = 3;
        this.A00 = i;
        this.A07 = interfaceC4670Co;
        this.A04 = j;
        this.A02 = i2;
    }

    private void A08(C5022Ij c5022Ij) {
        byte[] bArr = c5022Ij.A00;
        int position = c5022Ij.A06();
        int A07 = c5022Ij.A07();
        while (position < A07) {
            int i = position + 1;
            int i2 = bArr[position] & 255;
            int position2 = this.A01;
            if (position2 == 512 && i2 >= 240 && i2 != 255) {
                int position3 = i2 & 1;
                this.A0B = position3 == 0;
                A04();
                c5022Ij.A0Y(i);
                return;
            }
            int i3 = this.A01;
            int i4 = i3 | i2;
            if (i4 == 329) {
                this.A01 = 768;
            } else if (i4 == 511) {
                this.A01 = AdRequest.MAX_CONTENT_URL_LENGTH;
            } else if (i4 == 836) {
                this.A01 = 1024;
            } else if (i4 != 1075) {
                if (i3 != 256) {
                    this.A01 = 256;
                    position = i - 1;
                }
            } else {
                A05();
                c5022Ij.A0Y(i);
                return;
            }
            position = i;
        }
        c5022Ij.A0Y(position);
    }

    private void A09(C5022Ij c5022Ij) {
        int min = Math.min(c5022Ij.A04(), this.A02 - this.A00);
        this.A07.AEG(c5022Ij, min);
        this.A00 += min;
        int i = this.A00;
        int i2 = this.A02;
        if (i == i2) {
            this.A07.AEH(this.A06, 1, i2, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(C5022Ij c5022Ij, byte[] bArr, int i) {
        int min = Math.min(c5022Ij.A04(), i - this.A00);
        c5022Ij.A0c(bArr, this.A00, min);
        this.A00 += min;
        return this.A00 == i;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A48(C5022Ij c5022Ij) throws C4547Af {
        while (c5022Ij.A04() > 0) {
            int i = this.A03;
            if (i == 0) {
                A08(c5022Ij);
            } else if (i != 1) {
                String[] strArr = A0I;
                if (strArr[5].charAt(25) == strArr[6].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "9CqnxzaEQimEcBf5cSINZxdBysafSxdF";
                strArr2[6] = "zLp55t2V8ycwykcXwXcmLQHdTFNUXCiS";
                if (i == 2) {
                    boolean A0A = A0A(c5022Ij, this.A0D.A00, this.A0B ? 7 : 5);
                    if (A0I[0].charAt(1) == 'g') {
                        String[] strArr3 = A0I;
                        strArr3[3] = "PBSyuwIG2tPzzgRnoBM9";
                        strArr3[1] = "owzwp";
                        if (A0A) {
                            A01();
                        }
                    } else if (A0A) {
                        A01();
                    }
                } else if (i == 3) {
                    A09(c5022Ij);
                }
            } else if (A0A(c5022Ij, this.A0E.A00, 10)) {
                A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A4V(InterfaceC4660Ce interfaceC4660Ce, C4733Dw c4733Dw) {
        c4733Dw.A05();
        this.A0A = c4733Dw.A04();
        this.A09 = interfaceC4660Ce.AFD(c4733Dw.A03(), 1);
        if (this.A0G) {
            c4733Dw.A05();
            this.A08 = interfaceC4660Ce.AFD(c4733Dw.A03(), 4);
            this.A08.A5V(Format.A0B(c4733Dw.A04(), A00(60, 15, 84), null, -1, null));
            return;
        }
        this.A08 = new C5885Ws();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD4(long j, boolean z) {
        this.A06 = j;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AEK() {
        A03();
    }
}
