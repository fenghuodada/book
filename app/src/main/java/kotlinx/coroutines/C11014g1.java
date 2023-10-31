package kotlinx.coroutines;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10820l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.g1 */
/* loaded from: classes3.dex */
public final class C11014g1 extends AbstractC11081m1 {
    @NotNull

    /* renamed from: e */
    public final InterfaceC10820l<Throwable, C10868p> f21605e;

    /* JADX WARN: Multi-variable type inference failed */
    public C11014g1(@NotNull InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l) {
        this.f21605e = interfaceC10820l;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final /* bridge */ /* synthetic */ C10868p invoke(Throwable th) {
        mo110l(th);
        return C10868p.f21418a;
    }

    @Override // kotlinx.coroutines.AbstractC11148v
    /* renamed from: l */
    public final void mo110l(@Nullable Throwable th) {
        this.f21605e.invoke(th);
    }
}
