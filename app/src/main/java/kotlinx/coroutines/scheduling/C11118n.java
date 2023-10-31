package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,255:1\n90#2:256\n90#2:257\n90#2:258\n90#2:261\n90#2:262\n1#3:259\n25#4:260\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n95#1:256\n162#1:257\n185#1:258\n205#1:261\n249#1:262\n205#1:260\n*E\n"})
/* renamed from: kotlinx.coroutines.scheduling.n */
/* loaded from: classes3.dex */
public final class C11118n {
    @NotNull

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f21757b = AtomicReferenceFieldUpdater.newUpdater(C11118n.class, Object.class, "lastScheduledTask");
    @NotNull

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f21758c = AtomicIntegerFieldUpdater.newUpdater(C11118n.class, "producerIndex");
    @NotNull

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f21759d = AtomicIntegerFieldUpdater.newUpdater(C11118n.class, "consumerIndex");
    @NotNull

    /* renamed from: e */
    public static final AtomicIntegerFieldUpdater f21760e = AtomicIntegerFieldUpdater.newUpdater(C11118n.class, "blockingTasksInBuffer");
    @NotNull

    /* renamed from: a */
    public final AtomicReferenceArray<AbstractRunnableC11112h> f21761a = new AtomicReferenceArray<>(128);
    @Volatile
    private volatile int blockingTasksInBuffer;
    @Volatile
    private volatile int consumerIndex;
    @Volatile
    @Nullable
    private volatile Object lastScheduledTask;
    @Volatile
    private volatile int producerIndex;

    /* renamed from: a */
    public final AbstractRunnableC11112h m146a(AbstractRunnableC11112h abstractRunnableC11112h) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21758c;
        if (atomicIntegerFieldUpdater.get(this) - f21759d.get(this) == 127) {
            return abstractRunnableC11112h;
        }
        boolean z = true;
        if (abstractRunnableC11112h.f21745b.mo147b() != 1) {
            z = false;
        }
        if (z) {
            f21760e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<AbstractRunnableC11112h> atomicReferenceArray = this.f21761a;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, abstractRunnableC11112h);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    /* renamed from: b */
    public final AbstractRunnableC11112h m145b() {
        AbstractRunnableC11112h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21759d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f21758c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.f21761a.getAndSet(i2, null)) != null) {
                boolean z = true;
                if (andSet.f21745b.mo147b() != 1) {
                    z = false;
                }
                if (z) {
                    f21760e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* renamed from: c */
    public final AbstractRunnableC11112h m144c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray<AbstractRunnableC11112h> atomicReferenceArray = this.f21761a;
        AbstractRunnableC11112h abstractRunnableC11112h = atomicReferenceArray.get(i2);
        if (abstractRunnableC11112h != null) {
            boolean z2 = false;
            if ((abstractRunnableC11112h.f21745b.mo147b() == 1) == z) {
                while (true) {
                    if (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC11112h, null)) {
                        if (atomicReferenceArray.get(i2) != abstractRunnableC11112h) {
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    if (z) {
                        f21760e.decrementAndGet(this);
                    }
                    return abstractRunnableC11112h;
                }
            }
        }
        return null;
    }
}
