package p060j$.util.function;

import java.util.function.IntToDoubleFunction;

/* renamed from: j$.util.function.T */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10408T implements IntToDoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10410U f20887a;

    private /* synthetic */ C10408T(InterfaceC10410U interfaceC10410U) {
        this.f20887a = interfaceC10410U;
    }

    /* renamed from: a */
    public static /* synthetic */ IntToDoubleFunction m901a(InterfaceC10410U interfaceC10410U) {
        if (interfaceC10410U == null) {
            return null;
        }
        return interfaceC10410U instanceof C10406S ? ((C10406S) interfaceC10410U).f20885a : new C10408T(interfaceC10410U);
    }

    @Override // java.util.function.IntToDoubleFunction
    public final /* synthetic */ double applyAsDouble(int i) {
        return ((C10406S) this.f20887a).m906a(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10410U interfaceC10410U = this.f20887a;
        if (obj instanceof C10408T) {
            obj = ((C10408T) obj).f20887a;
        }
        return interfaceC10410U.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20887a.hashCode();
    }
}
