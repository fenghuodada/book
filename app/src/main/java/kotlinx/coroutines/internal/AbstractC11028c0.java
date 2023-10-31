package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC11139t1;
import kotlinx.coroutines.internal.AbstractC11028c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,269:1\n252#2,4:270\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n225#1:270,4\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.c0 */
/* loaded from: classes3.dex */
public abstract class AbstractC11028c0<S extends AbstractC11028c0<S>> extends AbstractC11031e<S> implements InterfaceC11139t1 {
    @NotNull

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f21620d = AtomicIntegerFieldUpdater.newUpdater(AbstractC11028c0.class, "cleanedAndPointers");
    @JvmField

    /* renamed from: c */
    public final long f21621c;
    @Volatile
    private volatile int cleanedAndPointers;

    public AbstractC11028c0(long j, @Nullable S s, int i) {
        super(s);
        this.f21621c = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // kotlinx.coroutines.internal.AbstractC11031e
    /* renamed from: c */
    public final boolean mo268c() {
        boolean z;
        if (f21620d.get(this) != mo129f()) {
            return false;
        }
        if (m269b() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m276e() {
        boolean z;
        if (f21620d.addAndGet(this, -65536) != mo129f()) {
            return false;
        }
        if (m269b() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public abstract int mo129f();

    /* renamed from: g */
    public abstract void mo128g(int i, @NotNull InterfaceC10775f interfaceC10775f);

    /* renamed from: h */
    public final void m275h() {
        if (f21620d.incrementAndGet(this) == mo129f()) {
            m267d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001f A[SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m274i() {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.AbstractC11028c0.f21620d
            int r1 = r0.get(r5)
            int r2 = r5.mo129f()
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L1c
            kotlinx.coroutines.internal.e r2 = r5.m269b()
            if (r2 != 0) goto L16
            r2 = r3
            goto L17
        L16:
            r2 = r4
        L17:
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = r4
            goto L1d
        L1c:
            r2 = r3
        L1d:
            if (r2 != 0) goto L21
            r3 = r4
            goto L2a
        L21:
            r2 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r1
            boolean r0 = r0.compareAndSet(r5, r1, r2)
            if (r0 == 0) goto L0
        L2a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.AbstractC11028c0.m274i():boolean");
    }
}
