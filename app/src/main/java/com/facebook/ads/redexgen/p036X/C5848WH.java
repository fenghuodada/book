package com.facebook.ads.redexgen.p036X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.WH */
/* loaded from: assets/audience_network.dex */
public final class C5848WH implements InterfaceC4658Cc {
    public static byte[] A04;
    public static String[] A05 = {"P5w0t5YmbfCx1ojda5KKDsEMO6jqUmnr", "UdOatSKcJailVD", "", "xAiF", "epl8GGi5jyNsT2QZHjLNLopZqyhNzplR", "TY8pRi4pa4JcG30Kuv61m", "fOMFGQDuqjq2usuY2YJ2oGF", "ObZwfJQfEiVxl"};
    public static final InterfaceC4661Cf A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final C5847WG A02;
    public final C5022Ij A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{15, 2, 117};
    }

    static {
        A01();
        A06 = new C5849WI();
        A07 = C5038Iz.A08(A00(0, 3, 127));
    }

    public C5848WH() {
        this(0L);
    }

    public C5848WH(long j) {
        this.A01 = j;
        this.A02 = new C5847WG();
        this.A03 = new C5022Ij(2786);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void A8I(InterfaceC4660Ce interfaceC4660Ce) {
        this.A02.A4V(interfaceC4660Ce, new C4733Dw(0, 1));
        interfaceC4660Ce.A5D();
        interfaceC4660Ce.AEM(new C5883Wq(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final int ADX(InterfaceC4659Cd interfaceC4659Cd, C4665Cj c4665Cj) throws IOException, InterruptedException {
        int read = interfaceC4659Cd.read(this.A03.A00, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.AD4(this.A01, true);
            this.A00 = true;
        }
        this.A02.A48(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void AEL(long j, long j2) {
        this.A00 = false;
        this.A02.AEK();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final boolean AEv(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        C5022Ij c5022Ij = new C5022Ij(10);
        int i = 0;
        while (true) {
            interfaceC4659Cd.AD7(c5022Ij.A00, 0, 10);
            if (A05[7].length() != 13) {
                throw new RuntimeException();
            }
            A05[5] = "IuOldmz1qGC5b";
            c5022Ij.A0Y(0);
            if (c5022Ij.A0G() != A07) {
                interfaceC4659Cd.AEB();
                interfaceC4659Cd.A3K(i);
                int startPosition = i;
                int i2 = 0;
                while (true) {
                    interfaceC4659Cd.AD7(c5022Ij.A00, 0, 5);
                    c5022Ij.A0Y(0);
                    if (c5022Ij.A0I() != 2935) {
                        i2 = 0;
                        interfaceC4659Cd.AEB();
                        startPosition++;
                        if (startPosition - i >= 8192) {
                            return false;
                        }
                        interfaceC4659Cd.A3K(startPosition);
                    } else {
                        i2++;
                        if (A05[5].length() != 29) {
                            String[] strArr = A05;
                            strArr[3] = "a4rI";
                            strArr[6] = "EnE3h5gngskpWhoTVRGnZEO";
                            if (i2 >= 4) {
                                return true;
                            }
                        } else if (i2 >= 4) {
                            return true;
                        }
                        int A052 = C4578BA.A05(c5022Ij.A00);
                        if (A052 == -1) {
                            return false;
                        }
                        int syncBytes = A052 - 5;
                        interfaceC4659Cd.A3K(syncBytes);
                    }
                }
            } else {
                c5022Ij.A0Z(3);
                int A0D = c5022Ij.A0D();
                int syncBytes2 = A0D + 10;
                i += syncBytes2;
                interfaceC4659Cd.A3K(A0D);
            }
        }
    }
}
