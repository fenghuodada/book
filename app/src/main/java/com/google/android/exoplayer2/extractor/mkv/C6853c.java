package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.mkv.c */
/* loaded from: classes.dex */
public final class C6853c {

    /* renamed from: a */
    public final C7436v f11333a = new C7436v(8);

    /* renamed from: b */
    public int f11334b;

    /* renamed from: a */
    public final long m5907a(C6820e c6820e) throws IOException {
        C7436v c7436v = this.f11333a;
        int i = 0;
        c6820e.mo5928d(c7436v.f13978a, 0, 1, false);
        int i2 = c7436v.f13978a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c6820e.mo5928d(c7436v.f13978a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (c7436v.f13978a[i] & 255) + (i5 << 8);
        }
        this.f11334b = i4 + 1 + this.f11334b;
        return i5;
    }
}
