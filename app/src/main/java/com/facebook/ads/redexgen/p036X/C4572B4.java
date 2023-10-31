package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.B4 */
/* loaded from: assets/audience_network.dex */
public final class C4572B4 {
    public final int A00;
    public final C4829FY A01;

    public C4572B4(int i, C4829FY c4829fy) {
        this.A00 = i;
        this.A01 = c4829fy;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4572B4 c4572b4 = (C4572B4) obj;
        return this.A00 == c4572b4.A00 && this.A01.equals(c4572b4.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
