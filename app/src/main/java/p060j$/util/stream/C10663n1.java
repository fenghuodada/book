package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.function.C10437k;
import p060j$.util.function.InterfaceC10443n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n1 */
/* loaded from: classes2.dex */
public final class C10663n1 extends AbstractC10683r1 implements InterfaceC10619e2 {

    /* renamed from: h */
    private final double[] f21212h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10663n1(InterfaceC10321P interfaceC10321P, AbstractC10707w0 abstractC10707w0, double[] dArr) {
        super(dArr.length, interfaceC10321P, abstractC10707w0);
        this.f21212h = dArr;
    }

    C10663n1(C10663n1 c10663n1, InterfaceC10321P interfaceC10321P, long j, long j2) {
        super(c10663n1, interfaceC10321P, j, j2, c10663n1.f21212h.length);
        this.f21212h = c10663n1.f21212h;
    }

    @Override // p060j$.util.stream.AbstractC10683r1
    /* renamed from: a */
    final AbstractC10683r1 mo626a(InterfaceC10321P interfaceC10321P, long j, long j2) {
        return new C10663n1(this, interfaceC10321P, j, j2);
    }

    @Override // p060j$.util.stream.AbstractC10683r1, p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        int i = this.f21247f;
        if (i >= this.f21248g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f21247f));
        }
        double[] dArr = this.f21212h;
        this.f21247f = i + 1;
        dArr[i] = d;
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo527q((Double) obj);
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }

    @Override // p060j$.util.stream.InterfaceC10619e2
    /* renamed from: q */
    public final /* synthetic */ void mo527q(Double d) {
        AbstractC10707w0.m552s0(this, d);
    }
}
