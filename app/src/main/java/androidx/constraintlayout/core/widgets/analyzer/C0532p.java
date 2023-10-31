package androidx.constraintlayout.core.widgets.analyzer;

import androidx.activity.result.C0063d;
import androidx.constraintlayout.core.C0504e;
import androidx.constraintlayout.core.C0510h;
import androidx.constraintlayout.core.widgets.C0535b;
import androidx.constraintlayout.core.widgets.C0537d;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.constraintlayout.core.widgets.C0540f;
import androidx.constraintlayout.core.widgets.C0541g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.p */
/* loaded from: classes.dex */
public final class C0532p {

    /* renamed from: f */
    public static int f1662f;

    /* renamed from: b */
    public final int f1664b;

    /* renamed from: c */
    public int f1665c;

    /* renamed from: a */
    public final ArrayList<C0540f> f1663a = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<C0533a> f1666d = null;

    /* renamed from: e */
    public int f1667e = -1;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.p$a */
    /* loaded from: classes.dex */
    public class C0533a {
        public C0533a(C0540f c0540f, C0504e c0504e) {
            new WeakReference(c0540f);
            C0537d c0537d = c0540f.f1725K;
            c0504e.getClass();
            C0504e.m12351o(c0537d);
            C0504e.m12351o(c0540f.f1726L);
            C0504e.m12351o(c0540f.f1727M);
            C0504e.m12351o(c0540f.f1728N);
            C0504e.m12351o(c0540f.f1729O);
        }
    }

    public C0532p(int i) {
        this.f1664b = -1;
        int i2 = f1662f;
        f1662f = i2 + 1;
        this.f1664b = i2;
        this.f1665c = i;
    }

    /* renamed from: a */
    public final void m12295a(ArrayList<C0532p> arrayList) {
        int size = this.f1663a.size();
        if (this.f1667e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0532p c0532p = arrayList.get(i);
                if (this.f1667e == c0532p.f1664b) {
                    m12293c(this.f1665c, c0532p);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: b */
    public final int m12294b(C0504e c0504e, int i) {
        int m12351o;
        C0537d c0537d;
        ArrayList<C0540f> arrayList = this.f1663a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0541g c0541g = (C0541g) arrayList.get(0).f1737W;
        c0504e.m12346t();
        c0541g.mo12211c(c0504e, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo12211c(c0504e, false);
        }
        if (i == 0 && c0541g.f1786B0 > 0) {
            C0535b.m12280a(c0541g, c0504e, arrayList, 0);
        }
        if (i == 1 && c0541g.f1787C0 > 0) {
            C0535b.m12280a(c0541g, c0504e, arrayList, 1);
        }
        try {
            c0504e.m12349q();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f1666d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f1666d.add(new C0533a(arrayList.get(i3), c0504e));
        }
        if (i == 0) {
            m12351o = C0504e.m12351o(c0541g.f1725K);
            c0537d = c0541g.f1727M;
        } else {
            m12351o = C0504e.m12351o(c0541g.f1726L);
            c0537d = c0541g.f1728N;
        }
        int m12351o2 = C0504e.m12351o(c0537d);
        c0504e.m12346t();
        return m12351o2 - m12351o;
    }

    /* renamed from: c */
    public final void m12293c(int i, C0532p c0532p) {
        Iterator<C0540f> it = this.f1663a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i2 = c0532p.f1664b;
            if (hasNext) {
                C0540f next = it.next();
                ArrayList<C0540f> arrayList = c0532p.f1663a;
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                }
                if (i == 0) {
                    next.f1774q0 = i2;
                } else {
                    next.f1776r0 = i2;
                }
            } else {
                this.f1667e = i2;
                return;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f1665c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String m12264b = C0539e.m12264b(sb, this.f1664b, "] <");
        Iterator<C0540f> it = this.f1663a.iterator();
        while (it.hasNext()) {
            StringBuilder m12339b = C0510h.m12339b(m12264b, " ");
            m12339b.append(it.next().f1762k0);
            m12264b = m12339b.toString();
        }
        return C0063d.m13053a(m12264b, " >");
    }
}
