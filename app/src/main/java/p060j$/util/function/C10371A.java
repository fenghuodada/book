package p060j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.A */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10371A implements InterfaceC10375C {

    /* renamed from: a */
    public final /* synthetic */ DoubleUnaryOperator f20853a;

    private /* synthetic */ C10371A(DoubleUnaryOperator doubleUnaryOperator) {
        this.f20853a = doubleUnaryOperator;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC10375C m932d(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return doubleUnaryOperator instanceof C10373B ? ((C10373B) doubleUnaryOperator).f20854a : new C10371A(doubleUnaryOperator);
    }

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10375C m935a(InterfaceC10375C interfaceC10375C) {
        return m932d(this.f20853a.andThen(C10373B.m931a(interfaceC10375C)));
    }

    /* renamed from: b */
    public final /* synthetic */ double m934b(double d) {
        return this.f20853a.applyAsDouble(d);
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10375C m933c(InterfaceC10375C interfaceC10375C) {
        return m932d(this.f20853a.compose(C10373B.m931a(interfaceC10375C)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10371A) {
            obj = ((C10371A) obj).f20853a;
        }
        return this.f20853a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20853a.hashCode();
    }
}
