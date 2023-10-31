package com.google.android.exoplayer2.extractor.p037ts;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6964f;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7404e0;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.ts.r */
/* loaded from: classes.dex */
public final class C6938r implements TsPayloadReader {

    /* renamed from: a */
    public final InterfaceC6922h f11913a;

    /* renamed from: b */
    public final C7435u f11914b = new C7435u(new byte[10], 10);

    /* renamed from: c */
    public int f11915c = 0;

    /* renamed from: d */
    public int f11916d;

    /* renamed from: e */
    public C7404e0 f11917e;

    /* renamed from: f */
    public boolean f11918f;

    /* renamed from: g */
    public boolean f11919g;

    /* renamed from: h */
    public boolean f11920h;

    /* renamed from: i */
    public int f11921i;

    /* renamed from: j */
    public int f11922j;

    /* renamed from: k */
    public boolean f11923k;

    /* renamed from: l */
    public long f11924l;

    public C6938r(InterfaceC6922h interfaceC6922h) {
        this.f11913a = interfaceC6922h;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader
    /* renamed from: a */
    public final void mo5819a(C7404e0 c7404e0, InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        this.f11917e = c7404e0;
        this.f11913a.mo5832e(interfaceC6833i, c6913d);
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader
    /* renamed from: b */
    public final void mo5818b(int i, C7436v c7436v) throws C7506y0 {
        boolean z;
        int i2;
        int i3;
        int i4;
        C7394a.m5130e(this.f11917e);
        int i5 = i & 1;
        InterfaceC6922h interfaceC6922h = this.f11913a;
        int i6 = -1;
        int i7 = 3;
        int i8 = 2;
        if (i5 != 0) {
            int i9 = this.f11915c;
            if (i9 != 0 && i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3) {
                        int i10 = this.f11922j;
                        if (i10 != -1) {
                            StringBuilder sb = new StringBuilder(59);
                            sb.append("Unexpected start indicator: expected ");
                            sb.append(i10);
                            sb.append(" more bytes");
                            Log.w("PesReader", sb.toString());
                        }
                        interfaceC6922h.mo5833d();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f11915c = 1;
            this.f11916d = 0;
        }
        int i11 = i;
        while (true) {
            int i12 = c7436v.f13980c;
            int i13 = c7436v.f13979b;
            int i14 = i12 - i13;
            if (i14 > 0) {
                int i15 = this.f11915c;
                if (i15 != 0) {
                    C7435u c7435u = this.f11914b;
                    if (i15 != 1) {
                        if (i15 != i8) {
                            if (i15 == i7) {
                                int i16 = this.f11922j;
                                if (i16 == i6) {
                                    i3 = 0;
                                } else {
                                    i3 = i14 - i16;
                                }
                                if (i3 > 0) {
                                    i14 -= i3;
                                    c7436v.m4993y(i13 + i14);
                                }
                                interfaceC6922h.mo5835b(c7436v);
                                int i17 = this.f11922j;
                                if (i17 != i6) {
                                    int i18 = i17 - i14;
                                    this.f11922j = i18;
                                    if (i18 == 0) {
                                        interfaceC6922h.mo5833d();
                                        this.f11915c = 1;
                                        this.f11916d = 0;
                                    }
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (m5826d(Math.min(10, this.f11921i), c7436v, c7435u.f13974a) && m5826d(this.f11921i, c7436v, null)) {
                                c7435u.m5022j(0);
                                this.f11924l = -9223372036854775807L;
                                if (this.f11918f) {
                                    c7435u.m5020l(4);
                                    c7435u.m5020l(1);
                                    c7435u.m5020l(1);
                                    long m5026f = (c7435u.m5026f(i7) << 30) | (c7435u.m5026f(15) << 15) | c7435u.m5026f(15);
                                    c7435u.m5020l(1);
                                    if (!this.f11920h && this.f11919g) {
                                        c7435u.m5020l(4);
                                        c7435u.m5020l(1);
                                        long m5026f2 = c7435u.m5026f(15) << 15;
                                        c7435u.m5020l(1);
                                        c7435u.m5020l(1);
                                        this.f11917e.m5111b(m5026f2 | (c7435u.m5026f(3) << 30) | c7435u.m5026f(15));
                                        this.f11920h = true;
                                    }
                                    this.f11924l = this.f11917e.m5111b(m5026f);
                                }
                                if (this.f11923k) {
                                    i4 = 4;
                                } else {
                                    i4 = 0;
                                }
                                i11 |= i4;
                                interfaceC6922h.mo5831f(i11, this.f11924l);
                                i7 = 3;
                                this.f11915c = 3;
                                this.f11916d = 0;
                            }
                            i6 = -1;
                            i8 = 2;
                        }
                    } else if (!m5826d(9, c7436v, c7435u.f13974a)) {
                        i6 = -1;
                        i8 = 2;
                    } else {
                        c7435u.m5022j(0);
                        int m5026f3 = c7435u.m5026f(24);
                        if (m5026f3 != 1) {
                            C6964f.m5792c(41, "Unexpected start code prefix: ", m5026f3, "PesReader");
                            i6 = -1;
                            this.f11922j = -1;
                            i8 = 2;
                            z = false;
                        } else {
                            c7435u.m5020l(8);
                            int m5026f4 = c7435u.m5026f(16);
                            c7435u.m5020l(5);
                            this.f11923k = c7435u.m5027e();
                            c7435u.m5020l(2);
                            this.f11918f = c7435u.m5027e();
                            this.f11919g = c7435u.m5027e();
                            c7435u.m5020l(6);
                            int m5026f5 = c7435u.m5026f(8);
                            this.f11921i = m5026f5;
                            if (m5026f4 != 0) {
                                int i19 = ((m5026f4 + 6) - 9) - m5026f5;
                                this.f11922j = i19;
                                if (i19 < 0) {
                                    C6964f.m5792c(47, "Found negative packet payload size: ", i19, "PesReader");
                                } else {
                                    i6 = -1;
                                    i8 = 2;
                                    z = true;
                                }
                            }
                            i6 = -1;
                            this.f11922j = -1;
                            i8 = 2;
                            z = true;
                        }
                        if (z) {
                            i2 = i8;
                        } else {
                            i2 = 0;
                        }
                        this.f11915c = i2;
                        this.f11916d = 0;
                    }
                } else {
                    c7436v.m5018A(i14);
                }
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader
    /* renamed from: c */
    public final void mo5817c() {
        this.f11915c = 0;
        this.f11916d = 0;
        this.f11920h = false;
        this.f11913a.mo5834c();
    }

    /* renamed from: d */
    public final boolean m5826d(int i, C7436v c7436v, @Nullable byte[] bArr) {
        int min = Math.min(c7436v.f13980c - c7436v.f13979b, i - this.f11916d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c7436v.m5018A(min);
        } else {
            c7436v.m5016b(this.f11916d, bArr, min);
        }
        int i2 = this.f11916d + min;
        this.f11916d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
