package p060j$.util.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import p060j$.util.function.Function;

/* renamed from: j$.util.function.T0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10409T0 implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10411U0 f20888a;

    private /* synthetic */ C10409T0(InterfaceC10411U0 interfaceC10411U0) {
        this.f20888a = interfaceC10411U0;
    }

    /* renamed from: a */
    public static /* synthetic */ UnaryOperator m900a(InterfaceC10411U0 interfaceC10411U0) {
        if (interfaceC10411U0 == null) {
            return null;
        }
        return interfaceC10411U0 instanceof C10407S0 ? ((C10407S0) interfaceC10411U0).f20886a : new C10409T0(interfaceC10411U0);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return C10377D.m928a(((C10407S0) this.f20888a).mo904a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return ((C10407S0) this.f20888a).apply(obj);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return C10377D.m928a(((C10407S0) this.f20888a).mo903b(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10411U0 interfaceC10411U0 = this.f20888a;
        if (obj instanceof C10409T0) {
            obj = ((C10409T0) obj).f20888a;
        }
        return interfaceC10411U0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20888a.hashCode();
    }
}
