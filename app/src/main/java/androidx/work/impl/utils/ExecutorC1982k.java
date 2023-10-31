package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.work.impl.utils.k */
/* loaded from: classes.dex */
public final class ExecutorC1982k implements Executor {

    /* renamed from: b */
    public final Executor f4805b;

    /* renamed from: d */
    public volatile Runnable f4807d;

    /* renamed from: a */
    public final ArrayDeque<RunnableC1983a> f4804a = new ArrayDeque<>();

    /* renamed from: c */
    public final Object f4806c = new Object();

    /* renamed from: androidx.work.impl.utils.k$a */
    /* loaded from: classes.dex */
    public static class RunnableC1983a implements Runnable {

        /* renamed from: a */
        public final ExecutorC1982k f4808a;

        /* renamed from: b */
        public final Runnable f4809b;

        public RunnableC1983a(@NonNull ExecutorC1982k executorC1982k, @NonNull Runnable runnable) {
            this.f4808a = executorC1982k;
            this.f4809b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ExecutorC1982k executorC1982k = this.f4808a;
            try {
                this.f4809b.run();
            } finally {
                executorC1982k.m9743b();
            }
        }
    }

    public ExecutorC1982k(@NonNull ExecutorService executorService) {
        this.f4805b = executorService;
    }

    /* renamed from: a */
    public final boolean m9744a() {
        boolean z;
        synchronized (this.f4806c) {
            z = !this.f4804a.isEmpty();
        }
        return z;
    }

    /* renamed from: b */
    public final void m9743b() {
        synchronized (this.f4806c) {
            RunnableC1983a poll = this.f4804a.poll();
            this.f4807d = poll;
            if (poll != null) {
                this.f4805b.execute(this.f4807d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        synchronized (this.f4806c) {
            this.f4804a.add(new RunnableC1983a(this, runnable));
            if (this.f4807d == null) {
                m9743b();
            }
        }
    }
}
