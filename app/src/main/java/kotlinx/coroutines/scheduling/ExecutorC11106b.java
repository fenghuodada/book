package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.C10781g;
import kotlin.coroutines.InterfaceC10775f;
import kotlinx.coroutines.AbstractC10946b0;
import kotlinx.coroutines.AbstractC11158y0;
import kotlinx.coroutines.internal.C11036g0;
import kotlinx.coroutines.internal.C11038h0;
import kotlinx.coroutines.internal.C11052n;
import kotlinx.coroutines.internal.C11054o;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.scheduling.b */
/* loaded from: classes3.dex */
public final class ExecutorC11106b extends AbstractC11158y0 implements Executor {
    @NotNull

    /* renamed from: c */
    public static final ExecutorC11106b f21739c = new ExecutorC11106b();
    @NotNull

    /* renamed from: d */
    public static final AbstractC10946b0 f21740d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.internal.n] */
    static {
        C11117m c11117m = C11117m.f21756c;
        int i = C11038h0.f21629a;
        if (64 >= i) {
            i = 64;
        }
        int m263b = C11036g0.m263b("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        c11117m.getClass();
        C11054o.m249a(m263b);
        if (m263b < C11116l.f21751d) {
            C11054o.m249a(m263b);
            c11117m = new C11052n(c11117m, m263b);
        }
        f21740d = c11117m;
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    /* renamed from: G */
    public final void mo100G(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Runnable runnable) {
        f21740d.mo100G(interfaceC10775f, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable runnable) {
        mo100G(C10781g.f21377a, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    @NotNull
    public final String toString() {
        return "Dispatchers.IO";
    }
}
