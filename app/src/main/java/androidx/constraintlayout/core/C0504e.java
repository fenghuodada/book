package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0501c;
import androidx.constraintlayout.core.widgets.C0537d;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.e */
/* loaded from: classes.dex */
public final class C0504e {

    /* renamed from: p */
    public static boolean f1576p = false;

    /* renamed from: q */
    public static int f1577q = 1000;

    /* renamed from: c */
    public final C0507g f1580c;

    /* renamed from: f */
    public C0501c[] f1583f;

    /* renamed from: l */
    public final C0503d f1589l;

    /* renamed from: o */
    public C0501c f1592o;

    /* renamed from: a */
    public boolean f1578a = false;

    /* renamed from: b */
    public int f1579b = 0;

    /* renamed from: d */
    public int f1581d = 32;

    /* renamed from: e */
    public int f1582e = 32;

    /* renamed from: g */
    public boolean f1584g = false;

    /* renamed from: h */
    public boolean[] f1585h = new boolean[32];

    /* renamed from: i */
    public int f1586i = 1;

    /* renamed from: j */
    public int f1587j = 0;

    /* renamed from: k */
    public int f1588k = 32;

    /* renamed from: m */
    public C0512j[] f1590m = new C0512j[f1577q];

    /* renamed from: n */
    public int f1591n = 0;

    /* renamed from: androidx.constraintlayout.core.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0505a {
        /* renamed from: a */
        C0512j mo12345a(boolean[] zArr);
    }

    public C0504e() {
        this.f1583f = null;
        this.f1583f = new C0501c[32];
        for (int i = 0; i < this.f1587j; i++) {
            C0501c[] c0501cArr = this.f1583f;
            C0501c c0501c = c0501cArr[i];
            if (c0501c != null) {
                C0506f c0506f = this.f1589l.f1573a;
                int i2 = c0506f.f1594b;
                Object[] objArr = c0506f.f1593a;
                if (i2 < objArr.length) {
                    objArr[i2] = c0501c;
                    c0506f.f1594b = i2 + 1;
                }
            }
            c0501cArr[i] = null;
        }
        C0503d c0503d = new C0503d();
        this.f1589l = c0503d;
        this.f1580c = new C0507g(c0503d);
        this.f1592o = new C0501c(c0503d);
    }

    /* renamed from: o */
    public static int m12351o(C0537d c0537d) {
        C0512j c0512j = c0537d.f1705i;
        if (c0512j != null) {
            return (int) (c0512j.f1606e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* renamed from: a */
    public final C0512j m12365a(int i) {
        C0506f c0506f = this.f1589l.f1574b;
        int i2 = c0506f.f1594b;
        C0512j c0512j = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = c0506f.f1593a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            c0506f.f1594b = i3;
            c0512j = r4;
        }
        C0512j c0512j2 = c0512j;
        if (c0512j2 == null) {
            c0512j2 = new C0512j(i);
        } else {
            c0512j2.m12333c();
        }
        c0512j2.f1610i = i;
        int i4 = this.f1591n;
        int i5 = f1577q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f1577q = i6;
            this.f1590m = (C0512j[]) Arrays.copyOf(this.f1590m, i6);
        }
        C0512j[] c0512jArr = this.f1590m;
        int i7 = this.f1591n;
        this.f1591n = i7 + 1;
        c0512jArr[i7] = c0512j2;
        return c0512j2;
    }

    /* renamed from: b */
    public final void m12364b(C0512j c0512j, C0512j c0512j2, int i, float f, C0512j c0512j3, C0512j c0512j4, int i2, int i3) {
        int i4;
        float f2;
        C0501c m12353m = m12353m();
        if (c0512j2 == c0512j3) {
            m12353m.f1571d.mo12373d(c0512j, 1.0f);
            m12353m.f1571d.mo12373d(c0512j4, 1.0f);
            m12353m.f1571d.mo12373d(c0512j2, -2.0f);
        } else {
            if (f == 0.5f) {
                m12353m.f1571d.mo12373d(c0512j, 1.0f);
                m12353m.f1571d.mo12373d(c0512j2, -1.0f);
                m12353m.f1571d.mo12373d(c0512j3, -1.0f);
                m12353m.f1571d.mo12373d(c0512j4, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f2 = i4;
                }
            } else if (f <= 0.0f) {
                m12353m.f1571d.mo12373d(c0512j, -1.0f);
                m12353m.f1571d.mo12373d(c0512j2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                m12353m.f1571d.mo12373d(c0512j4, -1.0f);
                m12353m.f1571d.mo12373d(c0512j3, 1.0f);
                i4 = -i2;
                f2 = i4;
            } else {
                float f3 = 1.0f - f;
                m12353m.f1571d.mo12373d(c0512j, f3 * 1.0f);
                m12353m.f1571d.mo12373d(c0512j2, f3 * (-1.0f));
                m12353m.f1571d.mo12373d(c0512j3, (-1.0f) * f);
                m12353m.f1571d.mo12373d(c0512j4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    m12353m.f1569b = (i2 * f) + ((-i) * f3);
                }
            }
            m12353m.f1569b = f2;
        }
        if (i3 != 8) {
            m12353m.m12382b(this, i3);
        }
        m12363c(m12353m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
        if (r4.f1613l <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
        if (r4.f1613l <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e0, code lost:
        if (r4.f1613l <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e9, code lost:
        if (r4.f1613l <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ec, code lost:
        r14 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b7  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12363c(androidx.constraintlayout.core.C0501c r17) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0504e.m12363c(androidx.constraintlayout.core.c):void");
    }

    /* renamed from: d */
    public final void m12362d(C0512j c0512j, int i) {
        C0501c m12353m;
        C0501c.InterfaceC0502a interfaceC0502a;
        float f;
        int i2 = c0512j.f1604c;
        if (i2 == -1) {
            c0512j.m12332d(this, i);
            for (int i3 = 0; i3 < this.f1579b + 1; i3++) {
                C0512j c0512j2 = this.f1589l.f1575c[i3];
            }
            return;
        }
        if (i2 != -1) {
            C0501c c0501c = this.f1583f[i2];
            if (!c0501c.f1572e) {
                if (c0501c.f1571d.mo12376a() == 0) {
                    c0501c.f1572e = true;
                } else {
                    m12353m = m12353m();
                    if (i < 0) {
                        m12353m.f1569b = i * (-1);
                        interfaceC0502a = m12353m.f1571d;
                        f = 1.0f;
                    } else {
                        m12353m.f1569b = i;
                        interfaceC0502a = m12353m.f1571d;
                        f = -1.0f;
                    }
                    interfaceC0502a.mo12373d(c0512j, f);
                }
            }
            c0501c.f1569b = i;
            return;
        }
        m12353m = m12353m();
        m12353m.f1568a = c0512j;
        float f2 = i;
        c0512j.f1606e = f2;
        m12353m.f1569b = f2;
        m12353m.f1572e = true;
        m12363c(m12353m);
    }

    /* renamed from: e */
    public final void m12361e(C0512j c0512j, C0512j c0512j2, int i, int i2) {
        if (i2 == 8 && c0512j2.f1607f && c0512j.f1604c == -1) {
            c0512j.m12332d(this, c0512j2.f1606e + i);
            return;
        }
        C0501c m12353m = m12353m();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            m12353m.f1569b = i;
        }
        if (!z) {
            m12353m.f1571d.mo12373d(c0512j, -1.0f);
            m12353m.f1571d.mo12373d(c0512j2, 1.0f);
        } else {
            m12353m.f1571d.mo12373d(c0512j, 1.0f);
            m12353m.f1571d.mo12373d(c0512j2, -1.0f);
        }
        if (i2 != 8) {
            m12353m.m12382b(this, i2);
        }
        m12363c(m12353m);
    }

    /* renamed from: f */
    public final void m12360f(C0512j c0512j, C0512j c0512j2, int i, int i2) {
        C0501c m12353m = m12353m();
        C0512j m12352n = m12352n();
        m12352n.f1605d = 0;
        m12353m.m12381c(c0512j, c0512j2, m12352n, i);
        if (i2 != 8) {
            m12353m.f1571d.mo12373d(m12355k(i2), (int) (m12353m.f1571d.mo12367j(m12352n) * (-1.0f)));
        }
        m12363c(m12353m);
    }

    /* renamed from: g */
    public final void m12359g(C0512j c0512j, C0512j c0512j2, int i, int i2) {
        C0501c m12353m = m12353m();
        C0512j m12352n = m12352n();
        m12352n.f1605d = 0;
        m12353m.m12380d(c0512j, c0512j2, m12352n, i);
        if (i2 != 8) {
            m12353m.f1571d.mo12373d(m12355k(i2), (int) (m12353m.f1571d.mo12367j(m12352n) * (-1.0f)));
        }
        m12363c(m12353m);
    }

    /* renamed from: h */
    public final void m12358h(C0512j c0512j, C0512j c0512j2, C0512j c0512j3, C0512j c0512j4, float f) {
        C0501c m12353m = m12353m();
        m12353m.f1571d.mo12373d(c0512j, -1.0f);
        m12353m.f1571d.mo12373d(c0512j2, 1.0f);
        m12353m.f1571d.mo12373d(c0512j3, f);
        m12353m.f1571d.mo12373d(c0512j4, -f);
        m12363c(m12353m);
    }

    /* renamed from: i */
    public final void m12357i(C0501c c0501c) {
        int i;
        if (c0501c.f1572e) {
            c0501c.f1568a.m12332d(this, c0501c.f1569b);
        } else {
            C0501c[] c0501cArr = this.f1583f;
            int i2 = this.f1587j;
            c0501cArr[i2] = c0501c;
            C0512j c0512j = c0501c.f1568a;
            c0512j.f1604c = i2;
            this.f1587j = i2 + 1;
            c0512j.m12331f(this, c0501c);
        }
        if (this.f1578a) {
            int i3 = 0;
            while (i3 < this.f1587j) {
                if (this.f1583f[i3] == null) {
                    System.out.println("WTF");
                }
                C0501c c0501c2 = this.f1583f[i3];
                if (c0501c2 != null && c0501c2.f1572e) {
                    c0501c2.f1568a.m12332d(this, c0501c2.f1569b);
                    C0506f c0506f = this.f1589l.f1573a;
                    int i4 = c0506f.f1594b;
                    Object[] objArr = c0506f.f1593a;
                    if (i4 < objArr.length) {
                        objArr[i4] = c0501c2;
                        c0506f.f1594b = i4 + 1;
                    }
                    this.f1583f[i3] = null;
                    int i5 = i3 + 1;
                    int i6 = i5;
                    while (true) {
                        i = this.f1587j;
                        if (i5 >= i) {
                            break;
                        }
                        C0501c[] c0501cArr2 = this.f1583f;
                        int i7 = i5 - 1;
                        C0501c c0501c3 = c0501cArr2[i5];
                        c0501cArr2[i7] = c0501c3;
                        C0512j c0512j2 = c0501c3.f1568a;
                        if (c0512j2.f1604c == i5) {
                            c0512j2.f1604c = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i) {
                        this.f1583f[i6] = null;
                    }
                    this.f1587j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f1578a = false;
        }
    }

    /* renamed from: j */
    public final void m12356j() {
        for (int i = 0; i < this.f1587j; i++) {
            C0501c c0501c = this.f1583f[i];
            c0501c.f1568a.f1606e = c0501c.f1569b;
        }
    }

    /* renamed from: k */
    public final C0512j m12355k(int i) {
        if (this.f1586i + 1 >= this.f1582e) {
            m12350p();
        }
        C0512j m12365a = m12365a(4);
        int i2 = this.f1579b + 1;
        this.f1579b = i2;
        this.f1586i++;
        m12365a.f1603b = i2;
        m12365a.f1605d = i;
        this.f1589l.f1575c[i2] = m12365a;
        C0507g c0507g = this.f1580c;
        c0507g.f1598i.f1599a = m12365a;
        float[] fArr = m12365a.f1609h;
        Arrays.fill(fArr, 0.0f);
        fArr[m12365a.f1605d] = 1.0f;
        c0507g.m12342j(m12365a);
        return m12365a;
    }

    /* renamed from: l */
    public final C0512j m12354l(Object obj) {
        C0512j c0512j = null;
        if (obj == null) {
            return null;
        }
        if (this.f1586i + 1 >= this.f1582e) {
            m12350p();
        }
        if (obj instanceof C0537d) {
            C0537d c0537d = (C0537d) obj;
            c0512j = c0537d.f1705i;
            if (c0512j == null) {
                c0537d.m12267k();
                c0512j = c0537d.f1705i;
            }
            int i = c0512j.f1603b;
            C0503d c0503d = this.f1589l;
            if (i == -1 || i > this.f1579b || c0503d.f1575c[i] == null) {
                if (i != -1) {
                    c0512j.m12333c();
                }
                int i2 = this.f1579b + 1;
                this.f1579b = i2;
                this.f1586i++;
                c0512j.f1603b = i2;
                c0512j.f1610i = 1;
                c0503d.f1575c[i2] = c0512j;
            }
        }
        return c0512j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* renamed from: m */
    public final C0501c m12353m() {
        C0501c c0501c;
        C0503d c0503d = this.f1589l;
        C0506f c0506f = c0503d.f1573a;
        int i = c0506f.f1594b;
        if (i > 0) {
            int i2 = i - 1;
            ?? r4 = c0506f.f1593a;
            ?? r5 = r4[i2];
            r4[i2] = 0;
            c0506f.f1594b = i2;
            c0501c = r5;
        } else {
            c0501c = null;
        }
        C0501c c0501c2 = c0501c;
        if (c0501c2 == null) {
            return new C0501c(c0503d);
        }
        c0501c2.f1568a = null;
        c0501c2.f1571d.clear();
        c0501c2.f1569b = 0.0f;
        c0501c2.f1572e = false;
        return c0501c2;
    }

    /* renamed from: n */
    public final C0512j m12352n() {
        if (this.f1586i + 1 >= this.f1582e) {
            m12350p();
        }
        C0512j m12365a = m12365a(3);
        int i = this.f1579b + 1;
        this.f1579b = i;
        this.f1586i++;
        m12365a.f1603b = i;
        this.f1589l.f1575c[i] = m12365a;
        return m12365a;
    }

    /* renamed from: p */
    public final void m12350p() {
        int i = this.f1581d * 2;
        this.f1581d = i;
        this.f1583f = (C0501c[]) Arrays.copyOf(this.f1583f, i);
        C0503d c0503d = this.f1589l;
        c0503d.f1575c = (C0512j[]) Arrays.copyOf(c0503d.f1575c, this.f1581d);
        int i2 = this.f1581d;
        this.f1585h = new boolean[i2];
        this.f1582e = i2;
        this.f1588k = i2;
    }

    /* renamed from: q */
    public final void m12349q() throws Exception {
        C0507g c0507g = this.f1580c;
        if (c0507g.mo12344e()) {
            m12356j();
            return;
        }
        if (this.f1584g) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f1587j) {
                    z = true;
                    break;
                } else if (!this.f1583f[i].f1572e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                m12356j();
                return;
            }
        }
        m12348r(c0507g);
    }

    /* renamed from: r */
    public final void m12348r(C0507g c0507g) throws Exception {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 < this.f1587j) {
                C0501c c0501c = this.f1583f[i2];
                if (c0501c.f1568a.f1610i != 1 && c0501c.f1569b < 0.0f) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.f1587j) {
                    C0501c c0501c2 = this.f1583f[i6];
                    if (c0501c2.f1568a.f1610i != i && !c0501c2.f1572e && c0501c2.f1569b < f) {
                        int mo12376a = c0501c2.f1571d.mo12376a();
                        int i8 = 0;
                        while (i8 < mo12376a) {
                            C0512j mo12372e = c0501c2.f1571d.mo12372e(i8);
                            float mo12367j = c0501c2.f1571d.mo12367j(mo12372e);
                            if (mo12367j > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = mo12372e.f1608g[i9] / mo12367j;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i5 = mo12372e.f1603b;
                                        i7 = i9;
                                        f2 = f3;
                                        i4 = i6;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i6++;
                    f = 0.0f;
                    i = 1;
                }
                if (i4 != -1) {
                    C0501c c0501c3 = this.f1583f[i4];
                    c0501c3.f1568a.f1604c = -1;
                    c0501c3.m12378g(this.f1589l.f1575c[i5]);
                    C0512j c0512j = c0501c3.f1568a;
                    c0512j.f1604c = i4;
                    c0512j.m12331f(this, c0501c3);
                } else {
                    z2 = true;
                }
                if (i3 > this.f1586i / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        m12347s(c0507g);
        m12356j();
    }

    /* renamed from: s */
    public final void m12347s(C0501c c0501c) {
        for (int i = 0; i < this.f1586i; i++) {
            this.f1585h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f1586i * 2) {
                return;
            }
            C0512j c0512j = c0501c.f1568a;
            if (c0512j != null) {
                this.f1585h[c0512j.f1603b] = true;
            }
            C0512j mo12345a = c0501c.mo12345a(this.f1585h);
            if (mo12345a != null) {
                boolean[] zArr = this.f1585h;
                int i3 = mo12345a.f1603b;
                if (zArr[i3]) {
                    return;
                }
                zArr[i3] = true;
            }
            if (mo12345a != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f1587j; i5++) {
                    C0501c c0501c2 = this.f1583f[i5];
                    if (c0501c2.f1568a.f1610i != 1 && !c0501c2.f1572e && c0501c2.f1571d.mo12375b(mo12345a)) {
                        float mo12367j = c0501c2.f1571d.mo12367j(mo12345a);
                        if (mo12367j < 0.0f) {
                            float f2 = (-c0501c2.f1569b) / mo12367j;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0501c c0501c3 = this.f1583f[i4];
                    c0501c3.f1568a.f1604c = -1;
                    c0501c3.m12378g(mo12345a);
                    C0512j c0512j2 = c0501c3.f1568a;
                    c0512j2.f1604c = i4;
                    c0512j2.m12331f(this, c0501c3);
                }
            } else {
                z = true;
            }
        }
    }

    /* renamed from: t */
    public final void m12346t() {
        C0503d c0503d;
        int i = 0;
        while (true) {
            c0503d = this.f1589l;
            C0512j[] c0512jArr = c0503d.f1575c;
            if (i >= c0512jArr.length) {
                break;
            }
            C0512j c0512j = c0512jArr[i];
            if (c0512j != null) {
                c0512j.m12333c();
            }
            i++;
        }
        C0512j[] c0512jArr2 = this.f1590m;
        int i2 = this.f1591n;
        C0506f c0506f = c0503d.f1574b;
        c0506f.getClass();
        if (i2 > c0512jArr2.length) {
            i2 = c0512jArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0512j c0512j2 = c0512jArr2[i3];
            int i4 = c0506f.f1594b;
            Object[] objArr = c0506f.f1593a;
            if (i4 < objArr.length) {
                objArr[i4] = c0512j2;
                c0506f.f1594b = i4 + 1;
            }
        }
        this.f1591n = 0;
        Arrays.fill(c0503d.f1575c, (Object) null);
        this.f1579b = 0;
        C0507g c0507g = this.f1580c;
        c0507g.f1597h = 0;
        c0507g.f1569b = 0.0f;
        this.f1586i = 1;
        for (int i5 = 0; i5 < this.f1587j; i5++) {
            C0501c c0501c = this.f1583f[i5];
        }
        for (int i6 = 0; i6 < this.f1587j; i6++) {
            C0501c[] c0501cArr = this.f1583f;
            C0501c c0501c2 = c0501cArr[i6];
            if (c0501c2 != null) {
                C0506f c0506f2 = c0503d.f1573a;
                int i7 = c0506f2.f1594b;
                Object[] objArr2 = c0506f2.f1593a;
                if (i7 < objArr2.length) {
                    objArr2[i7] = c0501c2;
                    c0506f2.f1594b = i7 + 1;
                }
            }
            c0501cArr[i6] = null;
        }
        this.f1587j = 0;
        this.f1592o = new C0501c(c0503d);
    }
}
