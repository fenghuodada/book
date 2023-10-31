package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10437k;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10372A0;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10427f;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.stream.C1 */
/* loaded from: classes2.dex */
final class C10495C1 extends AbstractC10559Q1 implements InterfaceC10555P1, InterfaceC10619e2 {

    /* renamed from: b */
    final /* synthetic */ InterfaceC10400O0 f20962b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10372A0 f20963c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC10427f f20964d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10495C1(InterfaceC10400O0 interfaceC10400O0, InterfaceC10372A0 interfaceC10372A0, InterfaceC10427f interfaceC10427f) {
        this.f20962b = interfaceC10400O0;
        this.f20963c = interfaceC10372A0;
        this.f20964d = interfaceC10427f;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        this.f20963c.accept(this.f21061a, d);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void accept(int i) {
        AbstractC10707w0.m541y0();
        throw null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void accept(long j) {
        AbstractC10707w0.m539z0();
        throw null;
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo527q((Double) obj);
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void end() {
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        this.f21061a = this.f20962b.get();
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.stream.InterfaceC10555P1
    /* renamed from: l */
    public final void mo529l(InterfaceC10555P1 interfaceC10555P1) {
        this.f21061a = this.f20964d.apply(this.f21061a, ((C10495C1) interfaceC10555P1).f21061a);
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }

    @Override // p060j$.util.stream.InterfaceC10619e2
    /* renamed from: q */
    public final /* synthetic */ void mo527q(Double d) {
        AbstractC10707w0.m552s0(this, d);
    }
}
