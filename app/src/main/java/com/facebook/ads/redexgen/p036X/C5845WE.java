package com.facebook.ads.redexgen.p036X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.WE */
/* loaded from: assets/audience_network.dex */
public final class C5845WE implements InterfaceC4658Cc {
    public static byte[] A04;
    public static String[] A05 = {"6Yd3MlxO6zs0On0JMF5Pwnois3aNTjpE", "MmQBoaYzrmdPmtEAYQ3R1Y6Mcsh6By7B", "7RUBoC8KCwVWfiCX9SWb", "GS41ND25W7ytYawGpGonJQP9IOOENLXr", "lL4oomLzy5vPLaNFQ0K", "J26", "emQAR3GMgLzBn72fJq6a", "GcSIxJRAUXsHB0u2DOmppTTbOqtsj228"};
    public static final InterfaceC4661Cf A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final C5844WD A02;
    public final C5022Ij A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{27, 22, 97};
    }

    static {
        A01();
        A06 = new C5846WF();
        A07 = C5038Iz.A08(A00(0, 3, 42));
    }

    public C5845WE() {
        this(0L);
    }

    public C5845WE(long j) {
        this.A01 = j;
        this.A02 = new C5844WD(true);
        this.A03 = new C5022Ij(200);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void A8I(InterfaceC4660Ce interfaceC4660Ce) {
        this.A02.A4V(interfaceC4660Ce, new C4733Dw(0, 1));
        interfaceC4660Ce.A5D();
        interfaceC4660Ce.AEM(new C5883Wq(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final int ADX(InterfaceC4659Cd interfaceC4659Cd, C4665Cj c4665Cj) throws IOException, InterruptedException {
        int read = interfaceC4659Cd.read(this.A03.A00, 0, 200);
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
        C5021Ii c5021Ii = new C5021Ii(c5022Ij.A00);
        int validFramesCount = 0;
        while (true) {
            interfaceC4659Cd.AD7(c5022Ij.A00, 0, 10);
            c5022Ij.A0Y(0);
            if (c5022Ij.A0G() != A07) {
                break;
            }
            c5022Ij.A0Z(3);
            int A0D = c5022Ij.A0D();
            int length = A0D + 10;
            validFramesCount += length;
            interfaceC4659Cd.A3K(A0D);
        }
        interfaceC4659Cd.AEB();
        interfaceC4659Cd.A3K(validFramesCount);
        int i = validFramesCount;
        int i2 = 0;
        if (A05[4].length() == 20) {
            throw new RuntimeException();
        }
        A05[1] = "mY90xJHLqPMDpFXgmiZe2UkYD68ZyI7P";
        int i3 = 0;
        while (true) {
            interfaceC4659Cd.AD7(c5022Ij.A00, 0, 2);
            c5022Ij.A0Y(0);
            int validFramesSize = c5022Ij.A0I();
            if ((65526 & validFramesSize) != 65520) {
                i3 = 0;
                i2 = 0;
                interfaceC4659Cd.AEB();
                i++;
                if (i - validFramesCount >= 8192) {
                    return false;
                }
                interfaceC4659Cd.A3K(i);
            } else {
                i3++;
                if (i3 >= 4 && i2 > 188) {
                    return true;
                }
                interfaceC4659Cd.AD7(c5022Ij.A00, 0, 4);
                c5021Ii.A07(14);
                int A042 = c5021Ii.A04(13);
                if (A042 <= 6) {
                    return false;
                }
                int syncBytes = A042 - 6;
                interfaceC4659Cd.A3K(syncBytes);
                i2 += A042;
            }
        }
    }
}
