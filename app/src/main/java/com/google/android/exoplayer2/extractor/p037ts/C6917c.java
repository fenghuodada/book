package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6904s;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import okhttp3.internal.http2.Http2;

/* renamed from: com.google.android.exoplayer2.extractor.ts.c */
/* loaded from: classes.dex */
public final class C6917c implements Extractor {

    /* renamed from: a */
    public final C6918d f11687a = new C6918d(null);

    /* renamed from: b */
    public final C7436v f11688b = new C7436v((int) Http2.INITIAL_MAX_FRAME_SIZE);

    /* renamed from: c */
    public boolean f11689c;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        C6820e c6820e;
        int i;
        C7436v c7436v = new C7436v(10);
        int i2 = 0;
        while (true) {
            c6820e = (C6820e) interfaceC6832h;
            c6820e.mo5928d(c7436v.f13978a, 0, 10, false);
            c7436v.m4992z(0);
            if (c7436v.m5000r() != 4801587) {
                break;
            }
            c7436v.m5018A(3);
            int m5003o = c7436v.m5003o();
            i2 += m5003o + 10;
            c6820e.m5950l(m5003o, false);
        }
        c6820e.f11128f = 0;
        c6820e.m5950l(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            c6820e.mo5928d(c7436v.f13978a, 0, 7, false);
            c7436v.m4992z(0);
            int m4997u = c7436v.m4997u();
            if (m4997u != 44096 && m4997u != 44097) {
                c6820e.f11128f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                c6820e.m5950l(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = c7436v.f13978a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (m4997u == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                c6820e.m5950l(i - 7, false);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public final int mo5806e(InterfaceC6832h interfaceC6832h, C6904s c6904s) throws IOException {
        C7436v c7436v = this.f11688b;
        int read = ((C6820e) interfaceC6832h).read(c7436v.f13978a, 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (read == -1) {
            return -1;
        }
        c7436v.m4992z(0);
        c7436v.m4993y(read);
        boolean z = this.f11689c;
        C6918d c6918d = this.f11687a;
        if (!z) {
            c6918d.mo5831f(4, 0L);
            this.f11689c = true;
        }
        c6918d.mo5835b(c7436v);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11687a.mo5832e(interfaceC6833i, new TsPayloadReader.C6913d(0, 1));
        interfaceC6833i.mo5483j();
        interfaceC6833i.mo5484a(new InterfaceC6905t.C6907b(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        this.f11689c = false;
        this.f11687a.mo5834c();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
