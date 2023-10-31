package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.audio.C6681a;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6904s;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import okio.Utf8;

/* renamed from: com.google.android.exoplayer2.extractor.ts.a */
/* loaded from: classes.dex */
public final class C6914a implements Extractor {

    /* renamed from: a */
    public final C6916b f11670a = new C6916b(null);

    /* renamed from: b */
    public final C7436v f11671b = new C7436v(2786);

    /* renamed from: c */
    public boolean f11672c;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        C6820e c6820e;
        boolean z;
        int m6079a;
        C7436v c7436v = new C7436v(10);
        int i = 0;
        while (true) {
            c6820e = (C6820e) interfaceC6832h;
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
        int i2 = 0;
        int i3 = i;
        while (true) {
            c6820e.mo5928d(c7436v.f13978a, 0, 6, false);
            c7436v.m4992z(0);
            if (c7436v.m4997u() != 2935) {
                c6820e.f11128f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                c6820e.m5950l(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = c7436v.f13978a;
                if (bArr.length < 6) {
                    m6079a = -1;
                } else {
                    if (((bArr[5] & 248) >> 3) > 10) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m6079a = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                    } else {
                        byte b = bArr[4];
                        m6079a = C6681a.m6079a((b & 192) >> 6, b & Utf8.REPLACEMENT_BYTE);
                    }
                }
                if (m6079a == -1) {
                    return false;
                }
                c6820e.m5950l(m6079a - 6, false);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public final int mo5806e(InterfaceC6832h interfaceC6832h, C6904s c6904s) throws IOException {
        C7436v c7436v = this.f11671b;
        int read = ((C6820e) interfaceC6832h).read(c7436v.f13978a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        c7436v.m4992z(0);
        c7436v.m4993y(read);
        boolean z = this.f11672c;
        C6916b c6916b = this.f11670a;
        if (!z) {
            c6916b.mo5831f(4, 0L);
            this.f11672c = true;
        }
        c6916b.mo5835b(c7436v);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11670a.mo5832e(interfaceC6833i, new TsPayloadReader.C6913d(0, 1));
        interfaceC6833i.mo5483j();
        interfaceC6833i.mo5484a(new InterfaceC6905t.C6907b(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        this.f11672c = false;
        this.f11670a.mo5834c();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
