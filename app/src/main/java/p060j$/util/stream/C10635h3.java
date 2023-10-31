package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10437k;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.stream.h3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10635h3 implements InterfaceC10619e2 {

    /* renamed from: a */
    public final /* synthetic */ int f21180a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10443n f21181b;

    public /* synthetic */ C10635h3(InterfaceC10443n interfaceC10443n, int i) {
        this.f21180a = i;
        this.f21181b = interfaceC10443n;
    }

    @Override // p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        int i = this.f21180a;
        InterfaceC10443n interfaceC10443n = this.f21181b;
        switch (i) {
            case 0:
                ((C10536K2) interfaceC10443n).accept(d);
                return;
            default:
                interfaceC10443n.accept(d);
                return;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void accept(int i) {
        switch (this.f21180a) {
            case 0:
                AbstractC10707w0.m541y0();
                throw null;
            default:
                AbstractC10707w0.m541y0();
                throw null;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void accept(long j) {
        switch (this.f21180a) {
            case 0:
                AbstractC10707w0.m539z0();
                throw null;
            default:
                AbstractC10707w0.m539z0();
                throw null;
        }
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f21180a) {
            case 0:
                mo527q((Double) obj);
                return;
            default:
                mo527q((Double) obj);
                return;
        }
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        switch (this.f21180a) {
            case 0:
                consumer.getClass();
                return new C10359u(3, this, consumer);
            default:
                consumer.getClass();
                return new C10359u(3, this, consumer);
        }
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
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        switch (this.f21180a) {
            case 0:
                interfaceC10443n.getClass();
                return new C10437k(this, interfaceC10443n);
            default:
                interfaceC10443n.getClass();
                return new C10437k(this, interfaceC10443n);
        }
    }

    @Override // p060j$.util.stream.InterfaceC10619e2
    /* renamed from: q */
    public final /* synthetic */ void mo527q(Double d) {
        switch (this.f21180a) {
            case 0:
                AbstractC10707w0.m552s0(this, d);
                return;
            default:
                AbstractC10707w0.m552s0(this, d);
                return;
        }
    }
}
