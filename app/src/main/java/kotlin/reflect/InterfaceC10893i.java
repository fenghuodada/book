package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.reflect.InterfaceC10891h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.reflect.i */
/* loaded from: classes3.dex */
public interface InterfaceC10893i<V> extends InterfaceC10891h<V>, InterfaceC10809a<V> {

    /* renamed from: kotlin.reflect.i$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC10894a<V> extends InterfaceC10891h.InterfaceC10892a<V>, InterfaceC10809a<V> {
    }

    V get();

    @SinceKotlin(version = "1.1")
    @Nullable
    Object getDelegate();

    @NotNull
    /* renamed from: getGetter */
    InterfaceC10894a<V> mo13091getGetter();
}
