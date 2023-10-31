package androidx.datastore.preferences.protobuf;

import androidx.core.p003os.C0740h;
import androidx.datastore.preferences.protobuf.AbstractC1183i;
import androidx.datastore.preferences.protobuf.C1163c0;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.k */
/* loaded from: classes.dex */
public abstract class AbstractC1197k {

    /* renamed from: a */
    public int f2995a;

    /* renamed from: b */
    public final int f2996b = 100;

    /* renamed from: c */
    public final int f2997c = Integer.MAX_VALUE;

    /* renamed from: d */
    public C1210l f2998d;

    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
    /* loaded from: classes.dex */
    public static final class C1198a extends AbstractC1197k {

        /* renamed from: e */
        public final byte[] f2999e;

        /* renamed from: f */
        public int f3000f;

        /* renamed from: g */
        public int f3001g;

        /* renamed from: h */
        public int f3002h;

        /* renamed from: i */
        public final int f3003i;

        /* renamed from: j */
        public int f3004j;

        /* renamed from: k */
        public int f3005k = Integer.MAX_VALUE;

        public C1198a(byte[] bArr, int i, int i2, boolean z) {
            this.f2999e = bArr;
            this.f3000f = i2 + i;
            this.f3002h = i;
            this.f3003i = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r3[r2] < 0) goto L34;
         */
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m11057A() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f3002h
                int r1 = r5.f3000f
                if (r1 != r0) goto L7
                goto L6a
            L7:
                int r2 = r0 + 1
                byte[] r3 = r5.f2999e
                r0 = r3[r0]
                if (r0 < 0) goto L12
                r5.f3002h = r2
                return r0
            L12:
                int r1 = r1 - r2
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r2
                goto L70
            L31:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m11055C()
                int r0 = (int) r0
                return r0
            L70:
                r5.f3002h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC1197k.C1198a.m11057A():int");
        }

        /* renamed from: B */
        public final long m11056B() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.f3002h;
            int i3 = this.f3000f;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f2999e;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f3002h = i4;
                    return b;
                } else if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            j = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 >= 0) {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = (bArr[i5] << 28) ^ j4;
                                if (j5 >= 0) {
                                    j2 = j5 ^ 266354560;
                                    i5 = i10;
                                } else {
                                    int i11 = i10 + 1;
                                    long j6 = j5 ^ (bArr[i10] << 35);
                                    if (j6 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i7 = i11 + 1;
                                        long j7 = j6 ^ (bArr[i11] << 42);
                                        if (j7 >= 0) {
                                            j = j7 ^ 4363953127296L;
                                        } else {
                                            i11 = i7 + 1;
                                            j6 = j7 ^ (bArr[i7] << 49);
                                            if (j6 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i7 = i11 + 1;
                                                j = (j6 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    i11 = i7 + 1;
                                                    if (bArr[i7] >= 0) {
                                                        j2 = j;
                                                        i5 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ j6;
                                    i5 = i11;
                                }
                                this.f3002h = i5;
                                return j2;
                            }
                            i = i9 ^ (-2080896);
                        }
                        i5 = i7;
                        j2 = j;
                        this.f3002h = i5;
                        return j2;
                    }
                    i = i6 ^ (-128);
                    j2 = i;
                    this.f3002h = i5;
                    return j2;
                }
            }
            return m11055C();
        }

        /* renamed from: C */
        public final long m11055C() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.f3002h;
                if (i2 != this.f3000f) {
                    this.f3002h = i2 + 1;
                    byte b = this.f2999e[i2];
                    j |= (b & Byte.MAX_VALUE) << i;
                    if ((b & 128) == 0) {
                        return j;
                    }
                } else {
                    throw C1163c0.m11134f();
                }
            }
            throw C1163c0.m11137c();
        }

        /* renamed from: D */
        public final void m11054D(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f3000f;
                int i3 = this.f3002h;
                if (i <= i2 - i3) {
                    this.f3002h = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw C1163c0.m11134f();
            }
            throw C1163c0.m11136d();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: a */
        public final void mo11041a(int i) throws C1163c0 {
            if (this.f3004j == i) {
                return;
            }
            throw new C1163c0("Protocol message end-group tag did not match expected tag.");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: b */
        public final int mo11040b() {
            return this.f3002h - this.f3003i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: c */
        public final boolean mo11039c() throws IOException {
            return this.f3002h == this.f3000f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: d */
        public final void mo11038d(int i) {
            this.f3005k = i;
            int i2 = this.f3000f + this.f3001g;
            this.f3000f = i2;
            int i3 = i2 - this.f3003i;
            if (i3 > i) {
                int i4 = i3 - i;
                this.f3001g = i4;
                this.f3000f = i2 - i4;
                return;
            }
            this.f3001g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: e */
        public final int mo11037e(int i) throws C1163c0 {
            if (i >= 0) {
                int i2 = this.f3002h;
                int i3 = this.f3003i;
                int i4 = (i2 - i3) + i;
                int i5 = this.f3005k;
                if (i4 <= i5) {
                    this.f3005k = i4;
                    int i6 = this.f3000f + this.f3001g;
                    this.f3000f = i6;
                    int i7 = i6 - i3;
                    if (i7 > i4) {
                        int i8 = i7 - i4;
                        this.f3001g = i8;
                        this.f3000f = i6 - i8;
                    } else {
                        this.f3001g = 0;
                    }
                    return i5;
                }
                throw C1163c0.m11134f();
            }
            throw C1163c0.m11136d();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: f */
        public final boolean mo11036f() throws IOException {
            return m11056B() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: g */
        public final AbstractC1183i.C1188e mo11035g() throws IOException {
            byte[] bArr;
            int m11057A = m11057A();
            byte[] bArr2 = this.f2999e;
            if (m11057A > 0) {
                int i = this.f3000f;
                int i2 = this.f3002h;
                if (m11057A <= i - i2) {
                    AbstractC1183i.C1188e m11120i = AbstractC1183i.m11120i(i2, bArr2, m11057A);
                    this.f3002h += m11057A;
                    return m11120i;
                }
            }
            if (m11057A == 0) {
                return AbstractC1183i.f2982b;
            }
            if (m11057A > 0) {
                int i3 = this.f3000f;
                int i4 = this.f3002h;
                if (m11057A <= i3 - i4) {
                    int i5 = m11057A + i4;
                    this.f3002h = i5;
                    bArr = Arrays.copyOfRange(bArr2, i4, i5);
                    AbstractC1183i.C1188e c1188e = AbstractC1183i.f2982b;
                    return new AbstractC1183i.C1188e(bArr);
                }
            }
            if (m11057A <= 0) {
                if (m11057A == 0) {
                    bArr = C1157b0.f2945b;
                    AbstractC1183i.C1188e c1188e2 = AbstractC1183i.f2982b;
                    return new AbstractC1183i.C1188e(bArr);
                }
                throw C1163c0.m11136d();
            }
            throw C1163c0.m11134f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: h */
        public final double mo11034h() throws IOException {
            return Double.longBitsToDouble(m11052z());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: i */
        public final int mo11033i() throws IOException {
            return m11057A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: j */
        public final int mo11032j() throws IOException {
            return m11053y();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: k */
        public final long mo11031k() throws IOException {
            return m11052z();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: l */
        public final float mo11030l() throws IOException {
            return Float.intBitsToFloat(m11053y());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: m */
        public final int mo11029m() throws IOException {
            return m11057A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: n */
        public final long mo11028n() throws IOException {
            return m11056B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: o */
        public final int mo11027o() throws IOException {
            return m11053y();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: p */
        public final long mo11026p() throws IOException {
            return m11052z();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: q */
        public final int mo11025q() throws IOException {
            int m11057A = m11057A();
            return (-(m11057A & 1)) ^ (m11057A >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: r */
        public final long mo11024r() throws IOException {
            long m11056B = m11056B();
            return (-(m11056B & 1)) ^ (m11056B >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: s */
        public final String mo11023s() throws IOException {
            int m11057A = m11057A();
            if (m11057A > 0) {
                int i = this.f3000f;
                int i2 = this.f3002h;
                if (m11057A <= i - i2) {
                    String str = new String(this.f2999e, i2, m11057A, C1157b0.f2944a);
                    this.f3002h += m11057A;
                    return str;
                }
            }
            if (m11057A == 0) {
                return "";
            }
            if (m11057A < 0) {
                throw C1163c0.m11136d();
            }
            throw C1163c0.m11134f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: t */
        public final String mo11022t() throws IOException {
            int m11057A = m11057A();
            if (m11057A > 0) {
                int i = this.f3000f;
                int i2 = this.f3002h;
                if (m11057A <= i - i2) {
                    String mo10781a = C1250t1.f3086a.mo10781a(i2, this.f2999e, m11057A);
                    this.f3002h += m11057A;
                    return mo10781a;
                }
            }
            if (m11057A == 0) {
                return "";
            }
            if (m11057A <= 0) {
                throw C1163c0.m11136d();
            }
            throw C1163c0.m11134f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: u */
        public final int mo11021u() throws IOException {
            if (mo11039c()) {
                this.f3004j = 0;
                return 0;
            }
            int m11057A = m11057A();
            this.f3004j = m11057A;
            if ((m11057A >>> 3) != 0) {
                return m11057A;
            }
            throw new C1163c0("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: v */
        public final int mo11020v() throws IOException {
            return m11057A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: w */
        public final long mo11019w() throws IOException {
            return m11056B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: x */
        public final boolean mo11018x(int i) throws IOException {
            int i2;
            int mo11021u;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                return false;
                            }
                            if (i3 == 5) {
                                m11054D(4);
                                return true;
                            }
                            int i5 = C1163c0.f2947a;
                            throw new C1163c0.C1164a();
                        }
                        do {
                            mo11021u = mo11021u();
                            if (mo11021u == 0) {
                                break;
                            }
                        } while (mo11018x(mo11021u));
                        mo11041a(((i >>> 3) << 3) | 4);
                        return true;
                    }
                    i2 = m11057A();
                } else {
                    i2 = 8;
                }
                m11054D(i2);
                return true;
            }
            int i6 = this.f3000f - this.f3002h;
            byte[] bArr = this.f2999e;
            if (i6 >= 10) {
                while (i4 < 10) {
                    int i7 = this.f3002h;
                    this.f3002h = i7 + 1;
                    if (bArr[i7] < 0) {
                        i4++;
                    }
                }
                throw C1163c0.m11137c();
            }
            while (i4 < 10) {
                int i8 = this.f3002h;
                if (i8 != this.f3000f) {
                    this.f3002h = i8 + 1;
                    if (bArr[i8] < 0) {
                        i4++;
                    }
                } else {
                    throw C1163c0.m11134f();
                }
            }
            throw C1163c0.m11137c();
            return true;
        }

        /* renamed from: y */
        public final int m11053y() throws IOException {
            int i = this.f3002h;
            if (this.f3000f - i >= 4) {
                this.f3002h = i + 4;
                byte[] bArr = this.f2999e;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw C1163c0.m11134f();
        }

        /* renamed from: z */
        public final long m11052z() throws IOException {
            int i = this.f3002h;
            if (this.f3000f - i >= 8) {
                this.f3002h = i + 8;
                byte[] bArr = this.f2999e;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw C1163c0.m11134f();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k$b */
    /* loaded from: classes.dex */
    public static final class C1199b extends AbstractC1197k {

        /* renamed from: e */
        public final InputStream f3006e;

        /* renamed from: f */
        public final byte[] f3007f;

        /* renamed from: g */
        public int f3008g;

        /* renamed from: h */
        public int f3009h;

        /* renamed from: i */
        public int f3010i;

        /* renamed from: j */
        public int f3011j;

        /* renamed from: k */
        public int f3012k;

        /* renamed from: l */
        public int f3013l = Integer.MAX_VALUE;

        public C1199b(FileInputStream fileInputStream) {
            Charset charset = C1157b0.f2944a;
            this.f3006e = fileInputStream;
            this.f3007f = new byte[4096];
            this.f3008g = 0;
            this.f3010i = 0;
            this.f3012k = 0;
        }

        /* renamed from: A */
        public final ArrayList m11051A(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f3006e.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw C1163c0.m11134f();
                    }
                    this.f3012k += read;
                    i2 += read;
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: B */
        public final int m11050B() throws IOException {
            int i = this.f3010i;
            if (this.f3008g - i < 4) {
                m11044H(4);
                i = this.f3010i;
            }
            this.f3010i = i + 4;
            byte[] bArr = this.f3007f;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: C */
        public final long m11049C() throws IOException {
            int i = this.f3010i;
            if (this.f3008g - i < 8) {
                m11044H(8);
                i = this.f3010i;
            }
            this.f3010i = i + 8;
            byte[] bArr = this.f3007f;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r3[r2] < 0) goto L34;
         */
        /* renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m11048D() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f3010i
                int r1 = r5.f3008g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                int r2 = r0 + 1
                byte[] r3 = r5.f3007f
                r0 = r3[r0]
                if (r0 < 0) goto L12
                r5.f3010i = r2
                return r0
            L12:
                int r1 = r1 - r2
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r2
                goto L70
            L31:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m11046F()
                int r0 = (int) r0
                return r0
            L70:
                r5.f3010i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC1197k.C1199b.m11048D():int");
        }

        /* renamed from: E */
        public final long m11047E() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.f3010i;
            int i3 = this.f3008g;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f3007f;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f3010i = i4;
                    return b;
                } else if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            j = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 >= 0) {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = (bArr[i5] << 28) ^ j4;
                                if (j5 >= 0) {
                                    j2 = j5 ^ 266354560;
                                    i5 = i10;
                                } else {
                                    int i11 = i10 + 1;
                                    long j6 = j5 ^ (bArr[i10] << 35);
                                    if (j6 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i7 = i11 + 1;
                                        long j7 = j6 ^ (bArr[i11] << 42);
                                        if (j7 >= 0) {
                                            j = j7 ^ 4363953127296L;
                                        } else {
                                            i11 = i7 + 1;
                                            j6 = j7 ^ (bArr[i7] << 49);
                                            if (j6 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i7 = i11 + 1;
                                                j = (j6 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    i11 = i7 + 1;
                                                    if (bArr[i7] >= 0) {
                                                        j2 = j;
                                                        i5 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ j6;
                                    i5 = i11;
                                }
                                this.f3010i = i5;
                                return j2;
                            }
                            i = i9 ^ (-2080896);
                        }
                        i5 = i7;
                        j2 = j;
                        this.f3010i = i5;
                        return j2;
                    }
                    i = i6 ^ (-128);
                    j2 = i;
                    this.f3010i = i5;
                    return j2;
                }
            }
            return m11046F();
        }

        /* renamed from: F */
        public final long m11046F() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.f3010i == this.f3008g) {
                    m11044H(1);
                }
                int i2 = this.f3010i;
                this.f3010i = i2 + 1;
                byte b = this.f3007f[i2];
                j |= (b & Byte.MAX_VALUE) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw C1163c0.m11137c();
        }

        /* renamed from: G */
        public final void m11045G() {
            int i = this.f3008g + this.f3009h;
            this.f3008g = i;
            int i2 = this.f3012k + i;
            int i3 = this.f3013l;
            if (i2 <= i3) {
                this.f3009h = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f3009h = i4;
            this.f3008g = i - i4;
        }

        /* renamed from: H */
        public final void m11044H(int i) throws IOException {
            if (!m11042J(i)) {
                if (i > (this.f2997c - this.f3012k) - this.f3010i) {
                    throw new C1163c0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                throw C1163c0.m11134f();
            }
        }

        /* renamed from: I */
        public final void m11043I(int i) throws IOException {
            int i2 = this.f3008g;
            int i3 = this.f3010i;
            if (i <= i2 - i3 && i >= 0) {
                this.f3010i = i3 + i;
                return;
            }
            InputStream inputStream = this.f3006e;
            if (i >= 0) {
                int i4 = this.f3012k;
                int i5 = i4 + i3;
                int i6 = i5 + i;
                int i7 = this.f3013l;
                if (i6 <= i7) {
                    this.f3012k = i5;
                    int i8 = i2 - i3;
                    this.f3008g = 0;
                    this.f3010i = 0;
                    while (i8 < i) {
                        long j = i - i8;
                        try {
                            long skip = inputStream.skip(j);
                            int i9 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i9 >= 0 && skip <= j) {
                                if (i9 == 0) {
                                    break;
                                }
                                i8 += (int) skip;
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } finally {
                            this.f3012k += i8;
                            m11045G();
                        }
                    }
                    if (i8 < i) {
                        int i10 = this.f3008g;
                        int i11 = i10 - this.f3010i;
                        this.f3010i = i10;
                        while (true) {
                            m11044H(1);
                            int i12 = i - i11;
                            int i13 = this.f3008g;
                            if (i12 > i13) {
                                i11 += i13;
                                this.f3010i = i13;
                            } else {
                                this.f3010i = i12;
                                return;
                            }
                        }
                    }
                } else {
                    m11043I((i7 - i4) - i3);
                    throw C1163c0.m11134f();
                }
            } else {
                throw C1163c0.m11136d();
            }
        }

        /* renamed from: J */
        public final boolean m11042J(int i) throws IOException {
            InputStream inputStream;
            int i2 = this.f3010i;
            int i3 = i2 + i;
            int i4 = this.f3008g;
            if (i3 > i4) {
                int i5 = this.f3012k;
                int i6 = this.f2997c;
                if (i > (i6 - i5) - i2 || i5 + i2 + i > this.f3013l) {
                    return false;
                }
                byte[] bArr = this.f3007f;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f3012k += i2;
                    this.f3008g -= i2;
                    this.f3010i = 0;
                }
                int i7 = this.f3008g;
                int min = Math.min(bArr.length - i7, (i6 - this.f3012k) - i7);
                int read = this.f3006e.read(bArr, i7, min);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f3008g += read;
                    m11045G();
                    if (this.f3008g >= i) {
                        return true;
                    }
                    return m11042J(i);
                }
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            throw new IllegalStateException(C0740h.m11849a("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: a */
        public final void mo11041a(int i) throws C1163c0 {
            if (this.f3011j == i) {
                return;
            }
            throw new C1163c0("Protocol message end-group tag did not match expected tag.");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: b */
        public final int mo11040b() {
            return this.f3012k + this.f3010i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: c */
        public final boolean mo11039c() throws IOException {
            return this.f3010i == this.f3008g && !m11042J(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: d */
        public final void mo11038d(int i) {
            this.f3013l = i;
            m11045G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: e */
        public final int mo11037e(int i) throws C1163c0 {
            if (i >= 0) {
                int i2 = this.f3012k + this.f3010i + i;
                int i3 = this.f3013l;
                if (i2 <= i3) {
                    this.f3013l = i2;
                    m11045G();
                    return i3;
                }
                throw C1163c0.m11134f();
            }
            throw C1163c0.m11136d();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: f */
        public final boolean mo11036f() throws IOException {
            return m11047E() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: g */
        public final AbstractC1183i.C1188e mo11035g() throws IOException {
            int m11048D = m11048D();
            int i = this.f3008g;
            int i2 = this.f3010i;
            int i3 = i - i2;
            byte[] bArr = this.f3007f;
            if (m11048D <= i3 && m11048D > 0) {
                AbstractC1183i.C1188e m11120i = AbstractC1183i.m11120i(i2, bArr, m11048D);
                this.f3010i += m11048D;
                return m11120i;
            } else if (m11048D == 0) {
                return AbstractC1183i.f2982b;
            } else {
                byte[] m11016z = m11016z(m11048D);
                if (m11016z != null) {
                    return AbstractC1183i.m11120i(0, m11016z, m11016z.length);
                }
                int i4 = this.f3010i;
                int i5 = this.f3008g;
                int i6 = i5 - i4;
                this.f3012k += i5;
                this.f3010i = 0;
                this.f3008g = 0;
                ArrayList m11051A = m11051A(m11048D - i6);
                byte[] bArr2 = new byte[m11048D];
                System.arraycopy(bArr, i4, bArr2, 0, i6);
                Iterator it = m11051A.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
                    i6 += bArr3.length;
                }
                AbstractC1183i.C1188e c1188e = AbstractC1183i.f2982b;
                return new AbstractC1183i.C1188e(bArr2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: h */
        public final double mo11034h() throws IOException {
            return Double.longBitsToDouble(m11049C());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: i */
        public final int mo11033i() throws IOException {
            return m11048D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: j */
        public final int mo11032j() throws IOException {
            return m11050B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: k */
        public final long mo11031k() throws IOException {
            return m11049C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: l */
        public final float mo11030l() throws IOException {
            return Float.intBitsToFloat(m11050B());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: m */
        public final int mo11029m() throws IOException {
            return m11048D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: n */
        public final long mo11028n() throws IOException {
            return m11047E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: o */
        public final int mo11027o() throws IOException {
            return m11050B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: p */
        public final long mo11026p() throws IOException {
            return m11049C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: q */
        public final int mo11025q() throws IOException {
            int m11048D = m11048D();
            return (-(m11048D & 1)) ^ (m11048D >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: r */
        public final long mo11024r() throws IOException {
            long m11047E = m11047E();
            return (-(m11047E & 1)) ^ (m11047E >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: s */
        public final String mo11023s() throws IOException {
            String str;
            int m11048D = m11048D();
            byte[] bArr = this.f3007f;
            if (m11048D > 0) {
                int i = this.f3008g;
                int i2 = this.f3010i;
                if (m11048D <= i - i2) {
                    str = new String(bArr, i2, m11048D, C1157b0.f2944a);
                    this.f3010i += m11048D;
                    return str;
                }
            }
            if (m11048D == 0) {
                return "";
            }
            if (m11048D <= this.f3008g) {
                m11044H(m11048D);
                str = new String(bArr, this.f3010i, m11048D, C1157b0.f2944a);
                this.f3010i += m11048D;
                return str;
            }
            return new String(m11017y(m11048D), C1157b0.f2944a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: t */
        public final String mo11022t() throws IOException {
            byte[] m11017y;
            int i;
            int m11048D = m11048D();
            int i2 = this.f3010i;
            int i3 = this.f3008g;
            if (m11048D <= i3 - i2 && m11048D > 0) {
                i = i2 + m11048D;
            } else if (m11048D == 0) {
                return "";
            } else {
                i2 = 0;
                if (m11048D <= i3) {
                    m11044H(m11048D);
                    i = m11048D + 0;
                } else {
                    m11017y = m11017y(m11048D);
                    return C1250t1.f3086a.mo10781a(i2, m11017y, m11048D);
                }
            }
            this.f3010i = i;
            m11017y = this.f3007f;
            return C1250t1.f3086a.mo10781a(i2, m11017y, m11048D);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: u */
        public final int mo11021u() throws IOException {
            if (mo11039c()) {
                this.f3011j = 0;
                return 0;
            }
            int m11048D = m11048D();
            this.f3011j = m11048D;
            if ((m11048D >>> 3) != 0) {
                return m11048D;
            }
            throw new C1163c0("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: v */
        public final int mo11020v() throws IOException {
            return m11048D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: w */
        public final long mo11019w() throws IOException {
            return m11047E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1197k
        /* renamed from: x */
        public final boolean mo11018x(int i) throws IOException {
            int i2;
            int mo11021u;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                return false;
                            }
                            if (i3 == 5) {
                                m11043I(4);
                                return true;
                            }
                            int i5 = C1163c0.f2947a;
                            throw new C1163c0.C1164a();
                        }
                        do {
                            mo11021u = mo11021u();
                            if (mo11021u == 0) {
                                break;
                            }
                        } while (mo11018x(mo11021u));
                        mo11041a(((i >>> 3) << 3) | 4);
                        return true;
                    }
                    i2 = m11048D();
                } else {
                    i2 = 8;
                }
                m11043I(i2);
                return true;
            }
            int i6 = this.f3008g - this.f3010i;
            byte[] bArr = this.f3007f;
            if (i6 >= 10) {
                while (i4 < 10) {
                    int i7 = this.f3010i;
                    this.f3010i = i7 + 1;
                    if (bArr[i7] < 0) {
                        i4++;
                    }
                }
                throw C1163c0.m11137c();
            }
            while (i4 < 10) {
                if (this.f3010i == this.f3008g) {
                    m11044H(1);
                }
                int i8 = this.f3010i;
                this.f3010i = i8 + 1;
                if (bArr[i8] < 0) {
                    i4++;
                }
            }
            throw C1163c0.m11137c();
            return true;
        }

        /* renamed from: y */
        public final byte[] m11017y(int i) throws IOException {
            byte[] m11016z = m11016z(i);
            if (m11016z != null) {
                return m11016z;
            }
            int i2 = this.f3010i;
            int i3 = this.f3008g;
            int i4 = i3 - i2;
            this.f3012k += i3;
            this.f3010i = 0;
            this.f3008g = 0;
            ArrayList m11051A = m11051A(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f3007f, i2, bArr, 0, i4);
            Iterator it = m11051A.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: z */
        public final byte[] m11016z(int i) throws IOException {
            if (i == 0) {
                return C1157b0.f2945b;
            }
            if (i >= 0) {
                int i2 = this.f3012k;
                int i3 = this.f3010i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f2997c <= 0) {
                    int i5 = this.f3013l;
                    if (i4 <= i5) {
                        int i6 = this.f3008g - i3;
                        int i7 = i - i6;
                        InputStream inputStream = this.f3006e;
                        if (i7 >= 4096 && i7 > inputStream.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f3007f, this.f3010i, bArr, 0, i6);
                        this.f3012k += this.f3008g;
                        this.f3010i = 0;
                        this.f3008g = 0;
                        while (i6 < i) {
                            int read = inputStream.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f3012k += read;
                                i6 += read;
                            } else {
                                throw C1163c0.m11134f();
                            }
                        }
                        return bArr;
                    }
                    m11043I((i5 - i2) - i3);
                    throw C1163c0.m11134f();
                }
                throw new C1163c0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C1163c0.m11136d();
        }
    }

    /* renamed from: a */
    public abstract void mo11041a(int i) throws C1163c0;

    /* renamed from: b */
    public abstract int mo11040b();

    /* renamed from: c */
    public abstract boolean mo11039c() throws IOException;

    /* renamed from: d */
    public abstract void mo11038d(int i);

    /* renamed from: e */
    public abstract int mo11037e(int i) throws C1163c0;

    /* renamed from: f */
    public abstract boolean mo11036f() throws IOException;

    /* renamed from: g */
    public abstract AbstractC1183i.C1188e mo11035g() throws IOException;

    /* renamed from: h */
    public abstract double mo11034h() throws IOException;

    /* renamed from: i */
    public abstract int mo11033i() throws IOException;

    /* renamed from: j */
    public abstract int mo11032j() throws IOException;

    /* renamed from: k */
    public abstract long mo11031k() throws IOException;

    /* renamed from: l */
    public abstract float mo11030l() throws IOException;

    /* renamed from: m */
    public abstract int mo11029m() throws IOException;

    /* renamed from: n */
    public abstract long mo11028n() throws IOException;

    /* renamed from: o */
    public abstract int mo11027o() throws IOException;

    /* renamed from: p */
    public abstract long mo11026p() throws IOException;

    /* renamed from: q */
    public abstract int mo11025q() throws IOException;

    /* renamed from: r */
    public abstract long mo11024r() throws IOException;

    /* renamed from: s */
    public abstract String mo11023s() throws IOException;

    /* renamed from: t */
    public abstract String mo11022t() throws IOException;

    /* renamed from: u */
    public abstract int mo11021u() throws IOException;

    /* renamed from: v */
    public abstract int mo11020v() throws IOException;

    /* renamed from: w */
    public abstract long mo11019w() throws IOException;

    /* renamed from: x */
    public abstract boolean mo11018x(int i) throws IOException;
}
