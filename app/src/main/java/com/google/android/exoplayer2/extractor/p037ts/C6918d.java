package com.google.android.exoplayer2.extractor.p037ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.audio.C6683b;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ts.d */
/* loaded from: classes.dex */
public final class C6918d implements InterfaceC6922h {

    /* renamed from: a */
    public final C7435u f11690a;

    /* renamed from: b */
    public final C7436v f11691b;
    @Nullable

    /* renamed from: c */
    public final String f11692c;

    /* renamed from: d */
    public String f11693d;

    /* renamed from: e */
    public TrackOutput f11694e;

    /* renamed from: f */
    public int f11695f;

    /* renamed from: g */
    public int f11696g;

    /* renamed from: h */
    public boolean f11697h;

    /* renamed from: i */
    public boolean f11698i;

    /* renamed from: j */
    public long f11699j;

    /* renamed from: k */
    public C7003m0 f11700k;

    /* renamed from: l */
    public int f11701l;

    /* renamed from: m */
    public long f11702m;

    public C6918d(@Nullable String str) {
        C7435u c7435u = new C7435u(new byte[16], 16);
        this.f11690a = c7435u;
        this.f11691b = new C7436v(c7435u.f13974a);
        this.f11695f = 0;
        this.f11696g = 0;
        this.f11697h = false;
        this.f11698i = false;
        this.f11702m = -9223372036854775807L;
        this.f11692c = str;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    public final void mo5835b(C7436v c7436v) {
        int i;
        boolean z;
        boolean z2;
        int m5002p;
        boolean z3;
        boolean z4;
        C7394a.m5130e(this.f11694e);
        while (true) {
            int i2 = c7436v.f13980c - c7436v.f13979b;
            if (i2 > 0) {
                int i3 = this.f11695f;
                C7436v c7436v2 = this.f11691b;
                boolean z5 = true;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            int min = Math.min(i2, this.f11701l - this.f11696g);
                            this.f11694e.mo5454b(min, c7436v);
                            int i4 = this.f11696g + min;
                            this.f11696g = i4;
                            int i5 = this.f11701l;
                            if (i4 == i5) {
                                long j = this.f11702m;
                                if (j != -9223372036854775807L) {
                                    this.f11694e.mo5452d(j, 1, i5, 0, null);
                                    this.f11702m += this.f11699j;
                                }
                                this.f11695f = 0;
                            }
                        }
                    } else {
                        byte[] bArr = c7436v2.f13978a;
                        int min2 = Math.min(i2, 16 - this.f11696g);
                        c7436v.m5016b(this.f11696g, bArr, min2);
                        int i6 = this.f11696g + min2;
                        this.f11696g = i6;
                        if (i6 != 16) {
                            z5 = false;
                        }
                        if (z5) {
                            C7435u c7435u = this.f11690a;
                            c7435u.m5022j(0);
                            C6683b.C6684a m6075b = C6683b.m6075b(c7435u);
                            C7003m0 c7003m0 = this.f11700k;
                            int i7 = m6075b.f10686a;
                            if (c7003m0 == null || 2 != c7003m0.f12300y || i7 != c7003m0.f12301z || !"audio/ac4".equals(c7003m0.f12287l)) {
                                C7003m0.C7005b c7005b = new C7003m0.C7005b();
                                c7005b.f12306a = this.f11693d;
                                c7005b.f12316k = "audio/ac4";
                                c7005b.f12329x = 2;
                                c7005b.f12330y = i7;
                                c7005b.f12308c = this.f11692c;
                                C7003m0 c7003m02 = new C7003m0(c7005b);
                                this.f11700k = c7003m02;
                                this.f11694e.mo5451e(c7003m02);
                            }
                            this.f11701l = m6075b.f10687b;
                            this.f11699j = (m6075b.f10688c * 1000000) / this.f11700k.f12301z;
                            c7436v2.m4992z(0);
                            this.f11694e.mo5454b(16, c7436v2);
                            this.f11695f = 2;
                        }
                    }
                } else {
                    while (true) {
                        i = 65;
                        if (c7436v.f13980c - c7436v.f13979b > 0) {
                            if (!this.f11697h) {
                                if (c7436v.m5002p() == 172) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.f11697h = z2;
                            } else {
                                m5002p = c7436v.m5002p();
                                if (m5002p == 172) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                this.f11697h = z3;
                                if (m5002p == 64 || m5002p == 65) {
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (m5002p == 65) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f11698i = z4;
                    z = true;
                    if (z) {
                        this.f11695f = 1;
                        byte[] bArr2 = c7436v2.f13978a;
                        bArr2[0] = -84;
                        if (!this.f11698i) {
                            i = 64;
                        }
                        bArr2[1] = (byte) i;
                        this.f11696g = 2;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: c */
    public final void mo5834c() {
        this.f11695f = 0;
        this.f11696g = 0;
        this.f11697h = false;
        this.f11698i = false;
        this.f11702m = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: d */
    public final void mo5833d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: e */
    public final void mo5832e(InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        c6913d.m5845a();
        c6913d.m5844b();
        this.f11693d = c6913d.f11669e;
        c6913d.m5844b();
        this.f11694e = interfaceC6833i.mo5482p(c6913d.f11668d, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f11702m = j;
        }
    }
}
