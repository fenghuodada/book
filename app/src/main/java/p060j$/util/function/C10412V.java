package p060j$.util.function;

import java.util.function.IntToLongFunction;

/* renamed from: j$.util.function.V */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10412V implements InterfaceC10414X {

    /* renamed from: a */
    public final /* synthetic */ IntToLongFunction f20892a;

    private /* synthetic */ C10412V(IntToLongFunction intToLongFunction) {
        this.f20892a = intToLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10414X m899a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return intToLongFunction instanceof C10413W ? ((C10413W) intToLongFunction).f20893a : new C10412V(intToLongFunction);
    }

    @Override // p060j$.util.function.InterfaceC10414X
    public final /* synthetic */ long applyAsLong(int i) {
        return this.f20892a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10412V) {
            obj = ((C10412V) obj).f20892a;
        }
        return this.f20892a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20892a.hashCode();
    }
}
