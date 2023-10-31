package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0512j;
import androidx.constraintlayout.core.widgets.analyzer.C0526j;
import androidx.constraintlayout.core.widgets.analyzer.C0532p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.d */
/* loaded from: classes.dex */
public final class C0537d {

    /* renamed from: b */
    public int f1698b;

    /* renamed from: c */
    public boolean f1699c;

    /* renamed from: d */
    public final C0540f f1700d;

    /* renamed from: e */
    public final EnumC0538a f1701e;

    /* renamed from: f */
    public C0537d f1702f;

    /* renamed from: i */
    public C0512j f1705i;

    /* renamed from: a */
    public HashSet<C0537d> f1697a = null;

    /* renamed from: g */
    public int f1703g = 0;

    /* renamed from: h */
    public int f1704h = Integer.MIN_VALUE;

    /* renamed from: androidx.constraintlayout.core.widgets.d$a */
    /* loaded from: classes.dex */
    public enum EnumC0538a {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0537d(C0540f c0540f, EnumC0538a enumC0538a) {
        this.f1700d = c0540f;
        this.f1701e = enumC0538a;
    }

    /* renamed from: a */
    public final void m12277a(C0537d c0537d, int i) {
        m12276b(c0537d, i, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public final boolean m12276b(C0537d c0537d, int i, int i2, boolean z) {
        if (c0537d == null) {
            m12268j();
            return true;
        } else if (z || m12269i(c0537d)) {
            this.f1702f = c0537d;
            if (c0537d.f1697a == null) {
                c0537d.f1697a = new HashSet<>();
            }
            HashSet<C0537d> hashSet = this.f1702f.f1697a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f1703g = i;
            this.f1704h = i2;
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public final void m12275c(int i, C0532p c0532p, ArrayList arrayList) {
        HashSet<C0537d> hashSet = this.f1697a;
        if (hashSet != null) {
            Iterator<C0537d> it = hashSet.iterator();
            while (it.hasNext()) {
                C0526j.m12304a(it.next().f1700d, i, arrayList, c0532p);
            }
        }
    }

    /* renamed from: d */
    public final int m12274d() {
        if (this.f1699c) {
            return this.f1698b;
        }
        return 0;
    }

    /* renamed from: e */
    public final int m12273e() {
        C0537d c0537d;
        if (this.f1700d.f1760j0 == 8) {
            return 0;
        }
        int i = this.f1704h;
        if (i != Integer.MIN_VALUE && (c0537d = this.f1702f) != null && c0537d.f1700d.f1760j0 == 8) {
            return i;
        }
        return this.f1703g;
    }

    /* renamed from: f */
    public final C0537d m12272f() {
        EnumC0538a enumC0538a = this.f1701e;
        int ordinal = enumC0538a.ordinal();
        C0540f c0540f = this.f1700d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0540f.f1727M;
            case 2:
                return c0540f.f1728N;
            case 3:
                return c0540f.f1725K;
            case 4:
                return c0540f.f1726L;
            default:
                throw new AssertionError(enumC0538a.name());
        }
    }

    /* renamed from: g */
    public final boolean m12271g() {
        HashSet<C0537d> hashSet = this.f1697a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C0537d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m12272f().m12270h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m12270h() {
        return this.f1702f != null;
    }

    /* renamed from: i */
    public final boolean m12269i(C0537d c0537d) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (c0537d == null) {
            return false;
        }
        EnumC0538a enumC0538a = EnumC0538a.BASELINE;
        EnumC0538a enumC0538a2 = this.f1701e;
        C0540f c0540f = c0537d.f1700d;
        EnumC0538a enumC0538a3 = c0537d.f1701e;
        if (enumC0538a3 == enumC0538a2) {
            if (enumC0538a2 == enumC0538a && (!c0540f.f1720F || !this.f1700d.f1720F)) {
                return false;
            }
            return true;
        }
        int ordinal = enumC0538a2.ordinal();
        EnumC0538a enumC0538a4 = EnumC0538a.CENTER_Y;
        EnumC0538a enumC0538a5 = EnumC0538a.RIGHT;
        EnumC0538a enumC0538a6 = EnumC0538a.CENTER_X;
        EnumC0538a enumC0538a7 = EnumC0538a.LEFT;
        switch (ordinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                if (enumC0538a3 != enumC0538a7 && enumC0538a3 != enumC0538a5) {
                    z = false;
                } else {
                    z = true;
                }
                if (c0540f instanceof C0544i) {
                    if (z || enumC0538a3 == enumC0538a6) {
                        z3 = true;
                    }
                    return z3;
                }
                return z;
            case 2:
            case 4:
                if (enumC0538a3 != EnumC0538a.TOP && enumC0538a3 != EnumC0538a.BOTTOM) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (c0540f instanceof C0544i) {
                    if (z2 || enumC0538a3 == enumC0538a4) {
                        z3 = true;
                    }
                    return z3;
                }
                return z2;
            case 5:
                if (enumC0538a3 == enumC0538a7 || enumC0538a3 == enumC0538a5) {
                    return false;
                }
                return true;
            case 6:
                if (enumC0538a3 == enumC0538a || enumC0538a3 == enumC0538a6 || enumC0538a3 == enumC0538a4) {
                    return false;
                }
                return true;
            default:
                throw new AssertionError(enumC0538a2.name());
        }
    }

    /* renamed from: j */
    public final void m12268j() {
        HashSet<C0537d> hashSet;
        C0537d c0537d = this.f1702f;
        if (c0537d != null && (hashSet = c0537d.f1697a) != null) {
            hashSet.remove(this);
            if (this.f1702f.f1697a.size() == 0) {
                this.f1702f.f1697a = null;
            }
        }
        this.f1697a = null;
        this.f1702f = null;
        this.f1703g = 0;
        this.f1704h = Integer.MIN_VALUE;
        this.f1699c = false;
        this.f1698b = 0;
    }

    /* renamed from: k */
    public final void m12267k() {
        C0512j c0512j = this.f1705i;
        if (c0512j == null) {
            this.f1705i = new C0512j(1);
        } else {
            c0512j.m12333c();
        }
    }

    /* renamed from: l */
    public final void m12266l(int i) {
        this.f1698b = i;
        this.f1699c = true;
    }

    public final String toString() {
        return this.f1700d.f1762k0 + ":" + this.f1701e.toString();
    }
}
