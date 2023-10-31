package kotlinx.coroutines.intrinsics;

import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10833a0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C11091o1;
import kotlinx.coroutines.C11137t;
import kotlinx.coroutines.internal.C11026b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,127:1\n55#1:128\n56#1,11:130\n55#1:141\n56#1,2:143\n58#1,9:150\n55#1:159\n56#1,2:161\n58#1,9:168\n97#1,4:178\n114#1,6:182\n120#1,5:190\n97#1,4:195\n114#1,6:199\n120#1,5:207\n11#2:129\n11#2:142\n11#2:160\n11#2:177\n95#3,5:145\n95#3,5:163\n61#4,2:188\n61#4,2:205\n61#4,2:212\n61#4,2:214\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n18#1:128\n18#1:130,11\n29#1:141\n29#1:143,2\n29#1:150,9\n42#1:159\n42#1:161,2\n42#1:168,9\n77#1:178,4\n77#1:182,6\n77#1:190,5\n88#1:195,4\n88#1:199,6\n88#1:207,5\n18#1:129\n29#1:142\n42#1:160\n55#1:177\n30#1:145,5\n43#1:163,5\n77#1:188,2\n88#1:205,2\n119#1:212,2\n120#1:214,2\n*E\n"})
/* renamed from: kotlinx.coroutines.intrinsics.a */
/* loaded from: classes3.dex */
public final class C11069a {
    @Nullable
    /* renamed from: a */
    public static final Object m227a(@NotNull C11026b0 c11026b0, C11026b0 c11026b02, @NotNull InterfaceC10824p interfaceC10824p) {
        Object c11137t;
        Object m203R;
        try {
            C10833a0.m439b(2, interfaceC10824p);
            c11137t = interfaceC10824p.invoke(c11026b02, c11026b0);
        } catch (Throwable th) {
            c11137t = new C11137t(false, th);
        }
        EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
        if (c11137t != enumC10782a && (m203R = c11026b0.m203R(c11137t)) != C11091o1.f21702b) {
            if (!(m203R instanceof C11137t)) {
                return C11091o1.m172a(m203R);
            }
            throw ((C11137t) m203R).f21796a;
        }
        return enumC10782a;
    }
}
