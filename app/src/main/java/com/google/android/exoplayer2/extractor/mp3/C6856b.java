package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.C6950u;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7422o;

/* renamed from: com.google.android.exoplayer2.extractor.mp3.b */
/* loaded from: classes.dex */
public final class C6856b implements InterfaceC6858d {

    /* renamed from: a */
    public final long f11360a;

    /* renamed from: b */
    public final C7422o f11361b;

    /* renamed from: c */
    public final C7422o f11362c;

    /* renamed from: d */
    public long f11363d;

    public C6856b(long j, long j2, long j3) {
        this.f11363d = j;
        this.f11360a = j3;
        C7422o c7422o = new C7422o();
        this.f11361b = c7422o;
        C7422o c7422o2 = new C7422o();
        this.f11362c = c7422o2;
        c7422o.m5054a(0L);
        c7422o2.m5054a(j2);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.InterfaceC6858d
    /* renamed from: a */
    public final long mo5898a() {
        return this.f11360a;
    }

    /* renamed from: b */
    public final boolean m5900b(long j) {
        C7422o c7422o = this.f11361b;
        if (j - c7422o.m5053b(c7422o.f13939a - 1) < 100000) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: c */
    public final boolean mo5796c() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.InterfaceC6858d
    /* renamed from: d */
    public final long mo5897d(long j) {
        return this.f11361b.m5053b(C7408g0.m5103c(this.f11362c, j));
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: h */
    public final InterfaceC6905t.C6906a mo5795h(long j) {
        C7422o c7422o = this.f11361b;
        int m5103c = C7408g0.m5103c(c7422o, j);
        long m5053b = c7422o.m5053b(m5103c);
        C7422o c7422o2 = this.f11362c;
        C6950u c6950u = new C6950u(m5053b, c7422o2.m5053b(m5103c));
        if (m5053b != j && m5103c != c7422o.f13939a - 1) {
            int i = m5103c + 1;
            return new InterfaceC6905t.C6906a(c6950u, new C6950u(c7422o.m5053b(i), c7422o2.m5053b(i)));
        }
        return new InterfaceC6905t.C6906a(c6950u, c6950u);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
    /* renamed from: i */
    public final long mo5794i() {
        return this.f11363d;
    }
}
