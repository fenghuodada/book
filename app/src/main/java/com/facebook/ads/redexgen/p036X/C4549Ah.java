package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ah */
/* loaded from: assets/audience_network.dex */
public final class C4549Ah {
    public static final C4549Ah A04 = new C4549Ah(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C4549Ah(float f) {
        this(f, 1.0f, false);
    }

    public C4549Ah(float f, float f2, boolean z) {
        C4997IK.A03(f > 0.0f);
        C4997IK.A03(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f);
    }

    public final long A00(long j) {
        return this.A03 * j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4549Ah c4549Ah = (C4549Ah) obj;
        return this.A01 == c4549Ah.A01 && this.A00 == c4549Ah.A00 && this.A02 == c4549Ah.A02;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A00);
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + result) * 31) + (this.A02 ? 1 : 0);
    }
}
