package p060j$.util.stream;

import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10312G;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;

/* renamed from: j$.util.stream.v3 */
/* loaded from: classes2.dex */
abstract class AbstractC10705v3 {

    /* renamed from: a */
    final long f21281a;

    /* renamed from: b */
    final long f21282b;

    /* renamed from: c */
    InterfaceC10321P f21283c;

    /* renamed from: d */
    long f21284d;

    /* renamed from: e */
    long f21285e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10705v3(InterfaceC10321P interfaceC10321P, long j, long j2, long j3, long j4) {
        this.f21283c = interfaceC10321P;
        this.f21281a = j;
        this.f21282b = j2;
        this.f21284d = j3;
        this.f21285e = j4;
    }

    public final int characteristics() {
        return this.f21283c.characteristics();
    }

    /* renamed from: e */
    protected abstract InterfaceC10321P mo601e(InterfaceC10321P interfaceC10321P, long j, long j2, long j3, long j4);

    public final long estimateSize() {
        long j = this.f21285e;
        long j2 = this.f21281a;
        if (j2 < j) {
            return j - Math.max(j2, this.f21284d);
        }
        return 0L;
    }

    public /* bridge */ /* synthetic */ InterfaceC10309D trySplit() {
        return (InterfaceC10309D) m13090trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC10312G m13087trySplit() {
        return (InterfaceC10312G) m13090trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC10315J m13088trySplit() {
        return (InterfaceC10315J) m13090trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC10318M m13089trySplit() {
        return (InterfaceC10318M) m13090trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public final InterfaceC10321P m13090trySplit() {
        long j = this.f21285e;
        if (this.f21281a >= j || this.f21284d >= j) {
            return null;
        }
        while (true) {
            InterfaceC10321P trySplit = this.f21283c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f21284d;
            long min = Math.min(estimateSize, this.f21282b);
            long j2 = this.f21281a;
            if (j2 >= min) {
                this.f21284d = min;
            } else {
                long j3 = this.f21282b;
                if (min < j3) {
                    long j4 = this.f21284d;
                    if (j4 < j2 || estimateSize > j3) {
                        this.f21284d = min;
                        return mo601e(trySplit, j2, j3, j4, min);
                    }
                    this.f21284d = min;
                    return trySplit;
                }
                this.f21283c = trySplit;
                this.f21285e = min;
            }
        }
    }
}
