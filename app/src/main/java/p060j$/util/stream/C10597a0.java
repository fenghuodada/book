package p060j$.util.stream;

import p060j$.util.InterfaceC10312G;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10391K;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a0 */
/* loaded from: classes2.dex */
public final class C10597a0 extends AbstractC10612d0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10597a0(InterfaceC10321P interfaceC10321P, int i) {
        super(interfaceC10321P, i);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: L1 */
    final boolean mo680L1() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: M1 */
    public final InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2) {
        throw new UnsupportedOperationException();
    }

    @Override // p060j$.util.stream.AbstractC10612d0, p060j$.util.stream.IntStream
    /* renamed from: U */
    public final void mo712U(InterfaceC10391K interfaceC10391K) {
        InterfaceC10312G m713S1;
        if (isParallel()) {
            super.mo712U(interfaceC10391K);
            return;
        }
        m713S1 = AbstractC10612d0.m713S1(m719O1());
        m713S1.mo662c(interfaceC10391K);
    }

    @Override // p060j$.util.stream.AbstractC10612d0, p060j$.util.stream.IntStream
    /* renamed from: c0 */
    public final void mo709c0(InterfaceC10391K interfaceC10391K) {
        InterfaceC10312G m713S1;
        if (isParallel()) {
            super.mo709c0(interfaceC10391K);
            return;
        }
        m713S1 = AbstractC10612d0.m713S1(m719O1());
        m713S1.mo662c(interfaceC10391K);
    }

    @Override // p060j$.util.stream.AbstractC10606c, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // p060j$.util.stream.AbstractC10606c, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
