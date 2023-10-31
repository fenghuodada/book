package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10312G;
import p060j$.util.InterfaceC10318M;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.stream.L2 */
/* loaded from: classes2.dex */
final class C10540L2 extends AbstractC10556P2 implements InterfaceC10312G {

    /* renamed from: g */
    final /* synthetic */ C10544M2 f21036g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10540L2(C10544M2 c10544m2, int i, int i2, int i3, int i4) {
        super(c10544m2, i, i2, i3, i4);
        this.f21036g = c10544m2;
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1008o(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10556P2
    /* renamed from: e */
    final void mo786e(int i, Object obj, Object obj2) {
        ((InterfaceC10391K) obj2).accept(((int[]) obj)[i]);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1015g(this, consumer);
    }

    @Override // p060j$.util.stream.AbstractC10556P2
    /* renamed from: g */
    final InterfaceC10318M mo784g(Object obj, int i, int i2) {
        return AbstractC10368e0.m939k((int[]) obj, i, i2 + i);
    }

    @Override // p060j$.util.stream.AbstractC10556P2
    /* renamed from: h */
    final InterfaceC10318M mo783h(int i, int i2, int i3, int i4) {
        return new C10540L2(this.f21036g, i, i2, i3, i4);
    }
}
