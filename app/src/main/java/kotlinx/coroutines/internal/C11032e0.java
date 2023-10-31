package kotlinx.coroutines.internal;

import _COROUTINE.C0000a;
import kotlin.C10862k;
import kotlin.C10864l;
import kotlin.coroutines.jvm.internal.AbstractC10784a;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1735#2,6:215\n12744#2,2:223\n1627#2,6:227\n12744#2,2:233\n1627#2,6:236\n37#3,2:221\n26#4:225\n26#4:226\n1#5:235\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n43#1:215,6\n131#1:223,2\n141#1:227,6\n171#1:233,2\n192#1:236,6\n106#1:221,2\n133#1:225\n135#1:226\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.e0 */
/* loaded from: classes3.dex */
public final class C11032e0 {

    /* renamed from: a */
    public static final /* synthetic */ int f21625a = 0;

    static {
        Object m419a;
        Object m419a2;
        Exception exc = new Exception();
        String simpleName = C0000a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            m419a = AbstractC10784a.class.getCanonicalName();
        } catch (Throwable th) {
            m419a = C10864l.m419a(th);
        }
        if (C10862k.m420a(m419a) != null) {
            m419a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) m419a;
        try {
            m419a2 = C11032e0.class.getCanonicalName();
        } catch (Throwable th2) {
            m419a2 = C10864l.m419a(th2);
        }
        if (C10862k.m420a(m419a2) != null) {
            m419a2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) m419a2;
    }
}
