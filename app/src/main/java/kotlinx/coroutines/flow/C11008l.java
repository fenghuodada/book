package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbstractC10996c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,428:1\n1#2:429\n314#3,11:430\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n298#1:430,11\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.l */
/* loaded from: classes3.dex */
public final class C11008l extends AbstractC10996c<C11005j<?>> {
    @NotNull

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f21599a = AtomicReferenceFieldUpdater.newUpdater(C11008l.class, Object.class, "_state");
    @Volatile
    @Nullable
    private volatile Object _state;

    @Override // kotlinx.coroutines.flow.internal.AbstractC10996c
    /* renamed from: a */
    public final boolean mo302a(InterfaceC10985b interfaceC10985b) {
        C11005j c11005j = (C11005j) interfaceC10985b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21599a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, C11007k.f21597a);
        return true;
    }

    /* renamed from: b */
    public final void m301b(C11005j c11005j) {
        f21599a.set(this, null);
    }
}
