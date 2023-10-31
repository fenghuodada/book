package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10427f;

/* renamed from: j$.util.stream.G1 */
/* loaded from: classes2.dex */
final class C10515G1 extends AbstractC10559Q1 implements InterfaceC10555P1 {

    /* renamed from: b */
    final /* synthetic */ InterfaceC10400O0 f20993b;

    /* renamed from: c */
    final /* synthetic */ BiConsumer f20994c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC10427f f20995d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10515G1(InterfaceC10400O0 interfaceC10400O0, BiConsumer biConsumer, InterfaceC10427f interfaceC10427f) {
        this.f20993b = interfaceC10400O0;
        this.f20994c = biConsumer;
        this.f20995d = interfaceC10427f;
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
        this.f20994c.accept(this.f21061a, obj);
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
        this.f21061a = this.f20993b.get();
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.stream.InterfaceC10555P1
    /* renamed from: l */
    public final void mo529l(InterfaceC10555P1 interfaceC10555P1) {
        this.f21061a = this.f20995d.apply(this.f21061a, ((C10515G1) interfaceC10555P1).f21061a);
    }
}
