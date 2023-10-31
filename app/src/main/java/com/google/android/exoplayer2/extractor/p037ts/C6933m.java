package com.google.android.exoplayer2.extractor.p037ts;

import android.util.Log;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ts.m */
/* loaded from: classes.dex */
public final class C6933m implements InterfaceC6922h {

    /* renamed from: b */
    public TrackOutput f11867b;

    /* renamed from: c */
    public boolean f11868c;

    /* renamed from: e */
    public int f11870e;

    /* renamed from: f */
    public int f11871f;

    /* renamed from: a */
    public final C7436v f11866a = new C7436v(10);

    /* renamed from: d */
    public long f11869d = -9223372036854775807L;

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    public final void mo5835b(C7436v c7436v) {
        C7394a.m5130e(this.f11867b);
        if (!this.f11868c) {
            return;
        }
        int i = c7436v.f13980c - c7436v.f13979b;
        int i2 = this.f11871f;
        if (i2 < 10) {
            int min = Math.min(i, 10 - i2);
            byte[] bArr = c7436v.f13978a;
            int i3 = c7436v.f13979b;
            C7436v c7436v2 = this.f11866a;
            System.arraycopy(bArr, i3, c7436v2.f13978a, this.f11871f, min);
            if (this.f11871f + min == 10) {
                c7436v2.m4992z(0);
                if (73 == c7436v2.m5002p() && 68 == c7436v2.m5002p() && 51 == c7436v2.m5002p()) {
                    c7436v2.m5018A(3);
                    this.f11870e = c7436v2.m5003o() + 10;
                } else {
                    Log.w("Id3Reader", "Discarding invalid ID3 tag");
                    this.f11868c = false;
                    return;
                }
            }
        }
        int min2 = Math.min(i, this.f11870e - this.f11871f);
        this.f11867b.mo5454b(min2, c7436v);
        this.f11871f += min2;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: c */
    public final void mo5834c() {
        this.f11868c = false;
        this.f11869d = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: d */
    public final void mo5833d() {
        int i;
        C7394a.m5130e(this.f11867b);
        if (this.f11868c && (i = this.f11870e) != 0 && this.f11871f == i) {
            long j = this.f11869d;
            if (j != -9223372036854775807L) {
                this.f11867b.mo5452d(j, 1, i, 0, null);
            }
            this.f11868c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: e */
    public final void mo5832e(InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        c6913d.m5845a();
        c6913d.m5844b();
        TrackOutput mo5482p = interfaceC6833i.mo5482p(c6913d.f11668d, 5);
        this.f11867b = mo5482p;
        C7003m0.C7005b c7005b = new C7003m0.C7005b();
        c6913d.m5844b();
        c7005b.f12306a = c6913d.f11669e;
        c7005b.f12316k = "application/id3";
        mo5482p.mo5451e(new C7003m0(c7005b));
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f11868c = true;
        if (j != -9223372036854775807L) {
            this.f11869d = j;
        }
        this.f11870e = 0;
        this.f11871f = 0;
    }
}
