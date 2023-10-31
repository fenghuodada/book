package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.extractor.r */
/* loaded from: classes.dex */
public final class C6903r implements InterfaceC6905t {

    /* renamed from: a */
    public final long[] f11614a;

    /* renamed from: b */
    public final long[] f11615b;

    /* renamed from: c */
    public final long f11616c;

    /* renamed from: d */
    public final boolean f11617d;

    public C6903r(long[] jArr, long[] jArr2, long j) {
        C7394a.m5134a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f11617d = z;
        if (!z || jArr2[0] <= 0) {
            this.f11614a = jArr;
            this.f11615b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f11614a = jArr3;
            long[] jArr4 = new long[i];
            this.f11615b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f11616c = j;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: c */
    public final boolean mo5796c() {
        return this.f11617d;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: h */
    public final InterfaceC6905t.C6906a mo5795h(long j) {
        if (!this.f11617d) {
            C6950u c6950u = C6950u.f11974c;
            return new InterfaceC6905t.C6906a(c6950u, c6950u);
        }
        long[] jArr = this.f11615b;
        int m5101e = C7408g0.m5101e(jArr, j, true);
        long j2 = jArr[m5101e];
        long[] jArr2 = this.f11614a;
        C6950u c6950u2 = new C6950u(j2, jArr2[m5101e]);
        if (j2 != j && m5101e != jArr.length - 1) {
            int i = m5101e + 1;
            return new InterfaceC6905t.C6906a(c6950u2, new C6950u(jArr[i], jArr2[i]));
        }
        return new InterfaceC6905t.C6906a(c6950u2, c6950u2);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: i */
    public final long mo5794i() {
        return this.f11616c;
    }
}
