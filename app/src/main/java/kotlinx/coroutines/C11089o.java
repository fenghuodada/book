package kotlinx.coroutines;

import kotlin.C10868p;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.o */
/* loaded from: classes3.dex */
public final class C11089o extends AbstractC11072j1 implements InterfaceC11082n {
    @JvmField
    @NotNull

    /* renamed from: e */
    public final InterfaceC11092p f21700e;

    public C11089o(@NotNull C11084n1 c11084n1) {
        this.f21700e = c11084n1;
    }

    @Override // kotlinx.coroutines.InterfaceC11082n
    /* renamed from: d */
    public final boolean mo163d(@NotNull Throwable th) {
        return m217m().mo107D(th);
    }

    @Override // kotlinx.coroutines.InterfaceC11082n
    @NotNull
    public final InterfaceC11017h1 getParent() {
        return m217m();
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final /* bridge */ /* synthetic */ C10868p invoke(Throwable th) {
        mo110l(th);
        return C10868p.f21418a;
    }

    @Override // kotlinx.coroutines.AbstractC11148v
    /* renamed from: l */
    public final void mo110l(@Nullable Throwable th) {
        this.f21700e.mo171x(m217m());
    }
}
