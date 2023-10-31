package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10312G;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.C10385H;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.stream.x3 */
/* loaded from: classes2.dex */
final class C10715x3 extends AbstractC10725z3 implements InterfaceC10312G, InterfaceC10391K {

    /* renamed from: e */
    int f21307e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10715x3(InterfaceC10312G interfaceC10312G, long j, long j2) {
        super(interfaceC10312G, j, j2);
    }

    C10715x3(InterfaceC10312G interfaceC10312G, C10715x3 c10715x3) {
        super(interfaceC10312G, c10715x3);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1008o(this, consumer);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    public final void accept(int i) {
        this.f21307e = i;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1015g(this, consumer);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }

    @Override // p060j$.util.stream.AbstractC10497C3
    /* renamed from: s */
    protected final InterfaceC10321P mo533s(InterfaceC10321P interfaceC10321P) {
        return new C10715x3((InterfaceC10312G) interfaceC10321P, this);
    }

    @Override // p060j$.util.stream.AbstractC10725z3
    /* renamed from: u */
    protected final void mo518u(Object obj) {
        ((InterfaceC10391K) obj).accept(this.f21307e);
    }

    @Override // p060j$.util.stream.AbstractC10725z3
    /* renamed from: v */
    protected final AbstractC10615d3 mo517v() {
        return new C10605b3();
    }
}
