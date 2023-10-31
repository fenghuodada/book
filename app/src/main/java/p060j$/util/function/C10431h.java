package p060j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10431h implements InterfaceC10435j {

    /* renamed from: a */
    public final /* synthetic */ DoubleBinaryOperator f20909a;

    private /* synthetic */ C10431h(DoubleBinaryOperator doubleBinaryOperator) {
        this.f20909a = doubleBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10435j m883a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return doubleBinaryOperator instanceof C10433i ? ((C10433i) doubleBinaryOperator).f20910a : new C10431h(doubleBinaryOperator);
    }

    @Override // p060j$.util.function.InterfaceC10435j
    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.f20909a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10431h) {
            obj = ((C10431h) obj).f20909a;
        }
        return this.f20909a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20909a.hashCode();
    }
}
