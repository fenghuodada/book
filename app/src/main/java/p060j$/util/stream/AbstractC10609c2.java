package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10426e0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.stream.c2 */
/* loaded from: classes2.dex */
public abstract class AbstractC10609c2 implements InterfaceC10629g2 {

    /* renamed from: a */
    protected final InterfaceC10634h2 f21150a;

    public AbstractC10609c2(InterfaceC10634h2 interfaceC10634h2) {
        interfaceC10634h2.getClass();
        this.f21150a = interfaceC10634h2;
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
    public void end() {
        this.f21150a.end();
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public boolean mo530i() {
        return this.f21150a.mo530i();
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }

    @Override // p060j$.util.stream.InterfaceC10629g2
    /* renamed from: m */
    public final /* synthetic */ void mo537m(Long l) {
        AbstractC10707w0.m544w0(this, l);
    }
}
