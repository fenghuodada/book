package kotlinx.coroutines;

import kotlin.C10738b;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC10952c0;
import kotlinx.coroutines.internal.C11039i;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,110:1\n75#2:111\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n38#1:111\n*E\n"})
/* renamed from: kotlinx.coroutines.d0 */
/* loaded from: classes3.dex */
public final class C10972d0 {
    @InternalCoroutinesApi
    /* renamed from: a */
    public static final void m311a(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Throwable th) {
        try {
            InterfaceC10952c0 interfaceC10952c0 = (InterfaceC10952c0) interfaceC10775f.mo195a(InterfaceC10952c0.C10953a.f21504a);
            if (interfaceC10952c0 != null) {
                interfaceC10952c0.mo347E(interfaceC10775f, th);
            } else {
                C11039i.m262a(interfaceC10775f, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C10738b.m502a(runtimeException, th);
                th = runtimeException;
            }
            C11039i.m262a(interfaceC10775f, th);
        }
    }
}
