package p060j$.util.function;

import java.util.function.Supplier;

/* renamed from: j$.util.function.M0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10396M0 implements InterfaceC10400O0 {

    /* renamed from: a */
    public final /* synthetic */ Supplier f20878a;

    private /* synthetic */ C10396M0(Supplier supplier) {
        this.f20878a = supplier;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10400O0 m917a(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier instanceof C10398N0 ? ((C10398N0) supplier).f20879a : new C10396M0(supplier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10396M0) {
            obj = ((C10396M0) obj).f20878a;
        }
        return this.f20878a.equals(obj);
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final /* synthetic */ Object get() {
        return this.f20878a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.f20878a.hashCode();
    }
}
