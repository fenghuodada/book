package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.coroutines.jvm.internal.b */
/* loaded from: classes3.dex */
public final class C10785b implements InterfaceC10772d<Object> {
    @NotNull

    /* renamed from: a */
    public static final C10785b f21380a = new C10785b();

    @Override // kotlin.coroutines.InterfaceC10772d
    @NotNull
    public final InterfaceC10775f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.coroutines.InterfaceC10772d
    public final void resumeWith(@NotNull Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @NotNull
    public final String toString() {
        return "This continuation is already complete";
    }
}
