package kotlin.coroutines.intrinsics;

import kotlin.SinceKotlin;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10784a;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.coroutines.intrinsics.b */
/* loaded from: classes3.dex */
public class C10783b {
    @SinceKotlin(version = "1.3")
    @NotNull
    /* renamed from: a */
    public static final InterfaceC10772d m456a(Object obj, @NotNull InterfaceC10772d completion, @NotNull InterfaceC10824p interfaceC10824p) {
        C10843j.m430f(completion, "completion");
        return ((AbstractC10784a) interfaceC10824p).create(obj, completion);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    /* renamed from: b */
    public static final InterfaceC10772d m455b(@NotNull InterfaceC10772d interfaceC10772d) {
        InterfaceC10772d<Object> intercepted;
        C10843j.m430f(interfaceC10772d, "<this>");
        AbstractC10786c abstractC10786c = interfaceC10772d instanceof AbstractC10786c ? (AbstractC10786c) interfaceC10772d : null;
        return (abstractC10786c == null || (intercepted = abstractC10786c.intercepted()) == null) ? interfaceC10772d : intercepted;
    }
}
