package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.g */
/* loaded from: classes.dex */
public class C0523g implements InterfaceC0520d {

    /* renamed from: d */
    public final AbstractC0534q f1646d;

    /* renamed from: f */
    public int f1648f;

    /* renamed from: g */
    public int f1649g;

    /* renamed from: a */
    public AbstractC0534q f1643a = null;

    /* renamed from: b */
    public boolean f1644b = false;

    /* renamed from: c */
    public boolean f1645c = false;

    /* renamed from: e */
    public int f1647e = 1;

    /* renamed from: h */
    public int f1650h = 1;

    /* renamed from: i */
    public C0524h f1651i = null;

    /* renamed from: j */
    public boolean f1652j = false;

    /* renamed from: k */
    public final ArrayList f1653k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f1654l = new ArrayList();

    public C0523g(AbstractC0534q abstractC0534q) {
        this.f1646d = abstractC0534q;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC0520d
    /* renamed from: a */
    public final void mo12292a(InterfaceC0520d interfaceC0520d) {
        ArrayList arrayList = this.f1654l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0523g) it.next()).f1652j) {
                return;
            }
        }
        this.f1645c = true;
        AbstractC0534q abstractC0534q = this.f1643a;
        if (abstractC0534q != null) {
            abstractC0534q.mo12292a(this);
        }
        if (this.f1644b) {
            this.f1646d.mo12292a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0523g c0523g = null;
        int i = 0;
        while (it2.hasNext()) {
            C0523g c0523g2 = (C0523g) it2.next();
            if (!(c0523g2 instanceof C0524h)) {
                i++;
                c0523g = c0523g2;
            }
        }
        if (c0523g != null && i == 1 && c0523g.f1652j) {
            C0524h c0524h = this.f1651i;
            if (c0524h != null) {
                if (!c0524h.f1652j) {
                    return;
                }
                this.f1648f = this.f1650h * c0524h.f1649g;
            }
            mo12312d(c0523g.f1649g + this.f1648f);
        }
        AbstractC0534q abstractC0534q2 = this.f1643a;
        if (abstractC0534q2 != null) {
            abstractC0534q2.mo12292a(this);
        }
    }

    /* renamed from: b */
    public final void m12314b(InterfaceC0520d interfaceC0520d) {
        this.f1653k.add(interfaceC0520d);
        if (this.f1652j) {
            interfaceC0520d.mo12292a(interfaceC0520d);
        }
    }

    /* renamed from: c */
    public final void m12313c() {
        this.f1654l.clear();
        this.f1653k.clear();
        this.f1652j = false;
        this.f1649g = 0;
        this.f1645c = false;
        this.f1644b = false;
    }

    /* renamed from: d */
    public void mo12312d(int i) {
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

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1646d.f1669b.f1762k0);
        sb.append(":");
        sb.append(C0522f.m12315c(this.f1647e));
        sb.append("(");
        if (this.f1652j) {
            obj = Integer.valueOf(this.f1649g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f1654l.size());
        sb.append(":d=");
        sb.append(this.f1653k.size());
        sb.append(">");
        return sb.toString();
    }
}
