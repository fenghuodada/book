package p060j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p060j$.util.InterfaceC10321P;

/* renamed from: j$.util.stream.d */
/* loaded from: classes2.dex */
abstract class AbstractC10611d extends AbstractC10621f {

    /* renamed from: h */
    protected final AtomicReference f21152h;

    /* renamed from: i */
    protected volatile boolean f21153i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10611d(AbstractC10611d abstractC10611d, InterfaceC10321P interfaceC10321P) {
        super(abstractC10611d, interfaceC10321P);
        this.f21152h = abstractC10611d.f21152h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10611d(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        super(abstractC10707w0, interfaceC10321P);
        this.f21152h = new AtomicReference(null);
    }

    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: b */
    public final Object mo696b() {
        if (m695c() == null) {
            Object obj = this.f21152h.get();
            return obj == null ? mo604i() : obj;
        }
        return super.mo696b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        r8 = r7.mo606a();
     */
    @Override // p060j$.util.stream.AbstractC10621f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void compute() {
        /*
            r10 = this;
            j$.util.P r0 = r10.f21165b
            long r1 = r0.estimateSize()
            long r3 = r10.f21166c
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto Lf
            goto L15
        Lf:
            long r3 = p060j$.util.stream.AbstractC10621f.m693f(r1)
            r10.f21166c = r3
        L15:
            java.util.concurrent.atomic.AtomicReference r5 = r10.f21152h
            r6 = 0
            r7 = r10
        L19:
            java.lang.Object r8 = r5.get()
            if (r8 != 0) goto L6f
            boolean r8 = r7.f21153i
            if (r8 != 0) goto L34
            j$.util.stream.f r9 = r7.m695c()
        L27:
            j$.util.stream.d r9 = (p060j$.util.stream.AbstractC10611d) r9
            if (r8 != 0) goto L34
            if (r9 == 0) goto L34
            boolean r8 = r9.f21153i
            j$.util.stream.f r9 = r9.m695c()
            goto L27
        L34:
            if (r8 == 0) goto L3b
            java.lang.Object r8 = r7.mo604i()
            goto L6f
        L3b:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L6b
            j$.util.P r1 = r0.trySplit()
            if (r1 != 0) goto L46
            goto L6b
        L46:
            j$.util.stream.f r2 = r7.mo605d(r1)
            j$.util.stream.d r2 = (p060j$.util.stream.AbstractC10611d) r2
            r7.f21167d = r2
            j$.util.stream.f r8 = r7.mo605d(r0)
            j$.util.stream.d r8 = (p060j$.util.stream.AbstractC10611d) r8
            r7.f21168e = r8
            r9 = 1
            r7.setPendingCount(r9)
            if (r6 == 0) goto L60
            r0 = r1
            r7 = r2
            r2 = r8
            goto L61
        L60:
            r7 = r8
        L61:
            r6 = r6 ^ 1
            r2.fork()
            long r1 = r0.estimateSize()
            goto L19
        L6b:
            java.lang.Object r8 = r7.mo606a()
        L6f:
            r7.mo694e(r8)
            r7.tryComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p060j$.util.stream.AbstractC10611d.compute():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p060j$.util.stream.AbstractC10621f
    /* renamed from: e */
    public final void mo694e(Object obj) {
        if (!(m695c() == null)) {
            super.mo694e(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f21152h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    /* renamed from: g */
    protected void mo625g() {
        this.f21153i = true;
    }

    @Override // p060j$.util.stream.AbstractC10621f, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return mo696b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final void m717h() {
        AbstractC10611d abstractC10611d = this;
        for (AbstractC10611d abstractC10611d2 = (AbstractC10611d) m695c(); abstractC10611d2 != null; abstractC10611d2 = (AbstractC10611d) abstractC10611d2.m695c()) {
            if (abstractC10611d2.f21167d == abstractC10611d) {
                AbstractC10611d abstractC10611d3 = (AbstractC10611d) abstractC10611d2.f21168e;
                if (!abstractC10611d3.f21153i) {
                    abstractC10611d3.mo625g();
                }
            }
            abstractC10611d = abstractC10611d2;
        }
    }

    /* renamed from: i */
    protected abstract Object mo604i();
}
