package com.google.android.exoplayer2.extractor.flv;

import androidx.constraintlayout.core.C0510h;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.flv.AbstractC6828d;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.flv.a */
/* loaded from: classes.dex */
public final class C6825a extends AbstractC6828d {

    /* renamed from: e */
    public static final int[] f11150e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f11151b;

    /* renamed from: c */
    public boolean f11152c;

    /* renamed from: d */
    public int f11153d;

    public C6825a(TrackOutput trackOutput) {
        super(trackOutput);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC6828d
    /* renamed from: a */
    public final boolean mo5937a(C7436v c7436v) throws AbstractC6828d.C6829a {
        String str;
        C7003m0.C7005b c7005b;
        int i;
        if (!this.f11151b) {
            int m5002p = c7436v.m5002p();
            int i2 = (m5002p >> 4) & 15;
            this.f11153d = i2;
            TrackOutput trackOutput = this.f11173a;
            if (i2 == 2) {
                i = f11150e[(m5002p >> 2) & 3];
                c7005b = new C7003m0.C7005b();
                c7005b.f12316k = "audio/mpeg";
                c7005b.f12329x = 1;
            } else if (i2 != 7 && i2 != 8) {
                if (i2 != 10) {
                    throw new AbstractC6828d.C6829a(C0510h.m12340a(39, "Audio format not supported: ", this.f11153d));
                }
                this.f11151b = true;
            } else {
                if (i2 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                c7005b = new C7003m0.C7005b();
                c7005b.f12316k = str;
                c7005b.f12329x = 1;
                i = 8000;
            }
            c7005b.f12330y = i;
            trackOutput.mo5451e(c7005b.m5614a());
            this.f11152c = true;
            this.f11151b = true;
        } else {
            c7436v.m5018A(1);
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC6828d
    /* renamed from: b */
    public final boolean mo5936b(long j, C7436v c7436v) throws C7506y0 {
        int i;
        int i2 = this.f11153d;
        TrackOutput trackOutput = this.f11173a;
        if (i2 == 2) {
            i = c7436v.f13980c;
        } else {
            int m5002p = c7436v.m5002p();
            if (m5002p == 0 && !this.f11152c) {
                int i3 = c7436v.f13980c - c7436v.f13979b;
                byte[] bArr = new byte[i3];
                c7436v.m5016b(0, bArr, i3);
                AacUtil.C6666a m6126c = AacUtil.m6126c(new C7435u(bArr, i3), false);
                C7003m0.C7005b c7005b = new C7003m0.C7005b();
                c7005b.f12316k = "audio/mp4a-latm";
                c7005b.f12313h = m6126c.f10596c;
                c7005b.f12329x = m6126c.f10595b;
                c7005b.f12330y = m6126c.f10594a;
                c7005b.f12318m = Collections.singletonList(bArr);
                trackOutput.mo5451e(new C7003m0(c7005b));
                this.f11152c = true;
                return false;
            } else if (this.f11153d == 10 && m5002p != 1) {
                return false;
            } else {
                i = c7436v.f13980c;
            }
        }
        int i4 = i - c7436v.f13979b;
        trackOutput.mo5454b(i4, c7436v);
        this.f11173a.mo5452d(j, 1, i4, 0, null);
        return true;
    }
}
