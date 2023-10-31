package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ax */
/* loaded from: assets/audience_network.dex */
public final class C4565Ax {
    public final long A00;
    public final long A01;
    public static final C4565Ax A04 = new C4565Ax(0, 0);
    public static final C4565Ax A02 = new C4565Ax(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C4565Ax A06 = new C4565Ax(Long.MAX_VALUE, 0);
    public static final C4565Ax A05 = new C4565Ax(0, Long.MAX_VALUE);
    public static final C4565Ax A03 = A04;

    public C4565Ax(long j, long j2) {
        C4997IK.A03(j >= 0);
        C4997IK.A03(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4565Ax c4565Ax = (C4565Ax) obj;
        return this.A01 == c4565Ax.A01 && this.A00 == c4565Ax.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
