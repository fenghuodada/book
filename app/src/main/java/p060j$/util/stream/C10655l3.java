package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10426e0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.stream.l3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10655l3 implements InterfaceC10629g2 {

    /* renamed from: a */
    public final /* synthetic */ int f21205a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10432h0 f21206b;

    public /* synthetic */ C10655l3(InterfaceC10432h0 interfaceC10432h0, int i) {
        this.f21205a = i;
        this.f21206b = interfaceC10432h0;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final /* synthetic */ void accept(double d) {
        switch (this.f21205a) {
            case 0:
                AbstractC10707w0.m554r0();
                throw null;
            default:
                AbstractC10707w0.m554r0();
                throw null;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void accept(int i) {
        switch (this.f21205a) {
            case 0:
                AbstractC10707w0.m541y0();
                throw null;
            default:
                AbstractC10707w0.m541y0();
                throw null;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10629g2, p060j$.util.stream.InterfaceC10634h2
    public final void accept(long j) {
        int i = this.f21205a;
        InterfaceC10432h0 interfaceC10432h0 = this.f21206b;
        switch (i) {
            case 0:
                ((C10552O2) interfaceC10432h0).accept(j);
                return;
            default:
                interfaceC10432h0.accept(j);
                return;
        }
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f21205a) {
            case 0:
                mo537m((Long) obj);
                return;
            default:
                mo537m((Long) obj);
                return;
        }
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        switch (this.f21205a) {
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

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        switch (this.f21205a) {
            case 0:
                interfaceC10432h0.getClass();
                return new C10426e0(this, interfaceC10432h0);
            default:
                interfaceC10432h0.getClass();
                return new C10426e0(this, interfaceC10432h0);
        }
    }

    @Override // p060j$.util.stream.InterfaceC10629g2
    /* renamed from: m */
    public final /* synthetic */ void mo537m(Long l) {
        switch (this.f21205a) {
            case 0:
                AbstractC10707w0.m544w0(this, l);
                return;
            default:
                AbstractC10707w0.m544w0(this, l);
                return;
        }
    }
}
