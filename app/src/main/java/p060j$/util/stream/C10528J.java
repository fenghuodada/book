package p060j$.util.stream;

import p060j$.util.C10475l;
import p060j$.util.function.C10385H;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.stream.J */
/* loaded from: classes2.dex */
final class C10528J extends AbstractC10541M implements InterfaceC10624f2 {
    @Override // p060j$.util.stream.AbstractC10541M, p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        m795q(Integer.valueOf(i));
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        if (this.f21037a) {
            return C10475l.m829d(((Integer) this.f21038b).intValue());
        }
        return null;
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }
}
