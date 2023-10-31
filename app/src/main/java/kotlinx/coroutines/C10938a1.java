package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.a1 */
/* loaded from: classes3.dex */
public final class C10938a1 {
    @JvmName(name = "from")
    @NotNull
    /* renamed from: a */
    public static final C11163z0 m354a(@NotNull Executor executor) {
        if (executor instanceof ExecutorC11090o0) {
            ExecutorC11090o0 executorC11090o0 = (ExecutorC11090o0) executor;
        }
        return new C11163z0(executor);
    }
}
