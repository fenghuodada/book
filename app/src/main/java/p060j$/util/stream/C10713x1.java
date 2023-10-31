package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10426e0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10384G0;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10427f;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.stream.x1 */
/* loaded from: classes2.dex */
final class C10713x1 extends AbstractC10559Q1 implements InterfaceC10555P1, InterfaceC10629g2 {

    /* renamed from: b */
    final /* synthetic */ InterfaceC10400O0 f21303b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10384G0 f21304c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC10427f f21305d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10713x1(InterfaceC10400O0 interfaceC10400O0, InterfaceC10384G0 interfaceC10384G0, InterfaceC10427f interfaceC10427f) {
        this.f21303b = interfaceC10400O0;
        this.f21304c = interfaceC10384G0;
        this.f21305d = interfaceC10427f;
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
    public final void accept(long j) {
        this.f21304c.accept(this.f21061a, j);
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo537m((Long) obj);
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
        this.f21061a = this.f21303b.get();
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }

    @Override // p060j$.util.stream.InterfaceC10555P1
    /* renamed from: l */
    public final void mo529l(InterfaceC10555P1 interfaceC10555P1) {
        this.f21061a = this.f21305d.apply(this.f21061a, ((C10713x1) interfaceC10555P1).f21061a);
    }

    @Override // p060j$.util.stream.InterfaceC10629g2
    /* renamed from: m */
    public final /* synthetic */ void mo537m(Long l) {
        AbstractC10707w0.m544w0(this, l);
    }
}
