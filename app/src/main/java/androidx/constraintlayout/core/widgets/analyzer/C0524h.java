package androidx.constraintlayout.core.widgets.analyzer;

import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.h */
/* loaded from: classes.dex */
public class C0524h extends C0523g {

    /* renamed from: m */
    public int f1655m;

    public C0524h(AbstractC0534q abstractC0534q) {
        super(abstractC0534q);
        this.f1647e = abstractC0534q instanceof C0529m ? 2 : 3;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.C0523g
    /* renamed from: d */
    public final void mo12312d(int i) {
        if (this.f1652j) {
            return;
        }
        this.f1652j = true;
        this.f1649g = i;
        Iterator it = this.f1653k.iterator();
        while (it.hasNext()) {
            InterfaceC0520d interfaceC0520d = (InterfaceC0520d) it.next();
            interfaceC0520d.mo12292a(interfaceC0520d);
        }
    }
}
