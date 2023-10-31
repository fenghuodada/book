package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0537d;
import androidx.constraintlayout.core.widgets.C0540f;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.q */
/* loaded from: classes.dex */
public abstract class AbstractC0534q implements InterfaceC0520d {

    /* renamed from: a */
    public int f1668a;

    /* renamed from: b */
    public C0540f f1669b;

    /* renamed from: c */
    public C0530n f1670c;

    /* renamed from: d */
    public int f1671d;

    /* renamed from: e */
    public final C0524h f1672e = new C0524h(this);

    /* renamed from: f */
    public int f1673f = 0;

    /* renamed from: g */
    public boolean f1674g = false;

    /* renamed from: h */
    public final C0523g f1675h = new C0523g(this);

    /* renamed from: i */
    public final C0523g f1676i = new C0523g(this);

    /* renamed from: j */
    public int f1677j = 1;

    public AbstractC0534q(C0540f c0540f) {
        this.f1669b = c0540f;
    }

    /* renamed from: b */
    public static void m12291b(C0523g c0523g, C0523g c0523g2, int i) {
        c0523g.f1654l.add(c0523g2);
        c0523g.f1648f = i;
        c0523g2.f1653k.add(c0523g);
    }

    /* renamed from: h */
    public static C0523g m12285h(C0537d c0537d) {
        AbstractC0534q abstractC0534q;
        AbstractC0534q abstractC0534q2;
        C0537d c0537d2 = c0537d.f1702f;
        if (c0537d2 == null) {
            return null;
        }
        int ordinal = c0537d2.f1701e.ordinal();
        C0540f c0540f = c0537d2.f1700d;
        if (ordinal == 1) {
            abstractC0534q = c0540f.f1747d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                abstractC0534q2 = c0540f.f1747d;
            } else if (ordinal != 4) {
                if (ordinal != 5) {
                    return null;
                }
                return c0540f.f1749e.f1660k;
            } else {
                abstractC0534q2 = c0540f.f1749e;
            }
            return abstractC0534q2.f1676i;
        } else {
            abstractC0534q = c0540f.f1749e;
        }
        return abstractC0534q.f1675h;
    }

    /* renamed from: i */
    public static C0523g m12284i(C0537d c0537d, int i) {
        C0537d c0537d2 = c0537d.f1702f;
        if (c0537d2 == null) {
            return null;
        }
        C0540f c0540f = c0537d2.f1700d;
        AbstractC0534q abstractC0534q = i == 0 ? c0540f.f1747d : c0540f.f1749e;
        int ordinal = c0537d2.f1701e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return abstractC0534q.f1675h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return abstractC0534q.f1676i;
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC0520d
    /* renamed from: a */
    public void mo12292a(InterfaceC0520d interfaceC0520d) {
    }

    /* renamed from: c */
    public final void m12290c(C0523g c0523g, C0523g c0523g2, int i, C0524h c0524h) {
        c0523g.f1654l.add(c0523g2);
        c0523g.f1654l.add(this.f1672e);
        c0523g.f1650h = i;
        c0523g.f1651i = c0524h;
        c0523g2.f1653k.add(c0523g);
        c0524h.f1653k.add(c0523g);
    }

    /* renamed from: d */
    public abstract void mo12289d();

    /* renamed from: e */
    public abstract void mo12288e();

    /* renamed from: f */
    public abstract void mo12287f();

    /* renamed from: g */
    public final int m12286g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0540f c0540f = this.f1669b;
            int i3 = c0540f.f1781w;
            max = Math.max(c0540f.f1780v, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0540f c0540f2 = this.f1669b;
            int i4 = c0540f2.f1784z;
            max = Math.max(c0540f2.f1783y, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* renamed from: j */
    public long mo12283j() {
        C0524h c0524h = this.f1672e;
        if (c0524h.f1652j) {
            return c0524h.f1649g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo12282k();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r9.f1668a == 3) goto L47;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12281l(androidx.constraintlayout.core.widgets.C0537d r12, androidx.constraintlayout.core.widgets.C0537d r13, int r14) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q.m12281l(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.widgets.d, int):void");
    }
}
