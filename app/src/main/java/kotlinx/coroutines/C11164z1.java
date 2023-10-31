package kotlinx.coroutines;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* renamed from: kotlinx.coroutines.z1 */
/* loaded from: classes3.dex */
public final class C11164z1 {
    @NotNull

    /* renamed from: a */
    public static final ThreadLocal<AbstractC11138t0> f21819a = new ThreadLocal<>();

    @NotNull
    /* renamed from: a */
    public static AbstractC11138t0 m99a() {
        ThreadLocal<AbstractC11138t0> threadLocal = f21819a;
        AbstractC11138t0 abstractC11138t0 = threadLocal.get();
        if (abstractC11138t0 == null) {
            C10971d c10971d = new C10971d(Thread.currentThread());
            threadLocal.set(c10971d);
            return c10971d;
        }
        return abstractC11138t0;
    }
}
