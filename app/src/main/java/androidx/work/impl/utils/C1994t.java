package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.t */
/* loaded from: classes.dex */
public final class C1994t {

    /* renamed from: e */
    public static final String f4845e = AbstractC2005l.m9732e("WorkTimer");

    /* renamed from: a */
    public final ScheduledExecutorService f4846a;

    /* renamed from: b */
    public final HashMap f4847b;

    /* renamed from: c */
    public final HashMap f4848c;

    /* renamed from: d */
    public final Object f4849d;

    /* renamed from: androidx.work.impl.utils.t$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC1995a implements ThreadFactory {

        /* renamed from: a */
        public int f4850a = 0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f4850a);
            this.f4850a = this.f4850a + 1;
            return newThread;
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: androidx.work.impl.utils.t$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1996b {
        /* renamed from: a */
        void mo9739a(@NonNull String str);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: androidx.work.impl.utils.t$c */
    /* loaded from: classes.dex */
    public static class RunnableC1997c implements Runnable {

        /* renamed from: a */
        public final C1994t f4851a;

        /* renamed from: b */
        public final String f4852b;

        public RunnableC1997c(@NonNull C1994t c1994t, @NonNull String str) {
            this.f4851a = c1994t;
            this.f4852b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f4851a.f4849d) {
                if (((RunnableC1997c) this.f4851a.f4847b.remove(this.f4852b)) != null) {
                    InterfaceC1996b interfaceC1996b = (InterfaceC1996b) this.f4851a.f4848c.remove(this.f4852b);
                    if (interfaceC1996b != null) {
                        interfaceC1996b.mo9739a(this.f4852b);
                    }
                } else {
                    AbstractC2005l.m9733c().mo9731a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f4852b), new Throwable[0]);
                }
            }
        }
    }

    public C1994t() {
        ThreadFactoryC1995a threadFactoryC1995a = new ThreadFactoryC1995a();
        this.f4847b = new HashMap();
        this.f4848c = new HashMap();
        this.f4849d = new Object();
        this.f4846a = Executors.newSingleThreadScheduledExecutor(threadFactoryC1995a);
    }

    /* renamed from: a */
    public final void m9741a(@NonNull String str, @NonNull InterfaceC1996b interfaceC1996b) {
        synchronized (this.f4849d) {
            AbstractC2005l.m9733c().mo9731a(f4845e, String.format("Starting timer for %s", str), new Throwable[0]);
            m9740b(str);
            RunnableC1997c runnableC1997c = new RunnableC1997c(this, str);
            this.f4847b.put(str, runnableC1997c);
            this.f4848c.put(str, interfaceC1996b);
            this.f4846a.schedule(runnableC1997c, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: b */
    public final void m9740b(@NonNull String str) {
        synchronized (this.f4849d) {
            if (((RunnableC1997c) this.f4847b.remove(str)) != null) {
                AbstractC2005l.m9733c().mo9731a(f4845e, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f4848c.remove(str);
            }
        }
    }
}
