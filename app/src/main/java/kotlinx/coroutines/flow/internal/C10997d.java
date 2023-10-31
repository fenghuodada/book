package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.InterfaceC10824p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.flow.internal.d */
/* loaded from: classes3.dex */
public final class C10997d implements InterfaceC10775f {
    @JvmField
    @NotNull

    /* renamed from: a */
    public final Throwable f21574a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10775f f21575b;

    public C10997d(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Throwable th) {
        this.f21574a = th;
        this.f21575b = interfaceC10775f;
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @Nullable
    /* renamed from: a */
    public final <E extends InterfaceC10775f.InterfaceC10778b> E mo195a(@NotNull InterfaceC10775f.InterfaceC10780c<E> interfaceC10780c) {
        return (E) this.f21575b.mo195a(interfaceC10780c);
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @NotNull
    /* renamed from: f */
    public final InterfaceC10775f mo190f(@NotNull InterfaceC10775f interfaceC10775f) {
        return this.f21575b.mo190f(interfaceC10775f);
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @NotNull
    /* renamed from: l */
    public final InterfaceC10775f mo186l(@NotNull InterfaceC10775f.InterfaceC10780c<?> interfaceC10780c) {
        return this.f21575b.mo186l(interfaceC10780c);
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    /* renamed from: w */
    public final <R> R mo183w(R r, @NotNull InterfaceC10824p<? super R, ? super InterfaceC10775f.InterfaceC10778b, ? extends R> interfaceC10824p) {
        return (R) this.f21575b.mo183w(r, interfaceC10824p);
    }
}
