package com.unity3d.services.core.request;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.services.core.request.a */
/* loaded from: classes3.dex */
public class C9576a extends ThreadPoolExecutor {

    /* renamed from: a */
    private final List<Runnable> f18959a;

    public C9576a(int i, int i2, long j, TimeUnit timeUnit, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        super(i, i2, j, timeUnit, linkedBlockingQueue);
        this.f18959a = new LinkedList();
    }

    /* renamed from: a */
    public synchronized void m1909a() {
        for (Runnable runnable : this.f18959a) {
            if (runnable instanceof RunnableC9587k) {
                ((RunnableC9587k) runnable).m1880a(true);
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public synchronized void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        this.f18959a.remove(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public synchronized void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.f18959a.add(runnable);
    }
}
