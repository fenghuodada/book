package p060j$.util.stream;

import p060j$.util.C10476m;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.C10426e0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10424d0;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.stream.O1 */
/* loaded from: classes2.dex */
final class C10551O1 implements InterfaceC10555P1, InterfaceC10629g2 {

    /* renamed from: a */
    private boolean f21050a;

    /* renamed from: b */
    private long f21051b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10424d0 f21052c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10551O1(InterfaceC10424d0 interfaceC10424d0) {
        this.f21052c = interfaceC10424d0;
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
    public final void accept(long j) {
        if (this.f21050a) {
            this.f21050a = false;
        } else {
            j = this.f21052c.applyAsLong(this.f21051b, j);
        }
        this.f21051b = j;
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
    public final /* synthetic */ void end() {
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        this.f21050a = true;
        this.f21051b = 0L;
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        return this.f21050a ? C10476m.m828a() : C10476m.m825d(this.f21051b);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }

    @Override // p060j$.util.stream.InterfaceC10555P1
    /* renamed from: l */
    public final void mo529l(InterfaceC10555P1 interfaceC10555P1) {
        C10551O1 c10551o1 = (C10551O1) interfaceC10555P1;
        if (c10551o1.f21050a) {
            return;
        }
        accept(c10551o1.f21051b);
    }

    @Override // p060j$.util.stream.InterfaceC10629g2
    /* renamed from: m */
    public final /* synthetic */ void mo537m(Long l) {
        AbstractC10707w0.m544w0(this, l);
    }
}
