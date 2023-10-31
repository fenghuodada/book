package androidx.constraintlayout.core.widgets;

import androidx.concurrent.futures.C0484a;
import androidx.constraintlayout.core.C0499a;
import androidx.constraintlayout.core.C0503d;
import androidx.constraintlayout.core.C0504e;
import androidx.constraintlayout.core.widgets.C0537d;
import androidx.constraintlayout.core.widgets.analyzer.C0519c;
import androidx.constraintlayout.core.widgets.analyzer.C0523g;
import androidx.constraintlayout.core.widgets.analyzer.C0529m;
import androidx.constraintlayout.core.widgets.analyzer.C0531o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.f */
/* loaded from: classes.dex */
public class C0540f {

    /* renamed from: A */
    public float f1715A;

    /* renamed from: B */
    public int f1716B;

    /* renamed from: C */
    public float f1717C;

    /* renamed from: D */
    public final int[] f1718D;

    /* renamed from: E */
    public float f1719E;

    /* renamed from: F */
    public boolean f1720F;

    /* renamed from: G */
    public boolean f1721G;

    /* renamed from: H */
    public boolean f1722H;

    /* renamed from: I */
    public int f1723I;

    /* renamed from: J */
    public int f1724J;

    /* renamed from: K */
    public final C0537d f1725K;

    /* renamed from: L */
    public final C0537d f1726L;

    /* renamed from: M */
    public final C0537d f1727M;

    /* renamed from: N */
    public final C0537d f1728N;

    /* renamed from: O */
    public final C0537d f1729O;

    /* renamed from: P */
    public final C0537d f1730P;

    /* renamed from: Q */
    public final C0537d f1731Q;

    /* renamed from: R */
    public final C0537d f1732R;

    /* renamed from: S */
    public final C0537d[] f1733S;

    /* renamed from: T */
    public final ArrayList<C0537d> f1734T;

    /* renamed from: U */
    public final boolean[] f1735U;

    /* renamed from: V */
    public final int[] f1736V;

    /* renamed from: W */
    public C0540f f1737W;

    /* renamed from: X */
    public int f1738X;

    /* renamed from: Y */
    public int f1739Y;

    /* renamed from: Z */
    public float f1740Z;

    /* renamed from: a0 */
    public int f1742a0;

    /* renamed from: b */
    public C0519c f1743b;

    /* renamed from: b0 */
    public int f1744b0;

    /* renamed from: c */
    public C0519c f1745c;

    /* renamed from: c0 */
    public int f1746c0;

    /* renamed from: d0 */
    public int f1748d0;

    /* renamed from: e0 */
    public int f1750e0;

    /* renamed from: f0 */
    public int f1752f0;

    /* renamed from: g0 */
    public float f1754g0;

    /* renamed from: h0 */
    public float f1756h0;

    /* renamed from: i0 */
    public Object f1758i0;

    /* renamed from: j0 */
    public int f1760j0;

    /* renamed from: k */
    public String f1761k;

    /* renamed from: k0 */
    public String f1762k0;

    /* renamed from: l */
    public boolean f1763l;

    /* renamed from: l0 */
    public int f1764l0;

    /* renamed from: m */
    public boolean f1765m;

    /* renamed from: m0 */
    public int f1766m0;

    /* renamed from: n */
    public boolean f1767n;

    /* renamed from: n0 */
    public final float[] f1768n0;

    /* renamed from: o */
    public boolean f1769o;

    /* renamed from: o0 */
    public final C0540f[] f1770o0;

    /* renamed from: p */
    public int f1771p;

    /* renamed from: p0 */
    public final C0540f[] f1772p0;

    /* renamed from: q */
    public int f1773q;

    /* renamed from: q0 */
    public int f1774q0;

    /* renamed from: r */
    public int f1775r;

    /* renamed from: r0 */
    public int f1776r0;

    /* renamed from: s */
    public int f1777s;

    /* renamed from: t */
    public int f1778t;

    /* renamed from: u */
    public final int[] f1779u;

    /* renamed from: v */
    public int f1780v;

    /* renamed from: w */
    public int f1781w;

    /* renamed from: x */
    public float f1782x;

    /* renamed from: y */
    public int f1783y;

    /* renamed from: z */
    public int f1784z;

    /* renamed from: a */
    public boolean f1741a = false;

    /* renamed from: d */
    public C0529m f1747d = null;

    /* renamed from: e */
    public C0531o f1749e = null;

    /* renamed from: f */
    public final boolean[] f1751f = {true, true};

    /* renamed from: g */
    public boolean f1753g = true;

    /* renamed from: h */
    public final boolean f1755h = true;

    /* renamed from: i */
    public int f1757i = -1;

    /* renamed from: j */
    public int f1759j = -1;

    public C0540f() {
        new HashMap();
        this.f1763l = false;
        this.f1765m = false;
        this.f1767n = false;
        this.f1769o = false;
        this.f1771p = -1;
        this.f1773q = -1;
        this.f1775r = 0;
        this.f1777s = 0;
        this.f1778t = 0;
        this.f1779u = new int[2];
        this.f1780v = 0;
        this.f1781w = 0;
        this.f1782x = 1.0f;
        this.f1783y = 0;
        this.f1784z = 0;
        this.f1715A = 1.0f;
        this.f1716B = -1;
        this.f1717C = 1.0f;
        this.f1718D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f1719E = 0.0f;
        this.f1720F = false;
        this.f1722H = false;
        this.f1723I = 0;
        this.f1724J = 0;
        C0537d c0537d = new C0537d(this, C0537d.EnumC0538a.LEFT);
        this.f1725K = c0537d;
        C0537d c0537d2 = new C0537d(this, C0537d.EnumC0538a.TOP);
        this.f1726L = c0537d2;
        C0537d c0537d3 = new C0537d(this, C0537d.EnumC0538a.RIGHT);
        this.f1727M = c0537d3;
        C0537d c0537d4 = new C0537d(this, C0537d.EnumC0538a.BOTTOM);
        this.f1728N = c0537d4;
        C0537d c0537d5 = new C0537d(this, C0537d.EnumC0538a.BASELINE);
        this.f1729O = c0537d5;
        C0537d c0537d6 = new C0537d(this, C0537d.EnumC0538a.CENTER_X);
        this.f1730P = c0537d6;
        C0537d c0537d7 = new C0537d(this, C0537d.EnumC0538a.CENTER_Y);
        this.f1731Q = c0537d7;
        C0537d c0537d8 = new C0537d(this, C0537d.EnumC0538a.CENTER);
        this.f1732R = c0537d8;
        this.f1733S = new C0537d[]{c0537d, c0537d3, c0537d2, c0537d4, c0537d5, c0537d8};
        ArrayList<C0537d> arrayList = new ArrayList<>();
        this.f1734T = arrayList;
        this.f1735U = new boolean[2];
        this.f1736V = new int[]{1, 1};
        this.f1737W = null;
        this.f1738X = 0;
        this.f1739Y = 0;
        this.f1740Z = 0.0f;
        this.f1742a0 = -1;
        this.f1744b0 = 0;
        this.f1746c0 = 0;
        this.f1748d0 = 0;
        this.f1754g0 = 0.5f;
        this.f1756h0 = 0.5f;
        this.f1760j0 = 0;
        this.f1762k0 = null;
        this.f1764l0 = 0;
        this.f1766m0 = 0;
        this.f1768n0 = new float[]{-1.0f, -1.0f};
        this.f1770o0 = new C0540f[]{null, null};
        this.f1772p0 = new C0540f[]{null, null};
        this.f1774q0 = -1;
        this.f1776r0 = -1;
        arrayList.add(c0537d);
        arrayList.add(c0537d2);
        arrayList.add(c0537d3);
        arrayList.add(c0537d4);
        arrayList.add(c0537d6);
        arrayList.add(c0537d7);
        arrayList.add(c0537d8);
        arrayList.add(c0537d5);
    }

    /* renamed from: G */
    public static void m12259G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    /* renamed from: H */
    public static void m12258H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    /* renamed from: o */
    public static void m12242o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        m12259G(i, 0, "      size", sb);
        m12259G(i2, 0, "      min", sb);
        m12259G(i3, Integer.MAX_VALUE, "      max", sb);
        m12259G(i4, 0, "      matchMin", sb);
        m12259G(i5, 0, "      matchDef", sb);
        m12258H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    /* renamed from: p */
    public static void m12241p(StringBuilder sb, String str, C0537d c0537d) {
        if (c0537d.f1702f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(c0537d.f1702f);
        sb.append("'");
        if (c0537d.f1704h != Integer.MIN_VALUE || c0537d.f1703g != 0) {
            sb.append(",");
            sb.append(c0537d.f1703g);
            if (c0537d.f1704h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(c0537d.f1704h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    /* renamed from: A */
    public boolean mo12215A() {
        if (!this.f1763l && (!this.f1725K.f1699c || !this.f1727M.f1699c)) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public boolean mo12214B() {
        if (!this.f1765m && (!this.f1726L.f1699c || !this.f1728N.f1699c)) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public void mo12198C() {
        this.f1725K.m12268j();
        this.f1726L.m12268j();
        this.f1727M.m12268j();
        this.f1728N.m12268j();
        this.f1729O.m12268j();
        this.f1730P.m12268j();
        this.f1731Q.m12268j();
        this.f1732R.m12268j();
        this.f1737W = null;
        this.f1719E = 0.0f;
        this.f1738X = 0;
        this.f1739Y = 0;
        this.f1740Z = 0.0f;
        this.f1742a0 = -1;
        this.f1744b0 = 0;
        this.f1746c0 = 0;
        this.f1748d0 = 0;
        this.f1750e0 = 0;
        this.f1752f0 = 0;
        this.f1754g0 = 0.5f;
        this.f1756h0 = 0.5f;
        int[] iArr = this.f1736V;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f1758i0 = null;
        this.f1760j0 = 0;
        this.f1764l0 = 0;
        this.f1766m0 = 0;
        float[] fArr = this.f1768n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1771p = -1;
        this.f1773q = -1;
        int[] iArr2 = this.f1718D;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f1777s = 0;
        this.f1778t = 0;
        this.f1782x = 1.0f;
        this.f1715A = 1.0f;
        this.f1781w = Integer.MAX_VALUE;
        this.f1784z = Integer.MAX_VALUE;
        this.f1780v = 0;
        this.f1783y = 0;
        this.f1716B = -1;
        this.f1717C = 1.0f;
        boolean[] zArr = this.f1751f;
        zArr[0] = true;
        zArr[1] = true;
        this.f1722H = false;
        boolean[] zArr2 = this.f1735U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f1753g = true;
        int[] iArr3 = this.f1779u;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f1757i = -1;
        this.f1759j = -1;
    }

    /* renamed from: D */
    public final void m12261D() {
        C0540f c0540f = this.f1737W;
        if (c0540f != null && (c0540f instanceof C0541g)) {
            ((C0541g) c0540f).getClass();
        }
        ArrayList<C0537d> arrayList = this.f1734T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).m12268j();
        }
    }

    /* renamed from: E */
    public final void m12260E() {
        this.f1763l = false;
        this.f1765m = false;
        this.f1767n = false;
        this.f1769o = false;
        ArrayList<C0537d> arrayList = this.f1734T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0537d c0537d = arrayList.get(i);
            c0537d.f1699c = false;
            c0537d.f1698b = 0;
        }
    }

    /* renamed from: F */
    public void mo12197F(C0503d c0503d) {
        this.f1725K.m12267k();
        this.f1726L.m12267k();
        this.f1727M.m12267k();
        this.f1728N.m12267k();
        this.f1729O.m12267k();
        this.f1732R.m12267k();
        this.f1730P.m12267k();
        this.f1731Q.m12267k();
    }

    /* renamed from: I */
    public final void m12257I(int i, int i2) {
        if (this.f1763l) {
            return;
        }
        this.f1725K.m12266l(i);
        this.f1727M.m12266l(i2);
        this.f1744b0 = i;
        this.f1738X = i2 - i;
        this.f1763l = true;
    }

    /* renamed from: J */
    public final void m12256J(int i, int i2) {
        if (this.f1765m) {
            return;
        }
        this.f1726L.m12266l(i);
        this.f1728N.m12266l(i2);
        this.f1746c0 = i;
        this.f1739Y = i2 - i;
        if (this.f1720F) {
            this.f1729O.m12266l(i + this.f1748d0);
        }
        this.f1765m = true;
    }

    /* renamed from: K */
    public final void m12255K(int i) {
        this.f1739Y = i;
        int i2 = this.f1752f0;
        if (i < i2) {
            this.f1739Y = i2;
        }
    }

    /* renamed from: L */
    public final void m12254L(int i) {
        this.f1736V[0] = i;
    }

    /* renamed from: M */
    public final void m12253M(int i) {
        this.f1736V[1] = i;
    }

    /* renamed from: N */
    public final void m12252N(int i) {
        this.f1738X = i;
        int i2 = this.f1750e0;
        if (i < i2) {
            this.f1738X = i2;
        }
    }

    /* renamed from: O */
    public void mo12230O(boolean z, boolean z2) {
        int i;
        int i2;
        C0529m c0529m = this.f1747d;
        boolean z3 = z & c0529m.f1674g;
        C0531o c0531o = this.f1749e;
        boolean z4 = z2 & c0531o.f1674g;
        int i3 = c0529m.f1675h.f1649g;
        int i4 = c0531o.f1675h.f1649g;
        int i5 = c0529m.f1676i.f1649g;
        int i6 = c0531o.f1676i.f1649g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.f1744b0 = i3;
        }
        if (z4) {
            this.f1746c0 = i4;
        }
        if (this.f1760j0 == 8) {
            this.f1738X = 0;
            this.f1739Y = 0;
            return;
        }
        int[] iArr = this.f1736V;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.f1738X)) {
                i8 = i2;
            }
            this.f1738X = i8;
            int i10 = this.f1750e0;
            if (i8 < i10) {
                this.f1738X = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.f1739Y)) {
                i9 = i;
            }
            this.f1739Y = i9;
            int i11 = this.f1752f0;
            if (i9 < i11) {
                this.f1739Y = i11;
            }
        }
    }

    /* renamed from: P */
    public void mo12213P(C0504e c0504e, boolean z) {
        int i;
        int i2;
        C0531o c0531o;
        C0529m c0529m;
        c0504e.getClass();
        int m12351o = C0504e.m12351o(this.f1725K);
        int m12351o2 = C0504e.m12351o(this.f1726L);
        int m12351o3 = C0504e.m12351o(this.f1727M);
        int m12351o4 = C0504e.m12351o(this.f1728N);
        if (z && (c0529m = this.f1747d) != null) {
            C0523g c0523g = c0529m.f1675h;
            if (c0523g.f1652j) {
                C0523g c0523g2 = c0529m.f1676i;
                if (c0523g2.f1652j) {
                    m12351o = c0523g.f1649g;
                    m12351o3 = c0523g2.f1649g;
                }
            }
        }
        if (z && (c0531o = this.f1749e) != null) {
            C0523g c0523g3 = c0531o.f1675h;
            if (c0523g3.f1652j) {
                C0523g c0523g4 = c0531o.f1676i;
                if (c0523g4.f1652j) {
                    m12351o2 = c0523g3.f1649g;
                    m12351o4 = c0523g4.f1649g;
                }
            }
        }
        int i3 = m12351o4 - m12351o2;
        if (m12351o3 - m12351o < 0 || i3 < 0 || m12351o == Integer.MIN_VALUE || m12351o == Integer.MAX_VALUE || m12351o2 == Integer.MIN_VALUE || m12351o2 == Integer.MAX_VALUE || m12351o3 == Integer.MIN_VALUE || m12351o3 == Integer.MAX_VALUE || m12351o4 == Integer.MIN_VALUE || m12351o4 == Integer.MAX_VALUE) {
            m12351o = 0;
            m12351o2 = 0;
            m12351o3 = 0;
            m12351o4 = 0;
        }
        int i4 = m12351o3 - m12351o;
        int i5 = m12351o4 - m12351o2;
        this.f1744b0 = m12351o;
        this.f1746c0 = m12351o2;
        if (this.f1760j0 == 8) {
            this.f1738X = 0;
            this.f1739Y = 0;
            return;
        }
        int[] iArr = this.f1736V;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.f1738X)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.f1739Y)) {
            i5 = i;
        }
        this.f1738X = i4;
        this.f1739Y = i5;
        int i7 = this.f1752f0;
        if (i5 < i7) {
            this.f1739Y = i7;
        }
        int i8 = this.f1750e0;
        if (i4 < i8) {
            this.f1738X = i8;
        }
        int i9 = this.f1781w;
        if (i9 > 0 && i6 == 3) {
            this.f1738X = Math.min(this.f1738X, i9);
        }
        int i10 = this.f1784z;
        if (i10 > 0 && iArr[1] == 3) {
            this.f1739Y = Math.min(this.f1739Y, i10);
        }
        int i11 = this.f1738X;
        if (i4 != i11) {
            this.f1757i = i11;
        }
        int i12 = this.f1739Y;
        if (i5 != i12) {
            this.f1759j = i12;
        }
    }

    /* renamed from: b */
    public final void m12251b(C0541g c0541g, C0504e c0504e, HashSet<C0540f> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            C0547l.m12205c(c0541g, c0504e, this);
            hashSet.remove(this);
            mo12211c(c0504e, c0541g.m12225V(64));
        }
        if (i == 0) {
            HashSet<C0537d> hashSet2 = this.f1725K.f1697a;
            if (hashSet2 != null) {
                Iterator<C0537d> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f1700d.m12251b(c0541g, c0504e, hashSet, i, true);
                }
            }
            HashSet<C0537d> hashSet3 = this.f1727M.f1697a;
            if (hashSet3 != null) {
                Iterator<C0537d> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f1700d.m12251b(c0541g, c0504e, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<C0537d> hashSet4 = this.f1726L.f1697a;
        if (hashSet4 != null) {
            Iterator<C0537d> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f1700d.m12251b(c0541g, c0504e, hashSet, i, true);
            }
        }
        HashSet<C0537d> hashSet5 = this.f1728N.f1697a;
        if (hashSet5 != null) {
            Iterator<C0537d> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f1700d.m12251b(c0541g, c0504e, hashSet, i, true);
            }
        }
        HashSet<C0537d> hashSet6 = this.f1729O.f1697a;
        if (hashSet6 != null) {
            Iterator<C0537d> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f1700d.m12251b(c0541g, c0504e, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d9, code lost:
        if (r0.m12274d() > r3.f1794J0.get().m12274d()) goto L408;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo12211c(androidx.constraintlayout.core.C0504e r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 1943
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0540f.mo12211c(androidx.constraintlayout.core.e, boolean):void");
    }

    /* renamed from: d */
    public boolean mo12210d() {
        return this.f1760j0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x0364 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0411 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:363:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12250e(androidx.constraintlayout.core.C0504e r29, boolean r30, boolean r31, boolean r32, boolean r33, androidx.constraintlayout.core.C0512j r34, androidx.constraintlayout.core.C0512j r35, int r36, boolean r37, androidx.constraintlayout.core.widgets.C0537d r38, androidx.constraintlayout.core.widgets.C0537d r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0540f.m12250e(androidx.constraintlayout.core.e, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.j, androidx.constraintlayout.core.j, int, boolean, androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.widgets.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x013c, code lost:
        if (r13 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
        if (r13.m12270h() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018a, code lost:
        if (r13.m12270h() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018c, code lost:
        r11.m12268j();
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12249f(androidx.constraintlayout.core.widgets.C0537d.EnumC0538a r11, androidx.constraintlayout.core.widgets.C0540f r12, androidx.constraintlayout.core.widgets.C0537d.EnumC0538a r13, int r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0540f.m12249f(androidx.constraintlayout.core.widgets.d$a, androidx.constraintlayout.core.widgets.f, androidx.constraintlayout.core.widgets.d$a, int):void");
    }

    /* renamed from: g */
    public final void m12248g(C0537d c0537d, C0537d c0537d2, int i) {
        if (c0537d.f1700d == this) {
            m12249f(c0537d.f1701e, c0537d2.f1700d, c0537d2.f1701e, i);
        }
    }

    /* renamed from: h */
    public final void m12247h(C0504e c0504e) {
        c0504e.m12354l(this.f1725K);
        c0504e.m12354l(this.f1726L);
        c0504e.m12354l(this.f1727M);
        c0504e.m12354l(this.f1728N);
        if (this.f1748d0 > 0) {
            c0504e.m12354l(this.f1729O);
        }
    }

    /* renamed from: i */
    public final void m12246i() {
        if (this.f1747d == null) {
            this.f1747d = new C0529m(this);
        }
        if (this.f1749e == null) {
            this.f1749e = new C0531o(this);
        }
    }

    /* renamed from: j */
    public C0537d mo12209j(C0537d.EnumC0538a enumC0538a) {
        switch (enumC0538a.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f1725K;
            case 2:
                return this.f1726L;
            case 3:
                return this.f1727M;
            case 4:
                return this.f1728N;
            case 5:
                return this.f1729O;
            case 6:
                return this.f1732R;
            case 7:
                return this.f1730P;
            case 8:
                return this.f1731Q;
            default:
                throw new AssertionError(enumC0538a.name());
        }
    }

    /* renamed from: k */
    public final int m12245k(int i) {
        int[] iArr = this.f1736V;
        if (i == 0) {
            return iArr[0];
        }
        if (i != 1) {
            return 0;
        }
        return iArr[1];
    }

    /* renamed from: l */
    public final int m12244l() {
        if (this.f1760j0 == 8) {
            return 0;
        }
        return this.f1739Y;
    }

    /* renamed from: m */
    public final C0540f m12243m(int i) {
        C0537d c0537d;
        C0537d c0537d2;
        if (i != 0) {
            if (i == 1 && (c0537d2 = (c0537d = this.f1728N).f1702f) != null && c0537d2.f1702f == c0537d) {
                return c0537d2.f1700d;
            }
            return null;
        }
        C0537d c0537d3 = this.f1727M;
        C0537d c0537d4 = c0537d3.f1702f;
        if (c0537d4 == null || c0537d4.f1702f != c0537d3) {
            return null;
        }
        return c0537d4.f1700d;
    }

    /* renamed from: n */
    public void mo12224n(StringBuilder sb) {
        sb.append("  " + this.f1761k + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f1738X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f1739Y);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f1744b0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f1746c0);
        sb.append("\n");
        m12241p(sb, "left", this.f1725K);
        m12241p(sb, "top", this.f1726L);
        m12241p(sb, "right", this.f1727M);
        m12241p(sb, "bottom", this.f1728N);
        m12241p(sb, "baseline", this.f1729O);
        m12241p(sb, "centerX", this.f1730P);
        m12241p(sb, "centerY", this.f1731Q);
        int i = this.f1738X;
        int i2 = this.f1750e0;
        int[] iArr = this.f1718D;
        int i3 = iArr[0];
        int i4 = this.f1780v;
        int i5 = this.f1777s;
        float f = this.f1782x;
        float[] fArr = this.f1768n0;
        float f2 = fArr[0];
        m12242o(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.f1739Y;
        int i7 = this.f1752f0;
        int i8 = iArr[1];
        int i9 = this.f1783y;
        int i10 = this.f1778t;
        float f3 = this.f1715A;
        float f4 = fArr[1];
        m12242o(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.f1740Z;
        int i11 = this.f1742a0;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        m12258H(sb, "    horizontalBias", this.f1754g0, 0.5f);
        m12258H(sb, "    verticalBias", this.f1756h0, 0.5f);
        m12259G(this.f1764l0, 0, "    horizontalChainStyle", sb);
        m12259G(this.f1766m0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    /* renamed from: q */
    public final int m12240q() {
        if (this.f1760j0 == 8) {
            return 0;
        }
        return this.f1738X;
    }

    /* renamed from: r */
    public final int m12239r() {
        C0540f c0540f = this.f1737W;
        return (c0540f == null || !(c0540f instanceof C0541g)) ? this.f1744b0 : ((C0541g) c0540f).f1805z0 + this.f1744b0;
    }

    /* renamed from: s */
    public final int m12238s() {
        C0540f c0540f = this.f1737W;
        return (c0540f == null || !(c0540f instanceof C0541g)) ? this.f1746c0 : ((C0541g) c0540f).f1785A0 + this.f1746c0;
    }

    /* renamed from: t */
    public final boolean m12237t(int i) {
        if (i == 0) {
            return (this.f1725K.f1702f != null ? 1 : 0) + (this.f1727M.f1702f != null ? 1 : 0) < 2;
        }
        return ((this.f1726L.f1702f != null ? 1 : 0) + (this.f1728N.f1702f != null ? 1 : 0)) + (this.f1729O.f1702f != null ? 1 : 0) < 2;
    }

    public String toString() {
        String str = "";
        StringBuilder m12383b = C0499a.m12383b("");
        if (this.f1762k0 != null) {
            str = C0484a.m12392a(new StringBuilder("id: "), this.f1762k0, " ");
        }
        m12383b.append(str);
        m12383b.append("(");
        m12383b.append(this.f1744b0);
        m12383b.append(", ");
        m12383b.append(this.f1746c0);
        m12383b.append(") - (");
        m12383b.append(this.f1738X);
        m12383b.append(" x ");
        return C0539e.m12264b(m12383b, this.f1739Y, ")");
    }

    /* renamed from: u */
    public final boolean m12236u(int i, int i2) {
        C0537d c0537d;
        C0537d c0537d2;
        C0537d c0537d3;
        C0537d c0537d4;
        if (i == 0) {
            C0537d c0537d5 = this.f1725K;
            C0537d c0537d6 = c0537d5.f1702f;
            if (c0537d6 != null && c0537d6.f1699c && (c0537d4 = (c0537d3 = this.f1727M).f1702f) != null && c0537d4.f1699c) {
                if ((c0537d4.m12274d() - c0537d3.m12273e()) - (c0537d5.m12273e() + c0537d5.f1702f.m12274d()) >= i2) {
                    return true;
                }
                return false;
            }
        } else {
            C0537d c0537d7 = this.f1726L;
            C0537d c0537d8 = c0537d7.f1702f;
            if (c0537d8 != null && c0537d8.f1699c && (c0537d2 = (c0537d = this.f1728N).f1702f) != null && c0537d2.f1699c) {
                if ((c0537d2.m12274d() - c0537d.m12273e()) - (c0537d7.m12273e() + c0537d7.f1702f.m12274d()) >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void m12235v(C0537d.EnumC0538a enumC0538a, C0540f c0540f, C0537d.EnumC0538a enumC0538a2, int i, int i2) {
        mo12209j(enumC0538a).m12276b(c0540f.mo12209j(enumC0538a2), i, i2, true);
    }

    /* renamed from: w */
    public final boolean m12234w(int i) {
        C0537d c0537d;
        C0537d c0537d2;
        int i2 = i * 2;
        C0537d[] c0537dArr = this.f1733S;
        C0537d c0537d3 = c0537dArr[i2];
        C0537d c0537d4 = c0537d3.f1702f;
        return (c0537d4 == null || c0537d4.f1702f == c0537d3 || (c0537d2 = (c0537d = c0537dArr[i2 + 1]).f1702f) == null || c0537d2.f1702f != c0537d) ? false : true;
    }

    /* renamed from: x */
    public final boolean m12233x() {
        C0537d c0537d = this.f1725K;
        C0537d c0537d2 = c0537d.f1702f;
        if (c0537d2 == null || c0537d2.f1702f != c0537d) {
            C0537d c0537d3 = this.f1727M;
            C0537d c0537d4 = c0537d3.f1702f;
            return c0537d4 != null && c0537d4.f1702f == c0537d3;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m12232y() {
        C0537d c0537d = this.f1726L;
        C0537d c0537d2 = c0537d.f1702f;
        if (c0537d2 == null || c0537d2.f1702f != c0537d) {
            C0537d c0537d3 = this.f1728N;
            C0537d c0537d4 = c0537d3.f1702f;
            return c0537d4 != null && c0537d4.f1702f == c0537d3;
        }
        return true;
    }

    /* renamed from: z */
    public final boolean m12231z() {
        return this.f1753g && this.f1760j0 != 8;
    }
}
