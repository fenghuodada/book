package kotlinx.coroutines.internal;

import kotlin.C10738b;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C10972d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nOnUndeliveredElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,44:1\n75#2:45\n*S KotlinDebug\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n*L\n22#1:45\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.x */
/* loaded from: classes3.dex */
public final class C11066x {
    /* renamed from: a */
    public static final <E> void m230a(@NotNull InterfaceC10820l<? super E, C10868p> interfaceC10820l, E e, @NotNull InterfaceC10775f interfaceC10775f) {
        C11051m0 m229b = m229b(interfaceC10820l, e, null);
        if (m229b != null) {
            C10972d0.m311a(interfaceC10775f, m229b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: b */
    public static final <E> C11051m0 m229b(@NotNull InterfaceC10820l<? super E, C10868p> interfaceC10820l, E e, @Nullable C11051m0 c11051m0) {
        try {
            interfaceC10820l.invoke(e);
        } catch (Throwable th) {
            if (c11051m0 == null || c11051m0.getCause() == th) {
                return new C11051m0("Exception in undelivered element handler for " + e, th);
            }
            C10738b.m502a(c11051m0, th);
        }
        return c11051m0;
    }
}
