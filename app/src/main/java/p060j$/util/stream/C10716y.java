package p060j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y */
/* loaded from: classes2.dex */
public final class C10716y extends AbstractC10642j0 {

    /* renamed from: s */
    public final /* synthetic */ int f21308s;

    /* renamed from: t */
    final /* synthetic */ Object f21309t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10716y(AbstractC10606c abstractC10606c, int i, Object obj, int i2) {
        super(abstractC10606c, i);
        this.f21308s = i2;
        this.f21309t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: M1 */
    public final InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2) {
        switch (this.f21308s) {
            case 0:
                return new C10696u(this, interfaceC10634h2, 3);
            case 1:
                return new C10584X(this, interfaceC10634h2, 5);
            case 2:
                return new C10627g0(this, interfaceC10634h2, 1);
            case 3:
                return new C10627g0(this, interfaceC10634h2, 5);
            case 4:
                return new C10627g0(this, interfaceC10634h2, 6);
            case 5:
                return new C10627g0(this, interfaceC10634h2, 7);
            case 6:
                return new C10676q(this, interfaceC10634h2);
            default:
                return new C10570T1(this, interfaceC10634h2, 4);
        }
    }
}
