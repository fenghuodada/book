package kotlin.coroutines;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
/* renamed from: kotlin.coroutines.g */
/* loaded from: classes3.dex */
public final class C10781g implements InterfaceC10775f, Serializable {
    @NotNull

    /* renamed from: a */
    public static final C10781g f21377a = new C10781g();

    @Override // kotlin.coroutines.InterfaceC10775f
    @Nullable
    /* renamed from: a */
    public final <E extends InterfaceC10775f.InterfaceC10778b> E mo195a(@NotNull InterfaceC10775f.InterfaceC10780c<E> key) {
        C10843j.m430f(key, "key");
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @NotNull
    /* renamed from: f */
    public final InterfaceC10775f mo190f(@NotNull InterfaceC10775f context) {
        C10843j.m430f(context, "context");
        return context;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @NotNull
    /* renamed from: l */
    public final InterfaceC10775f mo186l(@NotNull InterfaceC10775f.InterfaceC10780c<?> key) {
        C10843j.m430f(key, "key");
        return this;
    }

    @NotNull
    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    /* renamed from: w */
    public final <R> R mo183w(R r, @NotNull InterfaceC10824p<? super R, ? super InterfaceC10775f.InterfaceC10778b, ? extends R> operation) {
        C10843j.m430f(operation, "operation");
        return r;
    }
}
