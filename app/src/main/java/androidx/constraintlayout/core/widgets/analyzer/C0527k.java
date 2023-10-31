package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0540f;
import androidx.constraintlayout.core.widgets.C0544i;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.k */
/* loaded from: classes.dex */
public final class C0527k extends AbstractC0534q {
    public C0527k(C0540f c0540f) {
        super(c0540f);
        c0540f.f1747d.mo12287f();
        c0540f.f1749e.mo12287f();
        this.f1673f = ((C0544i) c0540f).f1853w0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q, androidx.constraintlayout.core.widgets.analyzer.InterfaceC0520d
    /* renamed from: a */
    public final void mo12292a(InterfaceC0520d interfaceC0520d) {
        C0523g c0523g = this.f1675h;
        if (!c0523g.f1645c || c0523g.f1652j) {
            return;
        }
        c0523g.mo12312d((int) ((((C0523g) c0523g.f1654l.get(0)).f1649g * ((C0544i) this.f1669b).f1849s0) + 0.5f));
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: d */
    public final void mo12289d() {
        AbstractC0534q abstractC0534q;
        C0540f c0540f = this.f1669b;
        C0544i c0544i = (C0544i) c0540f;
        int i = c0544i.f1850t0;
        int i2 = c0544i.f1851u0;
        int i3 = c0544i.f1853w0;
        C0523g c0523g = this.f1675h;
        if (i3 == 1) {
            if (i != -1) {
                c0523g.f1654l.add(c0540f.f1737W.f1747d.f1675h);
                this.f1669b.f1737W.f1747d.f1675h.f1653k.add(c0523g);
                c0523g.f1648f = i;
            } else if (i2 != -1) {
                c0523g.f1654l.add(c0540f.f1737W.f1747d.f1676i);
                this.f1669b.f1737W.f1747d.f1676i.f1653k.add(c0523g);
                c0523g.f1648f = -i2;
            } else {
                c0523g.f1644b = true;
                c0523g.f1654l.add(c0540f.f1737W.f1747d.f1676i);
                this.f1669b.f1737W.f1747d.f1676i.f1653k.add(c0523g);
            }
            m12302m(this.f1669b.f1747d.f1675h);
            abstractC0534q = this.f1669b.f1747d;
        } else {
            if (i != -1) {
                c0523g.f1654l.add(c0540f.f1737W.f1749e.f1675h);
                this.f1669b.f1737W.f1749e.f1675h.f1653k.add(c0523g);
                c0523g.f1648f = i;
            } else if (i2 != -1) {
                c0523g.f1654l.add(c0540f.f1737W.f1749e.f1676i);
                this.f1669b.f1737W.f1749e.f1676i.f1653k.add(c0523g);
                c0523g.f1648f = -i2;
            } else {
                c0523g.f1644b = true;
                c0523g.f1654l.add(c0540f.f1737W.f1749e.f1676i);
                this.f1669b.f1737W.f1749e.f1676i.f1653k.add(c0523g);
            }
            m12302m(this.f1669b.f1749e.f1675h);
            abstractC0534q = this.f1669b.f1749e;
        }
        m12302m(abstractC0534q.f1676i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: e */
    public final void mo12288e() {
        C0540f c0540f = this.f1669b;
        int i = ((C0544i) c0540f).f1853w0;
        C0523g c0523g = this.f1675h;
        if (i == 1) {
            c0540f.f1744b0 = c0523g.f1649g;
        } else {
            c0540f.f1746c0 = c0523g.f1649g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: f */
    public final void mo12287f() {
        this.f1675h.m12313c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q
    /* renamed from: k */
    public final boolean mo12282k() {
        return false;
    }

    /* renamed from: m */
    public final void m12302m(C0523g c0523g) {
        C0523g c0523g2 = this.f1675h;
        c0523g2.f1653k.add(c0523g);
        c0523g.f1654l.add(c0523g2);
    }
}
