package p060j$.util.stream;

import p060j$.util.function.C10385H;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.stream.b3 */
/* loaded from: classes2.dex */
final class C10605b3 extends AbstractC10615d3 implements InterfaceC10391K {

    /* renamed from: c */
    final int[] f21138c = new int[128];

    @Override // p060j$.util.stream.AbstractC10615d3
    /* renamed from: a */
    public final void mo697a(Object obj, long j) {
        InterfaceC10391K interfaceC10391K = (InterfaceC10391K) obj;
        for (int i = 0; i < j; i++) {
            interfaceC10391K.accept(this.f21138c[i]);
        }
    }

    @Override // p060j$.util.function.InterfaceC10391K
    public final void accept(int i) {
        int i2 = this.f21155b;
        this.f21155b = i2 + 1;
        this.f21138c[i2] = i;
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }
}
