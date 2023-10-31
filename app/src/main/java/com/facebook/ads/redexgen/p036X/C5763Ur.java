package com.facebook.ads.redexgen.p036X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.ads.redexgen.X.Ur */
/* loaded from: assets/audience_network.dex */
public final class C5763Ur implements InterfaceC4953Hc {
    public static String[] A0B = {"w20bAWjYMNQBWlbon1lxwLvvC2Wc6aDw", "lwUY3oAzCyDGvzazHVXOHQ3zY7kbNweW", "UaweMkDBVxVyODuJAIk0oAizBiXulMgw", "HCwWhWYnSwS9lU8hovQ66gM", "BSrpyguVpFJpaQafc1NdT7mO3uIgLmFW", "PMiNqiQ4kgs0VWuHsJy6tm47yNuoSJAG", "LFxM2Smyc2PeWHZihlec1nFmzNKIeMAJ", "CwFpegEhQfdxfTMnj3Ot7m2"};
    public long A00;
    public long A01;
    public C4959Hi A02;
    public C5029Iq A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final InterfaceC4981I4 A09;
    public final boolean A0A;

    public C5763Ur(InterfaceC4981I4 interfaceC4981I4, long j) {
        this(interfaceC4981I4, j, 20480, true);
    }

    public C5763Ur(InterfaceC4981I4 interfaceC4981I4, long j, int i, boolean z) {
        this.A09 = (InterfaceC4981I4) C4997IK.A01(interfaceC4981I4);
        this.A08 = j;
        this.A07 = i;
        this.A0A = z;
    }

    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            boolean success = this.A0A;
            if (success) {
                this.A05.getFD().sync();
            }
            C5038Iz.A0X(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (1 != 0) {
                this.A09.A44(file);
            } else {
                file.delete();
            }
        } catch (Throwable th) {
            C5038Iz.A0X(this.A06);
            this.A06 = null;
            File file2 = this.A04;
            this.A04 = null;
            if (0 != 0) {
                this.A09.A44(file2);
            } else {
                file2.delete();
            }
            throw th;
        }
    }

    private void A01() throws IOException {
        long min;
        if (this.A02.A02 == -1) {
            min = this.A08;
        } else {
            long j = this.A02.A02;
            long maxLength = this.A00;
            long j2 = j - maxLength;
            long maxLength2 = this.A08;
            min = Math.min(j2, maxLength2);
        }
        InterfaceC4981I4 interfaceC4981I4 = this.A09;
        String str = this.A02.A05;
        long maxLength3 = this.A02.A01;
        this.A04 = interfaceC4981I4.AEx(str, this.A00 + maxLength3, min);
        this.A05 = new FileOutputStream(this.A04);
        int i = this.A07;
        if (i > 0) {
            C5029Iq c5029Iq = this.A03;
            if (c5029Iq == null) {
                this.A03 = new C5029Iq(this.A05, i);
            } else {
                c5029Iq.A00(this.A05);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = this.A05;
        }
        this.A01 = 0L;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4953Hc
    public final void ACy(C4959Hi c4959Hi) throws C5764Us {
        if (c4959Hi.A02 == -1 && !c4959Hi.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = c4959Hi;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e) {
            throw new C5764Us(e);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4953Hc
    public final void close() throws C5764Us {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e) {
            throw new C5764Us(e);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4953Hc
    public final void write(byte[] bArr, int bytesToWrite, int i) throws C5764Us {
        if (this.A02 == null) {
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            try {
                int i3 = (this.A01 > this.A08 ? 1 : (this.A01 == this.A08 ? 0 : -1));
                if (A0B[0].charAt(30) != 'D') {
                    throw new RuntimeException();
                }
                A0B[6] = "jgYsfafqQwydOQ8BdugE0IR3OVOgVMqo";
                if (i3 == 0) {
                    A00();
                    A01();
                }
                int min = (int) Math.min(i - i2, this.A08 - this.A01);
                this.A06.write(bArr, bytesToWrite + i2, min);
                i2 += min;
                this.A01 += min;
                this.A00 += min;
            } catch (IOException e) {
                throw new C5764Us(e);
            }
        }
    }
}
