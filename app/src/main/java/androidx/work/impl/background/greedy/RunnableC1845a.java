package androidx.work.impl.background.greedy;

import androidx.work.AbstractC2005l;
import androidx.work.impl.model.C1940p;

/* renamed from: androidx.work.impl.background.greedy.a */
/* loaded from: classes.dex */
public final class RunnableC1845a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1940p f4477a;

    /* renamed from: b */
    public final /* synthetic */ C1846b f4478b;

    public RunnableC1845a(C1846b c1846b, C1940p c1940p) {
        this.f4478b = c1846b;
        this.f4477a = c1940p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2005l m9733c = AbstractC2005l.m9733c();
        String str = C1846b.f4479d;
        C1940p c1940p = this.f4477a;
        m9733c.mo9731a(str, String.format("Scheduling work %s", c1940p.f4690a), new Throwable[0]);
        this.f4478b.f4480a.mo9831a(c1940p);
    }
}
