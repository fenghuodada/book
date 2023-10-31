package kotlinx.coroutines;

import kotlin.C10868p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.r0 */
/* loaded from: classes3.dex */
public final class C11099r0 extends AbstractC10980f {
    @NotNull

    /* renamed from: a */
    public final InterfaceC11096q0 f21711a;

    public C11099r0(@NotNull InterfaceC11096q0 interfaceC11096q0) {
        this.f21711a = interfaceC11096q0;
    }

    @Override // kotlinx.coroutines.AbstractC11012g
    /* renamed from: d */
    public final void mo143d(@Nullable Throwable th) {
        this.f21711a.mo116b();
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final /* bridge */ /* synthetic */ C10868p invoke(Throwable th) {
        mo143d(th);
        return C10868p.f21418a;
    }

    @NotNull
    public final String toString() {
        return "DisposeOnCancel[" + this.f21711a + ']';
    }
}
