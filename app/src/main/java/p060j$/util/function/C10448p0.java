package p060j$.util.function;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.util.function.p0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10448p0 implements LongToDoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10450q0 f20922a;

    private /* synthetic */ C10448p0(InterfaceC10450q0 interfaceC10450q0) {
        this.f20922a = interfaceC10450q0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongToDoubleFunction m867a(InterfaceC10450q0 interfaceC10450q0) {
        if (interfaceC10450q0 == null) {
            return null;
        }
        return interfaceC10450q0 instanceof C10446o0 ? ((C10446o0) interfaceC10450q0).f20920a : new C10448p0(interfaceC10450q0);
    }

    @Override // java.util.function.LongToDoubleFunction
    public final /* synthetic */ double applyAsDouble(long j) {
        return ((C10446o0) this.f20922a).m870a(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10450q0 interfaceC10450q0 = this.f20922a;
        if (obj instanceof C10448p0) {
            obj = ((C10448p0) obj).f20922a;
        }
        return interfaceC10450q0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20922a.hashCode();
    }
}
