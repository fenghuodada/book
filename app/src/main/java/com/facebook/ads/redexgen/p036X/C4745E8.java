package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.E8 */
/* loaded from: assets/audience_network.dex */
public final class C4745E8 {
    public final String A00;
    public final boolean A01;

    public C4745E8(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C4745E8.class) {
            return false;
        }
        C4745E8 c4745e8 = (C4745E8) obj;
        return TextUtils.equals(this.A00, c4745e8.A00) && this.A01 == c4745e8.A01;
    }

    public final int hashCode() {
        int i = 1 * 31;
        String str = this.A00;
        int result = str == null ? 0 : str.hashCode();
        int result2 = (i + result) * 31;
        int result3 = this.A01 ? 1231 : 1237;
        return result2 + result3;
    }
}
