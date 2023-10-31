package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0501c;
import androidx.constraintlayout.core.C0504e;
import androidx.constraintlayout.core.C0512j;
import androidx.constraintlayout.core.widgets.C0537d;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.i */
/* loaded from: classes.dex */
public final class C0544i extends C0540f {

    /* renamed from: s0 */
    public float f1849s0 = -1.0f;

    /* renamed from: t0 */
    public int f1850t0 = -1;

    /* renamed from: u0 */
    public int f1851u0 = -1;

    /* renamed from: v0 */
    public C0537d f1852v0 = this.f1726L;

    /* renamed from: w0 */
    public int f1853w0 = 0;

    /* renamed from: x0 */
    public boolean f1854x0;

    public C0544i() {
        this.f1734T.clear();
        this.f1734T.add(this.f1852v0);
        int length = this.f1733S.length;
        for (int i = 0; i < length; i++) {
            this.f1733S[i] = this.f1852v0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: A */
    public final boolean mo12215A() {
        return this.f1854x0;
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: B */
    public final boolean mo12214B() {
        return this.f1854x0;
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: P */
    public final void mo12213P(C0504e c0504e, boolean z) {
        if (this.f1737W == null) {
            return;
        }
        C0537d c0537d = this.f1852v0;
        c0504e.getClass();
        int m12351o = C0504e.m12351o(c0537d);
        if (this.f1853w0 == 1) {
            this.f1744b0 = m12351o;
            this.f1746c0 = 0;
            m12255K(this.f1737W.m12244l());
            m12252N(0);
            return;
        }
        this.f1744b0 = 0;
        this.f1746c0 = m12351o;
        m12252N(this.f1737W.m12240q());
        m12255K(0);
    }

    /* renamed from: Q */
    public final void m12212Q(int i) {
        if (this.f1853w0 == i) {
            return;
        }
        this.f1853w0 = i;
        ArrayList<C0537d> arrayList = this.f1734T;
        arrayList.clear();
        this.f1852v0 = this.f1853w0 == 1 ? this.f1725K : this.f1726L;
        arrayList.add(this.f1852v0);
        C0537d[] c0537dArr = this.f1733S;
        int length = c0537dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0537dArr[i2] = this.f1852v0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: c */
    public final void mo12211c(C0504e c0504e, boolean z) {
        boolean z2;
        C0541g c0541g = (C0541g) this.f1737W;
        if (c0541g == null) {
            return;
        }
        Object mo12209j = c0541g.mo12209j(C0537d.EnumC0538a.LEFT);
        Object mo12209j2 = c0541g.mo12209j(C0537d.EnumC0538a.RIGHT);
        C0540f c0540f = this.f1737W;
        boolean z3 = true;
        if (c0540f != null && c0540f.f1736V[0] == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f1853w0 == 0) {
            mo12209j = c0541g.mo12209j(C0537d.EnumC0538a.TOP);
            mo12209j2 = c0541g.mo12209j(C0537d.EnumC0538a.BOTTOM);
            C0540f c0540f2 = this.f1737W;
            if (c0540f2 == null || c0540f2.f1736V[1] != 2) {
                z3 = false;
            }
            z2 = z3;
        }
        if (this.f1854x0) {
            C0537d c0537d = this.f1852v0;
            if (c0537d.f1699c) {
                C0512j m12354l = c0504e.m12354l(c0537d);
                c0504e.m12362d(m12354l, this.f1852v0.m12274d());
                if (this.f1850t0 != -1) {
                    if (z2) {
                        c0504e.m12360f(c0504e.m12354l(mo12209j2), m12354l, 0, 5);
                    }
                } else if (this.f1851u0 != -1 && z2) {
                    C0512j m12354l2 = c0504e.m12354l(mo12209j2);
                    c0504e.m12360f(m12354l, c0504e.m12354l(mo12209j), 0, 5);
                    c0504e.m12360f(m12354l2, m12354l, 0, 5);
                }
                this.f1854x0 = false;
                return;
            }
        }
        if (this.f1850t0 != -1) {
            C0512j m12354l3 = c0504e.m12354l(this.f1852v0);
            c0504e.m12361e(m12354l3, c0504e.m12354l(mo12209j), this.f1850t0, 8);
            if (z2) {
                c0504e.m12360f(c0504e.m12354l(mo12209j2), m12354l3, 0, 5);
            }
        } else if (this.f1851u0 != -1) {
            C0512j m12354l4 = c0504e.m12354l(this.f1852v0);
            C0512j m12354l5 = c0504e.m12354l(mo12209j2);
            c0504e.m12361e(m12354l4, m12354l5, -this.f1851u0, 8);
            if (z2) {
                c0504e.m12360f(m12354l4, c0504e.m12354l(mo12209j), 0, 5);
                c0504e.m12360f(m12354l5, m12354l4, 0, 5);
            }
        } else if (this.f1849s0 != -1.0f) {
            C0512j m12354l6 = c0504e.m12354l(this.f1852v0);
            C0512j m12354l7 = c0504e.m12354l(mo12209j2);
            float f = this.f1849s0;
            C0501c m12353m = c0504e.m12353m();
            m12353m.f1571d.mo12373d(m12354l6, -1.0f);
            m12353m.f1571d.mo12373d(m12354l7, f);
            c0504e.m12363c(m12353m);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: d */
    public final boolean mo12210d() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: j */
    public final C0537d mo12209j(C0537d.EnumC0538a enumC0538a) {
        int ordinal = enumC0538a.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f1853w0 == 0) {
                return this.f1852v0;
            }
            return null;
        }
        if (this.f1853w0 == 1) {
            return this.f1852v0;
        }
        return null;
    }
}
