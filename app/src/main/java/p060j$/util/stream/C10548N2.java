package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10318M;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.stream.N2 */
/* loaded from: classes2.dex */
final class C10548N2 extends AbstractC10556P2 implements InterfaceC10315J {

    /* renamed from: g */
    final /* synthetic */ C10552O2 f21048g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10548N2(C10552O2 c10552o2, int i, int i2, int i3, int i4) {
        super(c10552o2, i, i2, i3, i4);
        this.f21048g = c10552o2;
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1007q(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10556P2
    /* renamed from: e */
    final void mo786e(int i, Object obj, Object obj2) {
        ((InterfaceC10432h0) obj2).accept(((long[]) obj)[i]);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1014h(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10556P2
    /* renamed from: g */
    final InterfaceC10318M mo784g(Object obj, int i, int i2) {
        return AbstractC10368e0.m938l((long[]) obj, i, i2 + i);
    }

    @Override // p060j$.util.stream.AbstractC10556P2
    /* renamed from: h */
    final InterfaceC10318M mo783h(int i, int i2, int i3, int i4) {
        return new C10548N2(this.f21048g, i, i2, i3, i4);
    }
}
