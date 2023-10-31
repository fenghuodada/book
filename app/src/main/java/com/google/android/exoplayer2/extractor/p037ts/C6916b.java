package com.google.android.exoplayer2.extractor.p037ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ts.b */
/* loaded from: classes.dex */
public final class C6916b implements InterfaceC6922h {

    /* renamed from: a */
    public final C7435u f11675a;

    /* renamed from: b */
    public final C7436v f11676b;
    @Nullable

    /* renamed from: c */
    public final String f11677c;

    /* renamed from: d */
    public String f11678d;

    /* renamed from: e */
    public TrackOutput f11679e;

    /* renamed from: f */
    public int f11680f;

    /* renamed from: g */
    public int f11681g;

    /* renamed from: h */
    public boolean f11682h;

    /* renamed from: i */
    public long f11683i;

    /* renamed from: j */
    public C7003m0 f11684j;

    /* renamed from: k */
    public int f11685k;

    /* renamed from: l */
    public long f11686l;

    public C6916b(@Nullable String str) {
        C7435u c7435u = new C7435u(new byte[128], 128);
        this.f11675a = c7435u;
        this.f11676b = new C7436v(c7435u.f13974a);
        this.f11680f = 0;
        this.f11686l = -9223372036854775807L;
        this.f11677c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x035b, code lost:
        if (r21.m5002p() == 11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0369, code lost:
        if (r2 == 11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x036b, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x036d, code lost:
        r13 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0277  */
    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5835b(com.google.android.exoplayer2.util.C7436v r21) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.C6916b.mo5835b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: c */
    public final void mo5834c() {
        this.f11680f = 0;
        this.f11681g = 0;
        this.f11682h = false;
        this.f11686l = -9223372036854775807L;
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
        this.f11678d = c6913d.f11669e;
        c6913d.m5844b();
        this.f11679e = interfaceC6833i.mo5482p(c6913d.f11668d, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f11686l = j;
        }
    }
}
