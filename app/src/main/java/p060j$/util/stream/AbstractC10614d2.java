package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.d2 */
/* loaded from: classes2.dex */
public abstract class AbstractC10614d2 implements InterfaceC10634h2 {

    /* renamed from: a */
    protected final InterfaceC10634h2 f21154a;

    public AbstractC10614d2(InterfaceC10634h2 interfaceC10634h2) {
        interfaceC10634h2.getClass();
        this.f21154a = interfaceC10634h2;
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
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public void end() {
        this.f21154a.end();
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public boolean mo530i() {
        return this.f21154a.mo530i();
    }
}
