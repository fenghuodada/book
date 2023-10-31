package kotlin.jvm.internal;

import kotlin.SinceKotlin;

/* renamed from: kotlin.jvm.internal.z */
/* loaded from: classes3.dex */
public final class C10861z {
    @SinceKotlin(version = "1.3")
    /* renamed from: a */
    public static String m421a(InterfaceC10840g interfaceC10840g) {
        String obj = interfaceC10840g.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
