package p060j$.util.stream;

import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10432h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h0 */
/* loaded from: classes2.dex */
public final class C10632h0 extends AbstractC10647k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10632h0(InterfaceC10321P interfaceC10321P, int i) {
        super(interfaceC10321P, i);
    }

    @Override // p060j$.util.stream.AbstractC10647k0, p060j$.util.stream.InterfaceC10662n0
    /* renamed from: B */
    public final void mo646B(InterfaceC10432h0 interfaceC10432h0) {
        InterfaceC10315J m664S1;
        if (isParallel()) {
            super.mo646B(interfaceC10432h0);
            return;
        }
        m664S1 = AbstractC10647k0.m664S1(m719O1());
        m664S1.mo651b(interfaceC10432h0);
    }

    @Override // p060j$.util.stream.AbstractC10647k0, p060j$.util.stream.InterfaceC10662n0
    /* renamed from: I */
    public final void mo643I(InterfaceC10432h0 interfaceC10432h0) {
        InterfaceC10315J m664S1;
        if (isParallel()) {
            super.mo643I(interfaceC10432h0);
            return;
        }
        m664S1 = AbstractC10647k0.m664S1(m719O1());
        m664S1.mo651b(interfaceC10432h0);
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

    @Override // p060j$.util.stream.AbstractC10606c, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* bridge */ /* synthetic */ InterfaceC10662n0 parallel() {
        parallel();
        return this;
    }

    @Override // p060j$.util.stream.AbstractC10606c, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* bridge */ /* synthetic */ InterfaceC10662n0 sequential() {
        sequential();
        return this;
    }
}
