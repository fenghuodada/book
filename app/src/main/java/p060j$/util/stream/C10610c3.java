package p060j$.util.stream;

import p060j$.util.function.C10426e0;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.stream.c3 */
/* loaded from: classes2.dex */
final class C10610c3 extends AbstractC10615d3 implements InterfaceC10432h0 {

    /* renamed from: c */
    final long[] f21151c = new long[128];

    @Override // p060j$.util.stream.AbstractC10615d3
    /* renamed from: a */
    public final void mo697a(Object obj, long j) {
        InterfaceC10432h0 interfaceC10432h0 = (InterfaceC10432h0) obj;
        for (int i = 0; i < j; i++) {
            interfaceC10432h0.accept(this.f21151c[i]);
        }
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    public final void accept(long j) {
        int i = this.f21155b;
        this.f21155b = i + 1;
        this.f21151c[i] = j;
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }
}
