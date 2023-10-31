package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.internal.operators.observable.C10193c;
import io.reactivex.rxjava3.plugins.C10234a;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.h */
/* loaded from: classes3.dex */
public final class RunnableC10219h extends AbstractC10205a implements Runnable {
    public RunnableC10219h(C10193c.RunnableC10194a runnableC10194a) {
        super(runnableC10194a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20489b = Thread.currentThread();
        try {
            this.f20488a.run();
            this.f20489b = null;
        } catch (Throwable th) {
            this.f20489b = null;
            mo49b();
            C10234a.m1188a(th);
            throw th;
        }
    }
}
