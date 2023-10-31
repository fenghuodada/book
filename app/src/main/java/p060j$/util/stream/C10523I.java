package p060j$.util.stream;

import p060j$.util.C10474k;
import p060j$.util.function.C10437k;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.stream.I */
/* loaded from: classes2.dex */
final class C10523I extends AbstractC10541M implements InterfaceC10619e2 {
    @Override // p060j$.util.stream.AbstractC10541M, p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        m795q(Double.valueOf(d));
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        if (this.f21037a) {
            return C10474k.m833d(((Double) this.f21038b).doubleValue());
        }
        return null;
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }
}
