package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.XJ */
/* loaded from: assets/audience_network.dex */
public final class C5912XJ implements InterfaceC5013Ia {
    public static byte[] A04;
    @Nullable
    public InterfaceC5909XG A00;
    @Nullable
    public InterfaceC5013Ia A01;
    public final InterfaceC4526AJ A02;
    public final C5756Uk A03;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{95, 103, 126, 102, 123, 98, 126, 119, 50, 96, 119, 124, 118, 119, 96, 119, 96, 50, Byte.MAX_VALUE, 119, 118, 123, 115, 50, 113, 126, 125, 113, 121, 97, 50, 119, 124, 115, 112, 126, 119, 118, 60};
    }

    public C5912XJ(InterfaceC4526AJ interfaceC4526AJ, InterfaceC5000IN interfaceC5000IN) {
        this.A02 = interfaceC4526AJ;
        this.A03 = new C5756Uk(interfaceC5000IN);
    }

    private void A01() {
        this.A03.A02(this.A01.A7H());
        C4549Ah playbackParameters = this.A01.A7E();
        if (!playbackParameters.equals(this.A03.A7E())) {
            this.A03.AEf(playbackParameters);
            this.A02.ABo(playbackParameters);
        }
    }

    private boolean A03() {
        InterfaceC5909XG interfaceC5909XG = this.A00;
        return (interfaceC5909XG == null || interfaceC5909XG.A8R() || (!this.A00.A8c() && this.A00.A84())) ? false : true;
    }

    public final long A04() {
        if (A03()) {
            A01();
            return this.A01.A7H();
        }
        return this.A03.A7H();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j) {
        this.A03.A02(j);
    }

    public final void A08(InterfaceC5909XG interfaceC5909XG) {
        if (interfaceC5909XG == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(InterfaceC5909XG interfaceC5909XG) throws C4529AM {
        InterfaceC5013Ia interfaceC5013Ia;
        InterfaceC5013Ia A6w = interfaceC5909XG.A6w();
        if (A6w != null && A6w != (interfaceC5013Ia = this.A01)) {
            if (interfaceC5013Ia == null) {
                this.A01 = A6w;
                this.A00 = interfaceC5909XG;
                this.A01.AEf(this.A03.A7E());
                A01();
                return;
            }
            throw C4529AM.A02(new IllegalStateException(A00(0, 39, 41)));
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5013Ia
    public final C4549Ah A7E() {
        InterfaceC5013Ia interfaceC5013Ia = this.A01;
        if (interfaceC5013Ia != null) {
            return interfaceC5013Ia.A7E();
        }
        return this.A03.A7E();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5013Ia
    public final long A7H() {
        if (A03()) {
            return this.A01.A7H();
        }
        return this.A03.A7H();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5013Ia
    public final C4549Ah AEf(C4549Ah c4549Ah) {
        InterfaceC5013Ia interfaceC5013Ia = this.A01;
        if (interfaceC5013Ia != null) {
            c4549Ah = interfaceC5013Ia.AEf(c4549Ah);
        }
        this.A03.AEf(c4549Ah);
        this.A02.ABo(c4549Ah);
        return c4549Ah;
    }
}
