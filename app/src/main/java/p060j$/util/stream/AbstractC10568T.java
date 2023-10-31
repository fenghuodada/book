package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.T */
/* loaded from: classes2.dex */
abstract class AbstractC10568T implements InterfaceC10517G3, InterfaceC10522H3 {

    /* renamed from: a */
    private final boolean f21072a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10568T(boolean z) {
        this.f21072a = z;
    }

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: A */
    public final Object mo600A(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        (this.f21072a ? new C10572U(abstractC10707w0, interfaceC10321P, this) : new C10576V(abstractC10707w0, interfaceC10321P, abstractC10707w0.mo538z1(this))).invoke();
        return null;
    }

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: R */
    public final int mo582R() {
        if (this.f21072a) {
            return 0;
        }
        return EnumC10587X2.f21109r;
    }

    public /* synthetic */ void accept(double d) {
        AbstractC10707w0.m554r0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC10707w0.m541y0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
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
    public final /* synthetic */ void end() {
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final /* synthetic */ void mo531g(long j) {
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: p0 */
    public final Object mo557p0(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        abstractC10707w0.mo540y1(interfaceC10321P, this);
        return null;
    }
}
