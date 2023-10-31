package io.reactivex.rxjava3.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.k */
/* loaded from: classes3.dex */
public final class C10222k {

    /* renamed from: a */
    public static final boolean f20539a;

    /* renamed from: b */
    public static final int f20540b;

    /* renamed from: c */
    public static final AtomicReference<ScheduledExecutorService> f20541c = new AtomicReference<>();

    /* renamed from: d */
    public static final ConcurrentHashMap f20542d = new ConcurrentHashMap();

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.k$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC10223a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = new ArrayList(C10222k.f20542d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C10222k.f20542d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041 A[LOOP:0: B:23:0x0041->B:35:0x0077, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            io.reactivex.rxjava3.internal.schedulers.C10222k.f20541c = r0
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r0.<init>()
            io.reactivex.rxjava3.internal.schedulers.C10222k.f20542d = r0
            java.lang.String r0 = "rx3.purge-enabled"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L18
            goto L23
        L18:
            java.lang.String r2 = "true"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L1f
            goto L24
        L1f:
            r0 = move-exception
            io.reactivex.rxjava3.exceptions.C10169b.m1213a(r0)
        L23:
            r0 = r1
        L24:
            io.reactivex.rxjava3.internal.schedulers.C10222k.f20539a = r0
            java.lang.String r2 = "rx3.purge-period-seconds"
            if (r0 == 0) goto L3a
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L31
            goto L3a
        L31:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L36
            goto L3b
        L36:
            r0 = move-exception
            io.reactivex.rxjava3.exceptions.C10169b.m1213a(r0)
        L3a:
            r0 = r1
        L3b:
            io.reactivex.rxjava3.internal.schedulers.C10222k.f20540b = r0
            boolean r0 = io.reactivex.rxjava3.internal.schedulers.C10222k.f20539a
            if (r0 == 0) goto L7b
        L41:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = io.reactivex.rxjava3.internal.schedulers.C10222k.f20541c
            java.lang.Object r2 = r0.get()
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            if (r2 == 0) goto L4c
            goto L7b
        L4c:
            io.reactivex.rxjava3.internal.schedulers.g r3 = new io.reactivex.rxjava3.internal.schedulers.g
            java.lang.String r4 = "RxSchedulerPurge"
            r3.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r1, r3)
        L57:
            boolean r3 = r0.compareAndSet(r2, r5)
            if (r3 == 0) goto L5f
            r0 = r1
            goto L66
        L5f:
            java.lang.Object r3 = r0.get()
            if (r3 == r2) goto L57
            r0 = 0
        L66:
            if (r0 == 0) goto L77
            io.reactivex.rxjava3.internal.schedulers.k$a r6 = new io.reactivex.rxjava3.internal.schedulers.k$a
            r6.<init>()
            int r0 = io.reactivex.rxjava3.internal.schedulers.C10222k.f20540b
            long r9 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r9
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            goto L7b
        L77:
            r5.shutdownNow()
            goto L41
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.schedulers.C10222k.<clinit>():void");
    }
}
