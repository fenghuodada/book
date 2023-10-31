package com.google.android.exoplayer2.extractor.flv;

import androidx.constraintlayout.core.C0510h;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.flv.AbstractC6828d;
import com.google.android.exoplayer2.util.C7427r;
import com.google.android.exoplayer2.util.C7436v;
import com.google.android.exoplayer2.video.C7444a;

/* renamed from: com.google.android.exoplayer2.extractor.flv.e */
/* loaded from: classes.dex */
public final class C6830e extends AbstractC6828d {

    /* renamed from: b */
    public final C7436v f11174b;

    /* renamed from: c */
    public final C7436v f11175c;

    /* renamed from: d */
    public int f11176d;

    /* renamed from: e */
    public boolean f11177e;

    /* renamed from: f */
    public boolean f11178f;

    /* renamed from: g */
    public int f11179g;

    public C6830e(TrackOutput trackOutput) {
        super(trackOutput);
        this.f11174b = new C7436v(C7427r.f13945a);
        this.f11175c = new C7436v(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC6828d
    /* renamed from: a */
    public final boolean mo5937a(C7436v c7436v) throws AbstractC6828d.C6829a {
        int m5002p = c7436v.m5002p();
        int i = (m5002p >> 4) & 15;
        int i2 = m5002p & 15;
        if (i2 == 7) {
            this.f11179g = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new AbstractC6828d.C6829a(C0510h.m12340a(39, "Video format not supported: ", i2));
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC6828d
    /* renamed from: b */
    public final boolean mo5936b(long j, C7436v c7436v) throws C7506y0 {
        int i;
        int i2;
        int m5002p = c7436v.m5002p();
        byte[] bArr = c7436v.f13978a;
        int i3 = c7436v.f13979b;
        int i4 = i3 + 1;
        int i5 = (((bArr[i3] & 255) << 24) >> 8) | ((bArr[i4] & 255) << 8);
        int i6 = i4 + 1 + 1;
        c7436v.f13979b = i6;
        long j2 = (((bArr[i] & 255) | i5) * 1000) + j;
        TrackOutput trackOutput = this.f11173a;
        if (m5002p == 0 && !this.f11177e) {
            C7436v c7436v2 = new C7436v(new byte[c7436v.f13980c - i6]);
            c7436v.m5016b(0, c7436v2.f13978a, c7436v.f13980c - c7436v.f13979b);
            C7444a m4979a = C7444a.m4979a(c7436v2);
            this.f11176d = m4979a.f14001b;
            C7003m0.C7005b c7005b = new C7003m0.C7005b();
            c7005b.f12316k = "video/avc";
            c7005b.f12313h = m4979a.f14005f;
            c7005b.f12321p = m4979a.f14002c;
            c7005b.f12322q = m4979a.f14003d;
            c7005b.f12325t = m4979a.f14004e;
            c7005b.f12318m = m4979a.f14000a;
            trackOutput.mo5451e(c7005b.m5614a());
            this.f11177e = true;
            return false;
        } else if (m5002p != 1 || !this.f11177e) {
            return false;
        } else {
            if (this.f11179g == 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!this.f11178f && i2 == 0) {
                return false;
            }
            C7436v c7436v3 = this.f11175c;
            byte[] bArr2 = c7436v3.f13978a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i7 = 4 - this.f11176d;
            int i8 = 0;
            while (c7436v.f13980c - c7436v.f13979b > 0) {
                c7436v.m5016b(i7, c7436v3.f13978a, this.f11176d);
                c7436v3.m4992z(0);
                int m4999s = c7436v3.m4999s();
                C7436v c7436v4 = this.f11174b;
                c7436v4.m4992z(0);
                trackOutput.mo5454b(4, c7436v4);
                trackOutput.mo5454b(m4999s, c7436v);
                i8 = i8 + 4 + m4999s;
            }
            this.f11173a.mo5452d(j2, i2, i8, 0, null);
            this.f11178f = true;
            return true;
        }
    }
}
