package com.google.android.exoplayer2.extractor.p037ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.audio.C6697g0;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ts.o */
/* loaded from: classes.dex */
public final class C6935o implements InterfaceC6922h {

    /* renamed from: a */
    public final C7436v f11893a;

    /* renamed from: b */
    public final C6697g0.C6698a f11894b;
    @Nullable

    /* renamed from: c */
    public final String f11895c;

    /* renamed from: d */
    public TrackOutput f11896d;

    /* renamed from: e */
    public String f11897e;

    /* renamed from: f */
    public int f11898f = 0;

    /* renamed from: g */
    public int f11899g;

    /* renamed from: h */
    public boolean f11900h;

    /* renamed from: i */
    public boolean f11901i;

    /* renamed from: j */
    public long f11902j;

    /* renamed from: k */
    public int f11903k;

    /* renamed from: l */
    public long f11904l;

    public C6935o(@Nullable String str) {
        C7436v c7436v = new C7436v(4);
        this.f11893a = c7436v;
        c7436v.f13978a[0] = -1;
        this.f11894b = new C6697g0.C6698a();
        this.f11904l = -9223372036854775807L;
        this.f11895c = str;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    public final void mo5835b(C7436v c7436v) {
        boolean z;
        boolean z2;
        C7394a.m5130e(this.f11896d);
        while (true) {
            int i = c7436v.f13980c;
            int i2 = c7436v.f13979b;
            int i3 = i - i2;
            if (i3 > 0) {
                int i4 = this.f11898f;
                C7436v c7436v2 = this.f11893a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            int min = Math.min(i3, this.f11903k - this.f11899g);
                            this.f11896d.mo5454b(min, c7436v);
                            int i5 = this.f11899g + min;
                            this.f11899g = i5;
                            int i6 = this.f11903k;
                            if (i5 >= i6) {
                                long j = this.f11904l;
                                if (j != -9223372036854775807L) {
                                    this.f11896d.mo5452d(j, 1, i6, 0, null);
                                    this.f11904l += this.f11902j;
                                }
                                this.f11899g = 0;
                                this.f11898f = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int min2 = Math.min(i3, 4 - this.f11899g);
                        c7436v.m5016b(this.f11899g, c7436v2.f13978a, min2);
                        int i7 = this.f11899g + min2;
                        this.f11899g = i7;
                        if (i7 >= 4) {
                            c7436v2.m4992z(0);
                            int m5015c = c7436v2.m5015c();
                            C6697g0.C6698a c6698a = this.f11894b;
                            if (!c6698a.m6063a(m5015c)) {
                                this.f11899g = 0;
                                this.f11898f = 1;
                            } else {
                                this.f11903k = c6698a.f10726c;
                                if (!this.f11900h) {
                                    int i8 = c6698a.f10727d;
                                    this.f11902j = (c6698a.f10730g * 1000000) / i8;
                                    C7003m0.C7005b c7005b = new C7003m0.C7005b();
                                    c7005b.f12306a = this.f11897e;
                                    c7005b.f12316k = c6698a.f10725b;
                                    c7005b.f12317l = 4096;
                                    c7005b.f12329x = c6698a.f10728e;
                                    c7005b.f12330y = i8;
                                    c7005b.f12308c = this.f11895c;
                                    this.f11896d.mo5451e(new C7003m0(c7005b));
                                    this.f11900h = true;
                                }
                                c7436v2.m4992z(0);
                                this.f11896d.mo5454b(4, c7436v2);
                                this.f11898f = 2;
                            }
                        }
                    }
                } else {
                    byte[] bArr = c7436v.f13978a;
                    while (true) {
                        if (i2 < i) {
                            byte b = bArr[i2];
                            if ((b & 255) == 255) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (this.f11901i && (b & 224) == 224) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.f11901i = z;
                            if (z2) {
                                c7436v.m4992z(i2 + 1);
                                this.f11901i = false;
                                c7436v2.f13978a[1] = bArr[i2];
                                this.f11899g = 2;
                                this.f11898f = 1;
                                break;
                            }
                            i2++;
                        } else {
                            c7436v.m4992z(i);
                            break;
                        }
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
        this.f11898f = 0;
        this.f11899g = 0;
        this.f11901i = false;
        this.f11904l = -9223372036854775807L;
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
        this.f11897e = c6913d.f11669e;
        c6913d.m5844b();
        this.f11896d = interfaceC6833i.mo5482p(c6913d.f11668d, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f11904l = j;
        }
    }
}
