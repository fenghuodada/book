package p060j$.util.stream;

import p060j$.util.C10475l;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10385H;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10383G;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.stream.K1 */
/* loaded from: classes2.dex */
final class C10535K1 implements InterfaceC10555P1, InterfaceC10624f2 {

    /* renamed from: a */
    private boolean f21029a;

    /* renamed from: b */
    private int f21030b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10383G f21031c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10535K1(InterfaceC10383G interfaceC10383G) {
        this.f21031c = interfaceC10383G;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final /* synthetic */ void accept(double d) {
        AbstractC10707w0.m554r0();
        throw null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        if (this.f21029a) {
            this.f21029a = false;
        } else {
            i = this.f21031c.applyAsInt(this.f21030b, i);
        }
        this.f21030b = i;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void accept(long j) {
        AbstractC10707w0.m539z0();
        throw null;
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo630h((Integer) obj);
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
        this.f21029a = true;
        this.f21030b = 0;
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        return this.f21029a ? C10475l.m832a() : C10475l.m829d(this.f21030b);
    }

    @Override // p060j$.util.stream.InterfaceC10624f2
    /* renamed from: h */
    public final /* synthetic */ void mo630h(Integer num) {
        AbstractC10707w0.m548u0(this, num);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.stream.InterfaceC10555P1
    /* renamed from: l */
    public final void mo529l(InterfaceC10555P1 interfaceC10555P1) {
        C10535K1 c10535k1 = (C10535K1) interfaceC10555P1;
        if (c10535k1.f21029a) {
            return;
        }
        accept(c10535k1.f21030b);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }
}
