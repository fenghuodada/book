package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.D3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10502D3 implements InterfaceC10634h2 {

    /* renamed from: a */
    public final /* synthetic */ int f20975a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f20976b;

    public /* synthetic */ C10502D3(Consumer consumer, int i) {
        this.f20975a = i;
        this.f20976b = consumer;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final /* synthetic */ void accept(double d) {
        switch (this.f20975a) {
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
        switch (this.f20975a) {
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
        switch (this.f20975a) {
            case 0:
                AbstractC10707w0.m539z0();
                throw null;
            default:
                AbstractC10707w0.m539z0();
                throw null;
        }
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f20975a;
        Consumer consumer = this.f20976b;
        switch (i) {
            case 0:
                ((C10563R2) consumer).accept(obj);
                return;
            default:
                consumer.accept(obj);
                return;
        }
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        switch (this.f20975a) {
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
}
