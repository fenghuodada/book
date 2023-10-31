package kotlinx.coroutines;

import kotlin.C10862k;
import kotlin.C10864l;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.C11046k;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* renamed from: kotlinx.coroutines.h0 */
/* loaded from: classes3.dex */
public final class C11016h0 {
    @NotNull
    /* renamed from: a */
    public static final String m298a(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    /* renamed from: b */
    public static final String m297b(@NotNull InterfaceC10772d<?> interfaceC10772d) {
        String str;
        if (interfaceC10772d instanceof C11046k) {
            return interfaceC10772d.toString();
        }
        try {
            str = interfaceC10772d + '@' + m298a(interfaceC10772d);
        } catch (Throwable th) {
            str = C10864l.m419a(th);
        }
        Throwable m420a = C10862k.m420a(str);
        String str2 = str;
        if (m420a != null) {
            str2 = interfaceC10772d.getClass().getName() + '@' + m298a(interfaceC10772d);
        }
        return (String) str2;
    }
}
