package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.E3 */
/* loaded from: classes2.dex */
final class C10507E3 extends AbstractC10595Z2 {
    C10507E3(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z) {
        super(abstractC10707w0, interfaceC10321P, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10507E3(AbstractC10707w0 abstractC10707w0, C10596a c10596a, boolean z) {
        super(abstractC10707w0, c10596a, z);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final boolean mo534a(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean m732e = m732e();
        if (m732e) {
            C10563R2 c10563r2 = (C10563R2) this.f21128h;
            long j = this.f21127g;
            if (c10563r2.f21158c != 0) {
                if (j < c10563r2.count()) {
                    for (int i = 0; i <= c10563r2.f21158c; i++) {
                        long j2 = c10563r2.f21159d[i];
                        Object[] objArr = c10563r2.f21066f[i];
                        if (j < objArr.length + j2) {
                            obj = objArr[(int) (j - j2)];
                        }
                    }
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else if (j >= c10563r2.f21157b) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else {
                obj = c10563r2.f21065e[(int) j];
            }
            consumer.accept(obj);
        }
        return m732e;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final void forEachRemaining(Consumer consumer) {
        if (this.f21128h != null || this.f21129i) {
            do {
            } while (mo534a(consumer));
            return;
        }
        consumer.getClass();
        m730h();
        C10502D3 c10502d3 = new C10502D3(consumer, 1);
        this.f21122b.mo540y1(this.f21124d, c10502d3);
        this.f21129i = true;
    }

    @Override // p060j$.util.stream.AbstractC10595Z2
    /* renamed from: i */
    final void mo649i() {
        C10563R2 c10563r2 = new C10563R2();
        this.f21128h = c10563r2;
        this.f21125e = this.f21122b.mo538z1(new C10502D3(c10563r2, 0));
        this.f21126f = new C10596a(this, 7);
    }

    @Override // p060j$.util.stream.AbstractC10595Z2
    /* renamed from: j */
    final AbstractC10595Z2 mo648j(InterfaceC10321P interfaceC10321P) {
        return new C10507E3(this.f21122b, interfaceC10321P, this.f21121a);
    }
}
