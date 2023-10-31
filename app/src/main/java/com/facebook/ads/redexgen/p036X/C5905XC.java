package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.XC */
/* loaded from: assets/audience_network.dex */
public final class C5905XC implements InterfaceC4589BL {
    public static String[] A08 = {"hI95CJvP", "e7uFmzv8JlxhzV9w6wWiWm3C", "0BfqaNpqjs7ROgqNLFdYFDMF2kIE2JVl", "01nBjZj9wdoXPRYWJREYdbIjHTCf93fz", "xbIGt4PZ2jMEHXqvTGNBXf5J", "qzrNEKfdD0Je3OCcD1S0Cr1qEsV7v9mi", "0sM3QN", "C1cp7SniMnLQ2eyeNR7DTGSoW6Un2OTz"};
    public boolean A04;
    public boolean A05;
    @Nullable
    public int[] A06;
    @Nullable
    public int[] A07;
    public ByteBuffer A02 = InterfaceC4589BL.A00;
    public ByteBuffer A03 = InterfaceC4589BL.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(@Nullable int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4589BL
    public final boolean A47(int i, int i2, int i3) throws C4588BK {
        boolean z = !Arrays.equals(this.A07, this.A06);
        this.A06 = this.A07;
        if (this.A06 == null) {
            this.A04 = false;
            return z;
        } else if (i3 == 2) {
            if (!z && this.A01 == i) {
                int i4 = this.A00;
                String[] strArr = A08;
                if (strArr[6].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[6] = "gVI3SL";
                strArr2[0] = "1HQF1tqI";
                if (i4 == i2) {
                    return false;
                }
            }
            this.A01 = i;
            this.A00 = i2;
            this.A04 = i2 != this.A06.length;
            int i5 = 0;
            while (true) {
                int[] iArr = this.A06;
                if (i5 >= iArr.length) {
                    return true;
                }
                int i6 = iArr[i5];
                if (i6 < i2) {
                    this.A04 |= i6 != i5;
                    i5++;
                } else {
                    throw new C4588BK(i, i2, i3);
                }
            }
        } else {
            throw new C4588BK(i, i2, i3);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4589BL
    public final ByteBuffer A73() {
        ByteBuffer byteBuffer = this.A03;
        this.A03 = InterfaceC4589BL.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4589BL
    public final int A74() {
        int[] iArr = this.A06;
        return iArr == null ? this.A00 : iArr.length;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4589BL
    public final int A75() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4589BL
    public final int A76() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4589BL
    public final boolean A8N() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4589BL
    public final boolean A8R() {
        return this.A05 && this.A03 == InterfaceC4589BL.A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4589BL
    public final void ADU() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4589BL
    public final void ADV(ByteBuffer byteBuffer) {
        int[] iArr;
        C4997IK.A04(this.A06 != null);
        int outputSize = byteBuffer.position();
        int limit = byteBuffer.limit();
        int limit2 = this.A00;
        int i = (limit - outputSize) / (limit2 * 2);
        int frameCount = this.A06.length;
        int i2 = frameCount * i * 2;
        int frameCount2 = this.A02.capacity();
        if (frameCount2 < i2) {
            this.A02 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        while (outputSize < limit) {
            for (int frameCount3 : this.A06) {
                int channelIndex = frameCount3 * 2;
                this.A02.putShort(byteBuffer.getShort(channelIndex + outputSize));
            }
            outputSize += this.A00 * 2;
        }
        byteBuffer.position(limit);
        this.A02.flip();
        this.A03 = this.A02;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4589BL
    public final void flush() {
        this.A03 = InterfaceC4589BL.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4589BL
    public final void reset() {
        flush();
        this.A02 = InterfaceC4589BL.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
