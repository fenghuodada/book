package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.C10426e0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.stream.y3 */
/* loaded from: classes2.dex */
final class C10720y3 extends AbstractC10725z3 implements InterfaceC10315J, InterfaceC10432h0 {

    /* renamed from: e */
    long f21313e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10720y3(InterfaceC10315J interfaceC10315J, long j, long j2) {
        super(interfaceC10315J, j, j2);
    }

    C10720y3(InterfaceC10315J interfaceC10315J, C10720y3 c10720y3) {
        super(interfaceC10315J, c10720y3);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1007q(this, consumer);
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    public final void accept(long j) {
        this.f21313e = j;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1014h(this, consumer);
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }

    @Override // p060j$.util.stream.AbstractC10497C3
    /* renamed from: s */
    protected final InterfaceC10321P mo533s(InterfaceC10321P interfaceC10321P) {
        return new C10720y3((InterfaceC10315J) interfaceC10321P, this);
    }

    @Override // p060j$.util.stream.AbstractC10725z3
    /* renamed from: u */
    protected final void mo518u(Object obj) {
        ((InterfaceC10432h0) obj).accept(this.f21313e);
    }

    @Override // p060j$.util.stream.AbstractC10725z3
    /* renamed from: v */
    protected final AbstractC10615d3 mo517v() {
        return new C10610c3();
    }
}
