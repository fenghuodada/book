package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0535b;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.util.C7427r;
import com.google.android.exoplayer2.util.C7436v;
import com.google.android.exoplayer2.util.C7437w;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.video.f */
/* loaded from: classes.dex */
public final class C7452f {
    @Nullable

    /* renamed from: a */
    public final List<byte[]> f14035a;

    /* renamed from: b */
    public final int f14036b;
    @Nullable

    /* renamed from: c */
    public final String f14037c;

    public C7452f(@Nullable String str, int i, @Nullable List list) {
        this.f14035a = list;
        this.f14036b = i;
        this.f14037c = str;
    }

    /* renamed from: a */
    public static C7452f m4968a(C7436v c7436v) throws C7506y0 {
        List singletonList;
        try {
            c7436v.m5018A(21);
            int m5002p = c7436v.m5002p() & 3;
            int m5002p2 = c7436v.m5002p();
            int i = c7436v.f13979b;
            int i2 = 0;
            for (int i3 = 0; i3 < m5002p2; i3++) {
                c7436v.m5018A(1);
                int m4997u = c7436v.m4997u();
                for (int i4 = 0; i4 < m4997u; i4++) {
                    int m4997u2 = c7436v.m4997u();
                    i2 += m4997u2 + 4;
                    c7436v.m5018A(m4997u2);
                }
            }
            c7436v.m4992z(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            String str = null;
            for (int i6 = 0; i6 < m5002p2; i6++) {
                int m5002p3 = c7436v.m5002p() & 127;
                int m4997u3 = c7436v.m4997u();
                for (int i7 = 0; i7 < m4997u3; i7++) {
                    int m4997u4 = c7436v.m4997u();
                    System.arraycopy(C7427r.f13945a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(c7436v.f13978a, c7436v.f13979b, bArr, i8, m4997u4);
                    if (m5002p3 == 33 && i7 == 0) {
                        str = C0535b.m12278c(new C7437w(bArr, i8, i8 + m4997u4));
                    }
                    i5 = i8 + m4997u4;
                    c7436v.m5018A(m4997u4);
                }
            }
            if (i2 == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new C7452f(str, m5002p + 1, singletonList);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C7506y0.m4869a("Error parsing HEVC config", e);
        }
    }
}
