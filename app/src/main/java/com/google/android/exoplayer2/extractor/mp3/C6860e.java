package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.C6950u;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.extractor.mp3.e */
/* loaded from: classes.dex */
public final class C6860e implements InterfaceC6858d {

    /* renamed from: a */
    public final long[] f11367a;

    /* renamed from: b */
    public final long[] f11368b;

    /* renamed from: c */
    public final long f11369c;

    /* renamed from: d */
    public final long f11370d;

    public C6860e(long[] jArr, long[] jArr2, long j, long j2) {
        this.f11367a = jArr;
        this.f11368b = jArr2;
        this.f11369c = j;
        this.f11370d = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.InterfaceC6858d
    /* renamed from: a */
    public final long mo5898a() {
        return this.f11370d;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: c */
    public final boolean mo5796c() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.InterfaceC6858d
    /* renamed from: d */
    public final long mo5897d(long j) {
        return this.f11367a[C7408g0.m5101e(this.f11368b, j, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: h */
    public final InterfaceC6905t.C6906a mo5795h(long j) {
        long[] jArr = this.f11367a;
        int m5101e = C7408g0.m5101e(jArr, j, true);
        long j2 = jArr[m5101e];
        long[] jArr2 = this.f11368b;
        C6950u c6950u = new C6950u(j2, jArr2[m5101e]);
        if (j2 < j && m5101e != jArr.length - 1) {
            int i = m5101e + 1;
            return new InterfaceC6905t.C6906a(c6950u, new C6950u(jArr[i], jArr2[i]));
        }
        return new InterfaceC6905t.C6906a(c6950u, c6950u);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: i */
    public final long mo5794i() {
        return this.f11369c;
    }
}
