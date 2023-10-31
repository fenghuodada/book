package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0514a;
import androidx.constraintlayout.core.widgets.C0540f;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.l */
/* loaded from: classes.dex */
public final class C0528l extends AbstractC0534q {
    public C0528l(C0540f c0540f) {
        super(c0540f);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q, androidx.constraintlayout.core.widgets.analyzer.InterfaceC0520d
    /* renamed from: a */
    public final void mo12292a(InterfaceC0520d interfaceC0520d) {
        C0514a c0514a = (C0514a) this.f1669b;
        int i = c0514a.f1616u0;
        C0523g c0523g = this.f1675h;
        Iterator it = c0523g.f1654l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0523g) it.next()).f1649g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            c0523g.mo12312d(i2 + c0514a.f1618w0);
        } else {
            c0523g.mo12312d(i3 + c0514a.f1618w0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: d */
    public final void mo12289d() {
        AbstractC0534q abstractC0534q;
        C0540f c0540f = this.f1669b;
        if (c0540f instanceof C0514a) {
            C0523g c0523g = this.f1675h;
            c0523g.f1644b = true;
            C0514a c0514a = (C0514a) c0540f;
            int i = c0514a.f1616u0;
            boolean z = c0514a.f1617v0;
            ArrayList arrayList = c0523g.f1654l;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c0523g.f1647e = 7;
                            while (i2 < c0514a.f1856t0) {
                                C0540f c0540f2 = c0514a.f1855s0[i2];
                                if (z || c0540f2.f1760j0 != 8) {
                                    C0523g c0523g2 = c0540f2.f1749e.f1676i;
                                    c0523g2.f1653k.add(c0523g);
                                    arrayList.add(c0523g2);
                                }
                                i2++;
                            }
                        } else {
                            return;
                        }
                    } else {
                        c0523g.f1647e = 6;
                        while (i2 < c0514a.f1856t0) {
                            C0540f c0540f3 = c0514a.f1855s0[i2];
                            if (z || c0540f3.f1760j0 != 8) {
                                C0523g c0523g3 = c0540f3.f1749e.f1675h;
                                c0523g3.f1653k.add(c0523g);
                                arrayList.add(c0523g3);
                            }
                            i2++;
                        }
                    }
                    m12301m(this.f1669b.f1749e.f1675h);
                    abstractC0534q = this.f1669b.f1749e;
                    m12301m(abstractC0534q.f1676i);
                }
                c0523g.f1647e = 5;
                while (i2 < c0514a.f1856t0) {
                    C0540f c0540f4 = c0514a.f1855s0[i2];
                    if (z || c0540f4.f1760j0 != 8) {
                        C0523g c0523g4 = c0540f4.f1747d.f1676i;
                        c0523g4.f1653k.add(c0523g);
                        arrayList.add(c0523g4);
                    }
                    i2++;
                }
            } else {
                c0523g.f1647e = 4;
                while (i2 < c0514a.f1856t0) {
                    C0540f c0540f5 = c0514a.f1855s0[i2];
                    if (z || c0540f5.f1760j0 != 8) {
                        C0523g c0523g5 = c0540f5.f1747d.f1675h;
                        c0523g5.f1653k.add(c0523g);
                        arrayList.add(c0523g5);
                    }
                    i2++;
                }
            }
            m12301m(this.f1669b.f1747d.f1675h);
            abstractC0534q = this.f1669b.f1747d;
            m12301m(abstractC0534q.f1676i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: e */
    public final void mo12288e() {
        C0540f c0540f = this.f1669b;
        if (c0540f instanceof C0514a) {
            int i = ((C0514a) c0540f).f1616u0;
            C0523g c0523g = this.f1675h;
            if (i != 0 && i != 1) {
                c0540f.f1746c0 = c0523g.f1649g;
            } else {
                c0540f.f1744b0 = c0523g.f1649g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: f */
    public final void mo12287f() {
        this.f1670c = null;
        this.f1675h.m12313c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: k */
    public final boolean mo12282k() {
        return false;
    }

    /* renamed from: m */
    public final void m12301m(C0523g c0523g) {
        C0523g c0523g2 = this.f1675h;
        c0523g2.f1653k.add(c0523g);
        c0523g.f1654l.add(c0523g2);
    }
}
