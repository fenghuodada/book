package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0537d;
import androidx.constraintlayout.core.widgets.C0540f;
import androidx.constraintlayout.core.widgets.InterfaceC0545j;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.m */
/* loaded from: classes.dex */
public final class C0529m extends AbstractC0534q {

    /* renamed from: k */
    public static final int[] f1657k = new int[2];

    public C0529m(C0540f c0540f) {
        super(c0540f);
        this.f1675h.f1647e = 4;
        this.f1676i.f1647e = 5;
        this.f1673f = 0;
    }

    /* renamed from: m */
    public static void m12300m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x022a, code lost:
        if (r3 != 1) goto L125;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q, androidx.constraintlayout.core.widgets.analyzer.InterfaceC0520d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo12292a(androidx.constraintlayout.core.widgets.analyzer.InterfaceC0520d r24) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0529m.mo12292a(androidx.constraintlayout.core.widgets.analyzer.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: d */
    public final void mo12289d() {
        C0540f c0540f;
        C0540f c0540f2;
        int i;
        C0540f c0540f3;
        C0537d c0537d;
        ArrayList arrayList;
        C0540f c0540f4;
        int i2;
        C0540f c0540f5 = this.f1669b;
        boolean z = c0540f5.f1741a;
        C0524h c0524h = this.f1672e;
        if (z) {
            c0524h.mo12312d(c0540f5.m12240q());
        }
        boolean z2 = c0524h.f1652j;
        C0523g c0523g = this.f1676i;
        C0523g c0523g2 = this.f1675h;
        if (!z2) {
            C0540f c0540f6 = this.f1669b;
            int i3 = c0540f6.f1736V[0];
            this.f1671d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0540f4 = c0540f6.f1737W) != null && ((i2 = c0540f4.f1736V[0]) == 1 || i2 == 4)) {
                    int m12240q = (c0540f4.m12240q() - this.f1669b.f1725K.m12273e()) - this.f1669b.f1727M.m12273e();
                    AbstractC0534q.m12291b(c0523g2, c0540f4.f1747d.f1675h, this.f1669b.f1725K.m12273e());
                    AbstractC0534q.m12291b(c0523g, c0540f4.f1747d.f1676i, -this.f1669b.f1727M.m12273e());
                    c0524h.mo12312d(m12240q);
                    return;
                } else if (i3 == 1) {
                    c0524h.mo12312d(c0540f6.m12240q());
                }
            }
        } else if (this.f1671d == 4 && (c0540f2 = (c0540f = this.f1669b).f1737W) != null && ((i = c0540f2.f1736V[0]) == 1 || i == 4)) {
            AbstractC0534q.m12291b(c0523g2, c0540f2.f1747d.f1675h, c0540f.f1725K.m12273e());
            AbstractC0534q.m12291b(c0523g, c0540f2.f1747d.f1676i, -this.f1669b.f1727M.m12273e());
            return;
        }
        if (c0524h.f1652j) {
            C0540f c0540f7 = this.f1669b;
            if (c0540f7.f1741a) {
                C0537d[] c0537dArr = c0540f7.f1733S;
                C0537d c0537d2 = c0537dArr[0];
                C0537d c0537d3 = c0537d2.f1702f;
                if (c0537d3 != null && c0537dArr[1].f1702f != null) {
                    if (c0540f7.m12233x()) {
                        c0523g2.f1648f = this.f1669b.f1733S[0].m12273e();
                        c0537d = this.f1669b.f1733S[1];
                        c0523g.f1648f = -c0537d.m12273e();
                        return;
                    }
                    C0523g m12285h = AbstractC0534q.m12285h(this.f1669b.f1733S[0]);
                    if (m12285h != null) {
                        AbstractC0534q.m12291b(c0523g2, m12285h, this.f1669b.f1733S[0].m12273e());
                    }
                    C0523g m12285h2 = AbstractC0534q.m12285h(this.f1669b.f1733S[1]);
                    if (m12285h2 != null) {
                        AbstractC0534q.m12291b(c0523g, m12285h2, -this.f1669b.f1733S[1].m12273e());
                    }
                    c0523g2.f1644b = true;
                    c0523g.f1644b = true;
                    return;
                }
                if (c0537d3 != null) {
                    C0523g m12285h3 = AbstractC0534q.m12285h(c0537d2);
                    if (m12285h3 != null) {
                        AbstractC0534q.m12291b(c0523g2, m12285h3, this.f1669b.f1733S[0].m12273e());
                    } else {
                        return;
                    }
                } else {
                    C0537d c0537d4 = c0537dArr[1];
                    if (c0537d4.f1702f != null) {
                        C0523g m12285h4 = AbstractC0534q.m12285h(c0537d4);
                        if (m12285h4 != null) {
                            AbstractC0534q.m12291b(c0523g, m12285h4, -this.f1669b.f1733S[1].m12273e());
                            AbstractC0534q.m12291b(c0523g2, c0523g, -c0524h.f1649g);
                            return;
                        }
                        return;
                    } else if (!(c0540f7 instanceof InterfaceC0545j) && c0540f7.f1737W != null && c0540f7.mo12209j(C0537d.EnumC0538a.CENTER).f1702f == null) {
                        C0540f c0540f8 = this.f1669b;
                        AbstractC0534q.m12291b(c0523g2, c0540f8.f1737W.f1747d.f1675h, c0540f8.m12239r());
                    } else {
                        return;
                    }
                }
                AbstractC0534q.m12291b(c0523g, c0523g2, c0524h.f1649g);
                return;
            }
        }
        if (this.f1671d == 3) {
            C0540f c0540f9 = this.f1669b;
            int i4 = c0540f9.f1777s;
            ArrayList arrayList2 = c0524h.f1653k;
            ArrayList arrayList3 = c0524h.f1654l;
            if (i4 != 2) {
                if (i4 == 3) {
                    if (c0540f9.f1778t == 3) {
                        c0523g2.f1643a = this;
                        c0523g.f1643a = this;
                        C0531o c0531o = c0540f9.f1749e;
                        c0531o.f1675h.f1643a = this;
                        c0531o.f1676i.f1643a = this;
                        c0524h.f1643a = this;
                        if (c0540f9.m12232y()) {
                            arrayList3.add(this.f1669b.f1749e.f1672e);
                            this.f1669b.f1749e.f1672e.f1653k.add(c0524h);
                            C0531o c0531o2 = this.f1669b.f1749e;
                            c0531o2.f1672e.f1643a = this;
                            arrayList3.add(c0531o2.f1675h);
                            arrayList3.add(this.f1669b.f1749e.f1676i);
                            this.f1669b.f1749e.f1675h.f1653k.add(c0524h);
                            arrayList = this.f1669b.f1749e.f1676i.f1653k;
                        } else if (this.f1669b.m12233x()) {
                            this.f1669b.f1749e.f1672e.f1654l.add(c0524h);
                            arrayList2.add(this.f1669b.f1749e.f1672e);
                        } else {
                            arrayList = this.f1669b.f1749e.f1672e.f1654l;
                        }
                    } else {
                        C0524h c0524h2 = c0540f9.f1749e.f1672e;
                        arrayList3.add(c0524h2);
                        c0524h2.f1653k.add(c0524h);
                        this.f1669b.f1749e.f1675h.f1653k.add(c0524h);
                        this.f1669b.f1749e.f1676i.f1653k.add(c0524h);
                        c0524h.f1644b = true;
                        arrayList2.add(c0523g2);
                        arrayList2.add(c0523g);
                        c0523g2.f1654l.add(c0524h);
                        arrayList = c0523g.f1654l;
                    }
                    arrayList.add(c0524h);
                }
            } else {
                C0540f c0540f10 = c0540f9.f1737W;
                if (c0540f10 != null) {
                    C0524h c0524h3 = c0540f10.f1749e.f1672e;
                    arrayList3.add(c0524h3);
                    c0524h3.f1653k.add(c0524h);
                    c0524h.f1644b = true;
                    arrayList2.add(c0523g2);
                    arrayList2.add(c0523g);
                }
            }
        }
        C0540f c0540f11 = this.f1669b;
        C0537d[] c0537dArr2 = c0540f11.f1733S;
        C0537d c0537d5 = c0537dArr2[0];
        C0537d c0537d6 = c0537d5.f1702f;
        if (c0537d6 != null && c0537dArr2[1].f1702f != null) {
            if (c0540f11.m12233x()) {
                c0523g2.f1648f = this.f1669b.f1733S[0].m12273e();
                c0537d = this.f1669b.f1733S[1];
                c0523g.f1648f = -c0537d.m12273e();
                return;
            }
            C0523g m12285h5 = AbstractC0534q.m12285h(this.f1669b.f1733S[0]);
            C0523g m12285h6 = AbstractC0534q.m12285h(this.f1669b.f1733S[1]);
            if (m12285h5 != null) {
                m12285h5.m12314b(this);
            }
            if (m12285h6 != null) {
                m12285h6.m12314b(this);
            }
            this.f1677j = 4;
            return;
        }
        if (c0537d6 != null) {
            C0523g m12285h7 = AbstractC0534q.m12285h(c0537d5);
            if (m12285h7 != null) {
                AbstractC0534q.m12291b(c0523g2, m12285h7, this.f1669b.f1733S[0].m12273e());
            } else {
                return;
            }
        } else {
            C0537d c0537d7 = c0537dArr2[1];
            if (c0537d7.f1702f != null) {
                C0523g m12285h8 = AbstractC0534q.m12285h(c0537d7);
                if (m12285h8 != null) {
                    AbstractC0534q.m12291b(c0523g, m12285h8, -this.f1669b.f1733S[1].m12273e());
                    m12290c(c0523g2, c0523g, -1, c0524h);
                    return;
                }
                return;
            } else if (!(c0540f11 instanceof InterfaceC0545j) && (c0540f3 = c0540f11.f1737W) != null) {
                AbstractC0534q.m12291b(c0523g2, c0540f3.f1747d.f1675h, c0540f11.m12239r());
            } else {
                return;
            }
        }
        m12290c(c0523g, c0523g2, 1, c0524h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: e */
    public final void mo12288e() {
        C0523g c0523g = this.f1675h;
        if (c0523g.f1652j) {
            this.f1669b.f1744b0 = c0523g.f1649g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: f */
    public final void mo12287f() {
        this.f1670c = null;
        this.f1675h.m12313c();
        this.f1676i.m12313c();
        this.f1672e.m12313c();
        this.f1674g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: k */
    public final boolean mo12282k() {
        return this.f1671d != 3 || this.f1669b.f1777s == 0;
    }

    /* renamed from: n */
    public final void m12299n() {
        this.f1674g = false;
        C0523g c0523g = this.f1675h;
        c0523g.m12313c();
        c0523g.f1652j = false;
        C0523g c0523g2 = this.f1676i;
        c0523g2.m12313c();
        c0523g2.f1652j = false;
        this.f1672e.f1652j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f1669b.f1762k0;
    }
}
