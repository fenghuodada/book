package kotlinx.coroutines.internal;

import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/DiagnosticCoroutineContextException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,50:1\n26#2:51\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/DiagnosticCoroutineContextException\n*L\n46#1:51\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.j */
/* loaded from: classes3.dex */
public final class C11044j extends RuntimeException {
    @NotNull

    /* renamed from: a */
    public final transient InterfaceC10775f f21637a;

    public C11044j(@NotNull InterfaceC10775f interfaceC10775f) {
        this.f21637a = interfaceC10775f;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getLocalizedMessage() {
        return this.f21637a.toString();
    }
}
