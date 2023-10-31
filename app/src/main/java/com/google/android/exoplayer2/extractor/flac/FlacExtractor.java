package com.google.android.exoplayer2.extractor.flac;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.C6764a;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6844l;
import com.google.android.exoplayer2.extractor.C6885o;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.id3.C7080g;
import com.google.android.exoplayer2.util.C7436v;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class FlacExtractor implements Extractor {

    /* renamed from: e */
    public InterfaceC6833i f11136e;

    /* renamed from: f */
    public TrackOutput f11137f;
    @Nullable

    /* renamed from: h */
    public C7042a f11139h;

    /* renamed from: i */
    public C6885o f11140i;

    /* renamed from: j */
    public int f11141j;

    /* renamed from: k */
    public int f11142k;

    /* renamed from: l */
    public C6823b f11143l;

    /* renamed from: m */
    public int f11144m;

    /* renamed from: n */
    public long f11145n;

    /* renamed from: a */
    public final byte[] f11132a = new byte[42];

    /* renamed from: b */
    public final C7436v f11133b = new C7436v(new byte[32768], 0);

    /* renamed from: c */
    public final boolean f11134c = false;

    /* renamed from: d */
    public final C6844l.C6845a f11135d = new C6844l.C6845a();

    /* renamed from: g */
    public int f11138g = 0;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        byte[] bArr;
        C6820e c6820e = (C6820e) interfaceC6832h;
        C6764a c6764a = C7080g.f12560b;
        C7436v c7436v = new C7436v(10);
        C7042a c7042a = null;
        int i = 0;
        while (true) {
            try {
                c6820e.mo5928d(c7436v.f13978a, 0, 10, false);
                c7436v.m4992z(0);
                if (c7436v.m5000r() != 4801587) {
                    break;
                }
                c7436v.m5018A(3);
                int m5003o = c7436v.m5003o();
                int i2 = m5003o + 10;
                if (c7042a == null) {
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(c7436v.f13978a, 0, bArr2, 0, 10);
                    c6820e.mo5928d(bArr2, 10, m5003o, false);
                    c7042a = new C7080g(c6764a).m5533c(i2, bArr2);
                } else {
                    c6820e.m5950l(m5003o, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        c6820e.f11128f = 0;
        c6820e.m5950l(i, false);
        if (c7042a != null) {
            int length = c7042a.f12490a.length;
        }
        c6820e.mo5928d(new byte[4], 0, 4, false);
        if (((bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8)) != 1716281667) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0138, code lost:
        r1.m4992z(r3);
        r3 = r9.f11206a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5806e(com.google.android.exoplayer2.extractor.InterfaceC6832h r27, com.google.android.exoplayer2.extractor.C6904s r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flac.FlacExtractor.mo5806e(com.google.android.exoplayer2.extractor.h, com.google.android.exoplayer2.extractor.s):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11136e = interfaceC6833i;
        this.f11137f = interfaceC6833i.mo5482p(0, 1);
        interfaceC6833i.mo5483j();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        if (j == 0) {
            this.f11138g = 0;
        } else {
            C6823b c6823b = this.f11143l;
            if (c6823b != null) {
                c6823b.m5957c(j2);
            }
        }
        this.f11145n = j2 != 0 ? -1L : 0L;
        this.f11144m = 0;
        this.f11133b.m4995w(0);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
