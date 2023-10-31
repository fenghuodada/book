package p060j$.util.stream;

import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10443n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.A */
/* loaded from: classes2.dex */
public final class C10483A extends AbstractC10498D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10483A(InterfaceC10321P interfaceC10321P, int i) {
        super(interfaceC10321P, i);
    }

    @Override // p060j$.util.stream.AbstractC10498D, p060j$.util.stream.InterfaceC10513G
    /* renamed from: L */
    public final void mo813L(InterfaceC10443n interfaceC10443n) {
        InterfaceC10309D m817S1;
        if (isParallel()) {
            super.mo813L(interfaceC10443n);
            return;
        }
        m817S1 = AbstractC10498D.m817S1(m719O1());
        m817S1.mo682d(interfaceC10443n);
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

    @Override // p060j$.util.stream.AbstractC10498D, p060j$.util.stream.InterfaceC10513G
    /* renamed from: o0 */
    public final void mo804o0(InterfaceC10443n interfaceC10443n) {
        InterfaceC10309D m817S1;
        if (isParallel()) {
            super.mo804o0(interfaceC10443n);
            return;
        }
        m817S1 = AbstractC10498D.m817S1(m719O1());
        m817S1.mo682d(interfaceC10443n);
    }

    @Override // p060j$.util.stream.AbstractC10606c, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* bridge */ /* synthetic */ InterfaceC10513G parallel() {
        parallel();
        return this;
    }

    @Override // p060j$.util.stream.AbstractC10606c, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* bridge */ /* synthetic */ InterfaceC10513G sequential() {
        sequential();
        return this;
    }
}
