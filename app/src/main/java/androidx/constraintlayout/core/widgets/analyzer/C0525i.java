package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0537d;
import androidx.constraintlayout.core.widgets.C0540f;
import androidx.constraintlayout.core.widgets.C0541g;
import androidx.constraintlayout.core.widgets.C0544i;
import androidx.constraintlayout.core.widgets.analyzer.C0516b;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.i */
/* loaded from: classes.dex */
public final class C0525i {

    /* renamed from: a */
    public static final C0516b.C0517a f1656a = new C0516b.C0517a();

    /* renamed from: a */
    public static boolean m12311a(C0540f c0540f) {
        C0541g c0541g;
        boolean z;
        boolean z2;
        int[] iArr = c0540f.f1736V;
        int i = iArr[0];
        int i2 = iArr[1];
        C0540f c0540f2 = c0540f.f1737W;
        if (c0540f2 != null) {
            c0541g = (C0541g) c0540f2;
        } else {
            c0541g = null;
        }
        if (c0541g != null) {
            int i3 = c0541g.f1736V[0];
        }
        if (c0541g != null) {
            int i4 = c0541g.f1736V[1];
        }
        if (i != 1 && !c0540f.mo12215A() && i != 2 && ((i != 3 || c0540f.f1777s != 0 || c0540f.f1740Z != 0.0f || !c0540f.m12237t(0)) && (i != 3 || c0540f.f1777s != 1 || !c0540f.m12236u(0, c0540f.m12240q())))) {
            z = false;
        } else {
            z = true;
        }
        if (i2 != 1 && !c0540f.mo12214B() && i2 != 2 && ((i2 != 3 || c0540f.f1778t != 0 || c0540f.f1740Z != 0.0f || !c0540f.m12237t(1)) && (i2 != 3 || c0540f.f1778t != 1 || !c0540f.m12236u(1, c0540f.m12244l())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (c0540f.f1740Z > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m12310b(int i, C0540f c0540f, C0516b.InterfaceC0518b interfaceC0518b, boolean z) {
        boolean z2;
        C0537d c0537d;
        C0537d c0537d2;
        Iterator<C0537d> it;
        boolean z3;
        C0537d c0537d3;
        C0537d c0537d4;
        if (c0540f.f1767n) {
            return;
        }
        if (!(c0540f instanceof C0541g) && c0540f.m12231z() && m12311a(c0540f)) {
            C0541g.m12226U(c0540f, interfaceC0518b, new C0516b.C0517a());
        }
        C0537d mo12209j = c0540f.mo12209j(C0537d.EnumC0538a.LEFT);
        C0537d mo12209j2 = c0540f.mo12209j(C0537d.EnumC0538a.RIGHT);
        int m12274d = mo12209j.m12274d();
        int m12274d2 = mo12209j2.m12274d();
        HashSet<C0537d> hashSet = mo12209j.f1697a;
        if (hashSet != null && mo12209j.f1699c) {
            Iterator<C0537d> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C0537d next = it2.next();
                C0540f c0540f2 = next.f1700d;
                int i2 = i + 1;
                boolean m12311a = m12311a(c0540f2);
                if (c0540f2.m12231z() && m12311a) {
                    C0541g.m12226U(c0540f2, interfaceC0518b, new C0516b.C0517a());
                }
                C0537d c0537d5 = c0540f2.f1725K;
                C0537d c0537d6 = c0540f2.f1727M;
                if ((next == c0537d5 && (c0537d4 = c0537d6.f1702f) != null && c0537d4.f1699c) || (next == c0537d6 && (c0537d3 = c0537d5.f1702f) != null && c0537d3.f1699c)) {
                    it = it2;
                    z3 = true;
                } else {
                    it = it2;
                    z3 = false;
                }
                int i3 = c0540f2.f1736V[0];
                if (i3 == 3 && !m12311a) {
                    if (i3 == 3 && c0540f2.f1781w >= 0 && c0540f2.f1780v >= 0 && ((c0540f2.f1760j0 == 8 || (c0540f2.f1777s == 0 && c0540f2.f1740Z == 0.0f)) && !c0540f2.m12233x() && !c0540f2.f1722H && z3 && !c0540f2.m12233x())) {
                        m12308d(i2, c0540f, interfaceC0518b, c0540f2, z);
                    }
                } else if (!c0540f2.m12231z()) {
                    if (next == c0537d5 && c0537d6.f1702f == null) {
                        int m12273e = c0537d5.m12273e() + m12274d;
                        c0540f2.m12257I(m12273e, c0540f2.m12240q() + m12273e);
                    } else if (next == c0537d6 && c0537d5.f1702f == null) {
                        int m12273e2 = m12274d - c0537d6.m12273e();
                        c0540f2.m12257I(m12273e2 - c0540f2.m12240q(), m12273e2);
                    } else if (z3 && !c0540f2.m12233x()) {
                        m12309c(i2, c0540f2, interfaceC0518b, z);
                    }
                    m12310b(i2, c0540f2, interfaceC0518b, z);
                }
                it2 = it;
            }
        }
        if (c0540f instanceof C0544i) {
            return;
        }
        HashSet<C0537d> hashSet2 = mo12209j2.f1697a;
        if (hashSet2 != null && mo12209j2.f1699c) {
            Iterator<C0537d> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C0537d next2 = it3.next();
                C0540f c0540f3 = next2.f1700d;
                int i4 = i + 1;
                boolean m12311a2 = m12311a(c0540f3);
                if (c0540f3.m12231z() && m12311a2) {
                    C0541g.m12226U(c0540f3, interfaceC0518b, new C0516b.C0517a());
                }
                C0537d c0537d7 = c0540f3.f1725K;
                C0537d c0537d8 = c0540f3.f1727M;
                if ((next2 == c0537d7 && (c0537d2 = c0537d8.f1702f) != null && c0537d2.f1699c) || (next2 == c0537d8 && (c0537d = c0537d7.f1702f) != null && c0537d.f1699c)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i5 = c0540f3.f1736V[0];
                if (i5 == 3 && !m12311a2) {
                    if (i5 == 3 && c0540f3.f1781w >= 0 && c0540f3.f1780v >= 0) {
                        if (c0540f3.f1760j0 != 8) {
                            if (c0540f3.f1777s == 0) {
                                if (c0540f3.f1740Z == 0.0f) {
                                }
                            }
                        }
                        if (!c0540f3.m12233x() && !c0540f3.f1722H && z2 && !c0540f3.m12233x()) {
                            m12308d(i4, c0540f, interfaceC0518b, c0540f3, z);
                        }
                    }
                } else if (!c0540f3.m12231z()) {
                    if (next2 == c0537d7 && c0537d8.f1702f == null) {
                        int m12273e3 = c0537d7.m12273e() + m12274d2;
                        c0540f3.m12257I(m12273e3, c0540f3.m12240q() + m12273e3);
                    } else if (next2 == c0537d8 && c0537d7.f1702f == null) {
                        int m12273e4 = m12274d2 - c0537d8.m12273e();
                        c0540f3.m12257I(m12273e4 - c0540f3.m12240q(), m12273e4);
                    } else if (z2 && !c0540f3.m12233x()) {
                        m12309c(i4, c0540f3, interfaceC0518b, z);
                    }
                    m12310b(i4, c0540f3, interfaceC0518b, z);
                }
            }
        }
        c0540f.f1767n = true;
    }

    /* renamed from: c */
    public static void m12309c(int i, C0540f c0540f, C0516b.InterfaceC0518b interfaceC0518b, boolean z) {
        float f;
        float f2 = c0540f.f1754g0;
        C0537d c0537d = c0540f.f1725K;
        int m12274d = c0537d.f1702f.m12274d();
        C0537d c0537d2 = c0540f.f1727M;
        int m12274d2 = c0537d2.f1702f.m12274d();
        int m12273e = c0537d.m12273e() + m12274d;
        int m12273e2 = m12274d2 - c0537d2.m12273e();
        if (m12274d == m12274d2) {
            f2 = 0.5f;
        } else {
            m12274d = m12273e;
            m12274d2 = m12273e2;
        }
        int m12240q = c0540f.m12240q();
        int i2 = (m12274d2 - m12274d) - m12240q;
        if (m12274d > m12274d2) {
            i2 = (m12274d - m12274d2) - m12240q;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = ((int) f) + m12274d;
        int i4 = i3 + m12240q;
        if (m12274d > m12274d2) {
            i4 = i3 - m12240q;
        }
        c0540f.m12257I(i3, i4);
        m12310b(i + 1, c0540f, interfaceC0518b, z);
    }

    /* renamed from: d */
    public static void m12308d(int i, C0540f c0540f, C0516b.InterfaceC0518b interfaceC0518b, C0540f c0540f2, boolean z) {
        float f = c0540f2.f1754g0;
        C0537d c0537d = c0540f2.f1725K;
        int m12273e = c0537d.m12273e() + c0537d.f1702f.m12274d();
        C0537d c0537d2 = c0540f2.f1727M;
        int m12274d = c0537d2.f1702f.m12274d() - c0537d2.m12273e();
        if (m12274d >= m12273e) {
            int m12240q = c0540f2.m12240q();
            if (c0540f2.f1760j0 != 8) {
                int i2 = c0540f2.f1777s;
                if (i2 == 2) {
                    if (!(c0540f instanceof C0541g)) {
                        c0540f = c0540f.f1737W;
                    }
                    m12240q = (int) (c0540f2.f1754g0 * 0.5f * c0540f.m12240q());
                } else if (i2 == 0) {
                    m12240q = m12274d - m12273e;
                }
                m12240q = Math.max(c0540f2.f1780v, m12240q);
                int i3 = c0540f2.f1781w;
                if (i3 > 0) {
                    m12240q = Math.min(i3, m12240q);
                }
            }
            int i4 = m12273e + ((int) ((f * ((m12274d - m12273e) - m12240q)) + 0.5f));
            c0540f2.m12257I(i4, m12240q + i4);
            m12310b(i + 1, c0540f2, interfaceC0518b, z);
        }
    }

    /* renamed from: e */
    public static void m12307e(int i, C0540f c0540f, C0516b.InterfaceC0518b interfaceC0518b) {
        float f;
        float f2 = c0540f.f1756h0;
        C0537d c0537d = c0540f.f1726L;
        int m12274d = c0537d.f1702f.m12274d();
        C0537d c0537d2 = c0540f.f1728N;
        int m12274d2 = c0537d2.f1702f.m12274d();
        int m12273e = c0537d.m12273e() + m12274d;
        int m12273e2 = m12274d2 - c0537d2.m12273e();
        if (m12274d == m12274d2) {
            f2 = 0.5f;
        } else {
            m12274d = m12273e;
            m12274d2 = m12273e2;
        }
        int m12244l = c0540f.m12244l();
        int i2 = (m12274d2 - m12274d) - m12244l;
        if (m12274d > m12274d2) {
            i2 = (m12274d - m12274d2) - m12244l;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = (int) f;
        int i4 = m12274d + i3;
        int i5 = i4 + m12244l;
        if (m12274d > m12274d2) {
            i4 = m12274d - i3;
            i5 = i4 - m12244l;
        }
        c0540f.m12256J(i4, i5);
        m12305g(i + 1, c0540f, interfaceC0518b);
    }

    /* renamed from: f */
    public static void m12306f(int i, C0540f c0540f, C0516b.InterfaceC0518b interfaceC0518b, C0540f c0540f2) {
        float f = c0540f2.f1756h0;
        C0537d c0537d = c0540f2.f1726L;
        int m12273e = c0537d.m12273e() + c0537d.f1702f.m12274d();
        C0537d c0537d2 = c0540f2.f1728N;
        int m12274d = c0537d2.f1702f.m12274d() - c0537d2.m12273e();
        if (m12274d >= m12273e) {
            int m12244l = c0540f2.m12244l();
            if (c0540f2.f1760j0 != 8) {
                int i2 = c0540f2.f1778t;
                if (i2 == 2) {
                    if (!(c0540f instanceof C0541g)) {
                        c0540f = c0540f.f1737W;
                    }
                    m12244l = (int) (f * 0.5f * c0540f.m12244l());
                } else if (i2 == 0) {
                    m12244l = m12274d - m12273e;
                }
                m12244l = Math.max(c0540f2.f1783y, m12244l);
                int i3 = c0540f2.f1784z;
                if (i3 > 0) {
                    m12244l = Math.min(i3, m12244l);
                }
            }
            int i4 = m12273e + ((int) ((f * ((m12274d - m12273e) - m12244l)) + 0.5f));
            c0540f2.m12256J(i4, m12244l + i4);
            m12305g(i + 1, c0540f2, interfaceC0518b);
        }
    }

    /* renamed from: g */
    public static void m12305g(int i, C0540f c0540f, C0516b.InterfaceC0518b interfaceC0518b) {
        C0537d c0537d;
        boolean z;
        C0537d c0537d2;
        C0537d c0537d3;
        boolean z2;
        C0537d c0537d4;
        C0537d c0537d5;
        if (c0540f.f1769o) {
            return;
        }
        if (!(c0540f instanceof C0541g) && c0540f.m12231z() && m12311a(c0540f)) {
            C0541g.m12226U(c0540f, interfaceC0518b, new C0516b.C0517a());
        }
        C0537d mo12209j = c0540f.mo12209j(C0537d.EnumC0538a.TOP);
        C0537d mo12209j2 = c0540f.mo12209j(C0537d.EnumC0538a.BOTTOM);
        int m12274d = mo12209j.m12274d();
        int m12274d2 = mo12209j2.m12274d();
        HashSet<C0537d> hashSet = mo12209j.f1697a;
        if (hashSet != null && mo12209j.f1699c) {
            Iterator<C0537d> it = hashSet.iterator();
            while (it.hasNext()) {
                C0537d next = it.next();
                C0540f c0540f2 = next.f1700d;
                int i2 = i + 1;
                boolean m12311a = m12311a(c0540f2);
                if (c0540f2.m12231z() && m12311a) {
                    C0541g.m12226U(c0540f2, interfaceC0518b, new C0516b.C0517a());
                }
                C0537d c0537d6 = c0540f2.f1726L;
                C0537d c0537d7 = c0540f2.f1728N;
                if ((next == c0537d6 && (c0537d5 = c0537d7.f1702f) != null && c0537d5.f1699c) || (next == c0537d7 && (c0537d4 = c0537d6.f1702f) != null && c0537d4.f1699c)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i3 = c0540f2.f1736V[1];
                if (i3 == 3 && !m12311a) {
                    if (i3 == 3 && c0540f2.f1784z >= 0 && c0540f2.f1783y >= 0 && (c0540f2.f1760j0 == 8 || (c0540f2.f1778t == 0 && c0540f2.f1740Z == 0.0f))) {
                        if (!c0540f2.m12232y() && !c0540f2.f1722H && z2 && !c0540f2.m12232y()) {
                            m12306f(i2, c0540f, interfaceC0518b, c0540f2);
                        }
                    }
                } else if (!c0540f2.m12231z()) {
                    if (next == c0537d6 && c0537d7.f1702f == null) {
                        int m12273e = c0537d6.m12273e() + m12274d;
                        c0540f2.m12256J(m12273e, c0540f2.m12244l() + m12273e);
                    } else if (next == c0537d7 && c0537d6.f1702f == null) {
                        int m12273e2 = m12274d - c0537d7.m12273e();
                        c0540f2.m12256J(m12273e2 - c0540f2.m12244l(), m12273e2);
                    } else if (z2 && !c0540f2.m12232y()) {
                        m12307e(i2, c0540f2, interfaceC0518b);
                    }
                    m12305g(i2, c0540f2, interfaceC0518b);
                }
            }
        }
        if (c0540f instanceof C0544i) {
            return;
        }
        HashSet<C0537d> hashSet2 = mo12209j2.f1697a;
        if (hashSet2 != null && mo12209j2.f1699c) {
            Iterator<C0537d> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0537d next2 = it2.next();
                C0540f c0540f3 = next2.f1700d;
                int i4 = i + 1;
                boolean m12311a2 = m12311a(c0540f3);
                if (c0540f3.m12231z() && m12311a2) {
                    C0541g.m12226U(c0540f3, interfaceC0518b, new C0516b.C0517a());
                }
                C0537d c0537d8 = c0540f3.f1726L;
                C0537d c0537d9 = c0540f3.f1728N;
                if ((next2 == c0537d8 && (c0537d3 = c0537d9.f1702f) != null && c0537d3.f1699c) || (next2 == c0537d9 && (c0537d2 = c0537d8.f1702f) != null && c0537d2.f1699c)) {
                    z = true;
                } else {
                    z = false;
                }
                int i5 = c0540f3.f1736V[1];
                if (i5 == 3 && !m12311a2) {
                    if (i5 == 3 && c0540f3.f1784z >= 0 && c0540f3.f1783y >= 0) {
                        if (c0540f3.f1760j0 != 8) {
                            if (c0540f3.f1778t == 0) {
                                if (c0540f3.f1740Z == 0.0f) {
                                }
                            }
                        }
                        if (!c0540f3.m12232y() && !c0540f3.f1722H && z && !c0540f3.m12232y()) {
                            m12306f(i4, c0540f, interfaceC0518b, c0540f3);
                        }
                    }
                } else if (!c0540f3.m12231z()) {
                    if (next2 == c0537d8 && c0537d9.f1702f == null) {
                        int m12273e3 = c0537d8.m12273e() + m12274d2;
                        c0540f3.m12256J(m12273e3, c0540f3.m12244l() + m12273e3);
                    } else if (next2 == c0537d9 && c0537d8.f1702f == null) {
                        int m12273e4 = m12274d2 - c0537d9.m12273e();
                        c0540f3.m12256J(m12273e4 - c0540f3.m12244l(), m12273e4);
                    } else if (z && !c0540f3.m12232y()) {
                        m12307e(i4, c0540f3, interfaceC0518b);
                    }
                    m12305g(i4, c0540f3, interfaceC0518b);
                }
            }
        }
        C0537d mo12209j3 = c0540f.mo12209j(C0537d.EnumC0538a.BASELINE);
        if (mo12209j3.f1697a != null && mo12209j3.f1699c) {
            int m12274d3 = mo12209j3.m12274d();
            Iterator<C0537d> it3 = mo12209j3.f1697a.iterator();
            while (it3.hasNext()) {
                C0537d next3 = it3.next();
                C0540f c0540f4 = next3.f1700d;
                int i6 = i + 1;
                boolean m12311a3 = m12311a(c0540f4);
                if (c0540f4.m12231z() && m12311a3) {
                    C0541g.m12226U(c0540f4, interfaceC0518b, new C0516b.C0517a());
                }
                if (c0540f4.f1736V[1] != 3 || m12311a3) {
                    if (!c0540f4.m12231z() && next3 == (c0537d = c0540f4.f1729O)) {
                        int m12273e5 = next3.m12273e() + m12274d3;
                        if (c0540f4.f1720F) {
                            int i7 = m12273e5 - c0540f4.f1748d0;
                            int i8 = c0540f4.f1739Y + i7;
                            c0540f4.f1746c0 = i7;
                            c0540f4.f1726L.m12266l(i7);
                            c0540f4.f1728N.m12266l(i8);
                            c0537d.m12266l(m12273e5);
                            c0540f4.f1765m = true;
                        }
                        m12305g(i6, c0540f4, interfaceC0518b);
                    }
                }
            }
        }
        c0540f.f1769o = true;
    }
}
