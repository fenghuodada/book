package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.C10437k;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.stream.w3 */
/* loaded from: classes2.dex */
final class C10710w3 extends AbstractC10725z3 implements InterfaceC10309D, InterfaceC10443n {

    /* renamed from: e */
    double f21300e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10710w3(InterfaceC10309D interfaceC10309D, long j, long j2) {
        super(interfaceC10309D, j, j2);
    }

    C10710w3(InterfaceC10309D interfaceC10309D, C10710w3 c10710w3) {
        super(interfaceC10309D, c10710w3);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1009n(this, consumer);
    }

    @Override // p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        this.f21300e = d;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1016e(this, consumer);
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }

    @Override // p060j$.util.stream.AbstractC10497C3
    /* renamed from: s */
    protected final InterfaceC10321P mo533s(InterfaceC10321P interfaceC10321P) {
        return new C10710w3((InterfaceC10309D) interfaceC10321P, this);
    }

    @Override // p060j$.util.stream.AbstractC10725z3
    /* renamed from: u */
    protected final void mo518u(Object obj) {
        ((InterfaceC10443n) obj).accept(this.f21300e);
    }

    @Override // p060j$.util.stream.AbstractC10725z3
    /* renamed from: v */
    protected final AbstractC10615d3 mo517v() {
        return new C10600a3();
    }
}
