package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10437k;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.stream.a2 */
/* loaded from: classes2.dex */
public abstract class AbstractC10599a2 implements InterfaceC10619e2 {

    /* renamed from: a */
    protected final InterfaceC10634h2 f21132a;

    public AbstractC10599a2(InterfaceC10634h2 interfaceC10634h2) {
        interfaceC10634h2.getClass();
        this.f21132a = interfaceC10634h2;
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
    public void end() {
        this.f21132a.end();
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public boolean mo530i() {
        return this.f21132a.mo530i();
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
