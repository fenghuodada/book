package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.AbstractC7062g;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.C7048d;
import com.google.android.exoplayer2.metadata.scte35.C7109d;
import com.google.android.exoplayer2.metadata.scte35.C7114f;
import com.google.android.exoplayer2.util.C7404e0;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.c */
/* loaded from: classes.dex */
public final class C7108c extends AbstractC7062g {

    /* renamed from: a */
    public final C7436v f12598a = new C7436v();

    /* renamed from: b */
    public final C7435u f12599b = new C7435u();

    /* renamed from: c */
    public C7404e0 f12600c;

    @Override // com.google.android.exoplayer2.metadata.AbstractC7062g
    /* renamed from: b */
    public final C7042a mo5507b(C7048d c7048d, ByteBuffer byteBuffer) {
        C7042a.InterfaceC7044b c7112e;
        boolean z;
        long j;
        long j2;
        ArrayList arrayList;
        long j3;
        long j4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        long j5;
        long j6;
        boolean z8;
        boolean z9;
        List list;
        long j7;
        long j8;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i4;
        int i5;
        int i6;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long j9;
        boolean z18;
        long j10;
        C7404e0 c7404e0 = this.f12600c;
        if (c7404e0 == null || c7048d.f12492i != c7404e0.m5109d()) {
            C7404e0 c7404e02 = new C7404e0(c7048d.f10906e);
            this.f12600c = c7404e02;
            c7404e02.m5112a(c7048d.f10906e - c7048d.f12492i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C7436v c7436v = this.f12598a;
        c7436v.m4994x(limit, array);
        C7435u c7435u = this.f12599b;
        c7435u.m5023i(limit, array);
        c7435u.m5020l(39);
        long m5026f = (c7435u.m5026f(1) << 32) | c7435u.m5026f(32);
        c7435u.m5020l(20);
        int m5026f2 = c7435u.m5026f(12);
        int m5026f3 = c7435u.m5026f(8);
        c7436v.m5018A(14);
        if (m5026f3 != 0) {
            if (m5026f3 != 255) {
                long j11 = 0;
                long j12 = 1;
                long j13 = -9223372036854775807L;
                if (m5026f3 != 4) {
                    if (m5026f3 != 5) {
                        if (m5026f3 != 6) {
                            c7112e = null;
                        } else {
                            C7404e0 c7404e03 = this.f12600c;
                            long m5506b = C7118g.m5506b(m5026f, c7436v);
                            c7112e = new C7118g(m5506b, c7404e03.m5111b(m5506b));
                        }
                    } else {
                        C7404e0 c7404e04 = this.f12600c;
                        long m5001q = c7436v.m5001q();
                        if ((c7436v.m5002p() & 128) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        List emptyList = Collections.emptyList();
                        if (!z9) {
                            int m5002p = c7436v.m5002p();
                            if ((m5002p & 128) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((m5002p & 64) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if ((m5002p & 32) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((m5002p & 16) != 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z15 && !z17) {
                                j9 = C7118g.m5506b(m5026f, c7436v);
                            } else {
                                j9 = -9223372036854775807L;
                            }
                            if (!z15) {
                                int m5002p2 = c7436v.m5002p();
                                ArrayList arrayList2 = new ArrayList(m5002p2);
                                for (int i7 = 0; i7 < m5002p2; i7++) {
                                    int m5002p3 = c7436v.m5002p();
                                    if (!z17) {
                                        j10 = C7118g.m5506b(m5026f, c7436v);
                                    } else {
                                        j10 = -9223372036854775807L;
                                    }
                                    arrayList2.add(new C7109d.C7111b(m5002p3, j10, c7404e04.m5111b(j10)));
                                }
                                emptyList = arrayList2;
                            }
                            if (z16) {
                                long m5002p4 = c7436v.m5002p();
                                if ((m5002p4 & 128) != 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                j13 = ((((m5002p4 & 1) << 32) | c7436v.m5001q()) * 1000) / 90;
                            } else {
                                z18 = false;
                            }
                            int m4997u = c7436v.m4997u();
                            int m5002p5 = c7436v.m5002p();
                            z13 = z18;
                            i6 = c7436v.m5002p();
                            list = emptyList;
                            z10 = z14;
                            i4 = m4997u;
                            i5 = m5002p5;
                            j8 = j13;
                            long j14 = j9;
                            z12 = z17;
                            z11 = z15;
                            j7 = j14;
                        } else {
                            list = emptyList;
                            j7 = -9223372036854775807L;
                            j8 = -9223372036854775807L;
                            z10 = false;
                            z11 = false;
                            z12 = false;
                            z13 = false;
                            i4 = 0;
                            i5 = 0;
                            i6 = 0;
                        }
                        c7112e = new C7109d(m5001q, z9, z10, z11, z12, j7, c7404e04.m5111b(j7), list, z13, j8, i4, i5, i6);
                    }
                } else {
                    int m5002p6 = c7436v.m5002p();
                    ArrayList arrayList3 = new ArrayList(m5002p6);
                    int i8 = 0;
                    while (i8 < m5002p6) {
                        long m5001q2 = c7436v.m5001q();
                        if ((c7436v.m5002p() & 128) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!z) {
                            int m5002p7 = c7436v.m5002p();
                            if ((m5002p7 & 128) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((m5002p7 & 64) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if ((m5002p7 & 32) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z6) {
                                j5 = c7436v.m5001q();
                            } else {
                                j5 = -9223372036854775807L;
                            }
                            if (!z6) {
                                int m5002p8 = c7436v.m5002p();
                                ArrayList arrayList5 = new ArrayList(m5002p8);
                                for (int i9 = 0; i9 < m5002p8; i9++) {
                                    arrayList5.add(new C7114f.C7116b(c7436v.m5002p(), c7436v.m5001q()));
                                }
                                arrayList4 = arrayList5;
                            }
                            if (z7) {
                                long m5002p9 = c7436v.m5002p();
                                j2 = 0;
                                if ((m5002p9 & 128) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                j = 1;
                                j6 = ((((m5002p9 & 1) << 32) | c7436v.m5001q()) * 1000) / 90;
                            } else {
                                j = 1;
                                j2 = 0;
                                j6 = -9223372036854775807L;
                                z8 = false;
                            }
                            z4 = z8;
                            arrayList = arrayList4;
                            z2 = z5;
                            z3 = z6;
                            j3 = j5;
                            j4 = j6;
                            i = c7436v.m4997u();
                            i2 = c7436v.m5002p();
                            i3 = c7436v.m5002p();
                        } else {
                            j = j12;
                            j2 = j11;
                            arrayList = arrayList4;
                            j3 = -9223372036854775807L;
                            j4 = -9223372036854775807L;
                            z2 = false;
                            z3 = false;
                            z4 = false;
                            i = 0;
                            i2 = 0;
                            i3 = 0;
                        }
                        arrayList3.add(new C7114f.C7117c(m5001q2, z, z2, z3, arrayList, j3, z4, j4, i, i2, i3));
                        i8++;
                        j11 = j2;
                        j12 = j;
                    }
                    c7112e = new C7114f(arrayList3);
                }
            } else {
                long m5001q3 = c7436v.m5001q();
                int i10 = m5026f2 - 4;
                byte[] bArr = new byte[i10];
                c7436v.m5016b(0, bArr, i10);
                c7112e = new C7105a(m5001q3, bArr, m5026f);
            }
        } else {
            c7112e = new C7112e();
        }
        if (c7112e == null) {
            return new C7042a(new C7042a.InterfaceC7044b[0]);
        }
        return new C7042a(c7112e);
    }
}
