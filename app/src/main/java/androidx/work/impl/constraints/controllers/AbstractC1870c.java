package androidx.work.impl.constraints.controllers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.AbstractC2005l;
import androidx.work.impl.constraints.C1877d;
import androidx.work.impl.constraints.InterfaceC1865a;
import androidx.work.impl.constraints.InterfaceC1867c;
import androidx.work.impl.constraints.trackers.AbstractC1882d;
import androidx.work.impl.model.C1940p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: androidx.work.impl.constraints.controllers.c */
/* loaded from: classes.dex */
public abstract class AbstractC1870c<T> implements InterfaceC1865a<T> {

    /* renamed from: a */
    public final ArrayList f4552a = new ArrayList();

    /* renamed from: b */
    public T f4553b;

    /* renamed from: c */
    public final AbstractC1882d<T> f4554c;

    /* renamed from: d */
    public InterfaceC1871a f4555d;

    /* renamed from: androidx.work.impl.constraints.controllers.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1871a {
    }

    public AbstractC1870c(AbstractC1882d<T> abstractC1882d) {
        this.f4554c = abstractC1882d;
    }

    @Override // androidx.work.impl.constraints.InterfaceC1865a
    /* renamed from: a */
    public final void mo9860a(@Nullable T t) {
        this.f4553b = t;
        m9858e(this.f4555d, t);
    }

    /* renamed from: b */
    public abstract boolean mo9857b(@NonNull C1940p c1940p);

    /* renamed from: c */
    public abstract boolean mo9856c(@NonNull T t);

    /* renamed from: d */
    public final void m9859d(@NonNull Collection collection) {
        this.f4552a.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            C1940p c1940p = (C1940p) it.next();
            if (mo9857b(c1940p)) {
                this.f4552a.add(c1940p.f4690a);
            }
        }
        if (this.f4552a.isEmpty()) {
            this.f4554c.m9851b(this);
        } else {
            AbstractC1882d<T> abstractC1882d = this.f4554c;
            synchronized (abstractC1882d.f4570c) {
                if (abstractC1882d.f4571d.add(this)) {
                    if (abstractC1882d.f4571d.size() == 1) {
                        abstractC1882d.f4572e = abstractC1882d.mo9845a();
                        AbstractC2005l.m9733c().mo9731a(AbstractC1882d.f4567f, String.format("%s: initial state = %s", abstractC1882d.getClass().getSimpleName(), abstractC1882d.f4572e), new Throwable[0]);
                        abstractC1882d.mo9848d();
                    }
                    mo9860a(abstractC1882d.f4572e);
                }
            }
        }
        m9858e(this.f4555d, this.f4553b);
    }

    /* renamed from: e */
    public final void m9858e(@Nullable InterfaceC1871a interfaceC1871a, @Nullable T t) {
        if (!this.f4552a.isEmpty() && interfaceC1871a != null) {
            if (t != null && !mo9856c(t)) {
                ((C1877d) interfaceC1871a).m9854b(this.f4552a);
                return;
            }
            ArrayList arrayList = this.f4552a;
            C1877d c1877d = (C1877d) interfaceC1871a;
            synchronized (c1877d.f4561c) {
                InterfaceC1867c interfaceC1867c = c1877d.f4559a;
                if (interfaceC1867c != null) {
                    interfaceC1867c.mo9736e(arrayList);
                }
            }
        }
    }
}
