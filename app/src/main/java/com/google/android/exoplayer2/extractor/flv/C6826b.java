package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.flv.b */
/* loaded from: classes.dex */
public final class C6826b implements Extractor {

    /* renamed from: f */
    public InterfaceC6833i f11159f;

    /* renamed from: h */
    public boolean f11161h;

    /* renamed from: i */
    public long f11162i;

    /* renamed from: j */
    public int f11163j;

    /* renamed from: k */
    public int f11164k;

    /* renamed from: l */
    public int f11165l;

    /* renamed from: m */
    public long f11166m;

    /* renamed from: n */
    public boolean f11167n;

    /* renamed from: o */
    public C6825a f11168o;

    /* renamed from: p */
    public C6830e f11169p;

    /* renamed from: a */
    public final C7436v f11154a = new C7436v(4);

    /* renamed from: b */
    public final C7436v f11155b = new C7436v(9);

    /* renamed from: c */
    public final C7436v f11156c = new C7436v(11);

    /* renamed from: d */
    public final C7436v f11157d = new C7436v();

    /* renamed from: e */
    public final C6827c f11158e = new C6827c();

    /* renamed from: g */
    public int f11160g = 1;

    /* renamed from: a */
    public final C7436v m5941a(C6820e c6820e) throws IOException {
        int i = this.f11165l;
        C7436v c7436v = this.f11157d;
        byte[] bArr = c7436v.f13978a;
        if (i > bArr.length) {
            c7436v.m4994x(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            c7436v.m4992z(0);
        }
        c7436v.m4993y(this.f11165l);
        c6820e.mo5930a(c7436v.f13978a, 0, this.f11165l, false);
        return c7436v;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        C7436v c7436v = this.f11154a;
        C6820e c6820e = (C6820e) interfaceC6832h;
        c6820e.mo5928d(c7436v.f13978a, 0, 3, false);
        c7436v.m4992z(0);
        if (c7436v.m5000r() != 4607062) {
            return false;
        }
        c6820e.mo5928d(c7436v.f13978a, 0, 2, false);
        c7436v.m4992z(0);
        if ((c7436v.m4997u() & 250) != 0) {
            return false;
        }
        c6820e.mo5928d(c7436v.f13978a, 0, 4, false);
        c7436v.m4992z(0);
        int m5015c = c7436v.m5015c();
        c6820e.f11128f = 0;
        c6820e.m5950l(m5015c, false);
        c6820e.mo5928d(c7436v.f13978a, 0, 4, false);
        c7436v.m4992z(0);
        if (c7436v.m5015c() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d5 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5806e(com.google.android.exoplayer2.extractor.InterfaceC6832h r16, com.google.android.exoplayer2.extractor.C6904s r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flv.C6826b.mo5806e(com.google.android.exoplayer2.extractor.h, com.google.android.exoplayer2.extractor.s):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11159f = interfaceC6833i;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        if (j == 0) {
            this.f11160g = 1;
            this.f11161h = false;
        } else {
            this.f11160g = 3;
        }
        this.f11163j = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
