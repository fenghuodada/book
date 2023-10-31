package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.plugins.C10234a;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.i */
/* loaded from: classes3.dex */
public final class CallableC10220i extends AbstractC10205a implements Callable<Void> {
    public CallableC10220i(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        FutureTask<Void> futureTask = AbstractC10205a.f20486c;
        this.f20489b = Thread.currentThread();
        try {
            this.f20488a.run();
            lazySet(futureTask);
            this.f20489b = null;
            return null;
        } catch (Throwable th) {
            C10234a.m1188a(th);
            throw th;
        }
    }
}
