package kotlinx.coroutines;

import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.C11040i0;
import kotlinx.coroutines.internal.C11046k;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n198#1,17:238\n1#2:221\n253#3:222\n254#3,2:233\n256#3:237\n107#4,10:223\n118#4,2:235\n61#5,2:255\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n188#1:238,17\n176#1:222\n176#1:233,2\n176#1:237\n176#1:223,10\n176#1:235,2\n218#1:255,2\n*E\n"})
/* renamed from: kotlinx.coroutines.n0 */
/* loaded from: classes3.dex */
public final class C11083n0 {
    /* renamed from: a */
    public static final <T> void m216a(@NotNull AbstractC11080m0<? super T> abstractC11080m0, @NotNull InterfaceC10772d<? super T> interfaceC10772d, boolean z) {
        Object mo218h = abstractC11080m0.mo218h();
        Throwable mo221d = abstractC11080m0.mo221d(mo218h);
        Object m419a = mo221d != null ? C10864l.m419a(mo221d) : abstractC11080m0.mo220e(mo218h);
        if (!z) {
            interfaceC10772d.resumeWith(m419a);
            return;
        }
        C10843j.m432d(interfaceC10772d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C11046k c11046k = (C11046k) interfaceC10772d;
        InterfaceC10772d<T> interfaceC10772d2 = c11046k.f21642e;
        InterfaceC10775f context = interfaceC10772d2.getContext();
        Object m260b = C11040i0.m260b(context, c11046k.f21644g);
        C10950b2<?> m101b = m260b != C11040i0.f21630a ? C11160z.m101b(interfaceC10772d2, context, m260b) : null;
        try {
            c11046k.f21642e.resumeWith(m419a);
            C10868p c10868p = C10868p.f21418a;
        } finally {
            if (m101b == null || m101b.m349e0()) {
                C11040i0.m261a(context, m260b);
            }
        }
    }
}
