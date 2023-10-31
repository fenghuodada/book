package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ut */
/* loaded from: assets/audience_network.dex */
public final class C5765Ut implements InterfaceC4955He {
    public static String[] A04 = {"jlvJAgNeHWnJa3dPhRRd4EpOWMdB4X8x", "basxIWwUdkqjCj33WkHPX1XLcRlnz9UL", "EJ8jlkQXjQdwyr2PvL7NnSmrIKvSoKH9", "vRfpY4dXxgFvSAkqLCYO6SFKljAHuCzv", "ygfsCaK9ODNV1JdDOAbtF6as7T2mwjea", "kZYhIpAIarjEuyurYojB34Vr8jYSU6r4", "j4JmDL8bElApoe2AoNbHhKsqdvNkVwQT", "xpYPLrN7DnWMQWubBysNzF9"};
    public long A00;
    public boolean A01;
    public final InterfaceC4953Hc A02;
    public final InterfaceC4955He A03;

    public C5765Ut(InterfaceC4955He interfaceC4955He, InterfaceC4953Hc interfaceC4953Hc) {
        this.A03 = (InterfaceC4955He) C4997IK.A01(interfaceC4955He);
        this.A02 = (InterfaceC4953Hc) C4997IK.A01(interfaceC4953Hc);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final Uri A7k() {
        return this.A03.A7k();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final long ACw(C4959Hi dataSpec) throws IOException {
        this.A00 = this.A03.ACw(dataSpec);
        if (this.A00 == 0) {
            return 0L;
        }
        int i = (dataSpec.A02 > (-1L) ? 1 : (dataSpec.A02 == (-1L) ? 0 : -1));
        if (A04[4].charAt(25) != 'd') {
            A04[4] = "5eBqCtKJCfmd3joSOHW3VJl5u39JA8K8";
            if (i == 0 && this.A00 != -1) {
                dataSpec = new C4959Hi(dataSpec.A04, dataSpec.A01, dataSpec.A03, this.A00, dataSpec.A05, dataSpec.A00);
            }
            this.A01 = true;
            this.A02.ACy(dataSpec);
            return this.A00;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i, i2);
        if (read > 0) {
            this.A02.write(bArr, i, read);
            long j = this.A00;
            if (j != -1) {
                long j2 = read;
                if (A04[2].charAt(20) == 'R') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[0] = "pjLm1ZauVMrHAqpQAI7gN0n14eRh7O52";
                strArr[5] = "T96N4GskjcbGLsEcsrwL44bvdnkYKV6X";
                this.A00 = j - j2;
            }
        }
        return read;
    }
}
