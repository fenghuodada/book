package kotlinx.coroutines.scheduling;

import kotlin.jvm.JvmField;
import kotlinx.coroutines.C11016h0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.scheduling.k */
/* loaded from: classes3.dex */
public final class C11115k extends AbstractRunnableC11112h {
    @JvmField
    @NotNull

    /* renamed from: c */
    public final Runnable f21747c;

    public C11115k(@NotNull Runnable runnable, long j, @NotNull InterfaceC11113i interfaceC11113i) {
        super(j, interfaceC11113i);
        this.f21747c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f21747c.run();
        } finally {
            this.f21745b.mo148a();
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f21747c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(C11016h0.m298a(runnable));
        sb.append(", ");
        sb.append(this.f21744a);
        sb.append(", ");
        sb.append(this.f21745b);
        sb.append(']');
        return sb.toString();
    }
}
