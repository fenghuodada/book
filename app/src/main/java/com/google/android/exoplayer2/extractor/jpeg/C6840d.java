package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.C6950u;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* renamed from: com.google.android.exoplayer2.extractor.jpeg.d */
/* loaded from: classes.dex */
public final class C6840d implements InterfaceC6833i {

    /* renamed from: a */
    public final long f11199a;

    /* renamed from: b */
    public final InterfaceC6833i f11200b;

    /* renamed from: com.google.android.exoplayer2.extractor.jpeg.d$a */
    /* loaded from: classes.dex */
    public class C6841a implements InterfaceC6905t {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC6905t f11201a;

        public C6841a(InterfaceC6905t interfaceC6905t) {
            this.f11201a = interfaceC6905t;
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: c */
        public final boolean mo5796c() {
            return this.f11201a.mo5796c();
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: h */
        public final InterfaceC6905t.C6906a mo5795h(long j) {
            InterfaceC6905t.C6906a mo5795h = this.f11201a.mo5795h(j);
            C6950u c6950u = mo5795h.f11619a;
            long j2 = c6950u.f11975a;
            long j3 = c6950u.f11976b;
            long j4 = C6840d.this.f11199a;
            C6950u c6950u2 = new C6950u(j2, j3 + j4);
            C6950u c6950u3 = mo5795h.f11620b;
            return new InterfaceC6905t.C6906a(c6950u2, new C6950u(c6950u3.f11975a, c6950u3.f11976b + j4));
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC6905t
        /* renamed from: i */
        public final long mo5794i() {
            return this.f11201a.mo5794i();
        }
    }

    public C6840d(long j, InterfaceC6833i interfaceC6833i) {
        this.f11199a = j;
        this.f11200b = interfaceC6833i;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6833i
    /* renamed from: a */
    public final void mo5484a(InterfaceC6905t interfaceC6905t) {
        this.f11200b.mo5484a(new C6841a(interfaceC6905t));
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6833i
    /* renamed from: j */
    public final void mo5483j() {
        this.f11200b.mo5483j();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6833i
    /* renamed from: p */
    public final TrackOutput mo5482p(int i, int i2) {
        return this.f11200b.mo5482p(i, i2);
    }
}
