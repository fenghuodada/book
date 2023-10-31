package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10385H;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.stream.b2 */
/* loaded from: classes2.dex */
public abstract class AbstractC10604b2 implements InterfaceC10624f2 {

    /* renamed from: a */
    protected final InterfaceC10634h2 f21137a;

    public AbstractC10604b2(InterfaceC10634h2 interfaceC10634h2) {
        interfaceC10634h2.getClass();
        this.f21137a = interfaceC10634h2;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final /* synthetic */ void accept(double d) {
        AbstractC10707w0.m554r0();
        throw null;
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
    public void end() {
        this.f21137a.end();
    }

    @Override // p060j$.util.stream.InterfaceC10624f2
    /* renamed from: h */
    public final /* synthetic */ void mo630h(Integer num) {
        AbstractC10707w0.m548u0(this, num);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public boolean mo530i() {
        return this.f21137a.mo530i();
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }
}
