package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10309D;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.e1 */
/* loaded from: classes2.dex */
final class C10618e1 extends AbstractC10633h1 implements InterfaceC10309D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10618e1(InterfaceC10489B0 interfaceC10489B0) {
        super(interfaceC10489B0);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1009n(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1016e(this, consumer);
    }
}
