package kotlinx.coroutines.tasks;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.tasks.a */
/* loaded from: classes3.dex */
public final class ExecutorC11140a implements Executor {
    @NotNull

    /* renamed from: a */
    public static final ExecutorC11140a f21801a = new ExecutorC11140a();

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable runnable) {
        runnable.run();
    }
}
