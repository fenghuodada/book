package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.stream.m3 */
/* loaded from: classes2.dex */
final class C10660m3 extends AbstractC10595Z2 implements InterfaceC10315J {
    C10660m3(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z) {
        super(abstractC10707w0, interfaceC10321P, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10660m3(AbstractC10707w0 abstractC10707w0, C10596a c10596a, boolean z) {
        super(abstractC10707w0, c10596a, z);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1007q(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC10432h0 interfaceC10432h0) {
        if (this.f21128h != null || this.f21129i) {
            do {
            } while (tryAdvance(interfaceC10432h0));
            return;
        }
        interfaceC10432h0.getClass();
        m730h();
        C10655l3 c10655l3 = new C10655l3(interfaceC10432h0, 1);
        this.f21122b.mo540y1(this.f21124d, c10655l3);
        this.f21129i = true;
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: f */
    public final boolean tryAdvance(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        boolean m732e = m732e();
        if (m732e) {
            C10552O2 c10552o2 = (C10552O2) this.f21128h;
            long j = this.f21127g;
            int m778v = c10552o2.m778v(j);
            interfaceC10432h0.accept((c10552o2.f21158c == 0 && m778v == 0) ? ((long[]) c10552o2.f21062e)[(int) j] : ((long[][]) c10552o2.f21063f)[m778v][(int) (j - c10552o2.f21159d[m778v])]);
        }
        return m732e;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1014h(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10595Z2
    /* renamed from: i */
    final void mo649i() {
        C10552O2 c10552o2 = new C10552O2();
        this.f21128h = c10552o2;
        this.f21125e = this.f21122b.mo538z1(new C10655l3(c10552o2, 0));
        this.f21126f = new C10596a(this, 6);
    }

    @Override // p060j$.util.stream.AbstractC10595Z2
    /* renamed from: j */
    final AbstractC10595Z2 mo648j(InterfaceC10321P interfaceC10321P) {
        return new C10660m3(this.f21122b, interfaceC10321P, this.f21121a);
    }

    @Override // p060j$.util.stream.AbstractC10595Z2, p060j$.util.InterfaceC10321P
    public final InterfaceC10315J trySplit() {
        return (InterfaceC10315J) super.trySplit();
    }
}
