package kotlin.coroutines;

import kotlin.SinceKotlin;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
/* renamed from: kotlin.coroutines.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10768a implements InterfaceC10775f.InterfaceC10778b {
    @NotNull

    /* renamed from: a */
    public final InterfaceC10775f.InterfaceC10780c<?> f21368a;

    public AbstractC10768a(@NotNull InterfaceC10775f.InterfaceC10780c<?> interfaceC10780c) {
        this.f21368a = interfaceC10780c;
    }

    @Override // kotlin.coroutines.InterfaceC10775f.InterfaceC10778b, kotlin.coroutines.InterfaceC10775f
    @Nullable
    /* renamed from: a */
    public <E extends InterfaceC10775f.InterfaceC10778b> E mo195a(@NotNull InterfaceC10775f.InterfaceC10780c<E> interfaceC10780c) {
        return (E) InterfaceC10775f.InterfaceC10778b.C10779a.m459a(this, interfaceC10780c);
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @NotNull
    /* renamed from: f */
    public final InterfaceC10775f mo190f(@NotNull InterfaceC10775f context) {
        C10843j.m430f(context, "context");
        return InterfaceC10775f.C10776a.m460a(this, context);
    }

    @Override // kotlin.coroutines.InterfaceC10775f.InterfaceC10778b
    @NotNull
    public final InterfaceC10775f.InterfaceC10780c<?> getKey() {
        return this.f21368a;
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @NotNull
    /* renamed from: l */
    public InterfaceC10775f mo186l(@NotNull InterfaceC10775f.InterfaceC10780c<?> interfaceC10780c) {
        return InterfaceC10775f.InterfaceC10778b.C10779a.m458b(this, interfaceC10780c);
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    /* renamed from: w */
    public final <R> R mo183w(R r, @NotNull InterfaceC10824p<? super R, ? super InterfaceC10775f.InterfaceC10778b, ? extends R> operation) {
        C10843j.m430f(operation, "operation");
        return operation.invoke(r, this);
    }
}
