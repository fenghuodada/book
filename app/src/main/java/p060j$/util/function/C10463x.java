package p060j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.x */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10463x implements InterfaceC10467z {

    /* renamed from: a */
    public final /* synthetic */ DoubleToLongFunction f20934a;

    private /* synthetic */ C10463x(DoubleToLongFunction doubleToLongFunction) {
        this.f20934a = doubleToLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10467z m852a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return doubleToLongFunction instanceof C10465y ? ((C10465y) doubleToLongFunction).f20935a : new C10463x(doubleToLongFunction);
    }

    @Override // p060j$.util.function.InterfaceC10467z
    public final /* synthetic */ long applyAsLong(double d) {
        return this.f20934a.applyAsLong(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10463x) {
            obj = ((C10463x) obj).f20934a;
        }
        return this.f20934a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20934a.hashCode();
    }
}
