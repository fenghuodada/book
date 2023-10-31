package p060j$.util.function;

import java.util.function.IntFunction;

/* renamed from: j$.util.function.L */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10393L implements InterfaceC10397N {

    /* renamed from: a */
    public final /* synthetic */ IntFunction f20876a;

    private /* synthetic */ C10393L(IntFunction intFunction) {
        this.f20876a = intFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10397N m919a(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return intFunction instanceof C10395M ? ((C10395M) intFunction).f20877a : new C10393L(intFunction);
    }

    @Override // p060j$.util.function.InterfaceC10397N
    public final /* synthetic */ Object apply(int i) {
        return this.f20876a.apply(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10393L) {
            obj = ((C10393L) obj).f20876a;
        }
        return this.f20876a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20876a.hashCode();
    }
}
