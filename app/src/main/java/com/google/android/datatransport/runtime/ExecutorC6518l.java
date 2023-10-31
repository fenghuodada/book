package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.C6520a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.datatransport.runtime.l */
/* loaded from: classes.dex */
public final class ExecutorC6518l implements Executor {

    /* renamed from: a */
    public final Executor f10276a;

    /* renamed from: com.google.android.datatransport.runtime.l$a */
    /* loaded from: classes.dex */
    public static class RunnableC6519a implements Runnable {

        /* renamed from: a */
        public final Runnable f10277a;

        public RunnableC6519a(Runnable runnable) {
            this.f10277a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f10277a.run();
            } catch (Exception e) {
                C6520a.m6285b("Executor", "Background execution failure.", e);
            }
        }
    }

    public ExecutorC6518l(ExecutorService executorService) {
        this.f10276a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10276a.execute(new RunnableC6519a(runnable));
    }
}
