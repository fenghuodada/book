package p060j$.util.stream;

import p060j$.util.function.C10437k;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.stream.a3 */
/* loaded from: classes2.dex */
final class C10600a3 extends AbstractC10615d3 implements InterfaceC10443n {

    /* renamed from: c */
    final double[] f21133c = new double[128];

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10615d3
    /* renamed from: a */
    public final void mo697a(Object obj, long j) {
        InterfaceC10443n interfaceC10443n = (InterfaceC10443n) obj;
        for (int i = 0; i < j; i++) {
            interfaceC10443n.accept(this.f21133c[i]);
        }
    }

    @Override // p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        int i = this.f21155b;
        this.f21155b = i + 1;
        this.f21133c[i] = d;
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }
}
