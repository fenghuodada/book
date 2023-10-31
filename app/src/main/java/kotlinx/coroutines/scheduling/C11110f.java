package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.InterfaceC10775f;
import kotlinx.coroutines.AbstractC11158y0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.scheduling.f */
/* loaded from: classes3.dex */
public class C11110f extends AbstractC11158y0 {
    @NotNull

    /* renamed from: c */
    public final ExecutorC11104a f21743c;

    public C11110f(int i, int i2, @NotNull String str, long j) {
        this.f21743c = new ExecutorC11104a(i, i2, str, j);
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    /* renamed from: G */
    public final void mo100G(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC11104a.f21719h;
        this.f21743c.m161c(runnable, C11116l.f21754g, false);
    }
}
