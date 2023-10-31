package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6904s;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.exoplayer2.extractor.ts.AdtsExtractor */
/* loaded from: classes.dex */
public final class AdtsExtractor implements Extractor {

    /* renamed from: c */
    public final C7436v f11625c;

    /* renamed from: d */
    public final C7435u f11626d;

    /* renamed from: e */
    public InterfaceC6833i f11627e;

    /* renamed from: f */
    public long f11628f;

    /* renamed from: h */
    public boolean f11630h;

    /* renamed from: i */
    public boolean f11631i;

    /* renamed from: a */
    public final C6919e f11623a = new C6919e(true, null);

    /* renamed from: b */
    public final C7436v f11624b = new C7436v(2048);

    /* renamed from: g */
    public long f11629g = -1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.extractor.ts.AdtsExtractor$Flags */
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    public AdtsExtractor() {
        C7436v c7436v = new C7436v(10);
        this.f11625c = c7436v;
        byte[] bArr = c7436v.f13978a;
        this.f11626d = new C7435u(bArr, bArr.length);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        C7436v c7436v;
        boolean z;
        C6820e c6820e = (C6820e) interfaceC6832h;
        int i = 0;
        while (true) {
            c7436v = this.f11625c;
            c6820e.mo5928d(c7436v.f13978a, 0, 10, false);
            c7436v.m4992z(0);
            if (c7436v.m5000r() != 4801587) {
                break;
            }
            c7436v.m5018A(3);
            int m5003o = c7436v.m5003o();
            i += m5003o + 10;
            c6820e.m5950l(m5003o, false);
        }
        c6820e.f11128f = 0;
        c6820e.m5950l(i, false);
        if (this.f11629g == -1) {
            this.f11629g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            c6820e.mo5928d(c7436v.f13978a, 0, 2, false);
            c7436v.m4992z(0);
            if ((c7436v.m4997u() & 65526) == 65520) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                c6820e.mo5928d(c7436v.f13978a, 0, 4, false);
                C7435u c7435u = this.f11626d;
                c7435u.m5022j(14);
                int m5026f = c7435u.m5026f(13);
                if (m5026f > 6) {
                    c6820e.m5950l(m5026f - 6, false);
                    i3 += m5026f;
                }
            }
            i4++;
            c6820e.f11128f = 0;
            c6820e.m5950l(i4, false);
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public final int mo5806e(InterfaceC6832h interfaceC6832h, C6904s c6904s) throws IOException {
        boolean z;
        C7394a.m5130e(this.f11627e);
        C7436v c7436v = this.f11624b;
        int read = ((C6820e) interfaceC6832h).read(c7436v.f13978a, 0, 2048);
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f11631i) {
            this.f11627e.mo5484a(new InterfaceC6905t.C6907b(-9223372036854775807L));
            this.f11631i = true;
        }
        if (z) {
            return -1;
        }
        c7436v.m4992z(0);
        c7436v.m4993y(read);
        boolean z2 = this.f11630h;
        C6919e c6919e = this.f11623a;
        if (!z2) {
            c6919e.mo5831f(4, this.f11628f);
            this.f11630h = true;
        }
        c6919e.mo5835b(c7436v);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11627e = interfaceC6833i;
        this.f11623a.mo5832e(interfaceC6833i, new TsPayloadReader.C6913d(0, 1));
        interfaceC6833i.mo5483j();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        this.f11630h = false;
        this.f11623a.mo5834c();
        this.f11628f = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
