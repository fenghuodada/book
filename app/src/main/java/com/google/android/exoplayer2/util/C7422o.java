package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.util.o */
/* loaded from: classes.dex */
public final class C7422o {

    /* renamed from: a */
    public int f13939a;

    /* renamed from: b */
    public long[] f13940b = new long[32];

    /* renamed from: a */
    public final void m5054a(long j) {
        int i = this.f13939a;
        long[] jArr = this.f13940b;
        if (i == jArr.length) {
            this.f13940b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f13940b;
        int i2 = this.f13939a;
        this.f13939a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public final long m5053b(int i) {
        if (i < 0 || i >= this.f13939a) {
            int i2 = this.f13939a;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Invalid index ");
            sb.append(i);
            sb.append(", size is ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.f13940b[i];
    }
}
