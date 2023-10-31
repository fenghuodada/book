package kotlinx.coroutines.scheduling;

import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.scheduling.c */
/* loaded from: classes3.dex */
public final class C11107c extends C11110f {
    @NotNull

    /* renamed from: d */
    public static final C11107c f21741d = new C11107c();

    public C11107c() {
        super(C11116l.f21750c, C11116l.f21751d, C11116l.f21748a, C11116l.f21752e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    @NotNull
    public final String toString() {
        return "Dispatchers.Default";
    }
}
