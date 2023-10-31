package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.engine.a */
/* loaded from: classes.dex */
public final class ThreadFactoryC3476a implements ThreadFactory {

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    /* loaded from: classes.dex */
    public class RunnableC3477a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f9229a;

        public RunnableC3477a(Runnable runnable) {
            this.f9229a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.f9229a.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(new RunnableC3477a(runnable), "glide-active-resources");
    }
}
