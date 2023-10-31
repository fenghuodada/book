package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.C6950u;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.extractor.mp3.f */
/* loaded from: classes.dex */
public final class C6861f implements InterfaceC6858d {

    /* renamed from: a */
    public final long f11371a;

    /* renamed from: b */
    public final int f11372b;

    /* renamed from: c */
    public final long f11373c;

    /* renamed from: d */
    public final long f11374d;

    /* renamed from: e */
    public final long f11375e;
    @Nullable

    /* renamed from: f */
    public final long[] f11376f;

    public C6861f(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f11371a = j;
        this.f11372b = i;
        this.f11373c = j2;
        this.f11376f = jArr;
        this.f11374d = j3;
        this.f11375e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.InterfaceC6858d
    /* renamed from: a */
    public final long mo5898a() {
        return this.f11375e;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: c */
    public final boolean mo5796c() {
        return this.f11376f != null;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.InterfaceC6858d
    /* renamed from: d */
    public final long mo5897d(long j) {
        long j2;
        double d;
        long j3 = j - this.f11371a;
        if (mo5796c() && j3 > this.f11372b) {
            long[] jArr = this.f11376f;
            C7394a.m5130e(jArr);
            double d2 = (j3 * 256.0d) / this.f11374d;
            int m5101e = C7408g0.m5101e(jArr, (long) d2, true);
            long j4 = this.f11373c;
            long j5 = (m5101e * j4) / 100;
            long j6 = jArr[m5101e];
            int i = m5101e + 1;
            long j7 = (j4 * i) / 100;
            if (m5101e == 99) {
                j2 = 256;
            } else {
                j2 = jArr[i];
            }
            if (j6 == j2) {
                d = 0.0d;
            } else {
                d = (d2 - j6) / (j2 - j6);
            }
            return Math.round(d * (j7 - j5)) + j5;
        }
        return 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: h */
    public final InterfaceC6905t.C6906a mo5795h(long j) {
        double d;
        double d2;
        boolean mo5796c = mo5796c();
        int i = this.f11372b;
        long j2 = this.f11371a;
        if (!mo5796c) {
            C6950u c6950u = new C6950u(0L, j2 + i);
            return new InterfaceC6905t.C6906a(c6950u, c6950u);
        }
        long m5098h = C7408g0.m5098h(j, 0L, this.f11373c);
        double d3 = (m5098h * 100.0d) / this.f11373c;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d = 256.0d;
                d4 = 256.0d;
                double d5 = d4 / d;
                long j3 = this.f11374d;
                C6950u c6950u2 = new C6950u(m5098h, j2 + C7408g0.m5098h(Math.round(d5 * j3), i, j3 - 1));
                return new InterfaceC6905t.C6906a(c6950u2, c6950u2);
            }
            int i2 = (int) d3;
            long[] jArr = this.f11376f;
            C7394a.m5130e(jArr);
            double d6 = jArr[i2];
            if (i2 == 99) {
                d2 = 256.0d;
            } else {
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d6) * (d3 - i2)) + d6;
        }
        d = 256.0d;
        double d52 = d4 / d;
        long j32 = this.f11374d;
        C6950u c6950u22 = new C6950u(m5098h, j2 + C7408g0.m5098h(Math.round(d52 * j32), i, j32 - 1));
        return new InterfaceC6905t.C6906a(c6950u22, c6950u22);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: i */
    public final long mo5794i() {
        return this.f11373c;
    }
}
