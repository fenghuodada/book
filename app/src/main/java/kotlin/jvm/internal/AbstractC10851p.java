package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.InterfaceC10884b;
import kotlin.reflect.InterfaceC10893i;
import kotlinx.coroutines.C11016h0;
import kotlinx.coroutines.internal.C11057r;

/* renamed from: kotlin.jvm.internal.p */
/* loaded from: classes3.dex */
public abstract class AbstractC10851p extends AbstractC10855t implements InterfaceC10893i {
    @SinceKotlin(version = "1.4")
    public AbstractC10851p(Object obj) {
        super(obj, C11016h0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.internal.AbstractC10834b
    public final InterfaceC10884b computeReflected() {
        C10860y.f21411a.getClass();
        return this;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    public final Object invoke() {
        return ((C11057r.C11059b) this).get();
    }
}
