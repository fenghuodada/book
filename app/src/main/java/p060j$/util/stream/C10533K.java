package p060j$.util.stream;

import p060j$.util.C10476m;
import p060j$.util.function.C10426e0;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.stream.K */
/* loaded from: classes2.dex */
final class C10533K extends AbstractC10541M implements InterfaceC10629g2 {
    @Override // p060j$.util.stream.AbstractC10541M, p060j$.util.stream.InterfaceC10634h2
    public final void accept(long j) {
        m795q(Long.valueOf(j));
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        if (this.f21037a) {
            return C10476m.m825d(((Long) this.f21038b).longValue());
        }
        return null;
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }
}
