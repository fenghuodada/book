package p060j$.util.function;

/* renamed from: j$.util.function.H */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10385H implements InterfaceC10391K {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10391K f20866a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10391K f20867b;

    public /* synthetic */ C10385H(InterfaceC10391K interfaceC10391K, InterfaceC10391K interfaceC10391K2) {
        this.f20866a = interfaceC10391K;
        this.f20867b = interfaceC10391K2;
    }

    @Override // p060j$.util.function.InterfaceC10391K
    public final void accept(int i) {
        this.f20866a.accept(i);
        this.f20867b.accept(i);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }
}
