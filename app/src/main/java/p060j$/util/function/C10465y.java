package p060j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.y */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10465y implements DoubleToLongFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10467z f20935a;

    private /* synthetic */ C10465y(InterfaceC10467z interfaceC10467z) {
        this.f20935a = interfaceC10467z;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleToLongFunction m851a(InterfaceC10467z interfaceC10467z) {
        if (interfaceC10467z == null) {
            return null;
        }
        return interfaceC10467z instanceof C10463x ? ((C10463x) interfaceC10467z).f20934a : new C10465y(interfaceC10467z);
    }

    @Override // java.util.function.DoubleToLongFunction
    public final /* synthetic */ long applyAsLong(double d) {
        return this.f20935a.applyAsLong(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10467z interfaceC10467z = this.f20935a;
        if (obj instanceof C10465y) {
            obj = ((C10465y) obj).f20935a;
        }
        return interfaceC10467z.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20935a.hashCode();
    }
}
