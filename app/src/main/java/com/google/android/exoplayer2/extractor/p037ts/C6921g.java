package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7436v;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.g */
/* loaded from: classes.dex */
public final class C6921g implements InterfaceC6922h {

    /* renamed from: a */
    public final List<TsPayloadReader.C6910a> f11736a;

    /* renamed from: b */
    public final TrackOutput[] f11737b;

    /* renamed from: c */
    public boolean f11738c;

    /* renamed from: d */
    public int f11739d;

    /* renamed from: e */
    public int f11740e;

    /* renamed from: f */
    public long f11741f = -9223372036854775807L;

    public C6921g(List<TsPayloadReader.C6910a> list) {
        this.f11736a = list;
        this.f11737b = new TrackOutput[list.size()];
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    public final void mo5835b(C7436v c7436v) {
        TrackOutput[] trackOutputArr;
        boolean z;
        boolean z2;
        if (this.f11738c) {
            if (this.f11739d == 2) {
                if (c7436v.f13980c - c7436v.f13979b == 0) {
                    z2 = false;
                } else {
                    if (c7436v.m5002p() != 32) {
                        this.f11738c = false;
                    }
                    this.f11739d--;
                    z2 = this.f11738c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f11739d == 1) {
                if (c7436v.f13980c - c7436v.f13979b == 0) {
                    z = false;
                } else {
                    if (c7436v.m5002p() != 0) {
                        this.f11738c = false;
                    }
                    this.f11739d--;
                    z = this.f11738c;
                }
                if (!z) {
                    return;
                }
            }
            int i = c7436v.f13979b;
            int i2 = c7436v.f13980c - i;
            for (TrackOutput trackOutput : this.f11737b) {
                c7436v.m4992z(i);
                trackOutput.mo5454b(i2, c7436v);
            }
            this.f11740e += i2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: c */
    public final void mo5834c() {
        this.f11738c = false;
        this.f11741f = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: d */
    public final void mo5833d() {
        if (this.f11738c) {
            if (this.f11741f != -9223372036854775807L) {
                for (TrackOutput trackOutput : this.f11737b) {
                    trackOutput.mo5452d(this.f11741f, 1, this.f11740e, 0, null);
                }
            }
            this.f11738c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: e */
    public final void mo5832e(InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f11737b;
            if (i < trackOutputArr.length) {
                TsPayloadReader.C6910a c6910a = this.f11736a.get(i);
                c6913d.m5845a();
                c6913d.m5844b();
                TrackOutput mo5482p = interfaceC6833i.mo5482p(c6913d.f11668d, 3);
                C7003m0.C7005b c7005b = new C7003m0.C7005b();
                c6913d.m5844b();
                c7005b.f12306a = c6913d.f11669e;
                c7005b.f12316k = "application/dvbsubs";
                c7005b.f12318m = Collections.singletonList(c6910a.f11661b);
                c7005b.f12308c = c6910a.f11660a;
                mo5482p.mo5451e(new C7003m0(c7005b));
                trackOutputArr[i] = mo5482p;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f11738c = true;
        if (j != -9223372036854775807L) {
            this.f11741f = j;
        }
        this.f11740e = 0;
        this.f11739d = 2;
    }
}
