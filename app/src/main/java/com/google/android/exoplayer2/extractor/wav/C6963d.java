package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.C6950u;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.extractor.wav.d */
/* loaded from: classes.dex */
public final class C6963d implements InterfaceC6905t {

    /* renamed from: a */
    public final C6960b f12025a;

    /* renamed from: b */
    public final int f12026b;

    /* renamed from: c */
    public final long f12027c;

    /* renamed from: d */
    public final long f12028d;

    /* renamed from: e */
    public final long f12029e;

    public C6963d(C6960b c6960b, int i, long j, long j2) {
        this.f12025a = c6960b;
        this.f12026b = i;
        this.f12027c = j;
        long j3 = (j2 - j) / c6960b.f12020d;
        this.f12028d = j3;
        this.f12029e = m5797b(j3);
    }

    /* renamed from: b */
    public final long m5797b(long j) {
        return C7408g0.m5081y(j * this.f12026b, 1000000L, this.f12025a.f12019c);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: c */
    public final boolean mo5796c() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: h */
    public final InterfaceC6905t.C6906a mo5795h(long j) {
        C6960b c6960b = this.f12025a;
        long j2 = (c6960b.f12019c * j) / (this.f12026b * 1000000);
        long j3 = this.f12028d;
        long m5098h = C7408g0.m5098h(j2, 0L, j3 - 1);
        long j4 = this.f12027c;
        long m5797b = m5797b(m5098h);
        C6950u c6950u = new C6950u(m5797b, (c6960b.f12020d * m5098h) + j4);
        if (m5797b < j && m5098h != j3 - 1) {
            long j5 = m5098h + 1;
            return new InterfaceC6905t.C6906a(c6950u, new C6950u(m5797b(j5), (c6960b.f12020d * j5) + j4));
        }
        return new InterfaceC6905t.C6906a(c6950u, c6950u);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: i */
    public final long mo5794i() {
        return this.f12029e;
    }
}
