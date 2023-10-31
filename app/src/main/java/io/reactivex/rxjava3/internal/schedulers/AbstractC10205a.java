package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.functions.C10179a;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10205a extends AtomicReference<Future<?>> implements InterfaceC10161b {

    /* renamed from: c */
    public static final FutureTask<Void> f20486c;

    /* renamed from: d */
    public static final FutureTask<Void> f20487d;

    /* renamed from: a */
    public final Runnable f20488a;

    /* renamed from: b */
    public Thread f20489b;

    static {
        C10179a.RunnableC10182c runnableC10182c = C10179a.f20437a;
        f20486c = new FutureTask<>(runnableC10182c, null);
        f20487d = new FutureTask<>(runnableC10182c, null);
    }

    public AbstractC10205a(Runnable runnable) {
        this.f20488a = runnable;
    }

    /* renamed from: a */
    public final void m1203a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f20486c) {
                return;
            }
            if (future2 == f20487d) {
                future.cancel(this.f20489b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
    /* renamed from: b */
    public final void mo49b() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f20486c || future == (futureTask = f20487d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f20489b != Thread.currentThread());
    }
}
