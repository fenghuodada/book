package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0540f;
import androidx.constraintlayout.core.widgets.C0541g;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.b */
/* loaded from: classes.dex */
public final class C0516b {

    /* renamed from: a */
    public final ArrayList<C0540f> f1620a = new ArrayList<>();

    /* renamed from: b */
    public final C0517a f1621b = new C0517a();

    /* renamed from: c */
    public final C0541g f1622c;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.b$a */
    /* loaded from: classes.dex */
    public static class C0517a {

        /* renamed from: a */
        public int f1623a;

        /* renamed from: b */
        public int f1624b;

        /* renamed from: c */
        public int f1625c;

        /* renamed from: d */
        public int f1626d;

        /* renamed from: e */
        public int f1627e;

        /* renamed from: f */
        public int f1628f;

        /* renamed from: g */
        public int f1629g;

        /* renamed from: h */
        public boolean f1630h;

        /* renamed from: i */
        public boolean f1631i;

        /* renamed from: j */
        public int f1632j;
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0518b {
    }

    public C0516b(C0541g c0541g) {
        this.f1622c = c0541g;
    }

    /* renamed from: a */
    public final boolean m12328a(int i, C0540f c0540f, InterfaceC0518b interfaceC0518b) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int[] iArr = c0540f.f1736V;
        int i2 = iArr[0];
        C0517a c0517a = this.f1621b;
        c0517a.f1623a = i2;
        boolean z5 = true;
        c0517a.f1624b = iArr[1];
        c0517a.f1625c = c0540f.m12240q();
        c0517a.f1626d = c0540f.m12244l();
        c0517a.f1631i = false;
        c0517a.f1632j = i;
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
        int[] iArr2 = c0540f.f1779u;
        if (z3 && iArr2[0] == 4) {
            c0517a.f1623a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c0517a.f1624b = 1;
        }
        ((ConstraintLayout.C0564b) interfaceC0518b).m12167b(c0540f, c0517a);
        c0540f.m12252N(c0517a.f1627e);
        c0540f.m12255K(c0517a.f1628f);
        c0540f.f1720F = c0517a.f1630h;
        int i3 = c0517a.f1629g;
        c0540f.f1748d0 = i3;
        if (i3 <= 0) {
            z5 = false;
        }
        c0540f.f1720F = z5;
        c0517a.f1632j = 0;
        return c0517a.f1631i;
    }

    /* renamed from: b */
    public final void m12327b(C0541g c0541g, int i, int i2, int i3) {
        int i4 = c0541g.f1750e0;
        int i5 = c0541g.f1752f0;
        c0541g.f1750e0 = 0;
        c0541g.f1752f0 = 0;
        c0541g.m12252N(i2);
        c0541g.m12255K(i3);
        if (i4 < 0) {
            i4 = 0;
        }
        c0541g.f1750e0 = i4;
        if (i5 < 0) {
            i5 = 0;
        }
        c0541g.f1752f0 = i5;
        C0541g c0541g2 = this.f1622c;
        c0541g2.f1801v0 = i;
        c0541g2.mo12196Q();
    }

    /* renamed from: c */
    public final void m12326c(C0541g c0541g) {
        ArrayList<C0540f> arrayList = this.f1620a;
        arrayList.clear();
        int size = c0541g.f1870s0.size();
        for (int i = 0; i < size; i++) {
            C0540f c0540f = c0541g.f1870s0.get(i);
            int[] iArr = c0540f.f1736V;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0540f);
            }
        }
        c0541g.f1800u0.f1636b = true;
    }
}
