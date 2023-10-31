package com.google.android.exoplayer2.extractor.amr;

import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.C6819d;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6904s;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AmrExtractor implements Extractor {

    /* renamed from: n */
    public static final int[] f11095n;

    /* renamed from: q */
    public static final int f11098q;

    /* renamed from: b */
    public boolean f11100b;

    /* renamed from: c */
    public long f11101c;

    /* renamed from: d */
    public int f11102d;

    /* renamed from: e */
    public int f11103e;

    /* renamed from: f */
    public boolean f11104f;

    /* renamed from: h */
    public long f11106h;

    /* renamed from: i */
    public InterfaceC6833i f11107i;

    /* renamed from: j */
    public TrackOutput f11108j;

    /* renamed from: k */
    public InterfaceC6905t.C6907b f11109k;

    /* renamed from: l */
    public boolean f11110l;

    /* renamed from: m */
    public static final int[] f11094m = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: o */
    public static final byte[] f11096o = C7408g0.m5088r("#!AMR\n");

    /* renamed from: p */
    public static final byte[] f11097p = C7408g0.m5088r("#!AMR-WB\n");

    /* renamed from: a */
    public final byte[] f11099a = new byte[1];

    /* renamed from: g */
    public int f11105g = -1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f11095n = iArr;
        f11098q = iArr[8];
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        if (r1 != false) goto L22;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m5954a(com.google.android.exoplayer2.extractor.C6820e r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r6.f11128f = r0
            byte[] r1 = r5.f11099a
            r2 = 1
            r6.mo5928d(r1, r0, r2, r0)
            r6 = r1[r0]
            r1 = r6 & 131(0x83, float:1.84E-43)
            r3 = 0
            if (r1 > 0) goto L77
            int r6 = r6 >> 3
            r1 = 15
            r6 = r6 & r1
            if (r6 < 0) goto L3a
            if (r6 > r1) goto L3a
            boolean r1 = r5.f11100b
            if (r1 == 0) goto L27
            r4 = 10
            if (r6 < r4) goto L25
            r4 = 13
            if (r6 <= r4) goto L27
        L25:
            r4 = r2
            goto L28
        L27:
            r4 = r0
        L28:
            if (r4 != 0) goto L39
            if (r1 != 0) goto L36
            r1 = 12
            if (r6 < r1) goto L34
            r1 = 14
            if (r6 <= r1) goto L36
        L34:
            r1 = r2
            goto L37
        L36:
            r1 = r0
        L37:
            if (r1 == 0) goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 != 0) goto L69
            boolean r0 = r5.f11100b
            if (r0 == 0) goto L43
            java.lang.String r0 = "WB"
            goto L45
        L43:
            java.lang.String r0 = "NB"
        L45:
            int r1 = r0.length()
            int r1 = r1 + 35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Illegal AMR "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " frame type "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.google.android.exoplayer2.y0 r6 = com.google.android.exoplayer2.C7506y0.m4869a(r6, r3)
            throw r6
        L69:
            boolean r0 = r5.f11100b
            if (r0 == 0) goto L72
            int[] r0 = com.google.android.exoplayer2.extractor.amr.AmrExtractor.f11095n
            r6 = r0[r6]
            goto L76
        L72:
            int[] r0 = com.google.android.exoplayer2.extractor.amr.AmrExtractor.f11094m
            r6 = r0[r6]
        L76:
            return r6
        L77:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 42
            r0.<init>(r1)
            java.lang.String r1 = "Invalid padding bits for frame header "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.google.android.exoplayer2.y0 r6 = com.google.android.exoplayer2.C7506y0.m4869a(r6, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.amr.AmrExtractor.m5954a(com.google.android.exoplayer2.extractor.e):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        return m5953c((C6820e) interfaceC6832h);
    }

    /* renamed from: c */
    public final boolean m5953c(C6820e c6820e) throws IOException {
        int length;
        c6820e.f11128f = 0;
        byte[] bArr = f11096o;
        byte[] bArr2 = new byte[bArr.length];
        c6820e.mo5928d(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f11100b = false;
            length = bArr.length;
        } else {
            c6820e.f11128f = 0;
            byte[] bArr3 = f11097p;
            byte[] bArr4 = new byte[bArr3.length];
            c6820e.mo5928d(bArr4, 0, bArr3.length, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.f11100b = true;
            length = bArr3.length;
        }
        c6820e.mo5924j(length);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public final int mo5806e(InterfaceC6832h interfaceC6832h, C6904s c6904s) throws IOException {
        String str;
        int i;
        C7394a.m5130e(this.f11108j);
        int i2 = C7408g0.f13905a;
        C6820e c6820e = (C6820e) interfaceC6832h;
        if (c6820e.f11126d == 0 && !m5953c(c6820e)) {
            throw C7506y0.m4869a("Could not find AMR header.", null);
        }
        if (!this.f11110l) {
            this.f11110l = true;
            boolean z = this.f11100b;
            if (z) {
                str = "audio/amr-wb";
            } else {
                str = "audio/3gpp";
            }
            if (z) {
                i = 16000;
            } else {
                i = 8000;
            }
            TrackOutput trackOutput = this.f11108j;
            C7003m0.C7005b c7005b = new C7003m0.C7005b();
            c7005b.f12316k = str;
            c7005b.f12317l = f11098q;
            c7005b.f12329x = 1;
            c7005b.f12330y = i;
            trackOutput.mo5451e(new C7003m0(c7005b));
        }
        int i3 = -1;
        if (this.f11103e == 0) {
            try {
                int m5954a = m5954a((C6820e) interfaceC6832h);
                this.f11102d = m5954a;
                this.f11103e = m5954a;
                if (this.f11105g == -1) {
                    this.f11105g = m5954a;
                }
            } catch (EOFException unused) {
            }
        }
        int mo5455a = this.f11108j.mo5455a(interfaceC6832h, this.f11103e, true);
        if (mo5455a != -1) {
            int i4 = this.f11103e - mo5455a;
            this.f11103e = i4;
            if (i4 <= 0) {
                this.f11108j.mo5452d(this.f11101c + this.f11106h, 1, this.f11102d, 0, null);
                this.f11101c += 20000;
            }
            i3 = 0;
        }
        if (!this.f11104f) {
            InterfaceC6905t.C6907b c6907b = new InterfaceC6905t.C6907b(-9223372036854775807L);
            this.f11109k = c6907b;
            this.f11107i.mo5484a(c6907b);
            this.f11104f = true;
        }
        return i3;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11107i = interfaceC6833i;
        this.f11108j = interfaceC6833i.mo5482p(0, 1);
        interfaceC6833i.mo5483j();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        this.f11101c = 0L;
        this.f11102d = 0;
        this.f11103e = 0;
        if (j != 0) {
            InterfaceC6905t.C6907b c6907b = this.f11109k;
            if (c6907b instanceof C6819d) {
                C6819d c6819d = (C6819d) c6907b;
                this.f11106h = ((Math.max(0L, j - c6819d.f11118b) * 8) * 1000000) / c6819d.f11121e;
                return;
            }
        }
        this.f11106h = 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
