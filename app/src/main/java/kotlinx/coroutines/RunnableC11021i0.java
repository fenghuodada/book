package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC11144u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
/* renamed from: kotlinx.coroutines.i0 */
/* loaded from: classes3.dex */
public final class RunnableC11021i0 extends AbstractC11144u0 implements Runnable {
    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    @NotNull

    /* renamed from: j */
    public static final RunnableC11021i0 f21613j;

    /* renamed from: k */
    public static final long f21614k;

    static {
        Long l;
        RunnableC11021i0 runnableC11021i0 = new RunnableC11021i0();
        f21613j = runnableC11021i0;
        runnableC11021i0.m126J(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f21614k = timeUnit.toNanos(l.longValue());
    }

    @Override // kotlinx.coroutines.AbstractC11149v0
    @NotNull
    /* renamed from: M */
    public final Thread mo112M() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.AbstractC11149v0
    /* renamed from: N */
    public final void mo111N(long j, @NotNull AbstractC11144u0.AbstractRunnableC11145a abstractRunnableC11145a) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC11144u0
    /* renamed from: P */
    public final void mo121P(@NotNull Runnable runnable) {
        boolean z;
        if (debugStatus == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            super.mo121P(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* renamed from: T */
    public final synchronized void m280T() {
        boolean z;
        int i = debugStatus;
        if (i != 2 && i != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        debugStatus = 3;
        AbstractC11144u0.f21805g.set(this, null);
        AbstractC11144u0.f21806h.set(this, null);
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        C11164z1.f21819a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z2 = true;
                }
            }
            if (!z2) {
                _thread = null;
                m280T();
                if (!m119R()) {
                    mo112M();
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long mo123K = mo123K();
                if (mo123K == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f21614k + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        m280T();
                        if (!m119R()) {
                            mo112M();
                            return;
                        }
                        return;
                    } else if (mo123K > j2) {
                        mo123K = j2;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (mo123K > 0) {
                    int i2 = debugStatus;
                    if (i2 != 2 && i2 != 3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        _thread = null;
                        m280T();
                        if (!m119R()) {
                            mo112M();
                            return;
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, mo123K);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m280T();
            if (!m119R()) {
                mo112M();
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.AbstractC11144u0, kotlinx.coroutines.AbstractC11138t0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
