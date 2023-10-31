package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10385H;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10378D0;
import p060j$.util.function.InterfaceC10391K;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10427f;

/* renamed from: j$.util.stream.L1 */
/* loaded from: classes2.dex */
final class C10539L1 extends AbstractC10559Q1 implements InterfaceC10555P1, InterfaceC10624f2 {

    /* renamed from: b */
    final /* synthetic */ InterfaceC10400O0 f21033b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10378D0 f21034c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC10427f f21035d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10539L1(InterfaceC10400O0 interfaceC10400O0, InterfaceC10378D0 interfaceC10378D0, InterfaceC10427f interfaceC10427f) {
        this.f21033b = interfaceC10400O0;
        this.f21034c = interfaceC10378D0;
        this.f21035d = interfaceC10427f;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final /* synthetic */ void accept(double d) {
        AbstractC10707w0.m554r0();
        throw null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        this.f21034c.accept(this.f21061a, i);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void accept(long j) {
        AbstractC10707w0.m539z0();
        throw null;
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo630h((Integer) obj);
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
        this.f21061a = this.f21033b.get();
    }

    @Override // p060j$.util.stream.InterfaceC10624f2
    /* renamed from: h */
    public final /* synthetic */ void mo630h(Integer num) {
        AbstractC10707w0.m548u0(this, num);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.stream.InterfaceC10555P1
    /* renamed from: l */
    public final void mo529l(InterfaceC10555P1 interfaceC10555P1) {
        this.f21061a = this.f21035d.apply(this.f21061a, ((C10539L1) interfaceC10555P1).f21061a);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }
}
