package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10385H;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10383G;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.stream.J1 */
/* loaded from: classes2.dex */
final class C10530J1 implements InterfaceC10555P1, InterfaceC10624f2 {

    /* renamed from: a */
    private int f21023a;

    /* renamed from: b */
    final /* synthetic */ int f21024b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10383G f21025c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10530J1(int i, InterfaceC10383G interfaceC10383G) {
        this.f21024b = i;
        this.f21025c = interfaceC10383G;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final /* synthetic */ void accept(double d) {
        AbstractC10707w0.m554r0();
        throw null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        this.f21023a = this.f21025c.applyAsInt(this.f21023a, i);
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
        this.f21023a = this.f21024b;
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        return Integer.valueOf(this.f21023a);
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
        accept(((C10530J1) interfaceC10555P1).f21023a);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }
}
