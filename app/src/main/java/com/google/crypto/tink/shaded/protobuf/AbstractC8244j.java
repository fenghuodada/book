package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j */
/* loaded from: classes3.dex */
public abstract class AbstractC8244j {

    /* renamed from: a */
    public int f16023a;

    /* renamed from: b */
    public final int f16024b = 100;

    /* renamed from: c */
    public C8250k f16025c;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.j$a */
    /* loaded from: classes3.dex */
    public static final class C8245a extends AbstractC8244j {

        /* renamed from: d */
        public final byte[] f16026d;

        /* renamed from: e */
        public int f16027e;

        /* renamed from: f */
        public int f16028f;

        /* renamed from: g */
        public int f16029g;

        /* renamed from: h */
        public final int f16030h;

        /* renamed from: i */
        public int f16031i;

        /* renamed from: j */
        public int f16032j = Integer.MAX_VALUE;

        public C8245a(byte[] bArr, int i, int i2, boolean z) {
            this.f16026d = bArr;
            this.f16027e = i2 + i;
            this.f16029g = i;
            this.f16030h = i;
        }

        /* renamed from: A */
        public final int m3794A() throws IOException {
            int i = this.f16029g;
            if (this.f16027e - i >= 4) {
                this.f16029g = i + 4;
                byte[] bArr = this.f16026d;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw C8202b0.m3925f();
        }

        /* renamed from: B */
        public final long m3793B() throws IOException {
            int i = this.f16029g;
            if (this.f16027e - i >= 8) {
                this.f16029g = i + 8;
                byte[] bArr = this.f16026d;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw C8202b0.m3925f();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r3[r2] < 0) goto L34;
         */
        /* renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m3792C() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f16029g
                int r1 = r5.f16027e
                if (r1 != r0) goto L7
                goto L6a
            L7:
                int r2 = r0 + 1
                byte[] r3 = r5.f16026d
                r0 = r3[r0]
                if (r0 < 0) goto L12
                r5.f16029g = r2
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
                long r0 = r5.m3790E()
                int r0 = (int) r0
                return r0
            L70:
                r5.f16029g = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.AbstractC8244j.C8245a.m3792C():int");
        }

        /* renamed from: D */
        public final long m3791D() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.f16029g;
            int i3 = this.f16027e;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f16026d;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f16029g = i4;
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
                                this.f16029g = i5;
                                return j2;
                            }
                            i = i9 ^ (-2080896);
                        }
                        i5 = i7;
                        j2 = j;
                        this.f16029g = i5;
                        return j2;
                    }
                    i = i6 ^ (-128);
                    j2 = i;
                    this.f16029g = i5;
                    return j2;
                }
            }
            return m3790E();
        }

        /* renamed from: E */
        public final long m3790E() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.f16029g;
                if (i2 != this.f16027e) {
                    this.f16029g = i2 + 1;
                    byte b = this.f16026d[i2];
                    j |= (b & Byte.MAX_VALUE) << i;
                    if ((b & 128) == 0) {
                        return j;
                    }
                } else {
                    throw C8202b0.m3925f();
                }
            }
            throw C8202b0.m3928c();
        }

        /* renamed from: F */
        public final void m3789F(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f16027e;
                int i3 = this.f16029g;
                if (i <= i2 - i3) {
                    this.f16029g = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw C8202b0.m3925f();
            }
            throw C8202b0.m3927d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: a */
        public final void mo3788a(int i) throws C8202b0 {
            if (this.f16031i == i) {
                return;
            }
            throw new C8202b0("Protocol message end-group tag did not match expected tag.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: d */
        public final int mo3787d() {
            return this.f16029g - this.f16030h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: e */
        public final boolean mo3786e() throws IOException {
            return this.f16029g == this.f16027e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: f */
        public final void mo3785f(int i) {
            this.f16032j = i;
            int i2 = this.f16027e + this.f16028f;
            this.f16027e = i2;
            int i3 = i2 - this.f16030h;
            if (i3 > i) {
                int i4 = i3 - i;
                this.f16028f = i4;
                this.f16027e = i2 - i4;
                return;
            }
            this.f16028f = 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: g */
        public final int mo3784g(int i) throws C8202b0 {
            if (i >= 0) {
                int i2 = this.f16029g;
                int i3 = this.f16030h;
                int i4 = (i2 - i3) + i;
                int i5 = this.f16032j;
                if (i4 <= i5) {
                    this.f16032j = i4;
                    int i6 = this.f16027e + this.f16028f;
                    this.f16027e = i6;
                    int i7 = i6 - i3;
                    if (i7 > i4) {
                        int i8 = i7 - i4;
                        this.f16028f = i8;
                        this.f16027e = i6 - i8;
                    } else {
                        this.f16028f = 0;
                    }
                    return i5;
                }
                throw C8202b0.m3925f();
            }
            throw C8202b0.m3927d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: h */
        public final boolean mo3783h() throws IOException {
            return m3791D() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: i */
        public final AbstractC8228i.C8234f mo3782i() throws IOException {
            byte[] bArr;
            int m3792C = m3792C();
            byte[] bArr2 = this.f16026d;
            if (m3792C > 0) {
                int i = this.f16027e;
                int i2 = this.f16029g;
                if (m3792C <= i - i2) {
                    AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(i2, bArr2, m3792C);
                    this.f16029g += m3792C;
                    return m3821i;
                }
            }
            if (m3792C == 0) {
                return AbstractC8228i.f15998b;
            }
            if (m3792C > 0) {
                int i3 = this.f16027e;
                int i4 = this.f16029g;
                if (m3792C <= i3 - i4) {
                    int i5 = m3792C + i4;
                    this.f16029g = i5;
                    bArr = Arrays.copyOfRange(bArr2, i4, i5);
                    AbstractC8228i.C8234f c8234f = AbstractC8228i.f15998b;
                    return new AbstractC8228i.C8234f(bArr);
                }
            }
            if (m3792C <= 0) {
                if (m3792C == 0) {
                    bArr = C8196a0.f15950b;
                    AbstractC8228i.C8234f c8234f2 = AbstractC8228i.f15998b;
                    return new AbstractC8228i.C8234f(bArr);
                }
                throw C8202b0.m3927d();
            }
            throw C8202b0.m3925f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: j */
        public final double mo3781j() throws IOException {
            return Double.longBitsToDouble(m3793B());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: k */
        public final int mo3780k() throws IOException {
            return m3792C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: l */
        public final int mo3779l() throws IOException {
            return m3794A();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: m */
        public final long mo3778m() throws IOException {
            return m3793B();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: n */
        public final float mo3777n() throws IOException {
            return Float.intBitsToFloat(m3794A());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: o */
        public final int mo3776o() throws IOException {
            return m3792C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: p */
        public final long mo3775p() throws IOException {
            return m3791D();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: q */
        public final int mo3774q() throws IOException {
            return m3794A();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: r */
        public final long mo3773r() throws IOException {
            return m3793B();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: s */
        public final int mo3772s() throws IOException {
            return AbstractC8244j.m3796b(m3792C());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: t */
        public final long mo3771t() throws IOException {
            return AbstractC8244j.m3795c(m3791D());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: u */
        public final String mo3770u() throws IOException {
            int m3792C = m3792C();
            if (m3792C > 0) {
                int i = this.f16027e;
                int i2 = this.f16029g;
                if (m3792C <= i - i2) {
                    String str = new String(this.f16026d, i2, m3792C, C8196a0.f15949a);
                    this.f16029g += m3792C;
                    return str;
                }
            }
            if (m3792C == 0) {
                return "";
            }
            if (m3792C < 0) {
                throw C8202b0.m3927d();
            }
            throw C8202b0.m3925f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: v */
        public final String mo3769v() throws IOException {
            int m3792C = m3792C();
            if (m3792C > 0) {
                int i = this.f16027e;
                int i2 = this.f16029g;
                if (m3792C <= i - i2) {
                    String mo3561a = C8280q1.f16077a.mo3561a(i2, this.f16026d, m3792C);
                    this.f16029g += m3792C;
                    return mo3561a;
                }
            }
            if (m3792C == 0) {
                return "";
            }
            if (m3792C <= 0) {
                throw C8202b0.m3927d();
            }
            throw C8202b0.m3925f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: w */
        public final int mo3768w() throws IOException {
            if (mo3786e()) {
                this.f16031i = 0;
                return 0;
            }
            int m3792C = m3792C();
            this.f16031i = m3792C;
            if ((m3792C >>> 3) != 0) {
                return m3792C;
            }
            throw new C8202b0("Protocol message contained an invalid tag (zero).");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: x */
        public final int mo3767x() throws IOException {
            return m3792C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: y */
        public final long mo3766y() throws IOException {
            return m3791D();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8244j
        /* renamed from: z */
        public final boolean mo3765z(int i) throws IOException {
            int i2;
            int mo3768w;
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
                                m3789F(4);
                                return true;
                            }
                            int i5 = C8202b0.f15951a;
                            throw new C8202b0.C8203a();
                        }
                        do {
                            mo3768w = mo3768w();
                            if (mo3768w == 0) {
                                break;
                            }
                        } while (mo3765z(mo3768w));
                        mo3788a(((i >>> 3) << 3) | 4);
                        return true;
                    }
                    i2 = m3792C();
                } else {
                    i2 = 8;
                }
                m3789F(i2);
                return true;
            }
            int i6 = this.f16027e - this.f16029g;
            byte[] bArr = this.f16026d;
            if (i6 >= 10) {
                while (i4 < 10) {
                    int i7 = this.f16029g;
                    this.f16029g = i7 + 1;
                    if (bArr[i7] < 0) {
                        i4++;
                    }
                }
                throw C8202b0.m3928c();
            }
            while (i4 < 10) {
                int i8 = this.f16029g;
                if (i8 != this.f16027e) {
                    this.f16029g = i8 + 1;
                    if (bArr[i8] < 0) {
                        i4++;
                    }
                } else {
                    throw C8202b0.m3925f();
                }
            }
            throw C8202b0.m3928c();
            return true;
        }
    }

    /* renamed from: b */
    public static int m3796b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m3795c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    public abstract void mo3788a(int i) throws C8202b0;

    /* renamed from: d */
    public abstract int mo3787d();

    /* renamed from: e */
    public abstract boolean mo3786e() throws IOException;

    /* renamed from: f */
    public abstract void mo3785f(int i);

    /* renamed from: g */
    public abstract int mo3784g(int i) throws C8202b0;

    /* renamed from: h */
    public abstract boolean mo3783h() throws IOException;

    /* renamed from: i */
    public abstract AbstractC8228i.C8234f mo3782i() throws IOException;

    /* renamed from: j */
    public abstract double mo3781j() throws IOException;

    /* renamed from: k */
    public abstract int mo3780k() throws IOException;

    /* renamed from: l */
    public abstract int mo3779l() throws IOException;

    /* renamed from: m */
    public abstract long mo3778m() throws IOException;

    /* renamed from: n */
    public abstract float mo3777n() throws IOException;

    /* renamed from: o */
    public abstract int mo3776o() throws IOException;

    /* renamed from: p */
    public abstract long mo3775p() throws IOException;

    /* renamed from: q */
    public abstract int mo3774q() throws IOException;

    /* renamed from: r */
    public abstract long mo3773r() throws IOException;

    /* renamed from: s */
    public abstract int mo3772s() throws IOException;

    /* renamed from: t */
    public abstract long mo3771t() throws IOException;

    /* renamed from: u */
    public abstract String mo3770u() throws IOException;

    /* renamed from: v */
    public abstract String mo3769v() throws IOException;

    /* renamed from: w */
    public abstract int mo3768w() throws IOException;

    /* renamed from: x */
    public abstract int mo3767x() throws IOException;

    /* renamed from: y */
    public abstract long mo3766y() throws IOException;

    /* renamed from: z */
    public abstract boolean mo3765z(int i) throws IOException;
}
