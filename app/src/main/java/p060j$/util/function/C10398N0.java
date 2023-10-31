package p060j$.util.function;

import java.util.function.Supplier;

/* renamed from: j$.util.function.N0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10398N0 implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10400O0 f20879a;

    private /* synthetic */ C10398N0(InterfaceC10400O0 interfaceC10400O0) {
        this.f20879a = interfaceC10400O0;
    }

    /* renamed from: a */
    public static /* synthetic */ Supplier m916a(InterfaceC10400O0 interfaceC10400O0) {
        if (interfaceC10400O0 == null) {
            return null;
        }
        return interfaceC10400O0 instanceof C10396M0 ? ((C10396M0) interfaceC10400O0).f20878a : new C10398N0(interfaceC10400O0);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10400O0 interfaceC10400O0 = this.f20879a;
        if (obj instanceof C10398N0) {
            obj = ((C10398N0) obj).f20879a;
        }
        return interfaceC10400O0.equals(obj);
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.f20879a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.f20879a.hashCode();
    }
}
