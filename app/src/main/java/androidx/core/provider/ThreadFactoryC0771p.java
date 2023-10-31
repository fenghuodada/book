package androidx.core.provider;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.core.provider.p */
/* loaded from: classes.dex */
public final class ThreadFactoryC0771p implements ThreadFactory {

    /* renamed from: a */
    public final String f2467a = "fonts-androidx";

    /* renamed from: b */
    public final int f2468b = 10;

    /* renamed from: androidx.core.provider.p$a */
    /* loaded from: classes.dex */
    public static class C0772a extends Thread {

        /* renamed from: a */
        public final int f2469a;

        public C0772a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.f2469a = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f2469a);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0772a(runnable, this.f2467a, this.f2468b);
    }
}
