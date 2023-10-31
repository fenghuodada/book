package p060j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.o */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10445o implements InterfaceC10449q {

    /* renamed from: a */
    public final /* synthetic */ DoubleFunction f20919a;

    private /* synthetic */ C10445o(DoubleFunction doubleFunction) {
        this.f20919a = doubleFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10449q m871a(DoubleFunction doubleFunction) {
        if (doubleFunction == null) {
            return null;
        }
        return doubleFunction instanceof C10447p ? ((C10447p) doubleFunction).f20921a : new C10445o(doubleFunction);
    }

    @Override // p060j$.util.function.InterfaceC10449q
    public final /* synthetic */ Object apply(double d) {
        return this.f20919a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10445o) {
            obj = ((C10445o) obj).f20919a;
        }
        return this.f20919a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20919a.hashCode();
    }
}
