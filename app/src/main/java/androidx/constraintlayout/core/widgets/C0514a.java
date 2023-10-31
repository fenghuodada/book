package androidx.constraintlayout.core.widgets;

import androidx.activity.result.C0063d;
import androidx.concurrent.futures.C0484a;
import androidx.constraintlayout.core.C0499a;
import androidx.constraintlayout.core.C0501c;
import androidx.constraintlayout.core.C0504e;
import androidx.constraintlayout.core.C0512j;
import androidx.constraintlayout.core.widgets.C0537d;

/* renamed from: androidx.constraintlayout.core.widgets.a */
/* loaded from: classes.dex */
public final class C0514a extends C0546k {

    /* renamed from: u0 */
    public int f1616u0 = 0;

    /* renamed from: v0 */
    public boolean f1617v0 = true;

    /* renamed from: w0 */
    public int f1618w0 = 0;

    /* renamed from: x0 */
    public boolean f1619x0 = false;

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: A */
    public final boolean mo12215A() {
        return this.f1619x0;
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: B */
    public final boolean mo12214B() {
        return this.f1619x0;
    }

    /* renamed from: R */
    public final boolean m12330R() {
        int i;
        C0537d mo12209j;
        C0537d mo12209j2;
        C0537d mo12209j3;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f1856t0;
            if (i4 >= i) {
                break;
            }
            C0540f c0540f = this.f1855s0[i4];
            if ((this.f1617v0 || c0540f.mo12210d()) && ((((i2 = this.f1616u0) == 0 || i2 == 1) && !c0540f.mo12215A()) || (((i3 = this.f1616u0) == 2 || i3 == 3) && !c0540f.mo12214B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f1856t0; i6++) {
            C0540f c0540f2 = this.f1855s0[i6];
            if (this.f1617v0 || c0540f2.mo12210d()) {
                C0537d.EnumC0538a enumC0538a = C0537d.EnumC0538a.BOTTOM;
                C0537d.EnumC0538a enumC0538a2 = C0537d.EnumC0538a.TOP;
                C0537d.EnumC0538a enumC0538a3 = C0537d.EnumC0538a.RIGHT;
                C0537d.EnumC0538a enumC0538a4 = C0537d.EnumC0538a.LEFT;
                if (!z2) {
                    int i7 = this.f1616u0;
                    if (i7 == 0) {
                        mo12209j3 = c0540f2.mo12209j(enumC0538a4);
                    } else if (i7 == 1) {
                        mo12209j3 = c0540f2.mo12209j(enumC0538a3);
                    } else if (i7 == 2) {
                        mo12209j3 = c0540f2.mo12209j(enumC0538a2);
                    } else {
                        if (i7 == 3) {
                            mo12209j3 = c0540f2.mo12209j(enumC0538a);
                        }
                        z2 = true;
                    }
                    i5 = mo12209j3.m12274d();
                    z2 = true;
                }
                int i8 = this.f1616u0;
                if (i8 == 0) {
                    mo12209j2 = c0540f2.mo12209j(enumC0538a4);
                } else {
                    if (i8 == 1) {
                        mo12209j = c0540f2.mo12209j(enumC0538a3);
                    } else if (i8 == 2) {
                        mo12209j2 = c0540f2.mo12209j(enumC0538a2);
                    } else if (i8 == 3) {
                        mo12209j = c0540f2.mo12209j(enumC0538a);
                    }
                    i5 = Math.max(i5, mo12209j.m12274d());
                }
                i5 = Math.min(i5, mo12209j2.m12274d());
            }
        }
        int i9 = i5 + this.f1618w0;
        int i10 = this.f1616u0;
        if (i10 == 0 || i10 == 1) {
            m12257I(i9, i9);
        } else {
            m12256J(i9, i9);
        }
        this.f1619x0 = true;
        return true;
    }

    /* renamed from: S */
    public final int m12329S() {
        int i = this.f1616u0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: c */
    public final void mo12211c(C0504e c0504e, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        C0512j c0512j;
        C0537d c0537d;
        int i2;
        int i3;
        int i4;
        C0512j c0512j2;
        int i5;
        C0537d[] c0537dArr = this.f1733S;
        C0537d c0537d2 = this.f1725K;
        c0537dArr[0] = c0537d2;
        int i6 = 2;
        C0537d c0537d3 = this.f1726L;
        c0537dArr[2] = c0537d3;
        C0537d c0537d4 = this.f1727M;
        c0537dArr[1] = c0537d4;
        C0537d c0537d5 = this.f1728N;
        c0537dArr[3] = c0537d5;
        for (C0537d c0537d6 : c0537dArr) {
            c0537d6.f1705i = c0504e.m12354l(c0537d6);
        }
        int i7 = this.f1616u0;
        if (i7 >= 0 && i7 < 4) {
            C0537d c0537d7 = c0537dArr[i7];
            if (!this.f1619x0) {
                m12330R();
            }
            if (this.f1619x0) {
                this.f1619x0 = false;
                int i8 = this.f1616u0;
                if (i8 != 0 && i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        c0504e.m12362d(c0537d3.f1705i, this.f1746c0);
                        c0512j2 = c0537d5.f1705i;
                        i5 = this.f1746c0;
                    } else {
                        return;
                    }
                } else {
                    c0504e.m12362d(c0537d2.f1705i, this.f1744b0);
                    c0512j2 = c0537d4.f1705i;
                    i5 = this.f1744b0;
                }
                c0504e.m12362d(c0512j2, i5);
                return;
            }
            for (int i9 = 0; i9 < this.f1856t0; i9++) {
                C0540f c0540f = this.f1855s0[i9];
                if ((this.f1617v0 || c0540f.mo12210d()) && ((((i4 = this.f1616u0) == 0 || i4 == 1) && c0540f.f1736V[0] == 3 && c0540f.f1725K.f1702f != null && c0540f.f1727M.f1702f != null) || ((i4 == 2 || i4 == 3) && c0540f.f1736V[1] == 3 && c0540f.f1726L.f1702f != null && c0540f.f1728N.f1702f != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!c0537d2.m12271g() && !c0537d4.m12271g()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!c0537d3.m12271g() && !c0537d5.m12271g()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.f1616u0) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 4;
            } else {
                i = 5;
            }
            int i10 = 0;
            while (i10 < this.f1856t0) {
                C0540f c0540f2 = this.f1855s0[i10];
                if (this.f1617v0 || c0540f2.mo12210d()) {
                    C0512j m12354l = c0504e.m12354l(c0540f2.f1733S[this.f1616u0]);
                    int i11 = this.f1616u0;
                    C0537d c0537d8 = c0540f2.f1733S[i11];
                    c0537d8.f1705i = m12354l;
                    C0537d c0537d9 = c0537d8.f1702f;
                    if (c0537d9 != null && c0537d9.f1700d == this) {
                        i2 = c0537d8.f1703g + 0;
                    } else {
                        i2 = 0;
                    }
                    if (i11 != 0 && i11 != i6) {
                        C0501c m12353m = c0504e.m12353m();
                        C0512j m12352n = c0504e.m12352n();
                        m12352n.f1605d = 0;
                        m12353m.m12381c(c0537d7.f1705i, m12354l, m12352n, this.f1618w0 + i2);
                        c0504e.m12363c(m12353m);
                    } else {
                        C0501c m12353m2 = c0504e.m12353m();
                        C0512j m12352n2 = c0504e.m12352n();
                        m12352n2.f1605d = 0;
                        m12353m2.m12380d(c0537d7.f1705i, m12354l, m12352n2, this.f1618w0 - i2);
                        c0504e.m12363c(m12353m2);
                    }
                    c0504e.m12361e(c0537d7.f1705i, m12354l, this.f1618w0 + i2, i);
                }
                i10++;
                i6 = 2;
            }
            int i12 = this.f1616u0;
            if (i12 == 0) {
                c0504e.m12361e(c0537d4.f1705i, c0537d2.f1705i, 0, 8);
                c0504e.m12361e(c0537d2.f1705i, this.f1737W.f1727M.f1705i, 0, 4);
                c0512j = c0537d2.f1705i;
                c0537d = this.f1737W.f1725K;
            } else if (i12 == 1) {
                c0504e.m12361e(c0537d2.f1705i, c0537d4.f1705i, 0, 8);
                c0504e.m12361e(c0537d2.f1705i, this.f1737W.f1725K.f1705i, 0, 4);
                c0512j = c0537d2.f1705i;
                c0537d = this.f1737W.f1727M;
            } else if (i12 == 2) {
                c0504e.m12361e(c0537d5.f1705i, c0537d3.f1705i, 0, 8);
                c0504e.m12361e(c0537d3.f1705i, this.f1737W.f1728N.f1705i, 0, 4);
                c0512j = c0537d3.f1705i;
                c0537d = this.f1737W.f1726L;
            } else if (i12 == 3) {
                c0504e.m12361e(c0537d3.f1705i, c0537d5.f1705i, 0, 8);
                c0504e.m12361e(c0537d3.f1705i, this.f1737W.f1726L.f1705i, 0, 4);
                c0512j = c0537d3.f1705i;
                c0537d = this.f1737W.f1728N;
            } else {
                return;
            }
            c0504e.m12361e(c0512j, c0537d.f1705i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: d */
    public final boolean mo12210d() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    public final String toString() {
        String m12392a = C0484a.m12392a(new StringBuilder("[Barrier] "), this.f1762k0, " {");
        for (int i = 0; i < this.f1856t0; i++) {
            C0540f c0540f = this.f1855s0[i];
            if (i > 0) {
                m12392a = C0063d.m13053a(m12392a, ", ");
            }
            StringBuilder m12383b = C0499a.m12383b(m12392a);
            m12383b.append(c0540f.f1762k0);
            m12392a = m12383b.toString();
        }
        return C0063d.m13053a(m12392a, "}");
    }
}
