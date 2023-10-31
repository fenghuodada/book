package com.facebook.ads.redexgen.p036X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Wa */
/* loaded from: assets/audience_network.dex */
public final class C5867Wa extends AbstractC4680D3 {
    public static byte[] A03;
    public final long A00;
    public final List<C5867Wa> A01;
    public final List<C5866WZ> A02;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{0, 67, 79, 78, 84, 65, 73, 78, 69, 82, 83, 26, 0, -110, -34, -41, -45, -24, -41, -27, -84, -110};
    }

    public C5867Wa(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C5867Wa A06(int i) {
        int size = this.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5867Wa c5867Wa = this.A01.get(i2);
            if (((AbstractC4680D3) c5867Wa).A00 == i) {
                return c5867Wa;
            }
        }
        return null;
    }

    public final C5866WZ A07(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5866WZ c5866wz = this.A02.get(i2);
            if (((AbstractC4680D3) c5866wz).A00 == i) {
                return c5866wz;
            }
        }
        return null;
    }

    public final void A08(C5867Wa c5867Wa) {
        this.A01.add(c5867Wa);
    }

    public final void A09(C5866WZ c5866wz) {
        this.A02.add(c5866wz);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4680D3
    public final String toString() {
        return AbstractC4680D3.A02(super.A00) + A04(13, 9, 15) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 125) + Arrays.toString(this.A01.toArray());
    }
}
