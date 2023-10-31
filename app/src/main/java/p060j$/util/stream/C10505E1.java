package p060j$.util.stream;

import p060j$.util.Optional;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10427f;

/* renamed from: j$.util.stream.E1 */
/* loaded from: classes2.dex */
final class C10505E1 implements InterfaceC10555P1 {

    /* renamed from: a */
    private boolean f20978a;

    /* renamed from: b */
    private Object f20979b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10427f f20980c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10505E1(InterfaceC10427f interfaceC10427f) {
        this.f20980c = interfaceC10427f;
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
    public final void accept(Object obj) {
        if (this.f20978a) {
            this.f20978a = false;
        } else {
            obj = this.f20980c.apply(this.f20979b, obj);
        }
        this.f20979b = obj;
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
    public final void mo531g(long j) {
        this.f20978a = true;
        this.f20979b = null;
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        return this.f20978a ? Optional.m1027a() : Optional.m1024d(this.f20979b);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.stream.InterfaceC10555P1
    /* renamed from: l */
    public final void mo529l(InterfaceC10555P1 interfaceC10555P1) {
        C10505E1 c10505e1 = (C10505E1) interfaceC10555P1;
        if (c10505e1.f20978a) {
            return;
        }
        accept(c10505e1.f20979b);
    }
}
