package p060j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.u */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10457u implements InterfaceC10461w {

    /* renamed from: a */
    public final /* synthetic */ DoubleToIntFunction f20927a;

    private /* synthetic */ C10457u(DoubleToIntFunction doubleToIntFunction) {
        this.f20927a = doubleToIntFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10461w m856b(DoubleToIntFunction doubleToIntFunction) {
        if (doubleToIntFunction == null) {
            return null;
        }
        return doubleToIntFunction instanceof C10459v ? ((C10459v) doubleToIntFunction).f20931a : new C10457u(doubleToIntFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ int m857a(double d) {
        return this.f20927a.applyAsInt(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10457u) {
            obj = ((C10457u) obj).f20927a;
        }
        return this.f20927a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20927a.hashCode();
    }
}
