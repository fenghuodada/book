package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalCoroutinesApi
/* renamed from: kotlinx.coroutines.s1 */
/* loaded from: classes3.dex */
public final class C11103s1 implements InterfaceC11096q0, InterfaceC11082n {
    @NotNull

    /* renamed from: a */
    public static final C11103s1 f21718a = new C11103s1();

    @Override // kotlinx.coroutines.InterfaceC11096q0
    /* renamed from: b */
    public final void mo116b() {
    }

    @Override // kotlinx.coroutines.InterfaceC11082n
    /* renamed from: d */
    public final boolean mo163d(@NotNull Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC11082n
    @Nullable
    public final InterfaceC11017h1 getParent() {
        return null;
    }

    @NotNull
    public final String toString() {
        return "NonDisposableHandle";
    }
}
