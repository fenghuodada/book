package p060j$.util.function;

/* renamed from: j$.util.function.I0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10388I0 implements InterfaceC10394L0 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10394L0 f20872a;

    public /* synthetic */ C10388I0(InterfaceC10394L0 interfaceC10394L0) {
        this.f20872a = interfaceC10394L0;
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    /* renamed from: a */
    public final InterfaceC10394L0 mo772a(InterfaceC10394L0 interfaceC10394L0) {
        interfaceC10394L0.getClass();
        return new C10386H0(this, interfaceC10394L0, 0);
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    /* renamed from: b */
    public final InterfaceC10394L0 mo771b(InterfaceC10394L0 interfaceC10394L0) {
        interfaceC10394L0.getClass();
        return new C10386H0(this, interfaceC10394L0, 1);
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    public final InterfaceC10394L0 negate() {
        return new C10388I0(this);
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    public final boolean test(Object obj) {
        return !this.f20872a.test(obj);
    }
}
