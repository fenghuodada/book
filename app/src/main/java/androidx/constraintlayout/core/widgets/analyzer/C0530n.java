package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.n */
/* loaded from: classes.dex */
public final class C0530n {

    /* renamed from: a */
    public final AbstractC0534q f1658a;

    /* renamed from: b */
    public final ArrayList<AbstractC0534q> f1659b = new ArrayList<>();

    public C0530n(AbstractC0534q abstractC0534q) {
        this.f1658a = null;
        this.f1658a = abstractC0534q;
    }

    /* renamed from: a */
    public static long m12298a(C0523g c0523g, long j) {
        AbstractC0534q abstractC0534q = c0523g.f1646d;
        if (abstractC0534q instanceof C0528l) {
            return j;
        }
        ArrayList arrayList = c0523g.f1653k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0520d interfaceC0520d = (InterfaceC0520d) arrayList.get(i);
            if (interfaceC0520d instanceof C0523g) {
                C0523g c0523g2 = (C0523g) interfaceC0520d;
                if (c0523g2.f1646d != abstractC0534q) {
                    j2 = Math.min(j2, m12298a(c0523g2, c0523g2.f1648f + j));
                }
            }
        }
        if (c0523g == abstractC0534q.f1676i) {
            long mo12283j = abstractC0534q.mo12283j();
            C0523g c0523g3 = abstractC0534q.f1675h;
            long j3 = j - mo12283j;
            return Math.min(Math.min(j2, m12298a(c0523g3, j3)), j3 - c0523g3.f1648f);
        }
        return j2;
    }

    /* renamed from: b */
    public static long m12297b(C0523g c0523g, long j) {
        AbstractC0534q abstractC0534q = c0523g.f1646d;
        if (abstractC0534q instanceof C0528l) {
            return j;
        }
        ArrayList arrayList = c0523g.f1653k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0520d interfaceC0520d = (InterfaceC0520d) arrayList.get(i);
            if (interfaceC0520d instanceof C0523g) {
                C0523g c0523g2 = (C0523g) interfaceC0520d;
                if (c0523g2.f1646d != abstractC0534q) {
                    j2 = Math.max(j2, m12297b(c0523g2, c0523g2.f1648f + j));
                }
            }
        }
        if (c0523g == abstractC0534q.f1675h) {
            long mo12283j = abstractC0534q.mo12283j();
            C0523g c0523g3 = abstractC0534q.f1676i;
            long j3 = j + mo12283j;
            return Math.max(Math.max(j2, m12297b(c0523g3, j3)), j3 - c0523g3.f1648f);
        }
        return j2;
    }
}
