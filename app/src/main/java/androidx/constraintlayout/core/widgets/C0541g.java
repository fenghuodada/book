package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0504e;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC0534q;
import androidx.constraintlayout.core.widgets.analyzer.C0516b;
import androidx.constraintlayout.core.widgets.analyzer.C0519c;
import androidx.constraintlayout.core.widgets.analyzer.C0521e;
import androidx.constraintlayout.core.widgets.analyzer.C0524h;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.g */
/* loaded from: classes.dex */
public final class C0541g extends C0549n {

    /* renamed from: A0 */
    public int f1785A0;

    /* renamed from: v0 */
    public int f1801v0;

    /* renamed from: z0 */
    public int f1805z0;

    /* renamed from: t0 */
    public final C0516b f1799t0 = new C0516b(this);

    /* renamed from: u0 */
    public final C0521e f1800u0 = new C0521e(this);

    /* renamed from: w0 */
    public C0516b.InterfaceC0518b f1802w0 = null;

    /* renamed from: x0 */
    public boolean f1803x0 = false;

    /* renamed from: y0 */
    public final C0504e f1804y0 = new C0504e();

    /* renamed from: B0 */
    public int f1786B0 = 0;

    /* renamed from: C0 */
    public int f1787C0 = 0;

    /* renamed from: D0 */
    public C0536c[] f1788D0 = new C0536c[4];

    /* renamed from: E0 */
    public C0536c[] f1789E0 = new C0536c[4];

    /* renamed from: F0 */
    public int f1790F0 = 257;

    /* renamed from: G0 */
    public boolean f1791G0 = false;

    /* renamed from: H0 */
    public boolean f1792H0 = false;

    /* renamed from: I0 */
    public WeakReference<C0537d> f1793I0 = null;

    /* renamed from: J0 */
    public WeakReference<C0537d> f1794J0 = null;

    /* renamed from: K0 */
    public WeakReference<C0537d> f1795K0 = null;

    /* renamed from: L0 */
    public WeakReference<C0537d> f1796L0 = null;

    /* renamed from: M0 */
    public final HashSet<C0540f> f1797M0 = new HashSet<>();

    /* renamed from: N0 */
    public final C0516b.C0517a f1798N0 = new C0516b.C0517a();

    /* renamed from: U */
    public static void m12226U(C0540f c0540f, C0516b.InterfaceC0518b interfaceC0518b, C0516b.C0517a c0517a) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        if (interfaceC0518b == null) {
            return;
        }
        if (c0540f.f1760j0 != 8 && !(c0540f instanceof C0544i) && !(c0540f instanceof C0514a)) {
            int[] iArr = c0540f.f1736V;
            c0517a.f1623a = iArr[0];
            boolean z5 = true;
            c0517a.f1624b = iArr[1];
            c0517a.f1625c = c0540f.m12240q();
            c0517a.f1626d = c0540f.m12244l();
            c0517a.f1631i = false;
            c0517a.f1632j = 0;
            if (c0517a.f1623a == 3) {
                z = true;
            } else {
                z = false;
            }
            if (c0517a.f1624b == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && c0540f.f1740Z > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && c0540f.f1740Z > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && c0540f.m12237t(0) && c0540f.f1777s == 0 && !z3) {
                c0517a.f1623a = 2;
                if (z2 && c0540f.f1778t == 0) {
                    c0517a.f1623a = 1;
                }
                z = false;
            }
            if (z2 && c0540f.m12237t(1) && c0540f.f1778t == 0 && !z4) {
                c0517a.f1624b = 2;
                if (z && c0540f.f1777s == 0) {
                    c0517a.f1624b = 1;
                }
                z2 = false;
            }
            if (c0540f.mo12215A()) {
                c0517a.f1623a = 1;
                z = false;
            }
            if (c0540f.mo12214B()) {
                c0517a.f1624b = 1;
                z2 = false;
            }
            int[] iArr2 = c0540f.f1779u;
            if (z3) {
                if (iArr2[0] == 4) {
                    c0517a.f1623a = 1;
                } else if (!z2) {
                    if (c0517a.f1624b == 1) {
                        i3 = c0517a.f1626d;
                    } else {
                        c0517a.f1623a = 2;
                        ((ConstraintLayout.C0564b) interfaceC0518b).m12167b(c0540f, c0517a);
                        i3 = c0517a.f1628f;
                    }
                    c0517a.f1623a = 1;
                    c0517a.f1625c = (int) (c0540f.f1740Z * i3);
                }
            }
            if (z4) {
                if (iArr2[1] == 4) {
                    c0517a.f1624b = 1;
                } else if (!z) {
                    if (c0517a.f1623a == 1) {
                        i = c0517a.f1625c;
                    } else {
                        c0517a.f1624b = 2;
                        ((ConstraintLayout.C0564b) interfaceC0518b).m12167b(c0540f, c0517a);
                        i = c0517a.f1627e;
                    }
                    c0517a.f1624b = 1;
                    if (c0540f.f1742a0 == -1) {
                        i2 = (int) (i / c0540f.f1740Z);
                    } else {
                        i2 = (int) (c0540f.f1740Z * i);
                    }
                    c0517a.f1626d = i2;
                }
            }
            ((ConstraintLayout.C0564b) interfaceC0518b).m12167b(c0540f, c0517a);
            c0540f.m12252N(c0517a.f1627e);
            c0540f.m12255K(c0517a.f1628f);
            c0540f.f1720F = c0517a.f1630h;
            int i4 = c0517a.f1629g;
            c0540f.f1748d0 = i4;
            if (i4 <= 0) {
                z5 = false;
            }
            c0540f.f1720F = z5;
            c0517a.f1632j = 0;
            return;
        }
        c0517a.f1627e = 0;
        c0517a.f1628f = 0;
    }

    @Override // androidx.constraintlayout.core.widgets.C0549n, androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: C */
    public final void mo12198C() {
        this.f1804y0.m12346t();
        this.f1805z0 = 0;
        this.f1785A0 = 0;
        super.mo12198C();
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: O */
    public final void mo12230O(boolean z, boolean z2) {
        super.mo12230O(z, z2);
        int size = this.f1870s0.size();
        for (int i = 0; i < size; i++) {
            this.f1870s0.get(i).mo12230O(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:355:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0601 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x067e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x080b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0817 A[LOOP:14: B:505:0x0815->B:506:0x0817, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x08e3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.constraintlayout.core.widgets.C0549n
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo12196Q() {
        /*
            Method dump skipped, instructions count: 2299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0541g.mo12196Q():void");
    }

    /* renamed from: R */
    public final void m12229R(int i, C0540f c0540f) {
        if (i == 0) {
            int i2 = this.f1786B0 + 1;
            C0536c[] c0536cArr = this.f1789E0;
            if (i2 >= c0536cArr.length) {
                this.f1789E0 = (C0536c[]) Arrays.copyOf(c0536cArr, c0536cArr.length * 2);
            }
            C0536c[] c0536cArr2 = this.f1789E0;
            int i3 = this.f1786B0;
            c0536cArr2[i3] = new C0536c(c0540f, 0, this.f1803x0);
            this.f1786B0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.f1787C0 + 1;
            C0536c[] c0536cArr3 = this.f1788D0;
            if (i4 >= c0536cArr3.length) {
                this.f1788D0 = (C0536c[]) Arrays.copyOf(c0536cArr3, c0536cArr3.length * 2);
            }
            C0536c[] c0536cArr4 = this.f1788D0;
            int i5 = this.f1787C0;
            c0536cArr4[i5] = new C0536c(c0540f, 1, this.f1803x0);
            this.f1787C0 = i5 + 1;
        }
    }

    /* renamed from: S */
    public final void m12228S(C0504e c0504e) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean m12225V = m12225V(64);
        mo12211c(c0504e, m12225V);
        int size = this.f1870s0.size();
        boolean z5 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0540f c0540f = this.f1870s0.get(i2);
            boolean[] zArr = c0540f.f1735U;
            zArr[0] = false;
            zArr[1] = false;
            if (c0540f instanceof C0514a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i3 = 0; i3 < size; i3++) {
                C0540f c0540f2 = this.f1870s0.get(i3);
                if (c0540f2 instanceof C0514a) {
                    C0514a c0514a = (C0514a) c0540f2;
                    for (int i4 = 0; i4 < c0514a.f1856t0; i4++) {
                        C0540f c0540f3 = c0514a.f1855s0[i4];
                        if (c0514a.f1617v0 || c0540f3.mo12210d()) {
                            int i5 = c0514a.f1616u0;
                            if (i5 != 0 && i5 != 1) {
                                if (i5 == 2 || i5 == 3) {
                                    c0540f3.f1735U[1] = true;
                                }
                            } else {
                                c0540f3.f1735U[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<C0540f> hashSet = this.f1797M0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            C0540f c0540f4 = this.f1870s0.get(i6);
            c0540f4.getClass();
            if (!(c0540f4 instanceof C0548m) && !(c0540f4 instanceof C0544i)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                if (c0540f4 instanceof C0548m) {
                    hashSet.add(c0540f4);
                } else {
                    c0540f4.mo12211c(c0504e, m12225V);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<C0540f> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0548m c0548m = (C0548m) it.next();
                int i7 = 0;
                while (true) {
                    if (i7 < c0548m.f1856t0) {
                        if (hashSet.contains(c0548m.f1855s0[i7])) {
                            z3 = true;
                            continue;
                            break;
                        }
                        i7++;
                    } else {
                        z3 = false;
                        continue;
                        break;
                    }
                }
                if (z3) {
                    c0548m.mo12211c(c0504e, m12225V);
                    hashSet.remove(c0548m);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<C0540f> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().mo12211c(c0504e, m12225V);
                }
                hashSet.clear();
            }
        }
        if (C0504e.f1576p) {
            HashSet<C0540f> hashSet2 = new HashSet<>();
            for (int i8 = 0; i8 < size; i8++) {
                C0540f c0540f5 = this.f1870s0.get(i8);
                c0540f5.getClass();
                if (!(c0540f5 instanceof C0548m) && !(c0540f5 instanceof C0544i)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    hashSet2.add(c0540f5);
                }
            }
            if (this.f1736V[0] == 2) {
                i = 0;
            } else {
                i = 1;
            }
            m12251b(this, c0504e, hashSet2, i, false);
            Iterator<C0540f> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C0540f next = it3.next();
                C0547l.m12205c(this, c0504e, next);
                next.mo12211c(c0504e, m12225V);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                C0540f c0540f6 = this.f1870s0.get(i9);
                if (c0540f6 instanceof C0541g) {
                    int[] iArr = c0540f6.f1736V;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        c0540f6.m12254L(1);
                    }
                    if (i11 == 2) {
                        c0540f6.m12253M(1);
                    }
                    c0540f6.mo12211c(c0504e, m12225V);
                    if (i10 == 2) {
                        c0540f6.m12254L(i10);
                    }
                    if (i11 == 2) {
                        c0540f6.m12253M(i11);
                    }
                } else {
                    C0547l.m12205c(this, c0504e, c0540f6);
                    if (!(c0540f6 instanceof C0548m) && !(c0540f6 instanceof C0544i)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        c0540f6.mo12211c(c0504e, m12225V);
                    }
                }
            }
        }
        if (this.f1786B0 > 0) {
            C0535b.m12280a(this, c0504e, null, 0);
        }
        if (this.f1787C0 > 0) {
            C0535b.m12280a(this, c0504e, null, 1);
        }
    }

    /* renamed from: T */
    public final boolean m12227T(int i, boolean z) {
        boolean z2;
        C0524h c0524h;
        int m12244l;
        boolean z3 = true;
        boolean z4 = z & true;
        C0521e c0521e = this.f1800u0;
        C0541g c0541g = c0521e.f1635a;
        int m12245k = c0541g.m12245k(0);
        int m12245k2 = c0541g.m12245k(1);
        int m12239r = c0541g.m12239r();
        int m12238s = c0541g.m12238s();
        ArrayList<AbstractC0534q> arrayList = c0521e.f1639e;
        if (z4 && (m12245k == 2 || m12245k2 == 2)) {
            Iterator<AbstractC0534q> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC0534q next = it.next();
                if (next.f1673f == i && !next.mo12282k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && m12245k == 2) {
                    c0541g.m12254L(1);
                    c0541g.m12252N(c0521e.m12320d(c0541g, 0));
                    c0524h = c0541g.f1747d.f1672e;
                    m12244l = c0541g.m12240q();
                    c0524h.mo12312d(m12244l);
                }
            } else if (z4 && m12245k2 == 2) {
                c0541g.m12253M(1);
                c0541g.m12255K(c0521e.m12320d(c0541g, 1));
                c0524h = c0541g.f1749e.f1672e;
                m12244l = c0541g.m12244l();
                c0524h.mo12312d(m12244l);
            }
        }
        int[] iArr = c0541g.f1736V;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int m12240q = c0541g.m12240q() + m12239r;
                c0541g.f1747d.f1676i.mo12312d(m12240q);
                c0541g.f1747d.f1672e.mo12312d(m12240q - m12239r);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int m12244l2 = c0541g.m12244l() + m12238s;
                c0541g.f1749e.f1676i.mo12312d(m12244l2);
                c0541g.f1749e.f1672e.mo12312d(m12244l2 - m12238s);
                z2 = true;
            }
            z2 = false;
        }
        c0521e.m12317g();
        Iterator<AbstractC0534q> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC0534q next2 = it2.next();
            if (next2.f1673f == i && (next2.f1669b != c0541g || next2.f1674g)) {
                next2.mo12288e();
            }
        }
        Iterator<AbstractC0534q> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0534q next3 = it3.next();
            if (next3.f1673f == i && (z2 || next3.f1669b != c0541g)) {
                if (!next3.f1675h.f1652j || !next3.f1676i.f1652j || (!(next3 instanceof C0519c) && !next3.f1672e.f1652j)) {
                    z3 = false;
                    break;
                }
            }
        }
        c0541g.m12254L(m12245k);
        c0541g.m12253M(m12245k2);
        return z3;
    }

    /* renamed from: V */
    public final boolean m12225V(int i) {
        return (this.f1790F0 & i) == i;
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: n */
    public final void mo12224n(StringBuilder sb) {
        sb.append(this.f1761k + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f1738X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f1739Y);
        sb.append("\n");
        Iterator<C0540f> it = this.f1870s0.iterator();
        while (it.hasNext()) {
            it.next().mo12224n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
