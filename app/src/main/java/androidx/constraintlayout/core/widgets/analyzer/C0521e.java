package androidx.constraintlayout.core.widgets.analyzer;

import androidx.appcompat.graphics.drawable.C0171d;
import androidx.constraintlayout.core.widgets.C0540f;
import androidx.constraintlayout.core.widgets.C0541g;
import androidx.constraintlayout.core.widgets.C0544i;
import androidx.constraintlayout.core.widgets.C0546k;
import androidx.constraintlayout.core.widgets.analyzer.C0516b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.e */
/* loaded from: classes.dex */
public final class C0521e {

    /* renamed from: a */
    public final C0541g f1635a;

    /* renamed from: d */
    public final C0541g f1638d;

    /* renamed from: f */
    public C0516b.InterfaceC0518b f1640f;

    /* renamed from: g */
    public final C0516b.C0517a f1641g;

    /* renamed from: h */
    public final ArrayList<C0530n> f1642h;

    /* renamed from: b */
    public boolean f1636b = true;

    /* renamed from: c */
    public boolean f1637c = true;

    /* renamed from: e */
    public final ArrayList<AbstractC0534q> f1639e = new ArrayList<>();

    public C0521e(C0541g c0541g) {
        new ArrayList();
        this.f1640f = null;
        this.f1641g = new C0516b.C0517a();
        this.f1642h = new ArrayList<>();
        this.f1635a = c0541g;
        this.f1638d = c0541g;
    }

    /* renamed from: a */
    public final void m12323a(C0523g c0523g, int i, int i2, ArrayList arrayList, C0530n c0530n) {
        AbstractC0534q abstractC0534q = c0523g.f1646d;
        if (abstractC0534q.f1670c == null) {
            C0541g c0541g = this.f1635a;
            if (abstractC0534q != c0541g.f1747d && abstractC0534q != c0541g.f1749e) {
                if (c0530n == null) {
                    c0530n = new C0530n(abstractC0534q);
                    arrayList.add(c0530n);
                }
                abstractC0534q.f1670c = c0530n;
                c0530n.f1659b.add(abstractC0534q);
                C0523g c0523g2 = abstractC0534q.f1675h;
                Iterator it = c0523g2.f1653k.iterator();
                while (it.hasNext()) {
                    InterfaceC0520d interfaceC0520d = (InterfaceC0520d) it.next();
                    if (interfaceC0520d instanceof C0523g) {
                        m12323a((C0523g) interfaceC0520d, i, 0, arrayList, c0530n);
                    }
                }
                C0523g c0523g3 = abstractC0534q.f1676i;
                Iterator it2 = c0523g3.f1653k.iterator();
                while (it2.hasNext()) {
                    InterfaceC0520d interfaceC0520d2 = (InterfaceC0520d) it2.next();
                    if (interfaceC0520d2 instanceof C0523g) {
                        m12323a((C0523g) interfaceC0520d2, i, 1, arrayList, c0530n);
                    }
                }
                if (i == 1 && (abstractC0534q instanceof C0531o)) {
                    Iterator it3 = ((C0531o) abstractC0534q).f1660k.f1653k.iterator();
                    while (it3.hasNext()) {
                        InterfaceC0520d interfaceC0520d3 = (InterfaceC0520d) it3.next();
                        if (interfaceC0520d3 instanceof C0523g) {
                            m12323a((C0523g) interfaceC0520d3, i, 2, arrayList, c0530n);
                        }
                    }
                }
                Iterator it4 = c0523g2.f1654l.iterator();
                while (it4.hasNext()) {
                    m12323a((C0523g) it4.next(), i, 0, arrayList, c0530n);
                }
                Iterator it5 = c0523g3.f1654l.iterator();
                while (it5.hasNext()) {
                    m12323a((C0523g) it5.next(), i, 1, arrayList, c0530n);
                }
                if (i == 1 && (abstractC0534q instanceof C0531o)) {
                    Iterator it6 = ((C0531o) abstractC0534q).f1660k.f1654l.iterator();
                    while (it6.hasNext()) {
                        m12323a((C0523g) it6.next(), i, 2, arrayList, c0530n);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        if (r2.f1778t == 0) goto L23;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12322b(androidx.constraintlayout.core.widgets.C0541g r17) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0521e.m12322b(androidx.constraintlayout.core.widgets.g):void");
    }

    /* renamed from: c */
    public final void m12321c() {
        AbstractC0534q c0527k;
        ArrayList<AbstractC0534q> arrayList = this.f1639e;
        arrayList.clear();
        C0541g c0541g = this.f1638d;
        c0541g.f1747d.mo12287f();
        c0541g.f1749e.mo12287f();
        arrayList.add(c0541g.f1747d);
        arrayList.add(c0541g.f1749e);
        Iterator<C0540f> it = c0541g.f1870s0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0540f next = it.next();
            if (next instanceof C0544i) {
                c0527k = new C0527k(next);
            } else {
                if (next.m12233x()) {
                    if (next.f1743b == null) {
                        next.f1743b = new C0519c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f1743b);
                } else {
                    arrayList.add(next.f1747d);
                }
                if (next.m12232y()) {
                    if (next.f1745c == null) {
                        next.f1745c = new C0519c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f1745c);
                } else {
                    arrayList.add(next.f1749e);
                }
                if (next instanceof C0546k) {
                    c0527k = new C0528l(next);
                }
            }
            arrayList.add(c0527k);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC0534q> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo12287f();
        }
        Iterator<AbstractC0534q> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0534q next2 = it3.next();
            if (next2.f1669b != c0541g) {
                next2.mo12289d();
            }
        }
        ArrayList<C0530n> arrayList2 = this.f1642h;
        arrayList2.clear();
        C0541g c0541g2 = this.f1635a;
        m12319e(c0541g2.f1747d, 0, arrayList2);
        m12319e(c0541g2.f1749e, 1, arrayList2);
        this.f1636b = false;
    }

    /* renamed from: d */
    public final int m12320d(C0541g c0541g, int i) {
        long j;
        ArrayList<C0530n> arrayList;
        int i2;
        AbstractC0534q abstractC0534q;
        AbstractC0534q abstractC0534q2;
        long j2;
        long j3;
        float f;
        long j4;
        C0541g c0541g2 = c0541g;
        int i3 = i;
        ArrayList<C0530n> arrayList2 = this.f1642h;
        int size = arrayList2.size();
        int i4 = 0;
        long j5 = 0;
        while (i4 < size) {
            AbstractC0534q abstractC0534q3 = arrayList2.get(i4).f1658a;
            if (!(abstractC0534q3 instanceof C0519c) ? !(i3 != 0 ? (abstractC0534q3 instanceof C0531o) : (abstractC0534q3 instanceof C0529m)) : ((C0519c) abstractC0534q3).f1673f != i3) {
                j = 0;
                arrayList = arrayList2;
                i2 = size;
            } else {
                if (i3 == 0) {
                    abstractC0534q = c0541g2.f1747d;
                } else {
                    abstractC0534q = c0541g2.f1749e;
                }
                C0523g c0523g = abstractC0534q.f1675h;
                if (i3 == 0) {
                    abstractC0534q2 = c0541g2.f1747d;
                } else {
                    abstractC0534q2 = c0541g2.f1749e;
                }
                C0523g c0523g2 = abstractC0534q2.f1676i;
                boolean contains = abstractC0534q3.f1675h.f1654l.contains(c0523g);
                C0523g c0523g3 = abstractC0534q3.f1676i;
                boolean contains2 = c0523g3.f1654l.contains(c0523g2);
                long mo12283j = abstractC0534q3.mo12283j();
                C0523g c0523g4 = abstractC0534q3.f1675h;
                if (contains && contains2) {
                    long m12297b = C0530n.m12297b(c0523g4, 0L);
                    long m12298a = C0530n.m12298a(c0523g3, 0L);
                    long j6 = m12297b - mo12283j;
                    int i5 = c0523g3.f1648f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j6 >= (-i5)) {
                        j6 += i5;
                    }
                    long j7 = j6;
                    long j8 = c0523g4.f1648f;
                    long j9 = ((-m12298a) - mo12283j) - j8;
                    if (j9 >= j8) {
                        j9 -= j8;
                    }
                    C0540f c0540f = abstractC0534q3.f1669b;
                    if (i3 == 0) {
                        f = c0540f.f1754g0;
                    } else if (i3 == 1) {
                        f = c0540f.f1756h0;
                    } else {
                        c0540f.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j4 = (((float) j7) / (1.0f - f)) + (((float) j9) / f);
                    } else {
                        j4 = 0;
                    }
                    float f2 = (float) j4;
                    j = (c0523g4.f1648f + ((((f2 * f) + 0.5f) + mo12283j) + C0171d.m12907a(1.0f, f, f2, 0.5f))) - c0523g3.f1648f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    if (contains) {
                        j3 = C0530n.m12297b(c0523g4, c0523g4.f1648f);
                        j2 = c0523g4.f1648f + mo12283j;
                    } else if (contains2) {
                        j2 = (-c0523g3.f1648f) + mo12283j;
                        j3 = -C0530n.m12298a(c0523g3, c0523g3.f1648f);
                    } else {
                        j = (abstractC0534q3.mo12283j() + c0523g4.f1648f) - c0523g3.f1648f;
                    }
                    j = Math.max(j3, j2);
                }
            }
            j5 = Math.max(j5, j);
            i4++;
            c0541g2 = c0541g;
            i3 = i;
            arrayList2 = arrayList;
            size = i2;
        }
        return (int) j5;
    }

    /* renamed from: e */
    public final void m12319e(AbstractC0534q abstractC0534q, int i, ArrayList<C0530n> arrayList) {
        C0523g c0523g;
        C0523g c0523g2;
        C0523g c0523g3;
        Iterator it = abstractC0534q.f1675h.f1653k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0523g = abstractC0534q.f1676i;
            if (!hasNext) {
                break;
            }
            InterfaceC0520d interfaceC0520d = (InterfaceC0520d) it.next();
            if (interfaceC0520d instanceof C0523g) {
                c0523g3 = (C0523g) interfaceC0520d;
            } else if (interfaceC0520d instanceof AbstractC0534q) {
                c0523g3 = ((AbstractC0534q) interfaceC0520d).f1675h;
            }
            m12323a(c0523g3, i, 0, arrayList, null);
        }
        Iterator it2 = c0523g.f1653k.iterator();
        while (it2.hasNext()) {
            InterfaceC0520d interfaceC0520d2 = (InterfaceC0520d) it2.next();
            if (interfaceC0520d2 instanceof C0523g) {
                c0523g2 = (C0523g) interfaceC0520d2;
            } else if (interfaceC0520d2 instanceof AbstractC0534q) {
                c0523g2 = ((AbstractC0534q) interfaceC0520d2).f1676i;
            }
            m12323a(c0523g2, i, 1, arrayList, null);
        }
        if (i == 1) {
            Iterator it3 = ((C0531o) abstractC0534q).f1660k.f1653k.iterator();
            while (it3.hasNext()) {
                InterfaceC0520d interfaceC0520d3 = (InterfaceC0520d) it3.next();
                if (interfaceC0520d3 instanceof C0523g) {
                    m12323a((C0523g) interfaceC0520d3, i, 2, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m12318f(C0540f c0540f, int i, int i2, int i3, int i4) {
        boolean z;
        C0516b.C0517a c0517a = this.f1641g;
        c0517a.f1623a = i;
        c0517a.f1624b = i3;
        c0517a.f1625c = i2;
        c0517a.f1626d = i4;
        ((ConstraintLayout.C0564b) this.f1640f).m12167b(c0540f, c0517a);
        c0540f.m12252N(c0517a.f1627e);
        c0540f.m12255K(c0517a.f1628f);
        c0540f.f1720F = c0517a.f1630h;
        int i5 = c0517a.f1629g;
        c0540f.f1748d0 = i5;
        if (i5 > 0) {
            z = true;
        } else {
            z = false;
        }
        c0540f.f1720F = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r10 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r8 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        r2.f1655m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
        r2.mo12312d(r3);
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12317g() {
        /*
            r13 = this;
            androidx.constraintlayout.core.widgets.g r0 = r13.f1635a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.f> r0 = r0.f1870s0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.f r1 = (androidx.constraintlayout.core.widgets.C0540f) r1
            boolean r2 = r1.f1741a
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.f1736V
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f1777s
            int r4 = r1.f1778t
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = r3
            goto L31
        L30:
            r2 = r9
        L31:
            if (r10 == r5) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = r9
        L38:
            androidx.constraintlayout.core.widgets.analyzer.m r4 = r1.f1747d
            androidx.constraintlayout.core.widgets.analyzer.h r4 = r4.f1672e
            boolean r5 = r4.f1652j
            androidx.constraintlayout.core.widgets.analyzer.o r6 = r1.f1749e
            androidx.constraintlayout.core.widgets.analyzer.h r6 = r6.f1672e
            boolean r7 = r6.f1652j
            r12 = 1
            if (r5 == 0) goto L55
            if (r7 == 0) goto L55
            int r5 = r4.f1649g
            int r7 = r6.f1649g
            r6 = 1
            r2 = r13
            r3 = r1
            r4 = r6
            r2.m12318f(r3, r4, r5, r6, r7)
            goto L8e
        L55:
            if (r5 == 0) goto L6f
            if (r3 == 0) goto L6f
            int r5 = r4.f1649g
            int r7 = r6.f1649g
            r4 = 1
            r6 = 2
            r2 = r13
            r3 = r1
            r2.m12318f(r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.o r2 = r1.f1749e
            androidx.constraintlayout.core.widgets.analyzer.h r2 = r2.f1672e
            int r3 = r1.m12244l()
            if (r10 != r11) goto L8b
            goto L88
        L6f:
            if (r7 == 0) goto L90
            if (r2 == 0) goto L90
            int r5 = r4.f1649g
            int r7 = r6.f1649g
            r4 = 2
            r2 = r13
            r3 = r1
            r6 = r12
            r2.m12318f(r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.m r2 = r1.f1747d
            androidx.constraintlayout.core.widgets.analyzer.h r2 = r2.f1672e
            int r3 = r1.m12240q()
            if (r8 != r11) goto L8b
        L88:
            r2.f1655m = r3
            goto L90
        L8b:
            r2.mo12312d(r3)
        L8e:
            r1.f1741a = r9
        L90:
            boolean r2 = r1.f1741a
            if (r2 == 0) goto L8
            androidx.constraintlayout.core.widgets.analyzer.o r2 = r1.f1749e
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r2.f1661l
            if (r2 == 0) goto L8
            int r1 = r1.f1748d0
            r2.mo12312d(r1)
            goto L8
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0521e.m12317g():void");
    }
}
