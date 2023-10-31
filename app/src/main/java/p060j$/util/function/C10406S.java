package p060j$.util.function;

import java.util.function.IntToDoubleFunction;

/* renamed from: j$.util.function.S */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10406S implements InterfaceC10410U {

    /* renamed from: a */
    public final /* synthetic */ IntToDoubleFunction f20885a;

    private /* synthetic */ C10406S(IntToDoubleFunction intToDoubleFunction) {
        this.f20885a = intToDoubleFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10410U m905b(IntToDoubleFunction intToDoubleFunction) {
        if (intToDoubleFunction == null) {
            return null;
        }
        return intToDoubleFunction instanceof C10408T ? ((C10408T) intToDoubleFunction).f20887a : new C10406S(intToDoubleFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ double m906a(int i) {
        return this.f20885a.applyAsDouble(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10406S) {
            obj = ((C10406S) obj).f20885a;
        }
        return this.f20885a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20885a.hashCode();
    }
}
