package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.InterfaceC10986c;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nFlowExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,30:1\n26#2:31\n*S KotlinDebug\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n*L\n17#1:31\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.internal.a */
/* loaded from: classes3.dex */
public final class C10994a extends CancellationException {
    @JvmField
    @NotNull

    /* renamed from: a */
    public final transient InterfaceC10986c<?> f21570a;

    public C10994a(@NotNull InterfaceC10986c<?> interfaceC10986c) {
        super("Flow was aborted, no more elements needed");
        this.f21570a = interfaceC10986c;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
