package p060j$.util.stream;

import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.s0 */
/* loaded from: classes2.dex */
abstract class AbstractC10687s0 implements InterfaceC10634h2 {

    /* renamed from: a */
    boolean f21258a;

    /* renamed from: b */
    boolean f21259b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10687s0(EnumC10692t0 enumC10692t0) {
        boolean z;
        z = enumC10692t0.f21265b;
        this.f21259b = !z;
    }

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
        return this.f21258a;
    }
}
