package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.C10781g;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC10946b0;
import kotlinx.coroutines.C10972d0;
import kotlinx.coroutines.C11071j0;
import kotlinx.coroutines.InterfaceC11074k0;
import kotlinx.coroutines.scheduling.C11117m;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,134:1\n66#1,8:135\n66#1,8:143\n28#2,4:151\n28#2,4:156\n20#3:155\n20#3:160\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n48#1:135,8\n55#1:143,8\n79#1:151,4\n92#1:156,4\n79#1:155\n92#1:160\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.n */
/* loaded from: classes3.dex */
public final class C11052n extends AbstractC10946b0 implements InterfaceC11074k0 {
    @NotNull

    /* renamed from: h */
    public static final AtomicIntegerFieldUpdater f21651h = AtomicIntegerFieldUpdater.newUpdater(C11052n.class, "runningWorkers");
    @NotNull

    /* renamed from: c */
    public final AbstractC10946b0 f21652c;

    /* renamed from: d */
    public final int f21653d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC11074k0 f21654e;
    @NotNull

    /* renamed from: f */
    public final C11060s<Runnable> f21655f;
    @NotNull

    /* renamed from: g */
    public final Object f21656g;
    @Volatile
    private volatile int runningWorkers;

    /* renamed from: kotlinx.coroutines.internal.n$a */
    /* loaded from: classes3.dex */
    public final class RunnableC11053a implements Runnable {
        @NotNull

        /* renamed from: a */
        public Runnable f21657a;

        public RunnableC11053a(@NotNull Runnable runnable) {
            this.f21657a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.f21657a.run();
                } catch (Throwable th) {
                    C10972d0.m311a(C10781g.f21377a, th);
                }
                C11052n c11052n = C11052n.this;
                Runnable m250I = c11052n.m250I();
                if (m250I == null) {
                    return;
                }
                this.f21657a = m250I;
                i++;
                if (i >= 16) {
                    AbstractC10946b0 abstractC10946b0 = c11052n.f21652c;
                    if (abstractC10946b0.mo352H()) {
                        abstractC10946b0.mo100G(c11052n, this);
                        return;
                    }
                }
            }
        }
    }

    public C11052n(@NotNull C11117m c11117m, int i) {
        InterfaceC11074k0 interfaceC11074k0;
        this.f21652c = c11117m;
        this.f21653d = i;
        if (c11117m instanceof InterfaceC11074k0) {
            interfaceC11074k0 = (InterfaceC11074k0) c11117m;
        } else {
            interfaceC11074k0 = null;
        }
        this.f21654e = interfaceC11074k0 == null ? C11071j0.f21680a : interfaceC11074k0;
        this.f21655f = new C11060s<>();
        this.f21656g = new Object();
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    /* renamed from: G */
    public final void mo100G(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Runnable runnable) {
        boolean z;
        Runnable m250I;
        this.f21655f.m241a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21651h;
        if (atomicIntegerFieldUpdater.get(this) < this.f21653d) {
            synchronized (this.f21656g) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f21653d) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (z && (m250I = m250I()) != null) {
                this.f21652c.mo100G(this, new RunnableC11053a(m250I));
            }
        }
    }

    /* renamed from: I */
    public final Runnable m250I() {
        while (true) {
            Runnable m238d = this.f21655f.m238d();
            if (m238d != null) {
                return m238d;
            }
            synchronized (this.f21656g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21651h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f21655f.m239c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
