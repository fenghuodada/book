package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C10868p;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.InterfaceC10820l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.f1 */
/* loaded from: classes3.dex */
public final class C10982f1 extends AbstractC11072j1 {
    @NotNull

    /* renamed from: f */
    public static final AtomicIntegerFieldUpdater f21550f = AtomicIntegerFieldUpdater.newUpdater(C10982f1.class, "_invoked");
    @Volatile
    private volatile int _invoked;
    @NotNull

    /* renamed from: e */
    public final InterfaceC10820l<Throwable, C10868p> f21551e;

    /* JADX WARN: Multi-variable type inference failed */
    public C10982f1(@NotNull InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l) {
        this.f21551e = interfaceC10820l;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final /* bridge */ /* synthetic */ C10868p invoke(Throwable th) {
        mo110l(th);
        return C10868p.f21418a;
    }

    @Override // kotlinx.coroutines.AbstractC11148v
    /* renamed from: l */
    public final void mo110l(@Nullable Throwable th) {
        if (f21550f.compareAndSet(this, 0, 1)) {
            this.f21551e.invoke(th);
        }
    }
}
