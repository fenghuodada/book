package p060j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.p */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10447p implements DoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10449q f20921a;

    private /* synthetic */ C10447p(InterfaceC10449q interfaceC10449q) {
        this.f20921a = interfaceC10449q;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleFunction m868a(InterfaceC10449q interfaceC10449q) {
        if (interfaceC10449q == null) {
            return null;
        }
        return interfaceC10449q instanceof C10445o ? ((C10445o) interfaceC10449q).f20919a : new C10447p(interfaceC10449q);
    }

    @Override // java.util.function.DoubleFunction
    public final /* synthetic */ Object apply(double d) {
        return this.f20921a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10449q interfaceC10449q = this.f20921a;
        if (obj instanceof C10447p) {
            obj = ((C10447p) obj).f20921a;
        }
        return interfaceC10449q.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20921a.hashCode();
    }
}
