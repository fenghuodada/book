package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Y3 */
/* loaded from: assets/audience_network.dex */
public class C5958Y3 extends AbstractRunnableC5165L8 {
    public static byte[] A02;
    public final /* synthetic */ C5957Y2 A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, 22, 80, 87, 95, 90, 24, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public C5958Y3(C5957Y2 c5957y2, AtomicBoolean atomicBoolean) {
        this.A00 = c5957y2;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C44148U c44148u;
        long j;
        C44148U c44148u2;
        long j2;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(EnumC5087Jo.A0H);
                c44148u2 = this.A00.A02.A04;
                C43587N c43587n = this.A00.A01;
                int i = C43687X.A00;
                j2 = this.A00.A02.A00;
                C43687X.A02(c44148u2, c43587n, i, A00(11, 14, 17), j2);
                this.A00.A02.A0T();
                this.A00.A00.AAO();
                return;
            }
            this.A00.A02.A0I(EnumC5087Jo.A0G);
            c44148u = this.A00.A02.A04;
            C43587N c43587n2 = this.A00.A01;
            int i2 = C43687X.A04;
            j = this.A00.A02.A00;
            C43687X.A02(c44148u, c43587n2, i2, A00(0, 11, 41), j);
            this.A00.A02.A0U();
            this.A00.A00.AAH();
        }
    }
}
