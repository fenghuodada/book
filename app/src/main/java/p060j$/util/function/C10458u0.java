package p060j$.util.function;

/* renamed from: j$.util.function.u0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10458u0 implements InterfaceC10464x0 {

    /* renamed from: a */
    public final /* synthetic */ int f20928a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10464x0 f20929b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10464x0 f20930c;

    public /* synthetic */ C10458u0(InterfaceC10464x0 interfaceC10464x0, InterfaceC10464x0 interfaceC10464x02, int i) {
        this.f20928a = i;
        this.f20929b = interfaceC10464x0;
        this.f20930c = interfaceC10464x02;
    }

    @Override // p060j$.util.function.InterfaceC10464x0
    /* renamed from: a */
    public final InterfaceC10464x0 mo729a(InterfaceC10464x0 interfaceC10464x0) {
        switch (this.f20928a) {
            case 0:
                interfaceC10464x0.getClass();
                return new C10458u0(this, interfaceC10464x0, 1);
            default:
                interfaceC10464x0.getClass();
                return new C10458u0(this, interfaceC10464x0, 1);
        }
    }

    @Override // p060j$.util.function.InterfaceC10464x0
    public final long applyAsLong(long j) {
        int i = this.f20928a;
        InterfaceC10464x0 interfaceC10464x0 = this.f20930c;
        InterfaceC10464x0 interfaceC10464x02 = this.f20929b;
        switch (i) {
            case 0:
                return interfaceC10464x0.applyAsLong(interfaceC10464x02.applyAsLong(j));
            default:
                return interfaceC10464x02.applyAsLong(interfaceC10464x0.applyAsLong(j));
        }
    }

    @Override // p060j$.util.function.InterfaceC10464x0
    /* renamed from: b */
    public final InterfaceC10464x0 mo728b(InterfaceC10464x0 interfaceC10464x0) {
        switch (this.f20928a) {
            case 0:
                interfaceC10464x0.getClass();
                return new C10458u0(this, interfaceC10464x0, 0);
            default:
                interfaceC10464x0.getClass();
                return new C10458u0(this, interfaceC10464x0, 0);
        }
    }
}
