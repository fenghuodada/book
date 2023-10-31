package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0537d;
import androidx.constraintlayout.core.widgets.C0540f;
import androidx.constraintlayout.core.widgets.C0544i;
import androidx.constraintlayout.core.widgets.C0546k;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.j */
/* loaded from: classes.dex */
public final class C0526j {
    /* renamed from: a */
    public static C0532p m12304a(C0540f c0540f, int i, ArrayList<C0532p> arrayList, C0532p c0532p) {
        int i2;
        boolean z;
        C0537d c0537d;
        int i3;
        if (i == 0) {
            i2 = c0540f.f1774q0;
        } else {
            i2 = c0540f.f1776r0;
        }
        int i4 = 0;
        if (i2 != -1 && (c0532p == null || i2 != c0532p.f1664b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                C0532p c0532p2 = arrayList.get(i5);
                if (c0532p2.f1664b == i2) {
                    if (c0532p != null) {
                        c0532p.m12293c(i, c0532p2);
                        arrayList.remove(c0532p);
                    }
                    c0532p = c0532p2;
                } else {
                    i5++;
                }
            }
        } else if (i2 != -1) {
            return c0532p;
        }
        if (c0532p == null) {
            if (c0540f instanceof C0546k) {
                C0546k c0546k = (C0546k) c0540f;
                int i6 = 0;
                while (true) {
                    if (i6 < c0546k.f1856t0) {
                        C0540f c0540f2 = c0546k.f1855s0[i6];
                        if ((i == 0 && (i3 = c0540f2.f1774q0) != -1) || (i == 1 && (i3 = c0540f2.f1776r0) != -1)) {
                            break;
                        }
                        i6++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        C0532p c0532p3 = arrayList.get(i7);
                        if (c0532p3.f1664b == i3) {
                            c0532p = c0532p3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (c0532p == null) {
                c0532p = new C0532p(i);
            }
            arrayList.add(c0532p);
        }
        ArrayList<C0540f> arrayList2 = c0532p.f1663a;
        if (arrayList2.contains(c0540f)) {
            z = false;
        } else {
            arrayList2.add(c0540f);
            z = true;
        }
        if (z) {
            if (c0540f instanceof C0544i) {
                C0544i c0544i = (C0544i) c0540f;
                C0537d c0537d2 = c0544i.f1852v0;
                if (c0544i.f1853w0 == 0) {
                    i4 = 1;
                }
                c0537d2.m12275c(i4, c0532p, arrayList);
            }
            int i8 = c0532p.f1664b;
            if (i == 0) {
                c0540f.f1774q0 = i8;
                c0540f.f1725K.m12275c(i, c0532p, arrayList);
                c0537d = c0540f.f1727M;
            } else {
                c0540f.f1776r0 = i8;
                c0540f.f1726L.m12275c(i, c0532p, arrayList);
                c0540f.f1729O.m12275c(i, c0532p, arrayList);
                c0537d = c0540f.f1728N;
            }
            c0537d.m12275c(i, c0532p, arrayList);
            c0540f.f1732R.m12275c(i, c0532p, arrayList);
        }
        return c0532p;
    }

    /* renamed from: b */
    public static boolean m12303b(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
