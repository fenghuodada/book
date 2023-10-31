package p060j$.util.stream;

import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10315J;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.g1 */
/* loaded from: classes2.dex */
final class C10628g1 extends AbstractC10633h1 implements InterfaceC10315J {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10628g1(InterfaceC10499D0 interfaceC10499D0) {
        super(interfaceC10499D0);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final /* synthetic */ boolean mo534a(Consumer consumer) {
        return AbstractC10331a.m1007q(this, consumer);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC10331a.m1014h(this, consumer);
    }
}
