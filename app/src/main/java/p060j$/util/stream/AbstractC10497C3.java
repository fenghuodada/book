package p060j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10312G;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;

/* renamed from: j$.util.stream.C3 */
/* loaded from: classes2.dex */
abstract class AbstractC10497C3 {

    /* renamed from: a */
    protected final InterfaceC10321P f20967a;

    /* renamed from: b */
    protected final boolean f20968b;

    /* renamed from: c */
    private final long f20969c;

    /* renamed from: d */
    private final AtomicLong f20970d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10497C3(InterfaceC10321P interfaceC10321P, long j, long j2) {
        this.f20967a = interfaceC10321P;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        this.f20968b = i < 0;
        this.f20969c = i >= 0 ? j2 : 0L;
        this.f20970d = new AtomicLong(i >= 0 ? j + j2 : j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10497C3(InterfaceC10321P interfaceC10321P, AbstractC10497C3 abstractC10497C3) {
        this.f20967a = interfaceC10321P;
        this.f20968b = abstractC10497C3.f20968b;
        this.f20970d = abstractC10497C3.f20970d;
        this.f20969c = abstractC10497C3.f20969c;
    }

    public final int characteristics() {
        return this.f20967a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f20967a.estimateSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final long m820r(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long min;
        do {
            atomicLong = this.f20970d;
            j2 = atomicLong.get();
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            z = this.f20968b;
            if (i != 0) {
                min = Math.min(j2, j);
                if (min <= 0) {
                    break;
                }
            } else if (z) {
                return j;
            } else {
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - min));
        if (z) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.f20969c;
        return j2 > j3 ? Math.max(min - (j2 - j3), 0L) : min;
    }

    /* renamed from: s */
    protected abstract InterfaceC10321P mo533s(InterfaceC10321P interfaceC10321P);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final EnumC10492B3 m819t() {
        return this.f20970d.get() > 0 ? EnumC10492B3.MAYBE_MORE : this.f20968b ? EnumC10492B3.UNLIMITED : EnumC10492B3.NO_MORE;
    }

    public /* bridge */ /* synthetic */ InterfaceC10309D trySplit() {
        return (InterfaceC10309D) m13086trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC10312G m13083trySplit() {
        return (InterfaceC10312G) m13086trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC10315J m13084trySplit() {
        return (InterfaceC10315J) m13086trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC10318M m13085trySplit() {
        return (InterfaceC10318M) m13086trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public final InterfaceC10321P m13086trySplit() {
        InterfaceC10321P trySplit;
        if (this.f20970d.get() == 0 || (trySplit = this.f20967a.trySplit()) == null) {
            return null;
        }
        return mo533s(trySplit);
    }
}
