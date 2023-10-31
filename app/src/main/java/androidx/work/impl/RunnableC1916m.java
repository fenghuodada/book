package androidx.work.impl;

import androidx.work.AbstractC2005l;
import androidx.work.impl.utils.futures.C1977c;
import com.google.common.util.concurrent.InterfaceFutureC8037a;

/* renamed from: androidx.work.impl.m */
/* loaded from: classes.dex */
public final class RunnableC1916m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceFutureC8037a f4664a;

    /* renamed from: b */
    public final /* synthetic */ C1977c f4665b;

    /* renamed from: c */
    public final /* synthetic */ RunnableC1958o f4666c;

    public RunnableC1916m(RunnableC1958o runnableC1958o, C1977c c1977c, C1977c c1977c2) {
        this.f4666c = runnableC1958o;
        this.f4664a = c1977c;
        this.f4665b = c1977c2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1977c c1977c = this.f4665b;
        RunnableC1958o runnableC1958o = this.f4666c;
        try {
            this.f4664a.get();
            AbstractC2005l.m9733c().mo9731a(RunnableC1958o.f4726t, String.format("Starting work for %s", runnableC1958o.f4731e.f4692c), new Throwable[0]);
            runnableC1958o.f4744r = runnableC1958o.f4732f.startWork();
            c1977c.m9748j(runnableC1958o.f4744r);
        } catch (Throwable th) {
            c1977c.m9749i(th);
        }
    }
}
