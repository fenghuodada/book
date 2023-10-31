package androidx.work.impl.foreground;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.model.C1943r;

/* renamed from: androidx.work.impl.foreground.b */
/* loaded from: classes.dex */
public final class RunnableC1895b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WorkDatabase f4609a;

    /* renamed from: b */
    public final /* synthetic */ String f4610b;

    /* renamed from: c */
    public final /* synthetic */ C1896c f4611c;

    public RunnableC1895b(C1896c c1896c, WorkDatabase workDatabase, String str) {
        this.f4611c = c1896c;
        this.f4609a = workDatabase;
        this.f4610b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1940p m9793i = ((C1943r) this.f4609a.mo9893n()).m9793i(this.f4610b);
        if (m9793i == null || !m9793i.m9803b()) {
            return;
        }
        synchronized (this.f4611c.f4615c) {
            this.f4611c.f4618f.put(this.f4610b, m9793i);
            this.f4611c.f4619g.add(m9793i);
            C1896c c1896c = this.f4611c;
            c1896c.f4620h.m9853c(c1896c.f4619g);
        }
    }
}
