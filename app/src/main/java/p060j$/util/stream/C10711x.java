package p060j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x */
/* loaded from: classes2.dex */
public final class C10711x extends AbstractC10607c0 {

    /* renamed from: s */
    public final /* synthetic */ int f21301s;

    /* renamed from: t */
    final /* synthetic */ Object f21302t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10711x(AbstractC10606c abstractC10606c, int i, Object obj, int i2) {
        super(abstractC10606c, i);
        this.f21301s = i2;
        this.f21302t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: M1 */
    public final InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2) {
        switch (this.f21301s) {
            case 0:
                return new C10696u(this, interfaceC10634h2, 2);
            case 1:
                return new C10584X(this, interfaceC10634h2, 1);
            case 2:
                return new C10584X(this, interfaceC10634h2, 3);
            case 3:
                return new C10584X(this, interfaceC10634h2, 7);
            case 4:
                return new C10584X(this, interfaceC10634h2, 8);
            case 5:
                return new C10627g0(this, interfaceC10634h2, 3);
            case 6:
                return new C10570T1(this, interfaceC10634h2, 3);
            default:
                return new C10676q(this, interfaceC10634h2);
        }
    }
}
