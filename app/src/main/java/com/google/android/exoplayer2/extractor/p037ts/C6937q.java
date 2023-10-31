package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7404e0;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ts.q */
/* loaded from: classes.dex */
public final class C6937q implements InterfaceC6944v {

    /* renamed from: a */
    public C7003m0 f11910a;

    /* renamed from: b */
    public C7404e0 f11911b;

    /* renamed from: c */
    public TrackOutput f11912c;

    public C6937q(String str) {
        C7003m0.C7005b c7005b = new C7003m0.C7005b();
        c7005b.f12316k = str;
        this.f11910a = new C7003m0(c7005b);
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6944v
    /* renamed from: a */
    public final void mo5821a(C7404e0 c7404e0, InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        this.f11911b = c7404e0;
        c6913d.m5845a();
        c6913d.m5844b();
        TrackOutput mo5482p = interfaceC6833i.mo5482p(c6913d.f11668d, 5);
        this.f11912c = mo5482p;
        mo5482p.mo5451e(this.f11910a);
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6944v
    /* renamed from: b */
    public final void mo5820b(C7436v c7436v) {
        long m5110c;
        long j;
        C7394a.m5130e(this.f11911b);
        int i = C7408g0.f13905a;
        C7404e0 c7404e0 = this.f11911b;
        synchronized (c7404e0) {
            long j2 = c7404e0.f13898c;
            if (j2 != -9223372036854775807L) {
                m5110c = j2 + c7404e0.f13897b;
            } else {
                m5110c = c7404e0.m5110c();
            }
            j = m5110c;
        }
        long m5109d = this.f11911b.m5109d();
        if (j != -9223372036854775807L && m5109d != -9223372036854775807L) {
            C7003m0 c7003m0 = this.f11910a;
            if (m5109d != c7003m0.f12291p) {
                C7003m0.C7005b c7005b = new C7003m0.C7005b(c7003m0);
                c7005b.f12320o = m5109d;
                C7003m0 c7003m02 = new C7003m0(c7005b);
                this.f11910a = c7003m02;
                this.f11912c.mo5451e(c7003m02);
            }
            int i2 = c7436v.f13980c - c7436v.f13979b;
            this.f11912c.mo5454b(i2, c7436v);
            this.f11912c.mo5452d(j, 1, i2, 0, null);
        }
    }
}
