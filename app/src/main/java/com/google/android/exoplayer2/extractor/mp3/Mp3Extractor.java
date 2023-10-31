package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.C0522f;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.audio.C6697g0;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6831g;
import com.google.android.exoplayer2.extractor.C6901p;
import com.google.android.exoplayer2.extractor.C6902q;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.id3.C7090l;
import com.google.android.exoplayer2.util.C7436v;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class Mp3Extractor implements Extractor {

    /* renamed from: u */
    public static final C0522f f11339u = new C0522f();

    /* renamed from: a */
    public final int f11340a;

    /* renamed from: b */
    public final long f11341b;

    /* renamed from: c */
    public final C7436v f11342c;

    /* renamed from: d */
    public final C6697g0.C6698a f11343d;

    /* renamed from: e */
    public final C6901p f11344e;

    /* renamed from: f */
    public final C6902q f11345f;

    /* renamed from: g */
    public final C6831g f11346g;

    /* renamed from: h */
    public InterfaceC6833i f11347h;

    /* renamed from: i */
    public TrackOutput f11348i;

    /* renamed from: j */
    public TrackOutput f11349j;

    /* renamed from: k */
    public int f11350k;
    @Nullable

    /* renamed from: l */
    public C7042a f11351l;

    /* renamed from: m */
    public long f11352m;

    /* renamed from: n */
    public long f11353n;

    /* renamed from: o */
    public long f11354o;

    /* renamed from: p */
    public int f11355p;

    /* renamed from: q */
    public InterfaceC6858d f11356q;

    /* renamed from: r */
    public boolean f11357r;

    /* renamed from: s */
    public boolean f11358s;

    /* renamed from: t */
    public long f11359t;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    public Mp3Extractor() {
        this(0);
    }

    public Mp3Extractor(int i) {
        this.f11340a = 0;
        this.f11341b = -9223372036854775807L;
        this.f11342c = new C7436v(10);
        this.f11343d = new C6697g0.C6698a();
        this.f11344e = new C6901p();
        this.f11352m = -9223372036854775807L;
        this.f11345f = new C6902q();
        C6831g c6831g = new C6831g();
        this.f11346g = c6831g;
        this.f11349j = c6831g;
    }

    /* renamed from: c */
    public static long m5903c(@Nullable C7042a c7042a) {
        C7042a.InterfaceC7044b[] interfaceC7044bArr;
        if (c7042a != null) {
            for (C7042a.InterfaceC7044b interfaceC7044b : c7042a.f12490a) {
                if (interfaceC7044b instanceof C7090l) {
                    C7090l c7090l = (C7090l) interfaceC7044b;
                    if (c7090l.f12565a.equals("TLEN")) {
                        return C6622C.m6217b(Long.parseLong(c7090l.f12577c));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public final C6855a m5904a(C6820e c6820e) throws IOException {
        C7436v c7436v = this.f11342c;
        c6820e.mo5928d(c7436v.f13978a, 0, 4, false);
        c7436v.m4992z(0);
        this.f11343d.m6063a(c7436v.m5015c());
        return new C6855a(c6820e.f11125c, c6820e.f11126d, this.f11343d);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        return m5901h((C6820e) interfaceC6832h, true);
    }

    /* renamed from: d */
    public final boolean m5902d(C6820e c6820e) throws IOException {
        InterfaceC6858d interfaceC6858d = this.f11356q;
        if (interfaceC6858d != null) {
            long mo5898a = interfaceC6858d.mo5898a();
            if (mo5898a != -1 && c6820e.mo5927e() > mo5898a - 4) {
                return true;
            }
        }
        try {
            return !c6820e.mo5928d(this.f11342c.f13978a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r8 != 1231971951) goto L184;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0237  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5806e(com.google.android.exoplayer2.extractor.InterfaceC6832h r41, com.google.android.exoplayer2.extractor.C6904s r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.mo5806e(com.google.android.exoplayer2.extractor.h, com.google.android.exoplayer2.extractor.s):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11347h = interfaceC6833i;
        TrackOutput mo5482p = interfaceC6833i.mo5482p(0, 1);
        this.f11348i = mo5482p;
        this.f11349j = mo5482p;
        this.f11347h.mo5483j();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        this.f11350k = 0;
        this.f11352m = -9223372036854775807L;
        this.f11353n = 0L;
        this.f11355p = 0;
        this.f11359t = j2;
        InterfaceC6858d interfaceC6858d = this.f11356q;
        if (!(interfaceC6858d instanceof C6856b) || ((C6856b) interfaceC6858d).m5900b(j2)) {
            return;
        }
        this.f11358s = true;
        this.f11349j = this.f11346g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a7, code lost:
        if (r20 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
        r19.mo5924j(r4 + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ae, code lost:
        r19.f11128f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b0, code lost:
        r18.f11350k = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b2, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007f A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5901h(com.google.android.exoplayer2.extractor.C6820e r19, boolean r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r20 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r3 = 0
            r1.f11128f = r3
            long r4 = r1.f11126d
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            r6 = 0
            r7 = 4
            if (r4 != 0) goto L42
            int r4 = r0.f11340a
            r4 = r4 & r7
            if (r4 != 0) goto L21
            r4 = r5
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 == 0) goto L26
            r4 = r6
            goto L28
        L26:
            androidx.constraintlayout.core.widgets.analyzer.f r4 = com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.f11339u
        L28:
            com.google.android.exoplayer2.extractor.q r8 = r0.f11345f
            com.google.android.exoplayer2.metadata.a r4 = r8.m5849a(r1, r4)
            r0.f11351l = r4
            if (r4 == 0) goto L37
            com.google.android.exoplayer2.extractor.p r8 = r0.f11344e
            r8.m5850b(r4)
        L37:
            long r8 = r19.mo5927e()
            int r4 = (int) r8
            if (r20 != 0) goto L43
            r1.mo5924j(r4)
            goto L43
        L42:
            r4 = r3
        L43:
            r8 = r3
            r9 = r8
            r10 = r9
        L46:
            boolean r11 = r18.m5902d(r19)
            if (r11 == 0) goto L55
            if (r9 <= 0) goto L4f
            goto La7
        L4f:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L55:
            com.google.android.exoplayer2.util.v r11 = r0.f11342c
            r11.m4992z(r3)
            int r11 = r11.m5015c()
            if (r8 == 0) goto L74
            long r12 = (long) r8
            r14 = -128000(0xfffffffffffe0c00, float:NaN)
            r14 = r14 & r11
            long r14 = (long) r14
            r16 = -128000(0xfffffffffffe0c00, double:NaN)
            long r12 = r12 & r16
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 != 0) goto L71
            r12 = r5
            goto L72
        L71:
            r12 = r3
        L72:
            if (r12 == 0) goto L7b
        L74:
            int r12 = com.google.android.exoplayer2.audio.C6697g0.m6065a(r11)
            r13 = -1
            if (r12 != r13) goto L9a
        L7b:
            int r8 = r10 + 1
            if (r10 != r2) goto L89
            if (r20 == 0) goto L82
            return r3
        L82:
            java.lang.String r1 = "Searched too many bytes."
            com.google.android.exoplayer2.y0 r1 = com.google.android.exoplayer2.C7506y0.m4869a(r1, r6)
            throw r1
        L89:
            if (r20 == 0) goto L93
            r1.f11128f = r3
            int r9 = r4 + r8
            r1.m5950l(r9, r3)
            goto L96
        L93:
            r1.mo5924j(r5)
        L96:
            r9 = r3
            r10 = r8
            r8 = r9
            goto L46
        L9a:
            int r9 = r9 + 1
            if (r9 != r5) goto La5
            com.google.android.exoplayer2.audio.g0$a r8 = r0.f11343d
            r8.m6063a(r11)
            r8 = r11
            goto Lb3
        La5:
            if (r9 != r7) goto Lb3
        La7:
            if (r20 == 0) goto Lae
            int r4 = r4 + r10
            r1.mo5924j(r4)
            goto Lb0
        Lae:
            r1.f11128f = r3
        Lb0:
            r0.f11350k = r8
            return r5
        Lb3:
            int r12 = r12 + (-4)
            r1.m5950l(r12, r3)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.m5901h(com.google.android.exoplayer2.extractor.e, boolean):boolean");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
