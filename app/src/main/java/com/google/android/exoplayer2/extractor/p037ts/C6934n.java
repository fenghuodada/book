package com.google.android.exoplayer2.extractor.p037ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ts.n */
/* loaded from: classes.dex */
public final class C6934n implements InterfaceC6922h {
    @Nullable

    /* renamed from: a */
    public final String f11872a;

    /* renamed from: b */
    public final C7436v f11873b;

    /* renamed from: c */
    public final C7435u f11874c;

    /* renamed from: d */
    public TrackOutput f11875d;

    /* renamed from: e */
    public String f11876e;

    /* renamed from: f */
    public C7003m0 f11877f;

    /* renamed from: g */
    public int f11878g;

    /* renamed from: h */
    public int f11879h;

    /* renamed from: i */
    public int f11880i;

    /* renamed from: j */
    public int f11881j;

    /* renamed from: k */
    public long f11882k;

    /* renamed from: l */
    public boolean f11883l;

    /* renamed from: m */
    public int f11884m;

    /* renamed from: n */
    public int f11885n;

    /* renamed from: o */
    public int f11886o;

    /* renamed from: p */
    public boolean f11887p;

    /* renamed from: q */
    public long f11888q;

    /* renamed from: r */
    public int f11889r;

    /* renamed from: s */
    public long f11890s;

    /* renamed from: t */
    public int f11891t;
    @Nullable

    /* renamed from: u */
    public String f11892u;

    public C6934n(@Nullable String str) {
        this.f11872a = str;
        C7436v c7436v = new C7436v(1024);
        this.f11873b = c7436v;
        byte[] bArr = c7436v.f13978a;
        this.f11874c = new C7435u(bArr, bArr.length);
        this.f11882k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x017a, code lost:
        throw com.google.android.exoplayer2.C7506y0.m4869a(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0187, code lost:
        if (r23.f11883l == false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5835b(com.google.android.exoplayer2.util.C7436v r24) throws com.google.android.exoplayer2.C7506y0 {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.C6934n.mo5835b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: c */
    public final void mo5834c() {
        this.f11878g = 0;
        this.f11882k = -9223372036854775807L;
        this.f11883l = false;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: d */
    public final void mo5833d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: e */
    public final void mo5832e(InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        c6913d.m5845a();
        c6913d.m5844b();
        this.f11875d = interfaceC6833i.mo5482p(c6913d.f11668d, 1);
        c6913d.m5844b();
        this.f11876e = c6913d.f11669e;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f11882k = j;
        }
    }
}
