package p060j$.util.function;

import java.util.function.UnaryOperator;
import p060j$.util.function.Function;

/* renamed from: j$.util.function.S0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10407S0 implements InterfaceC10411U0 {

    /* renamed from: a */
    public final /* synthetic */ UnaryOperator f20886a;

    private /* synthetic */ C10407S0(UnaryOperator unaryOperator) {
        this.f20886a = unaryOperator;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC10411U0 m902c(UnaryOperator unaryOperator) {
        if (unaryOperator == null) {
            return null;
        }
        return unaryOperator instanceof C10409T0 ? ((C10409T0) unaryOperator).f20888a : new C10407S0(unaryOperator);
    }

    @Override // p060j$.util.function.Function
    /* renamed from: a */
    public final /* synthetic */ Function mo904a(Function function) {
        return Function.VivifiedWrapper.convert(this.f20886a.andThen(C10377D.m928a(function)));
    }

    @Override // p060j$.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.f20886a.apply(obj);
    }

    @Override // p060j$.util.function.Function
    /* renamed from: b */
    public final /* synthetic */ Function mo903b(Function function) {
        return Function.VivifiedWrapper.convert(this.f20886a.compose(C10377D.m928a(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10407S0) {
            obj = ((C10407S0) obj).f20886a;
        }
        return this.f20886a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20886a.hashCode();
    }
}
