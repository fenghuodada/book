package p060j$.util.stream;

import p060j$.util.function.C10385H;
import p060j$.util.function.C10399O;
import p060j$.util.function.InterfaceC10391K;
import p060j$.util.function.InterfaceC10403Q;

/* renamed from: j$.util.stream.p0 */
/* loaded from: classes2.dex */
final class C10672p0 extends AbstractC10687s0 implements InterfaceC10624f2 {

    /* renamed from: c */
    final /* synthetic */ EnumC10692t0 f21227c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC10403Q f21228d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10672p0(InterfaceC10403Q interfaceC10403Q, EnumC10692t0 enumC10692t0) {
        super(enumC10692t0);
        this.f21227c = enumC10692t0;
        this.f21228d = interfaceC10403Q;
    }

    @Override // p060j$.util.stream.AbstractC10687s0, p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        boolean z;
        boolean z2;
        if (this.f21258a) {
            return;
        }
        boolean m911e = ((C10399O) this.f21228d).m911e(i);
        EnumC10692t0 enumC10692t0 = this.f21227c;
        z = enumC10692t0.f21264a;
        if (m911e == z) {
            this.f21258a = true;
            z2 = enumC10692t0.f21265b;
            this.f21259b = z2;
        }
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo630h((Integer) obj);
    }

    @Override // p060j$.util.stream.InterfaceC10624f2
    /* renamed from: h */
    public final /* synthetic */ void mo630h(Integer num) {
        AbstractC10707w0.m548u0(this, num);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }
}
