package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10318M;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.stream.J2 */
/* loaded from: classes2.dex */
final class C10531J2 extends AbstractC10556P2 implements InterfaceC10309D {

    /* renamed from: g */
    final /* synthetic */ C10536K2 f21026g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10531J2(C10536K2 c10536k2, int i, int i2, int i3, int i4) {
        super(c10536k2, i, i2, i3, i4);
        this.f21026g = c10536k2;
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1009n(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10556P2
    /* renamed from: e */
    final void mo786e(int i, Object obj, Object obj2) {
        ((InterfaceC10443n) obj2).accept(((double[]) obj)[i]);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1016e(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10556P2
    /* renamed from: g */
    final InterfaceC10318M mo784g(Object obj, int i, int i2) {
        return AbstractC10368e0.m940j((double[]) obj, i, i2 + i);
    }

    @Override // p060j$.util.stream.AbstractC10556P2
    /* renamed from: h */
    final InterfaceC10318M mo783h(int i, int i2, int i3, int i4) {
        return new C10531J2(this.f21026g, i, i2, i3, i4);
    }
}
