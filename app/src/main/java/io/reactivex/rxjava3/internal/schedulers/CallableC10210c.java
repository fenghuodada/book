package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.functions.C10179a;
import io.reactivex.rxjava3.internal.operators.observable.C10193c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.c */
/* loaded from: classes3.dex */
public final class CallableC10210c implements Callable<Void>, InterfaceC10161b {

    /* renamed from: f */
    public static final FutureTask<Void> f20503f = new FutureTask<>(C10179a.f20437a, null);

    /* renamed from: a */
    public final Runnable f20504a;

    /* renamed from: d */
    public final ExecutorService f20507d;

    /* renamed from: e */
    public Thread f20508e;

    /* renamed from: c */
    public final AtomicReference<Future<?>> f20506c = new AtomicReference<>();

    /* renamed from: b */
    public final AtomicReference<Future<?>> f20505b = new AtomicReference<>();

    public CallableC10210c(C10193c.RunnableC10194a runnableC10194a, ScheduledExecutorService scheduledExecutorService) {
        this.f20504a = runnableC10194a;
        this.f20507d = scheduledExecutorService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1201a(java.util.concurrent.Future<?> r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r0 = r5.f20506c
            java.lang.Object r1 = r0.get()
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            java.util.concurrent.FutureTask<java.lang.Void> r2 = io.reactivex.rxjava3.internal.schedulers.CallableC10210c.f20503f
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L1b
            java.lang.Thread r0 = r5.f20508e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L17
            r3 = r4
        L17:
            r6.cancel(r3)
            return
        L1b:
            boolean r2 = r0.compareAndSet(r1, r6)
            if (r2 == 0) goto L23
            r3 = r4
            goto L29
        L23:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L1b
        L29:
            if (r3 == 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.schedulers.CallableC10210c.m1201a(java.util.concurrent.Future):void");
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
    /* renamed from: b */
    public final void mo49b() {
        AtomicReference<Future<?>> atomicReference = this.f20506c;
        FutureTask<Void> futureTask = f20503f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f20508e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f20505b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f20508e != Thread.currentThread());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r7.f20508e == java.lang.Thread.currentThread()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        r1.cancel(r5);
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Void call() throws java.lang.Exception {
        /*
            r7 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r7.f20508e = r0
            r0 = 0
            java.lang.Runnable r1 = r7.f20504a     // Catch: java.lang.Throwable -> L40
            r1.run()     // Catch: java.lang.Throwable -> L40
            r7.f20508e = r0     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.ExecutorService r1 = r7.f20507d     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.Future r1 = r1.submit(r7)     // Catch: java.lang.Throwable -> L40
        L14:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r2 = r7.f20505b     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.FutureTask<java.lang.Void> r4 = io.reactivex.rxjava3.internal.schedulers.CallableC10210c.f20503f     // Catch: java.lang.Throwable -> L40
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L2f
            java.lang.Thread r2 = r7.f20508e     // Catch: java.lang.Throwable -> L40
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L40
            if (r2 == r3) goto L2b
            r5 = r6
        L2b:
            r1.cancel(r5)     // Catch: java.lang.Throwable -> L40
            goto L3f
        L2f:
            boolean r4 = r2.compareAndSet(r3, r1)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L37
            r5 = r6
            goto L3d
        L37:
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> L40
            if (r4 == r3) goto L2f
        L3d:
            if (r5 == 0) goto L14
        L3f:
            return r0
        L40:
            r1 = move-exception
            r7.f20508e = r0
            io.reactivex.rxjava3.plugins.C10234a.m1188a(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.schedulers.CallableC10210c.call():java.lang.Object");
    }
}
