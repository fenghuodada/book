package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.coroutines.InterfaceC10775f;
import kotlinx.coroutines.internal.C11027c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.z0 */
/* loaded from: classes3.dex */
public final class C11163z0 extends AbstractC11158y0 implements InterfaceC11074k0 {
    @NotNull

    /* renamed from: c */
    public final Executor f21818c;

    public C11163z0(@NotNull Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f21818c = executor;
        Method method2 = C11027c.f21619a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = C11027c.f21619a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    /* renamed from: G */
    public final void mo100G(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Runnable runnable) {
        try {
            this.f21818c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            C11078l1.m224a(interfaceC10775f, cancellationException);
            C11093p0.f21709b.mo100G(interfaceC10775f, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f21818c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof C11163z0) && ((C11163z0) obj).f21818c == this.f21818c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f21818c);
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    @NotNull
    public final String toString() {
        return this.f21818c.toString();
    }
}
