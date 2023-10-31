package kotlin.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.InterfaceC10775f.InterfaceC10778b;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@ExperimentalStdlibApi
/* renamed from: kotlin.coroutines.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10769b<B extends InterfaceC10775f.InterfaceC10778b, E extends B> implements InterfaceC10775f.InterfaceC10780c<E> {
    @NotNull

    /* renamed from: a */
    public final InterfaceC10820l<InterfaceC10775f.InterfaceC10778b, E> f21369a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC10775f.InterfaceC10780c<?> f21370b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.l<? super kotlin.coroutines.f$b, ? extends E extends B>, java.lang.Object, kotlin.jvm.functions.l<kotlin.coroutines.f$b, E extends B>] */
    public AbstractC10769b(@NotNull InterfaceC10775f.InterfaceC10780c<B> baseKey, @NotNull InterfaceC10820l<? super InterfaceC10775f.InterfaceC10778b, ? extends E> safeCast) {
        C10843j.m430f(baseKey, "baseKey");
        C10843j.m430f(safeCast, "safeCast");
        this.f21369a = safeCast;
        this.f21370b = baseKey instanceof AbstractC10769b ? (InterfaceC10775f.InterfaceC10780c<B>) ((AbstractC10769b) baseKey).f21370b : baseKey;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/f$b;)TE; */
    @Nullable
    /* renamed from: a */
    public final InterfaceC10775f.InterfaceC10778b m461a(@NotNull InterfaceC10775f.InterfaceC10778b element) {
        C10843j.m430f(element, "element");
        return (InterfaceC10775f.InterfaceC10778b) this.f21369a.invoke(element);
    }
}
