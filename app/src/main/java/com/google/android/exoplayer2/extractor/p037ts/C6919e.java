package com.google.android.exoplayer2.extractor.p037ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.C6831g;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.ts.e */
/* loaded from: classes.dex */
public final class C6919e implements InterfaceC6922h {

    /* renamed from: v */
    public static final byte[] f11703v = {73, 68, 51};

    /* renamed from: a */
    public final boolean f11704a;
    @Nullable

    /* renamed from: d */
    public final String f11707d;

    /* renamed from: e */
    public String f11708e;

    /* renamed from: f */
    public TrackOutput f11709f;

    /* renamed from: g */
    public TrackOutput f11710g;

    /* renamed from: k */
    public boolean f11714k;

    /* renamed from: l */
    public boolean f11715l;

    /* renamed from: o */
    public int f11718o;

    /* renamed from: p */
    public boolean f11719p;

    /* renamed from: r */
    public int f11721r;

    /* renamed from: t */
    public TrackOutput f11723t;

    /* renamed from: u */
    public long f11724u;

    /* renamed from: b */
    public final C7435u f11705b = new C7435u(new byte[7], 7);

    /* renamed from: c */
    public final C7436v f11706c = new C7436v(Arrays.copyOf(f11703v, 10));

    /* renamed from: h */
    public int f11711h = 0;

    /* renamed from: i */
    public int f11712i = 0;

    /* renamed from: j */
    public int f11713j = 256;

    /* renamed from: m */
    public int f11716m = -1;

    /* renamed from: n */
    public int f11717n = -1;

    /* renamed from: q */
    public long f11720q = -9223372036854775807L;

    /* renamed from: s */
    public long f11722s = -9223372036854775807L;

    public C6919e(boolean z, @Nullable String str) {
        this.f11704a = z;
        this.f11707d = str;
    }

    /* renamed from: a */
    public final boolean m5841a(int i, C7436v c7436v, byte[] bArr) {
        int min = Math.min(c7436v.f13980c - c7436v.f13979b, i - this.f11712i);
        c7436v.m5016b(this.f11712i, bArr, min);
        int i2 = this.f11712i + min;
        this.f11712i = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x025a, code lost:
        if (((r8 & 8) >> 3) == r7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0277, code lost:
        if (r9[r8] != 51) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027e A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5835b(com.google.android.exoplayer2.util.C7436v r23) throws com.google.android.exoplayer2.C7506y0 {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.C6919e.mo5835b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: c */
    public final void mo5834c() {
        this.f11722s = -9223372036854775807L;
        this.f11715l = false;
        this.f11711h = 0;
        this.f11712i = 0;
        this.f11713j = 256;
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
        this.f11708e = c6913d.f11669e;
        c6913d.m5844b();
        TrackOutput mo5482p = interfaceC6833i.mo5482p(c6913d.f11668d, 1);
        this.f11709f = mo5482p;
        this.f11723t = mo5482p;
        if (this.f11704a) {
            c6913d.m5845a();
            c6913d.m5844b();
            TrackOutput mo5482p2 = interfaceC6833i.mo5482p(c6913d.f11668d, 5);
            this.f11710g = mo5482p2;
            C7003m0.C7005b c7005b = new C7003m0.C7005b();
            c6913d.m5844b();
            c7005b.f12306a = c6913d.f11669e;
            c7005b.f12316k = "application/id3";
            mo5482p2.mo5451e(new C7003m0(c7005b));
            return;
        }
        this.f11710g = new C6831g();
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f11722s = j;
        }
    }
}
