package kotlinx.coroutines.internal;

import kotlin.coroutines.InterfaceC10775f;
import kotlinx.coroutines.InterfaceC10976e0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.internal.f */
/* loaded from: classes3.dex */
public final class C11033f implements InterfaceC10976e0 {
    @NotNull

    /* renamed from: a */
    public final InterfaceC10775f f21626a;

    public C11033f(@NotNull InterfaceC10775f interfaceC10775f) {
        this.f21626a = interfaceC10775f;
    }

    @Override // kotlinx.coroutines.InterfaceC10976e0
    @NotNull
    /* renamed from: i */
    public final InterfaceC10775f mo266i() {
        return this.f21626a;
    }

    @NotNull
    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f21626a + ')';
    }
}
