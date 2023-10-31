package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.M */
/* loaded from: classes2.dex */
abstract class AbstractC10541M implements InterfaceC10522H3 {

    /* renamed from: a */
    boolean f21037a;

    /* renamed from: b */
    Object f21038b;

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public /* synthetic */ void accept(double d) {
        AbstractC10707w0.m554r0();
        throw null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public /* synthetic */ void accept(int i) {
        AbstractC10707w0.m541y0();
        throw null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public /* synthetic */ void accept(long j) {
        AbstractC10707w0.m539z0();
        throw null;
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: accept */
    public final void m795q(Object obj) {
        if (this.f21037a) {
            return;
        }
        this.f21037a = true;
        this.f21038b = obj;
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
    public final /* synthetic */ void mo531g(long j) {
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final boolean mo530i() {
        return this.f21037a;
    }
}
