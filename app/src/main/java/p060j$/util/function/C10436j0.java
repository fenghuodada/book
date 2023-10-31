package p060j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.j0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10436j0 implements LongFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10438k0 f20912a;

    private /* synthetic */ C10436j0(InterfaceC10438k0 interfaceC10438k0) {
        this.f20912a = interfaceC10438k0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongFunction m880a(InterfaceC10438k0 interfaceC10438k0) {
        if (interfaceC10438k0 == null) {
            return null;
        }
        return interfaceC10438k0 instanceof C10434i0 ? ((C10434i0) interfaceC10438k0).f20911a : new C10436j0(interfaceC10438k0);
    }

    @Override // java.util.function.LongFunction
    public final /* synthetic */ Object apply(long j) {
        return this.f20912a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10438k0 interfaceC10438k0 = this.f20912a;
        if (obj instanceof C10436j0) {
            obj = ((C10436j0) obj).f20912a;
        }
        return interfaceC10438k0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20912a.hashCode();
    }
}
