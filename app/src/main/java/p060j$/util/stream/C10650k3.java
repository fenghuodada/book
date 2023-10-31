package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10312G;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.stream.k3 */
/* loaded from: classes2.dex */
final class C10650k3 extends AbstractC10595Z2 implements InterfaceC10312G {
    C10650k3(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z) {
        super(abstractC10707w0, interfaceC10321P, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10650k3(AbstractC10707w0 abstractC10707w0, C10596a c10596a, boolean z) {
        super(abstractC10707w0, c10596a, z);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1008o(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: c */
    public final void forEachRemaining(InterfaceC10391K interfaceC10391K) {
        if (this.f21128h != null || this.f21129i) {
            do {
            } while (tryAdvance(interfaceC10391K));
            return;
        }
        interfaceC10391K.getClass();
        m730h();
        C10645j3 c10645j3 = new C10645j3(interfaceC10391K, 1);
        this.f21122b.mo540y1(this.f21124d, c10645j3);
        this.f21129i = true;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1015g(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10595Z2
    /* renamed from: i */
    final void mo649i() {
        C10544M2 c10544m2 = new C10544M2();
        this.f21128h = c10544m2;
        this.f21125e = this.f21122b.mo538z1(new C10645j3(c10544m2, 0));
        this.f21126f = new C10596a(this, 5);
    }

    @Override // p060j$.util.stream.AbstractC10595Z2
    /* renamed from: j */
    final AbstractC10595Z2 mo648j(InterfaceC10321P interfaceC10321P) {
        return new C10650k3(this.f21122b, interfaceC10321P, this.f21121a);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: k */
    public final boolean tryAdvance(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        boolean m732e = m732e();
        if (m732e) {
            C10544M2 c10544m2 = (C10544M2) this.f21128h;
            long j = this.f21127g;
            int m778v = c10544m2.m778v(j);
            interfaceC10391K.accept((c10544m2.f21158c == 0 && m778v == 0) ? ((int[]) c10544m2.f21062e)[(int) j] : ((int[][]) c10544m2.f21063f)[m778v][(int) (j - c10544m2.f21159d[m778v])]);
        }
        return m732e;
    }

    @Override // p060j$.util.stream.AbstractC10595Z2, p060j$.util.InterfaceC10321P
    public final InterfaceC10312G trySplit() {
        return (InterfaceC10312G) super.trySplit();
    }
}
