package p060j$.util.function;

/* renamed from: j$.util.function.e0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10426e0 implements InterfaceC10432h0 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10432h0 f20904a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10432h0 f20905b;

    public /* synthetic */ C10426e0(InterfaceC10432h0 interfaceC10432h0, InterfaceC10432h0 interfaceC10432h02) {
        this.f20904a = interfaceC10432h0;
        this.f20905b = interfaceC10432h02;
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    public final void accept(long j) {
        this.f20904a.accept(j);
        this.f20905b.accept(j);
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }
}
