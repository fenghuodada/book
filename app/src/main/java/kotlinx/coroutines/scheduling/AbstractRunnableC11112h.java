package kotlinx.coroutines.scheduling;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.scheduling.h */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC11112h implements Runnable {
    @JvmField

    /* renamed from: a */
    public long f21744a;
    @JvmField
    @NotNull

    /* renamed from: b */
    public InterfaceC11113i f21745b;

    public AbstractRunnableC11112h() {
        this(0L, C11116l.f21754g);
    }

    public AbstractRunnableC11112h(long j, @NotNull InterfaceC11113i interfaceC11113i) {
        this.f21744a = j;
        this.f21745b = interfaceC11113i;
    }
}
