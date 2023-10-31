package p060j$.util.stream;

import p060j$.util.C10474k;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10437k;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10435j;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.stream.B1 */
/* loaded from: classes2.dex */
final class C10490B1 implements InterfaceC10555P1, InterfaceC10619e2 {

    /* renamed from: a */
    private boolean f20958a;

    /* renamed from: b */
    private double f20959b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10435j f20960c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10490B1(InterfaceC10435j interfaceC10435j) {
        this.f20960c = interfaceC10435j;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        if (this.f20958a) {
            this.f20958a = false;
        } else {
            d = this.f20960c.applyAsDouble(this.f20959b, d);
        }
        this.f20959b = d;
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
        this.f20958a = true;
        this.f20959b = 0.0d;
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        return this.f20958a ? C10474k.m836a() : C10474k.m833d(this.f20959b);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.stream.InterfaceC10555P1
    /* renamed from: l */
    public final void mo529l(InterfaceC10555P1 interfaceC10555P1) {
        C10490B1 c10490b1 = (C10490B1) interfaceC10555P1;
        if (c10490b1.f20958a) {
            return;
        }
        accept(c10490b1.f20959b);
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
