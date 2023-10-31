package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.stream.i3 */
/* loaded from: classes2.dex */
final class C10640i3 extends AbstractC10595Z2 implements InterfaceC10309D {
    C10640i3(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z) {
        super(abstractC10707w0, interfaceC10321P, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10640i3(AbstractC10707w0 abstractC10707w0, C10596a c10596a, boolean z) {
        super(abstractC10707w0, c10596a, z);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1009n(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC10443n interfaceC10443n) {
        if (this.f21128h != null || this.f21129i) {
            do {
            } while (tryAdvance(interfaceC10443n));
            return;
        }
        interfaceC10443n.getClass();
        m730h();
        C10635h3 c10635h3 = new C10635h3(interfaceC10443n, 1);
        this.f21122b.mo540y1(this.f21124d, c10635h3);
        this.f21129i = true;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1016e(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10595Z2
    /* renamed from: i */
    final void mo649i() {
        C10536K2 c10536k2 = new C10536K2();
        this.f21128h = c10536k2;
        this.f21125e = this.f21122b.mo538z1(new C10635h3(c10536k2, 0));
        this.f21126f = new C10596a(this, 4);
    }

    @Override // p060j$.util.stream.AbstractC10595Z2
    /* renamed from: j */
    final AbstractC10595Z2 mo648j(InterfaceC10321P interfaceC10321P) {
        return new C10640i3(this.f21122b, interfaceC10321P, this.f21121a);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: p */
    public final boolean tryAdvance(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        boolean m732e = m732e();
        if (m732e) {
            C10536K2 c10536k2 = (C10536K2) this.f21128h;
            long j = this.f21127g;
            int m778v = c10536k2.m778v(j);
            interfaceC10443n.accept((c10536k2.f21158c == 0 && m778v == 0) ? ((double[]) c10536k2.f21062e)[(int) j] : ((double[][]) c10536k2.f21063f)[m778v][(int) (j - c10536k2.f21159d[m778v])]);
        }
        return m732e;
    }

    @Override // p060j$.util.stream.AbstractC10595Z2, p060j$.util.InterfaceC10321P
    public final InterfaceC10309D trySplit() {
        return (InterfaceC10309D) super.trySplit();
    }
}
