package com.google.android.exoplayer2.extractor.ogg;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.C6951v;
import com.google.android.exoplayer2.extractor.C6952w;
import com.google.android.exoplayer2.extractor.ogg.AbstractC6896h;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.exoplayer2.extractor.ogg.i */
/* loaded from: classes.dex */
public final class C6899i extends AbstractC6896h {
    @Nullable

    /* renamed from: n */
    public C6900a f11601n;

    /* renamed from: o */
    public int f11602o;

    /* renamed from: p */
    public boolean f11603p;
    @Nullable

    /* renamed from: q */
    public C6952w.C6955c f11604q;
    @Nullable

    /* renamed from: r */
    public C6952w.C6953a f11605r;

    /* renamed from: com.google.android.exoplayer2.extractor.ogg.i$a */
    /* loaded from: classes.dex */
    public static final class C6900a {

        /* renamed from: a */
        public final C6952w.C6955c f11606a;

        /* renamed from: b */
        public final byte[] f11607b;

        /* renamed from: c */
        public final C6952w.C6954b[] f11608c;

        /* renamed from: d */
        public final int f11609d;

        public C6900a(C6952w.C6955c c6955c, byte[] bArr, C6952w.C6954b[] c6954bArr, int i) {
            this.f11606a = c6955c;
            this.f11607b = bArr;
            this.f11608c = c6954bArr;
            this.f11609d = i;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC6896h
    /* renamed from: a */
    public final void mo5855a(long j) {
        boolean z;
        this.f11592g = j;
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f11603p = z;
        C6952w.C6955c c6955c = this.f11604q;
        if (c6955c != null) {
            i = c6955c.f11987e;
        }
        this.f11602o = i;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC6896h
    /* renamed from: b */
    public final long mo5854b(C7436v c7436v) {
        int i;
        int i2 = 0;
        byte b = c7436v.f13978a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C6900a c6900a = this.f11601n;
        C7394a.m5130e(c6900a);
        boolean z = c6900a.f11608c[(b >> 1) & (255 >>> (8 - c6900a.f11609d))].f11982a;
        C6952w.C6955c c6955c = c6900a.f11606a;
        if (!z) {
            i = c6955c.f11987e;
        } else {
            i = c6955c.f11988f;
        }
        if (this.f11603p) {
            i2 = (this.f11602o + i) / 4;
        }
        long j = i2;
        byte[] bArr = c7436v.f13978a;
        int length = bArr.length;
        int i3 = c7436v.f13980c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            c7436v.m4994x(copyOf.length, copyOf);
        } else {
            c7436v.m4993y(i3);
        }
        byte[] bArr2 = c7436v.f13978a;
        int i4 = c7436v.f13980c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.f11603p = true;
        this.f11602o = i;
        return j;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC6896h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo5853c(C7436v c7436v, long j, AbstractC6896h.C6897a c6897a) throws IOException {
        C6900a c6900a;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        if (this.f11601n != null) {
            c6897a.f11599a.getClass();
            return false;
        }
        C6952w.C6955c c6955c = this.f11604q;
        int i5 = 1;
        if (c6955c == null) {
            C6952w.m5808b(1, c7436v, false);
            c7436v.m5010h();
            int m5002p = c7436v.m5002p();
            int m5010h = c7436v.m5010h();
            int m5013e = c7436v.m5013e();
            if (m5013e <= 0) {
                i3 = -1;
            } else {
                i3 = m5013e;
            }
            int m5013e2 = c7436v.m5013e();
            if (m5013e2 <= 0) {
                i4 = -1;
            } else {
                i4 = m5013e2;
            }
            c7436v.m5013e();
            int m5002p2 = c7436v.m5002p();
            c7436v.m5002p();
            this.f11604q = new C6952w.C6955c(m5002p, m5010h, i3, i4, (int) Math.pow(2.0d, m5002p2 & 15), (int) Math.pow(2.0d, (m5002p2 & 240) >> 4), Arrays.copyOf(c7436v.f13978a, c7436v.f13980c));
        } else if (this.f11605r == null) {
            this.f11605r = C6952w.m5809a(c7436v, true, true);
        } else {
            int i6 = c7436v.f13980c;
            byte[] bArr = new byte[i6];
            System.arraycopy(c7436v.f13978a, 0, bArr, 0, i6);
            int i7 = 5;
            C6952w.m5808b(5, c7436v, false);
            int m5002p3 = c7436v.m5002p() + 1;
            C6951v c6951v = new C6951v(c7436v.f13978a);
            c6951v.m5810c(c7436v.f13979b * 8);
            int i8 = 0;
            while (true) {
                int i9 = 16;
                if (i8 < m5002p3) {
                    if (c6951v.m5811b(24) == 5653314) {
                        int m5811b = c6951v.m5811b(16);
                        int m5811b2 = c6951v.m5811b(24);
                        long[] jArr = new long[m5811b2];
                        long j2 = 0;
                        if (!c6951v.m5812a()) {
                            boolean m5812a = c6951v.m5812a();
                            int i10 = 0;
                            while (i10 < m5811b2) {
                                if (m5812a) {
                                    if (c6951v.m5812a()) {
                                        jArr[i10] = c6951v.m5811b(i7) + 1;
                                    } else {
                                        jArr[i10] = 0;
                                    }
                                    z = true;
                                } else {
                                    z = true;
                                    jArr[i10] = c6951v.m5811b(i7) + 1;
                                }
                                i10++;
                                i7 = 5;
                            }
                        } else {
                            int m5811b3 = c6951v.m5811b(i7) + i5;
                            int i11 = 0;
                            while (i11 < m5811b2) {
                                int i12 = 0;
                                for (int i13 = m5811b2 - i11; i13 > 0; i13 >>>= 1) {
                                    i12++;
                                }
                                int i14 = 0;
                                for (int m5811b4 = c6951v.m5811b(i12); i14 < m5811b4 && i11 < m5811b2; m5811b4 = m5811b4) {
                                    jArr[i11] = m5811b3;
                                    i11++;
                                    i14++;
                                    bArr = bArr;
                                }
                                m5811b3++;
                                bArr = bArr;
                            }
                        }
                        byte[] bArr2 = bArr;
                        int m5811b5 = c6951v.m5811b(4);
                        if (m5811b5 <= 2) {
                            if (m5811b5 == 1 || m5811b5 == 2) {
                                c6951v.m5810c(32);
                                c6951v.m5810c(32);
                                int m5811b6 = c6951v.m5811b(4) + 1;
                                c6951v.m5810c(1);
                                if (m5811b5 == 1) {
                                    if (m5811b != 0) {
                                        j2 = (long) Math.floor(Math.pow(m5811b2, 1.0d / m5811b));
                                    }
                                } else {
                                    j2 = m5811b2 * m5811b;
                                }
                                c6951v.m5810c((int) (m5811b6 * j2));
                            }
                            i8++;
                            bArr = bArr2;
                            i5 = 1;
                            i7 = 5;
                        } else {
                            StringBuilder sb = new StringBuilder(53);
                            sb.append("lookup type greater than 2 not decodable: ");
                            sb.append(m5811b5);
                            throw C7506y0.m4869a(sb.toString(), null);
                        }
                    } else {
                        int i15 = (c6951v.f11979c * 8) + c6951v.f11980d;
                        StringBuilder sb2 = new StringBuilder(66);
                        sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb2.append(i15);
                        throw C7506y0.m4869a(sb2.toString(), null);
                    }
                } else {
                    byte[] bArr3 = bArr;
                    int i16 = 6;
                    int m5811b7 = c6951v.m5811b(6) + 1;
                    for (int i17 = 0; i17 < m5811b7; i17++) {
                        if (c6951v.m5811b(16) != 0) {
                            throw C7506y0.m4869a("placeholder of time domain transforms not zeroed out", null);
                        }
                    }
                    int i18 = 1;
                    int m5811b8 = c6951v.m5811b(6) + 1;
                    int i19 = 0;
                    while (true) {
                        int i20 = 3;
                        if (i19 < m5811b8) {
                            int m5811b9 = c6951v.m5811b(i9);
                            if (m5811b9 != 0) {
                                if (m5811b9 == i18) {
                                    int m5811b10 = c6951v.m5811b(5);
                                    int[] iArr = new int[m5811b10];
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < m5811b10; i22++) {
                                        int m5811b11 = c6951v.m5811b(4);
                                        iArr[i22] = m5811b11;
                                        if (m5811b11 > i21) {
                                            i21 = m5811b11;
                                        }
                                    }
                                    int i23 = i21 + 1;
                                    int[] iArr2 = new int[i23];
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        iArr2[i24] = c6951v.m5811b(i20) + 1;
                                        int m5811b12 = c6951v.m5811b(2);
                                        int i25 = 8;
                                        if (m5811b12 > 0) {
                                            c6951v.m5810c(8);
                                        }
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << m5811b12); i27 = 1) {
                                            c6951v.m5810c(i25);
                                            i26++;
                                            i25 = 8;
                                        }
                                        i24++;
                                        i20 = 3;
                                    }
                                    c6951v.m5810c(2);
                                    int m5811b13 = c6951v.m5811b(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < m5811b10; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            c6951v.m5810c(m5811b13);
                                            i29++;
                                        }
                                    }
                                } else {
                                    StringBuilder sb3 = new StringBuilder(52);
                                    sb3.append("floor type greater than 1 not decodable: ");
                                    sb3.append(m5811b9);
                                    throw C7506y0.m4869a(sb3.toString(), null);
                                }
                            } else {
                                int i31 = 8;
                                c6951v.m5810c(8);
                                c6951v.m5810c(16);
                                c6951v.m5810c(16);
                                c6951v.m5810c(6);
                                c6951v.m5810c(8);
                                int m5811b14 = c6951v.m5811b(4) + 1;
                                int i32 = 0;
                                while (i32 < m5811b14) {
                                    c6951v.m5810c(i31);
                                    i32++;
                                    i31 = 8;
                                }
                            }
                            i19++;
                            i16 = 6;
                            i9 = 16;
                            i18 = 1;
                        } else {
                            int i33 = 1;
                            int m5811b15 = c6951v.m5811b(i16) + 1;
                            int i34 = 0;
                            while (i34 < m5811b15) {
                                if (c6951v.m5811b(16) <= 2) {
                                    c6951v.m5810c(24);
                                    c6951v.m5810c(24);
                                    c6951v.m5810c(24);
                                    int m5811b16 = c6951v.m5811b(i16) + i33;
                                    int i35 = 8;
                                    c6951v.m5810c(8);
                                    int[] iArr3 = new int[m5811b16];
                                    for (int i36 = 0; i36 < m5811b16; i36++) {
                                        int m5811b17 = c6951v.m5811b(3);
                                        if (c6951v.m5812a()) {
                                            i2 = c6951v.m5811b(5);
                                        } else {
                                            i2 = 0;
                                        }
                                        iArr3[i36] = (i2 * 8) + m5811b17;
                                    }
                                    int i37 = 0;
                                    while (i37 < m5811b16) {
                                        int i38 = 0;
                                        while (i38 < i35) {
                                            if ((iArr3[i37] & (1 << i38)) != 0) {
                                                c6951v.m5810c(i35);
                                            }
                                            i38++;
                                            i35 = 8;
                                        }
                                        i37++;
                                        i35 = 8;
                                    }
                                    i34++;
                                    i16 = 6;
                                    i33 = 1;
                                } else {
                                    throw C7506y0.m4869a("residueType greater than 2 is not decodable", null);
                                }
                            }
                            int m5811b18 = c6951v.m5811b(i16) + 1;
                            for (int i39 = 0; i39 < m5811b18; i39++) {
                                int m5811b19 = c6951v.m5811b(16);
                                if (m5811b19 != 0) {
                                    StringBuilder sb4 = new StringBuilder(52);
                                    sb4.append("mapping type other than 0 not supported: ");
                                    sb4.append(m5811b19);
                                    Log.e("VorbisUtil", sb4.toString());
                                } else {
                                    if (c6951v.m5812a()) {
                                        i = c6951v.m5811b(4) + 1;
                                    } else {
                                        i = 1;
                                    }
                                    boolean m5812a2 = c6951v.m5812a();
                                    int i40 = c6955c.f11983a;
                                    if (m5812a2) {
                                        int m5811b20 = c6951v.m5811b(8) + 1;
                                        for (int i41 = 0; i41 < m5811b20; i41++) {
                                            int i42 = i40 - 1;
                                            int i43 = 0;
                                            for (int i44 = i42; i44 > 0; i44 >>>= 1) {
                                                i43++;
                                            }
                                            c6951v.m5810c(i43);
                                            int i45 = 0;
                                            while (i42 > 0) {
                                                i45++;
                                                i42 >>>= 1;
                                            }
                                            c6951v.m5810c(i45);
                                        }
                                    }
                                    if (c6951v.m5811b(2) == 0) {
                                        if (i > 1) {
                                            for (int i46 = 0; i46 < i40; i46++) {
                                                c6951v.m5810c(4);
                                            }
                                        }
                                        for (int i47 = 0; i47 < i; i47++) {
                                            c6951v.m5810c(8);
                                            c6951v.m5810c(8);
                                            c6951v.m5810c(8);
                                        }
                                    } else {
                                        throw C7506y0.m4869a("to reserved bits must be zero after mapping coupling steps", null);
                                    }
                                }
                            }
                            int m5811b21 = c6951v.m5811b(6) + 1;
                            C6952w.C6954b[] c6954bArr = new C6952w.C6954b[m5811b21];
                            for (int i48 = 0; i48 < m5811b21; i48++) {
                                boolean m5812a3 = c6951v.m5812a();
                                c6951v.m5811b(16);
                                c6951v.m5811b(16);
                                c6951v.m5811b(8);
                                c6954bArr[i48] = new C6952w.C6954b(m5812a3);
                            }
                            if (c6951v.m5812a()) {
                                int i49 = 0;
                                for (int i50 = m5811b21 - 1; i50 > 0; i50 >>>= 1) {
                                    i49++;
                                }
                                c6900a = new C6900a(c6955c, bArr3, c6954bArr, i49);
                            } else {
                                throw C7506y0.m4869a("framing bit after modes not set as expected", null);
                            }
                        }
                    }
                }
            }
        }
        c6900a = null;
        this.f11601n = c6900a;
        if (c6900a == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C6952w.C6955c c6955c2 = c6900a.f11606a;
        arrayList.add(c6955c2.f11989g);
        arrayList.add(c6900a.f11607b);
        C7003m0.C7005b c7005b = new C7003m0.C7005b();
        c7005b.f12316k = "audio/vorbis";
        c7005b.f12311f = c6955c2.f11986d;
        c7005b.f12312g = c6955c2.f11985c;
        c7005b.f12329x = c6955c2.f11983a;
        c7005b.f12330y = c6955c2.f11984b;
        c7005b.f12318m = arrayList;
        c6897a.f11599a = new C7003m0(c7005b);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC6896h
    /* renamed from: d */
    public final void mo5852d(boolean z) {
        super.mo5852d(z);
        if (z) {
            this.f11601n = null;
            this.f11604q = null;
            this.f11605r = null;
        }
        this.f11602o = 0;
        this.f11603p = false;
    }
}
