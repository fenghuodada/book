package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7404e0;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ts.w */
/* loaded from: classes.dex */
public final class C6945w implements TsPayloadReader {

    /* renamed from: a */
    public final InterfaceC6944v f11953a;

    /* renamed from: b */
    public final C7436v f11954b = new C7436v(32);

    /* renamed from: c */
    public int f11955c;

    /* renamed from: d */
    public int f11956d;

    /* renamed from: e */
    public boolean f11957e;

    /* renamed from: f */
    public boolean f11958f;

    public C6945w(InterfaceC6944v interfaceC6944v) {
        this.f11953a = interfaceC6944v;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader
    /* renamed from: a */
    public final void mo5819a(C7404e0 c7404e0, InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        this.f11953a.mo5821a(c7404e0, interfaceC6833i, c6913d);
        this.f11958f = true;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader
    /* renamed from: b */
    public final void mo5818b(int i, C7436v c7436v) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = c7436v.f13979b + c7436v.m5002p();
        } else {
            i2 = -1;
        }
        if (this.f11958f) {
            if (!z) {
                return;
            }
            this.f11958f = false;
            c7436v.m4992z(i2);
            this.f11956d = 0;
        }
        while (true) {
            int i3 = c7436v.f13980c;
            int i4 = c7436v.f13979b;
            if (i3 - i4 > 0) {
                int i5 = this.f11956d;
                C7436v c7436v2 = this.f11954b;
                if (i5 < 3) {
                    if (i5 == 0) {
                        int m5002p = c7436v.m5002p();
                        c7436v.m4992z(c7436v.f13979b - 1);
                        if (m5002p == 255) {
                            this.f11958f = true;
                            return;
                        }
                    }
                    int min = Math.min(c7436v.f13980c - c7436v.f13979b, 3 - this.f11956d);
                    c7436v.m5016b(this.f11956d, c7436v2.f13978a, min);
                    int i6 = this.f11956d + min;
                    this.f11956d = i6;
                    if (i6 == 3) {
                        c7436v2.m4992z(0);
                        c7436v2.m4993y(3);
                        c7436v2.m5018A(1);
                        int m5002p2 = c7436v2.m5002p();
                        int m5002p3 = c7436v2.m5002p();
                        if ((m5002p2 & 128) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f11957e = z2;
                        int i7 = (((m5002p2 & 15) << 8) | m5002p3) + 3;
                        this.f11955c = i7;
                        byte[] bArr = c7436v2.f13978a;
                        if (bArr.length < i7) {
                            c7436v2.m5017a(Math.min(4098, Math.max(i7, bArr.length * 2)));
                        }
                    }
                } else {
                    int min2 = Math.min(i3 - i4, this.f11955c - i5);
                    c7436v.m5016b(this.f11956d, c7436v2.f13978a, min2);
                    int i8 = this.f11956d + min2;
                    this.f11956d = i8;
                    int i9 = this.f11955c;
                    if (i8 != i9) {
                        continue;
                    } else {
                        if (this.f11957e) {
                            byte[] bArr2 = c7436v2.f13978a;
                            int i10 = C7408g0.f13905a;
                            int i11 = -1;
                            for (int i12 = 0; i12 < i9; i12++) {
                                i11 = C7408g0.f13914j[((i11 >>> 24) ^ (bArr2[i12] & 255)) & 255] ^ (i11 << 8);
                            }
                            if (i11 != 0) {
                                this.f11958f = true;
                                return;
                            }
                            i9 = this.f11955c - 4;
                        }
                        c7436v2.m4993y(i9);
                        c7436v2.m4992z(0);
                        this.f11953a.mo5820b(c7436v2);
                        this.f11956d = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader
    /* renamed from: c */
    public final void mo5817c() {
        this.f11958f = true;
    }
}
