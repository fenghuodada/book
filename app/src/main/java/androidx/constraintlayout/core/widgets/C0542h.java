package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0504e;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.h */
/* loaded from: classes.dex */
public final class C0542h extends C0548m {

    /* renamed from: c1 */
    public C0540f[] f1829c1;

    /* renamed from: F0 */
    public int f1806F0 = -1;

    /* renamed from: G0 */
    public int f1807G0 = -1;

    /* renamed from: H0 */
    public int f1808H0 = -1;

    /* renamed from: I0 */
    public int f1809I0 = -1;

    /* renamed from: J0 */
    public int f1810J0 = -1;

    /* renamed from: K0 */
    public int f1811K0 = -1;

    /* renamed from: L0 */
    public float f1812L0 = 0.5f;

    /* renamed from: M0 */
    public float f1813M0 = 0.5f;

    /* renamed from: N0 */
    public float f1814N0 = 0.5f;

    /* renamed from: O0 */
    public float f1815O0 = 0.5f;

    /* renamed from: P0 */
    public float f1816P0 = 0.5f;

    /* renamed from: Q0 */
    public float f1817Q0 = 0.5f;

    /* renamed from: R0 */
    public int f1818R0 = 0;

    /* renamed from: S0 */
    public int f1819S0 = 0;

    /* renamed from: T0 */
    public int f1820T0 = 2;

    /* renamed from: U0 */
    public int f1821U0 = 2;

    /* renamed from: V0 */
    public int f1822V0 = 0;

    /* renamed from: W0 */
    public int f1823W0 = -1;

    /* renamed from: X0 */
    public int f1824X0 = 0;

    /* renamed from: Y0 */
    public final ArrayList<C0543a> f1825Y0 = new ArrayList<>();

    /* renamed from: Z0 */
    public C0540f[] f1826Z0 = null;

    /* renamed from: a1 */
    public C0540f[] f1827a1 = null;

    /* renamed from: b1 */
    public int[] f1828b1 = null;

    /* renamed from: d1 */
    public int f1830d1 = 0;

    /* renamed from: androidx.constraintlayout.core.widgets.h$a */
    /* loaded from: classes.dex */
    public class C0543a {

        /* renamed from: a */
        public int f1831a;

        /* renamed from: d */
        public C0537d f1834d;

        /* renamed from: e */
        public C0537d f1835e;

        /* renamed from: f */
        public C0537d f1836f;

        /* renamed from: g */
        public C0537d f1837g;

        /* renamed from: h */
        public int f1838h;

        /* renamed from: i */
        public int f1839i;

        /* renamed from: j */
        public int f1840j;

        /* renamed from: k */
        public int f1841k;

        /* renamed from: q */
        public int f1847q;

        /* renamed from: b */
        public C0540f f1832b = null;

        /* renamed from: c */
        public int f1833c = 0;

        /* renamed from: l */
        public int f1842l = 0;

        /* renamed from: m */
        public int f1843m = 0;

        /* renamed from: n */
        public int f1844n = 0;

        /* renamed from: o */
        public int f1845o = 0;

        /* renamed from: p */
        public int f1846p = 0;

        public C0543a(int i, C0537d c0537d, C0537d c0537d2, C0537d c0537d3, C0537d c0537d4, int i2) {
            this.f1838h = 0;
            this.f1839i = 0;
            this.f1840j = 0;
            this.f1841k = 0;
            this.f1847q = 0;
            this.f1831a = i;
            this.f1834d = c0537d;
            this.f1835e = c0537d2;
            this.f1836f = c0537d3;
            this.f1837g = c0537d4;
            this.f1838h = C0542h.this.f1868y0;
            this.f1839i = C0542h.this.f1864u0;
            this.f1840j = C0542h.this.f1869z0;
            this.f1841k = C0542h.this.f1865v0;
            this.f1847q = i2;
        }

        /* renamed from: a */
        public final void m12221a(C0540f c0540f) {
            int i = this.f1831a;
            int i2 = 0;
            C0542h c0542h = C0542h.this;
            if (i == 0) {
                int m12222U = c0542h.m12222U(this.f1847q, c0540f);
                if (c0540f.f1736V[0] == 3) {
                    this.f1846p++;
                    m12222U = 0;
                }
                int i3 = c0542h.f1818R0;
                if (c0540f.f1760j0 != 8) {
                    i2 = i3;
                }
                this.f1842l = m12222U + i2 + this.f1842l;
                int m12223T = c0542h.m12223T(this.f1847q, c0540f);
                if (this.f1832b == null || this.f1833c < m12223T) {
                    this.f1832b = c0540f;
                    this.f1833c = m12223T;
                    this.f1843m = m12223T;
                }
            } else {
                int m12222U2 = c0542h.m12222U(this.f1847q, c0540f);
                int m12223T2 = c0542h.m12223T(this.f1847q, c0540f);
                if (c0540f.f1736V[1] == 3) {
                    this.f1846p++;
                    m12223T2 = 0;
                }
                int i4 = c0542h.f1819S0;
                if (c0540f.f1760j0 != 8) {
                    i2 = i4;
                }
                this.f1843m = m12223T2 + i2 + this.f1843m;
                if (this.f1832b == null || this.f1833c < m12222U2) {
                    this.f1832b = c0540f;
                    this.f1833c = m12222U2;
                    this.f1842l = m12222U2;
                }
            }
            this.f1845o++;
        }

        /* renamed from: b */
        public final void m12220b(int i, boolean z, boolean z2) {
            C0542h c0542h;
            boolean z3;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            C0540f c0540f;
            int i7;
            int i8;
            char c;
            int i9;
            int i10;
            float f;
            float f2;
            int i11;
            float f3;
            float f4;
            int i12;
            int i13;
            int i14;
            int i15 = this.f1845o;
            int i16 = 0;
            while (true) {
                c0542h = C0542h.this;
                if (i16 >= i15 || (i14 = this.f1844n + i16) >= c0542h.f1830d1) {
                    break;
                }
                C0540f c0540f2 = c0542h.f1829c1[i14];
                if (c0540f2 != null) {
                    c0540f2.m12261D();
                }
                i16++;
            }
            if (i15 != 0 && this.f1832b != null) {
                if (z2 && i == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i17 = -1;
                int i18 = -1;
                for (int i19 = 0; i19 < i15; i19++) {
                    if (z) {
                        i13 = (i15 - 1) - i19;
                    } else {
                        i13 = i19;
                    }
                    int i20 = this.f1844n + i13;
                    if (i20 >= c0542h.f1830d1) {
                        break;
                    }
                    C0540f c0540f3 = c0542h.f1829c1[i20];
                    if (c0540f3 != null && c0540f3.f1760j0 == 0) {
                        if (i17 == -1) {
                            i17 = i19;
                        }
                        i18 = i19;
                    }
                }
                if (this.f1831a == 0) {
                    C0540f c0540f4 = this.f1832b;
                    c0540f4.f1766m0 = c0542h.f1807G0;
                    int i21 = this.f1839i;
                    if (i > 0) {
                        i21 += c0542h.f1819S0;
                    }
                    C0537d c0537d = this.f1835e;
                    C0537d c0537d2 = c0540f4.f1726L;
                    c0537d2.m12277a(c0537d, i21);
                    C0537d c0537d3 = c0540f4.f1728N;
                    if (z2) {
                        c0537d3.m12277a(this.f1837g, this.f1841k);
                    }
                    if (i > 0) {
                        this.f1835e.f1700d.f1728N.m12277a(c0537d2, 0);
                    }
                    if (c0542h.f1821U0 == 3 && !c0540f4.f1720F) {
                        for (int i22 = 0; i22 < i15; i22++) {
                            if (z) {
                                i12 = (i15 - 1) - i22;
                            } else {
                                i12 = i22;
                            }
                            int i23 = this.f1844n + i12;
                            if (i23 >= c0542h.f1830d1) {
                                break;
                            }
                            c0540f = c0542h.f1829c1[i23];
                            if (c0540f.f1720F) {
                                break;
                            }
                        }
                    }
                    c0540f = c0540f4;
                    int i24 = 0;
                    C0540f c0540f5 = null;
                    while (i24 < i15) {
                        if (z) {
                            i7 = (i15 - 1) - i24;
                        } else {
                            i7 = i24;
                        }
                        int i25 = this.f1844n + i7;
                        if (i25 < c0542h.f1830d1) {
                            C0540f c0540f6 = c0542h.f1829c1[i25];
                            if (c0540f6 == null) {
                                i8 = i15;
                                c = 3;
                            } else {
                                C0537d c0537d4 = c0540f6.f1725K;
                                if (i24 == 0) {
                                    c0540f6.m12248g(c0537d4, this.f1834d, this.f1838h);
                                }
                                if (i7 == 0) {
                                    int i26 = c0542h.f1806F0;
                                    if (z) {
                                        i10 = i26;
                                        f = 1.0f - c0542h.f1812L0;
                                    } else {
                                        i10 = i26;
                                        f = c0542h.f1812L0;
                                    }
                                    if (this.f1844n == 0) {
                                        int i27 = c0542h.f1808H0;
                                        f2 = f;
                                        if (i27 != -1) {
                                            if (z) {
                                                f4 = 1.0f - c0542h.f1814N0;
                                            } else {
                                                f4 = c0542h.f1814N0;
                                            }
                                            f3 = f4;
                                            i11 = i27;
                                            c0540f6.f1764l0 = i11;
                                            c0540f6.f1754g0 = f3;
                                        }
                                    } else {
                                        f2 = f;
                                    }
                                    if (z2 && (i11 = c0542h.f1810J0) != -1) {
                                        if (z) {
                                            f3 = 1.0f - c0542h.f1816P0;
                                        } else {
                                            f3 = c0542h.f1816P0;
                                        }
                                    } else {
                                        i11 = i10;
                                        f3 = f2;
                                    }
                                    c0540f6.f1764l0 = i11;
                                    c0540f6.f1754g0 = f3;
                                }
                                if (i24 == i15 - 1) {
                                    i8 = i15;
                                    c0540f6.m12248g(c0540f6.f1727M, this.f1836f, this.f1840j);
                                } else {
                                    i8 = i15;
                                }
                                if (c0540f5 != null) {
                                    int i28 = c0542h.f1818R0;
                                    C0537d c0537d5 = c0540f5.f1727M;
                                    c0537d4.m12277a(c0537d5, i28);
                                    if (i24 == i17) {
                                        int i29 = this.f1838h;
                                        if (c0537d4.m12270h()) {
                                            c0537d4.f1704h = i29;
                                        }
                                    }
                                    c0537d5.m12277a(c0537d4, 0);
                                    if (i24 == i18 + 1) {
                                        int i30 = this.f1840j;
                                        if (c0537d5.m12270h()) {
                                            c0537d5.f1704h = i30;
                                        }
                                    }
                                }
                                if (c0540f6 != c0540f4) {
                                    int i31 = c0542h.f1821U0;
                                    c = 3;
                                    if (i31 == 3 && c0540f.f1720F && c0540f6 != c0540f && c0540f6.f1720F) {
                                        c0540f6.f1729O.m12277a(c0540f.f1729O, 0);
                                    } else {
                                        C0537d c0537d6 = c0540f6.f1726L;
                                        if (i31 != 0) {
                                            C0537d c0537d7 = c0540f6.f1728N;
                                            if (i31 != 1) {
                                                if (z3) {
                                                    c0537d6.m12277a(this.f1835e, this.f1839i);
                                                    c0537d7.m12277a(this.f1837g, this.f1841k);
                                                } else {
                                                    i9 = 0;
                                                    c0537d6.m12277a(c0537d2, 0);
                                                }
                                            } else {
                                                i9 = 0;
                                            }
                                            c0537d7.m12277a(c0537d3, i9);
                                        } else {
                                            c0537d6.m12277a(c0537d2, 0);
                                        }
                                    }
                                } else {
                                    c = 3;
                                }
                                c0540f5 = c0540f6;
                            }
                            i24++;
                            i15 = i8;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                C0540f c0540f7 = this.f1832b;
                c0540f7.f1764l0 = c0542h.f1806F0;
                int i32 = this.f1838h;
                if (i > 0) {
                    i32 += c0542h.f1818R0;
                }
                C0537d c0537d8 = c0540f7.f1727M;
                C0537d c0537d9 = c0540f7.f1725K;
                if (z) {
                    c0537d8.m12277a(this.f1836f, i32);
                    if (z2) {
                        c0537d9.m12277a(this.f1834d, this.f1840j);
                    }
                    if (i > 0) {
                        this.f1836f.f1700d.f1725K.m12277a(c0537d8, 0);
                    }
                } else {
                    c0537d9.m12277a(this.f1834d, i32);
                    if (z2) {
                        c0537d8.m12277a(this.f1836f, this.f1840j);
                    }
                    if (i > 0) {
                        this.f1834d.f1700d.f1727M.m12277a(c0537d9, 0);
                    }
                }
                int i33 = 0;
                C0540f c0540f8 = null;
                while (i33 < i15) {
                    int i34 = this.f1844n + i33;
                    if (i34 < c0542h.f1830d1) {
                        C0540f c0540f9 = c0542h.f1829c1[i34];
                        if (c0540f9 == null) {
                            c0540f9 = c0540f8;
                        } else {
                            C0537d c0537d10 = c0540f9.f1726L;
                            if (i33 == 0) {
                                c0540f9.m12248g(c0537d10, this.f1835e, this.f1839i);
                                int i35 = c0542h.f1807G0;
                                float f5 = c0542h.f1813M0;
                                if (this.f1844n == 0) {
                                    i6 = c0542h.f1809I0;
                                    i4 = i35;
                                    i5 = -1;
                                    if (i6 != -1) {
                                        f5 = c0542h.f1815O0;
                                        c0540f9.f1766m0 = i6;
                                        c0540f9.f1756h0 = f5;
                                    }
                                } else {
                                    i4 = i35;
                                    i5 = -1;
                                }
                                if (z2 && (i6 = c0542h.f1811K0) != i5) {
                                    f5 = c0542h.f1817Q0;
                                } else {
                                    i6 = i4;
                                }
                                c0540f9.f1766m0 = i6;
                                c0540f9.f1756h0 = f5;
                            }
                            if (i33 == i15 - 1) {
                                c0540f9.m12248g(c0540f9.f1728N, this.f1837g, this.f1841k);
                            }
                            if (c0540f8 != null) {
                                int i36 = c0542h.f1819S0;
                                C0537d c0537d11 = c0540f8.f1728N;
                                c0537d10.m12277a(c0537d11, i36);
                                if (i33 == i17) {
                                    int i37 = this.f1839i;
                                    if (c0537d10.m12270h()) {
                                        c0537d10.f1704h = i37;
                                    }
                                }
                                c0537d11.m12277a(c0537d10, 0);
                                if (i33 == i18 + 1) {
                                    int i38 = this.f1841k;
                                    if (c0537d11.m12270h()) {
                                        c0537d11.f1704h = i38;
                                    }
                                }
                            }
                            if (c0540f9 != c0540f7) {
                                C0537d c0537d12 = c0540f9.f1727M;
                                C0537d c0537d13 = c0540f9.f1725K;
                                if (z) {
                                    int i39 = c0542h.f1820T0;
                                    if (i39 != 0) {
                                        if (i39 != 1) {
                                            if (i39 == 2) {
                                                i3 = 0;
                                                c0537d13.m12277a(c0537d9, 0);
                                            }
                                        } else {
                                            c0537d13.m12277a(c0537d9, 0);
                                            i33++;
                                            c0540f8 = c0540f9;
                                        }
                                    } else {
                                        i3 = 0;
                                    }
                                    c0537d12.m12277a(c0537d8, i3);
                                    i33++;
                                    c0540f8 = c0540f9;
                                } else {
                                    int i40 = c0542h.f1820T0;
                                    if (i40 != 0) {
                                        if (i40 != 1) {
                                            if (i40 == 2) {
                                                if (z3) {
                                                    c0537d13.m12277a(this.f1834d, this.f1838h);
                                                    c0537d12.m12277a(this.f1836f, this.f1840j);
                                                } else {
                                                    i2 = 0;
                                                    c0537d13.m12277a(c0537d9, 0);
                                                }
                                            }
                                        } else {
                                            i2 = 0;
                                        }
                                        c0537d12.m12277a(c0537d8, i2);
                                    } else {
                                        c0537d13.m12277a(c0537d9, 0);
                                    }
                                    i33++;
                                    c0540f8 = c0540f9;
                                }
                            }
                        }
                        i33++;
                        c0540f8 = c0540f9;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        public final int m12219c() {
            if (this.f1831a == 1) {
                return this.f1843m - C0542h.this.f1819S0;
            }
            return this.f1843m;
        }

        /* renamed from: d */
        public final int m12218d() {
            if (this.f1831a == 0) {
                return this.f1842l - C0542h.this.f1818R0;
            }
            return this.f1842l;
        }

        /* renamed from: e */
        public final void m12217e(int i) {
            C0542h c0542h;
            int i2;
            int i3;
            int i4;
            int i5;
            int m12240q;
            int i6 = this.f1846p;
            if (i6 == 0) {
                return;
            }
            int i7 = this.f1845o;
            int i8 = i / i6;
            int i9 = 0;
            while (true) {
                c0542h = C0542h.this;
                if (i9 >= i7 || (i2 = this.f1844n + i9) >= c0542h.f1830d1) {
                    break;
                }
                C0540f c0540f = c0542h.f1829c1[i2];
                if (this.f1831a == 0) {
                    if (c0540f != null) {
                        int[] iArr = c0540f.f1736V;
                        if (iArr[0] == 3 && c0540f.f1777s == 0) {
                            int i10 = iArr[1];
                            i4 = c0540f.m12244l();
                            i5 = i10;
                            i3 = 1;
                            m12240q = i8;
                            c0542h.m12200S(c0540f, i3, m12240q, i5, i4);
                        }
                    }
                    i9++;
                } else {
                    if (c0540f != null) {
                        int[] iArr2 = c0540f.f1736V;
                        if (iArr2[1] == 3 && c0540f.f1778t == 0) {
                            i3 = iArr2[0];
                            i4 = i8;
                            i5 = 1;
                            m12240q = c0540f.m12240q();
                            c0542h.m12200S(c0540f, i3, m12240q, i5, i4);
                        }
                    }
                    i9++;
                }
            }
            this.f1842l = 0;
            this.f1843m = 0;
            this.f1832b = null;
            this.f1833c = 0;
            int i11 = this.f1845o;
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = this.f1844n + i12;
                if (i13 < c0542h.f1830d1) {
                    C0540f c0540f2 = c0542h.f1829c1[i13];
                    if (this.f1831a == 0) {
                        int m12240q2 = c0540f2.m12240q();
                        int i14 = c0542h.f1818R0;
                        if (c0540f2.f1760j0 == 8) {
                            i14 = 0;
                        }
                        this.f1842l = m12240q2 + i14 + this.f1842l;
                        int m12223T = c0542h.m12223T(this.f1847q, c0540f2);
                        if (this.f1832b == null || this.f1833c < m12223T) {
                            this.f1832b = c0540f2;
                            this.f1833c = m12223T;
                            this.f1843m = m12223T;
                        }
                    } else {
                        int m12222U = c0542h.m12222U(this.f1847q, c0540f2);
                        int m12223T2 = c0542h.m12223T(this.f1847q, c0540f2);
                        int i15 = c0542h.f1819S0;
                        if (c0540f2.f1760j0 == 8) {
                            i15 = 0;
                        }
                        this.f1843m = m12223T2 + i15 + this.f1843m;
                        if (this.f1832b == null || this.f1833c < m12222U) {
                            this.f1832b = c0540f2;
                            this.f1833c = m12222U;
                            this.f1842l = m12222U;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: f */
        public final void m12216f(int i, C0537d c0537d, C0537d c0537d2, C0537d c0537d3, C0537d c0537d4, int i2, int i3, int i4, int i5, int i6) {
            this.f1831a = i;
            this.f1834d = c0537d;
            this.f1835e = c0537d2;
            this.f1836f = c0537d3;
            this.f1837g = c0537d4;
            this.f1838h = i2;
            this.f1839i = i3;
            this.f1840j = i4;
            this.f1841k = i5;
            this.f1847q = i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a4, code lost:
        if (r37.f1807G0 == (-1)) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00af, code lost:
        if (r37.f1807G0 == (-1)) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b1, code lost:
        r37.f1807G0 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x083c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:292:0x0501 -> B:293:0x0510). Please submit an issue!!! */
    @Override // androidx.constraintlayout.core.widgets.C0548m
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo12201R(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 2113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0542h.mo12201R(int, int, int, int):void");
    }

    /* renamed from: T */
    public final int m12223T(int i, C0540f c0540f) {
        if (c0540f == null) {
            return 0;
        }
        int[] iArr = c0540f.f1736V;
        if (iArr[1] == 3) {
            int i2 = c0540f.f1778t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0540f.f1715A * i);
                if (i3 != c0540f.m12244l()) {
                    c0540f.f1753g = true;
                    m12200S(c0540f, iArr[0], c0540f.m12240q(), 1, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return c0540f.m12244l();
            } else {
                if (i2 == 3) {
                    return (int) ((c0540f.m12240q() * c0540f.f1740Z) + 0.5f);
                }
            }
        }
        return c0540f.m12244l();
    }

    /* renamed from: U */
    public final int m12222U(int i, C0540f c0540f) {
        if (c0540f == null) {
            return 0;
        }
        int[] iArr = c0540f.f1736V;
        if (iArr[0] == 3) {
            int i2 = c0540f.f1777s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0540f.f1782x * i);
                if (i3 != c0540f.m12240q()) {
                    c0540f.f1753g = true;
                    m12200S(c0540f, 1, i3, iArr[1], c0540f.m12244l());
                }
                return i3;
            } else if (i2 == 1) {
                return c0540f.m12240q();
            } else {
                if (i2 == 3) {
                    return (int) ((c0540f.m12244l() * c0540f.f1740Z) + 0.5f);
                }
            }
        }
        return c0540f.m12240q();
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: c */
    public final void mo12211c(C0504e c0504e, boolean z) {
        boolean z2;
        boolean z3;
        C0540f c0540f;
        float f;
        int i;
        boolean z4;
        super.mo12211c(c0504e, z);
        C0540f c0540f2 = this.f1737W;
        if (c0540f2 != null && ((C0541g) c0540f2).f1803x0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.f1822V0;
        ArrayList<C0543a> arrayList = this.f1825Y0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            C0543a c0543a = arrayList.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            c0543a.m12220b(i3, z2, z4);
                        }
                    }
                } else if (this.f1828b1 != null && this.f1827a1 != null && this.f1826Z0 != null) {
                    for (int i4 = 0; i4 < this.f1830d1; i4++) {
                        this.f1829c1[i4].m12261D();
                    }
                    int[] iArr = this.f1828b1;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float f2 = this.f1812L0;
                    C0540f c0540f3 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.f1812L0;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        C0540f c0540f4 = this.f1827a1[i];
                        if (c0540f4 != null && c0540f4.f1760j0 != 8) {
                            C0537d c0537d = c0540f4.f1725K;
                            if (i7 == 0) {
                                c0540f4.m12248g(c0537d, this.f1725K, this.f1868y0);
                                c0540f4.f1764l0 = this.f1806F0;
                                c0540f4.f1754g0 = f;
                            }
                            if (i7 == i5 - 1) {
                                c0540f4.m12248g(c0540f4.f1727M, this.f1727M, this.f1869z0);
                            }
                            if (i7 > 0 && c0540f3 != null) {
                                int i8 = this.f1818R0;
                                C0537d c0537d2 = c0540f3.f1727M;
                                c0540f4.m12248g(c0537d, c0537d2, i8);
                                c0540f3.m12248g(c0537d2, c0537d, 0);
                            }
                            c0540f3 = c0540f4;
                        }
                        i7++;
                        f2 = f;
                    }
                    for (int i9 = 0; i9 < i6; i9++) {
                        C0540f c0540f5 = this.f1826Z0[i9];
                        if (c0540f5 != null && c0540f5.f1760j0 != 8) {
                            C0537d c0537d3 = c0540f5.f1726L;
                            if (i9 == 0) {
                                c0540f5.m12248g(c0537d3, this.f1726L, this.f1864u0);
                                c0540f5.f1766m0 = this.f1807G0;
                                c0540f5.f1756h0 = this.f1813M0;
                            }
                            if (i9 == i6 - 1) {
                                c0540f5.m12248g(c0540f5.f1728N, this.f1728N, this.f1865v0);
                            }
                            if (i9 > 0 && c0540f3 != null) {
                                int i10 = this.f1819S0;
                                C0537d c0537d4 = c0540f3.f1728N;
                                c0540f5.m12248g(c0537d3, c0537d4, i10);
                                c0540f3.m12248g(c0537d4, c0537d3, 0);
                            }
                            c0540f3 = c0540f5;
                        }
                    }
                    for (int i11 = 0; i11 < i5; i11++) {
                        for (int i12 = 0; i12 < i6; i12++) {
                            int i13 = (i12 * i5) + i11;
                            if (this.f1824X0 == 1) {
                                i13 = (i11 * i6) + i12;
                            }
                            C0540f[] c0540fArr = this.f1829c1;
                            if (i13 < c0540fArr.length && (c0540f = c0540fArr[i13]) != null && c0540f.f1760j0 != 8) {
                                C0540f c0540f6 = this.f1827a1[i11];
                                C0540f c0540f7 = this.f1826Z0[i12];
                                if (c0540f != c0540f6) {
                                    c0540f.m12248g(c0540f.f1725K, c0540f6.f1725K, 0);
                                    c0540f.m12248g(c0540f.f1727M, c0540f6.f1727M, 0);
                                }
                                if (c0540f != c0540f7) {
                                    c0540f.m12248g(c0540f.f1726L, c0540f7.f1726L, 0);
                                    c0540f.m12248g(c0540f.f1728N, c0540f7.f1728N, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    C0543a c0543a2 = arrayList.get(i14);
                    if (i14 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c0543a2.m12220b(i14, z2, z3);
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).m12220b(0, z2, true);
        }
        this.f1859A0 = false;
    }
}
