package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10385H;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.stream.j3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10645j3 implements InterfaceC10624f2 {

    /* renamed from: a */
    public final /* synthetic */ int f21193a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10391K f21194b;

    public /* synthetic */ C10645j3(InterfaceC10391K interfaceC10391K, int i) {
        this.f21193a = i;
        this.f21194b = interfaceC10391K;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final /* synthetic */ void accept(double d) {
        switch (this.f21193a) {
            case 0:
                AbstractC10707w0.m554r0();
                throw null;
            default:
                AbstractC10707w0.m554r0();
                throw null;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10624f2, p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        int i2 = this.f21193a;
        InterfaceC10391K interfaceC10391K = this.f21194b;
        switch (i2) {
            case 0:
                ((C10544M2) interfaceC10391K).accept(i);
                return;
            default:
                interfaceC10391K.accept(i);
                return;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void accept(long j) {
        switch (this.f21193a) {
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
        switch (this.f21193a) {
            case 0:
                mo630h((Integer) obj);
                return;
            default:
                mo630h((Integer) obj);
                return;
        }
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        switch (this.f21193a) {
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

    @Override // p060j$.util.stream.InterfaceC10624f2
    /* renamed from: h */
    public final /* synthetic */ void mo630h(Integer num) {
        switch (this.f21193a) {
            case 0:
                AbstractC10707w0.m548u0(this, num);
                return;
            default:
                AbstractC10707w0.m548u0(this, num);
                return;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        switch (this.f21193a) {
            case 0:
                interfaceC10391K.getClass();
                return new C10385H(this, interfaceC10391K);
            default:
                interfaceC10391K.getClass();
                return new C10385H(this, interfaceC10391K);
        }
    }
}
