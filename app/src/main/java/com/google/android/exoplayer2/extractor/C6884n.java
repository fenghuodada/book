package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.C6885o;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.extractor.n */
/* loaded from: classes.dex */
public final class C6884n implements InterfaceC6905t {

    /* renamed from: a */
    public final C6885o f11534a;

    /* renamed from: b */
    public final long f11535b;

    public C6884n(C6885o c6885o, long j) {
        this.f11534a = c6885o;
        this.f11535b = j;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: c */
    public final boolean mo5796c() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: h */
    public final InterfaceC6905t.C6906a mo5795h(long j) {
        long j2;
        C6885o c6885o = this.f11534a;
        C7394a.m5130e(c6885o.f11546k);
        C6885o.C6886a c6886a = c6885o.f11546k;
        long[] jArr = c6886a.f11548a;
        int m5101e = C7408g0.m5101e(jArr, C7408g0.m5098h((c6885o.f11540e * j) / 1000000, 0L, c6885o.f11545j - 1), false);
        long j3 = 0;
        if (m5101e == -1) {
            j2 = 0;
        } else {
            j2 = jArr[m5101e];
        }
        long[] jArr2 = c6886a.f11549b;
        if (m5101e != -1) {
            j3 = jArr2[m5101e];
        }
        int i = c6885o.f11540e;
        long j4 = (j2 * 1000000) / i;
        long j5 = this.f11535b;
        C6950u c6950u = new C6950u(j4, j3 + j5);
        if (j4 != j && m5101e != jArr.length - 1) {
            int i2 = m5101e + 1;
            return new InterfaceC6905t.C6906a(c6950u, new C6950u((jArr[i2] * 1000000) / i, j5 + jArr2[i2]));
        }
        return new InterfaceC6905t.C6906a(c6950u, c6950u);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: i */
    public final long mo5794i() {
        return this.f11534a.m5865c();
    }
}
