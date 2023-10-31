package p060j$.util.stream;

/* renamed from: j$.util.stream.z */
/* loaded from: classes2.dex */
final class C10721z extends AbstractC10493C {

    /* renamed from: s */
    public final /* synthetic */ int f21314s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10721z(AbstractC10606c abstractC10606c, int i, int i2) {
        super(abstractC10606c, i);
        this.f21314s = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: M1 */
    public final InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2) {
        switch (this.f21314s) {
            case 0:
                return interfaceC10634h2;
            case 1:
                return new C10584X(this, interfaceC10634h2, 2);
            default:
                return new C10627g0(this, interfaceC10634h2, 0);
        }
    }
}
