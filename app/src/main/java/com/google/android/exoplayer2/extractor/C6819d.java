package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.extractor.d */
/* loaded from: classes.dex */
public class C6819d implements InterfaceC6905t {

    /* renamed from: a */
    public final long f11117a;

    /* renamed from: b */
    public final long f11118b;

    /* renamed from: c */
    public final int f11119c;

    /* renamed from: d */
    public final long f11120d;

    /* renamed from: e */
    public final int f11121e;

    /* renamed from: f */
    public final long f11122f;

    public C6819d(int i, int i2, long j, long j2) {
        long max;
        this.f11117a = j;
        this.f11118b = j2;
        this.f11119c = i2 == -1 ? 1 : i2;
        this.f11121e = i;
        if (j == -1) {
            this.f11120d = -1L;
            max = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f11120d = j3;
            max = ((Math.max(0L, j3) * 8) * 1000000) / i;
        }
        this.f11122f = max;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: c */
    public final boolean mo5796c() {
        return this.f11120d != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: h */
    public final InterfaceC6905t.C6906a mo5795h(long j) {
        long j2 = this.f11120d;
        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        long j3 = this.f11118b;
        if (i == 0) {
            C6950u c6950u = new C6950u(0L, j3);
            return new InterfaceC6905t.C6906a(c6950u, c6950u);
        }
        int i2 = this.f11121e;
        long j4 = this.f11119c;
        long m5098h = C7408g0.m5098h((((i2 * j) / 8000000) / j4) * j4, 0L, j2 - j4) + j3;
        long max = ((Math.max(0L, m5098h - j3) * 8) * 1000000) / i2;
        C6950u c6950u2 = new C6950u(max, m5098h);
        if (max < j) {
            long j5 = j4 + m5098h;
            if (j5 < this.f11117a) {
                return new InterfaceC6905t.C6906a(c6950u2, new C6950u(((Math.max(0L, j5 - j3) * 8) * 1000000) / i2, j5));
            }
        }
        return new InterfaceC6905t.C6906a(c6950u2, c6950u2);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: i */
    public final long mo5794i() {
        return this.f11122f;
    }
}
