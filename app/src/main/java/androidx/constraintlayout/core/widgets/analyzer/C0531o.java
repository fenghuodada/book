package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.C0511i;
import androidx.constraintlayout.core.widgets.C0540f;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.o */
/* loaded from: classes.dex */
public final class C0531o extends AbstractC0534q {

    /* renamed from: k */
    public final C0523g f1660k;

    /* renamed from: l */
    public C0515a f1661l;

    public C0531o(C0540f c0540f) {
        super(c0540f);
        C0523g c0523g = new C0523g(this);
        this.f1660k = c0523g;
        this.f1661l = null;
        this.f1675h.f1647e = 6;
        this.f1676i.f1647e = 7;
        c0523g.f1647e = 8;
        this.f1673f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q, androidx.constraintlayout.core.widgets.analyzer.InterfaceC0520d
    /* renamed from: a */
    public final void mo12292a(InterfaceC0520d interfaceC0520d) {
        C0524h c0524h;
        float f;
        int i;
        C0524h c0524h2;
        if (C0511i.m12337b(this.f1677j) != 3) {
            C0524h c0524h3 = this.f1672e;
            if (c0524h3.f1645c && !c0524h3.f1652j && this.f1671d == 3) {
                C0540f c0540f = this.f1669b;
                int i2 = c0540f.f1778t;
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (c0540f.f1747d.f1672e.f1652j) {
                            int i3 = c0540f.f1742a0;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                    }
                                } else {
                                    f = c0524h2.f1649g * c0540f.f1740Z;
                                    i = (int) (f + 0.5f);
                                }
                            }
                            f = c0524h2.f1649g / c0540f.f1740Z;
                            i = (int) (f + 0.5f);
                        }
                    }
                } else {
                    C0540f c0540f2 = c0540f.f1737W;
                    if (c0540f2 != null) {
                        if (c0540f2.f1749e.f1672e.f1652j) {
                            f = c0524h.f1649g * c0540f.f1715A;
                            i = (int) (f + 0.5f);
                        }
                    }
                }
                c0524h3.mo12312d(i);
            }
            C0523g c0523g = this.f1675h;
            if (c0523g.f1645c) {
                C0523g c0523g2 = this.f1676i;
                if (c0523g2.f1645c) {
                    if (c0523g.f1652j && c0523g2.f1652j && c0524h3.f1652j) {
                        return;
                    }
                    boolean z = c0524h3.f1652j;
                    ArrayList arrayList = c0523g.f1654l;
                    ArrayList arrayList2 = c0523g2.f1654l;
                    if (!z && this.f1671d == 3) {
                        C0540f c0540f3 = this.f1669b;
                        if (c0540f3.f1777s == 0 && !c0540f3.m12232y()) {
                            int i4 = ((C0523g) arrayList.get(0)).f1649g + c0523g.f1648f;
                            int i5 = ((C0523g) arrayList2.get(0)).f1649g + c0523g2.f1648f;
                            c0523g.mo12312d(i4);
                            c0523g2.mo12312d(i5);
                            c0524h3.mo12312d(i5 - i4);
                            return;
                        }
                    }
                    if (!c0524h3.f1652j && this.f1671d == 3 && this.f1668a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        int i6 = (((C0523g) arrayList2.get(0)).f1649g + c0523g2.f1648f) - (((C0523g) arrayList.get(0)).f1649g + c0523g.f1648f);
                        int i7 = c0524h3.f1655m;
                        if (i6 < i7) {
                            c0524h3.mo12312d(i6);
                        } else {
                            c0524h3.mo12312d(i7);
                        }
                    }
                    if (c0524h3.f1652j && arrayList.size() > 0 && arrayList2.size() > 0) {
                        C0523g c0523g3 = (C0523g) arrayList.get(0);
                        C0523g c0523g4 = (C0523g) arrayList2.get(0);
                        int i8 = c0523g3.f1649g;
                        int i9 = c0523g.f1648f + i8;
                        int i10 = c0523g4.f1649g;
                        int i11 = c0523g2.f1648f + i10;
                        float f2 = this.f1669b.f1756h0;
                        if (c0523g3 == c0523g4) {
                            f2 = 0.5f;
                        } else {
                            i8 = i9;
                            i10 = i11;
                        }
                        c0523g.mo12312d((int) ((((i10 - i8) - c0524h3.f1649g) * f2) + i8 + 0.5f));
                        c0523g2.mo12312d(c0523g.f1649g + c0524h3.f1649g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C0540f c0540f4 = this.f1669b;
        m12281l(c0540f4.f1726L, c0540f4.f1728N, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x025b, code lost:
        if (r15.f1669b.f1720F != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0292, code lost:
        if (r0.f1671d == 3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b8, code lost:
        if (r15.f1669b.f1720F != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ba, code lost:
        m12290c(r7, r3, 1, r15.f1661l);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0309, code lost:
        if (r0.f1671d == 3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030b, code lost:
        r0.f1672e.f1653k.add(r2);
        r10.add(r15.f1669b.f1747d.f1672e);
        r2.f1643a = r15;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo12289d() {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0531o.mo12289d():void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: e */
    public final void mo12288e() {
        C0523g c0523g = this.f1675h;
        if (c0523g.f1652j) {
            this.f1669b.f1746c0 = c0523g.f1649g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: f */
    public final void mo12287f() {
        this.f1670c = null;
        this.f1675h.m12313c();
        this.f1676i.m12313c();
        this.f1660k.m12313c();
        this.f1672e.m12313c();
        this.f1674g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: k */
    public final boolean mo12282k() {
        return this.f1671d != 3 || this.f1669b.f1778t == 0;
    }

    /* renamed from: m */
    public final void m12296m() {
        this.f1674g = false;
        C0523g c0523g = this.f1675h;
        c0523g.m12313c();
        c0523g.f1652j = false;
        C0523g c0523g2 = this.f1676i;
        c0523g2.m12313c();
        c0523g2.f1652j = false;
        C0523g c0523g3 = this.f1660k;
        c0523g3.m12313c();
        c0523g3.f1652j = false;
        this.f1672e.f1652j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f1669b.f1762k0;
    }
}
