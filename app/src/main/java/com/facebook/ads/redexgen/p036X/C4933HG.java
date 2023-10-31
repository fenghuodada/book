package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.HG */
/* loaded from: assets/audience_network.dex */
public final class C4933HG {
    public static String[] A03 = {"JpQuEMJyhkDDwoW2qnimD48iH4", "zq20t8z5PSjLxyVHdDvtiCtXPLpdqU3i", "so9HDpzw9NbS3t5s7rLQl2iaR2XAJ3iQ", "SPSQ89YBqvY9lwFZlxdH4ztJ", "r8lQcfIA9xflC1biO54W", "tOh5wxE3", "g5QR5HO0jbZc71FO4Igm6aH5aV", "ocODke0nsuLbpuPtat5dt9ny7kJ7l6fu"};
    public final int A00;
    public final int A01;
    @Nullable
    public final String A02;

    public C4933HG(int i, int i2, @Nullable String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A03;
        if (strArr[5].length() != strArr[4].length()) {
            A03[7] = "ASeEdSOeJHMbddf2fOqd0PFHGr8KWkVO";
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4933HG c4933hg = (C4933HG) obj;
            if (this.A00 == c4933hg.A00 && this.A01 == c4933hg.A01 && TextUtils.equals(this.A02, c4933hg.A02)) {
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    public final int hashCode() {
        int i = ((this.A00 * 31) + this.A01) * 31;
        String str = this.A02;
        int result = str != null ? str.hashCode() : 0;
        return i + result;
    }
}
