package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.BiFunction;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10427f;

/* renamed from: j$.util.stream.D1 */
/* loaded from: classes2.dex */
final class C10500D1 extends AbstractC10559Q1 implements InterfaceC10555P1 {

    /* renamed from: b */
    final /* synthetic */ Object f20971b;

    /* renamed from: c */
    final /* synthetic */ BiFunction f20972c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC10427f f20973d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10500D1(Object obj, BiFunction biFunction, InterfaceC10427f interfaceC10427f) {
        this.f20971b = obj;
        this.f20972c = biFunction;
        this.f20973d = interfaceC10427f;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final /* synthetic */ void accept(double d) {
        AbstractC10707w0.m554r0();
        throw null;
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
    public final void accept(Object obj) {
        this.f21061a = this.f20972c.apply(this.f21061a, obj);
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
        this.f21061a = this.f20971b;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.stream.InterfaceC10555P1
    /* renamed from: l */
    public final void mo529l(InterfaceC10555P1 interfaceC10555P1) {
        this.f21061a = this.f20973d.apply(this.f21061a, ((C10500D1) interfaceC10555P1).f21061a);
    }
}
