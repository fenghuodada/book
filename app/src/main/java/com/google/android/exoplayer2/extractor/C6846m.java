package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.C6885o;
import com.google.android.exoplayer2.util.C7436v;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.m */
/* loaded from: classes.dex */
public final class C6846m {
    /* renamed from: a */
    public static C6885o.C6886a m5919a(C7436v c7436v) {
        c7436v.m5018A(1);
        int m5000r = c7436v.m5000r();
        long j = c7436v.f13979b + m5000r;
        int i = m5000r / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long m5008j = c7436v.m5008j();
            if (m5008j == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = m5008j;
            jArr2[i2] = c7436v.m5008j();
            c7436v.m5018A(2);
            i2++;
        }
        c7436v.m5018A((int) (j - c7436v.f13979b));
        return new C6885o.C6886a(jArr, jArr2);
    }
}
