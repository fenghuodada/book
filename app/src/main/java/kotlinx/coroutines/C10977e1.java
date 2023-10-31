package kotlinx.coroutines;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10820l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.e1 */
/* loaded from: classes3.dex */
public final class C10977e1 extends AbstractC10980f {
    @NotNull

    /* renamed from: a */
    public final InterfaceC10820l<Throwable, C10868p> f21548a;

    /* JADX WARN: Multi-variable type inference failed */
    public C10977e1(@NotNull InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l) {
        this.f21548a = interfaceC10820l;
    }

    @Override // kotlinx.coroutines.AbstractC11012g
    /* renamed from: d */
    public final void mo143d(@Nullable Throwable th) {
        this.f21548a.invoke(th);
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final /* bridge */ /* synthetic */ C10868p invoke(Throwable th) {
        mo143d(th);
        return C10868p.f21418a;
    }

    @NotNull
    public final String toString() {
        return "InvokeOnCancel[" + this.f21548a.getClass().getSimpleName() + '@' + C11016h0.m298a(this) + ']';
    }
}
