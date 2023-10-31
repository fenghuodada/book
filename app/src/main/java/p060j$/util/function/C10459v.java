package p060j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.v */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10459v implements DoubleToIntFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10461w f20931a;

    private /* synthetic */ C10459v(InterfaceC10461w interfaceC10461w) {
        this.f20931a = interfaceC10461w;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleToIntFunction m855a(InterfaceC10461w interfaceC10461w) {
        if (interfaceC10461w == null) {
            return null;
        }
        return interfaceC10461w instanceof C10457u ? ((C10457u) interfaceC10461w).f20927a : new C10459v(interfaceC10461w);
    }

    @Override // java.util.function.DoubleToIntFunction
    public final /* synthetic */ int applyAsInt(double d) {
        return ((C10457u) this.f20931a).m857a(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10461w interfaceC10461w = this.f20931a;
        if (obj instanceof C10459v) {
            obj = ((C10459v) obj).f20931a;
        }
        return interfaceC10461w.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20931a.hashCode();
    }
}
