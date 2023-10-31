package p060j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p060j$.util.InterfaceC10321P;

/* renamed from: j$.util.stream.V */
/* loaded from: classes2.dex */
final class C10576V extends CountedCompleter {

    /* renamed from: a */
    private InterfaceC10321P f21084a;

    /* renamed from: b */
    private final InterfaceC10634h2 f21085b;

    /* renamed from: c */
    private final AbstractC10707w0 f21086c;

    /* renamed from: d */
    private long f21087d;

    C10576V(C10576V c10576v, InterfaceC10321P interfaceC10321P) {
        super(c10576v);
        this.f21084a = interfaceC10321P;
        this.f21085b = c10576v.f21085b;
        this.f21087d = c10576v.f21087d;
        this.f21086c = c10576v.f21086c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10576V(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2) {
        super(null);
        this.f21085b = interfaceC10634h2;
        this.f21086c = abstractC10707w0;
        this.f21084a = interfaceC10321P;
        this.f21087d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC10321P trySplit;
        InterfaceC10321P interfaceC10321P = this.f21084a;
        long estimateSize = interfaceC10321P.estimateSize();
        long j = this.f21087d;
        if (j == 0) {
            j = AbstractC10621f.m693f(estimateSize);
            this.f21087d = j;
        }
        boolean m759d = EnumC10587X2.SHORT_CIRCUIT.m759d(this.f21086c.mo564i1());
        InterfaceC10634h2 interfaceC10634h2 = this.f21085b;
        boolean z = false;
        C10576V c10576v = this;
        while (true) {
            if (m759d && interfaceC10634h2.mo530i()) {
                break;
            } else if (estimateSize <= j || (trySplit = interfaceC10321P.trySplit()) == null) {
                break;
            } else {
                C10576V c10576v2 = new C10576V(c10576v, trySplit);
                c10576v.addToPendingCount(1);
                if (z) {
                    interfaceC10321P = trySplit;
                } else {
                    C10576V c10576v3 = c10576v;
                    c10576v = c10576v2;
                    c10576v2 = c10576v3;
                }
                z = !z;
                c10576v.fork();
                c10576v = c10576v2;
                estimateSize = interfaceC10321P.estimateSize();
            }
        }
        c10576v.f21086c.mo575X0(interfaceC10321P, interfaceC10634h2);
        c10576v.f21084a = null;
        c10576v.propagateCompletion();
    }
}
