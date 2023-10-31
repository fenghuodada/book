package com.google.android.exoplayer2.extractor.p037ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ts.f */
/* loaded from: classes.dex */
public final class C6920f implements InterfaceC6922h {
    @Nullable

    /* renamed from: b */
    public final String f11726b;

    /* renamed from: c */
    public String f11727c;

    /* renamed from: d */
    public TrackOutput f11728d;

    /* renamed from: f */
    public int f11730f;

    /* renamed from: g */
    public int f11731g;

    /* renamed from: h */
    public long f11732h;

    /* renamed from: i */
    public C7003m0 f11733i;

    /* renamed from: j */
    public int f11734j;

    /* renamed from: a */
    public final C7436v f11725a = new C7436v(new byte[18]);

    /* renamed from: e */
    public int f11729e = 0;

    /* renamed from: k */
    public long f11735k = -9223372036854775807L;

    public C6920f(@Nullable String str) {
        this.f11726b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0239  */
    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5835b(com.google.android.exoplayer2.util.C7436v r23) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.C6920f.mo5835b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: c */
    public final void mo5834c() {
        this.f11729e = 0;
        this.f11730f = 0;
        this.f11731g = 0;
        this.f11735k = -9223372036854775807L;
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
        this.f11727c = c6913d.f11669e;
        c6913d.m5844b();
        this.f11728d = interfaceC6833i.mo5482p(c6913d.f11668d, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f11735k = j;
        }
    }
}
