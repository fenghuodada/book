package p060j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.B */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10373B implements DoubleUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10375C f20854a;

    private /* synthetic */ C10373B(InterfaceC10375C interfaceC10375C) {
        this.f20854a = interfaceC10375C;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleUnaryOperator m931a(InterfaceC10375C interfaceC10375C) {
        if (interfaceC10375C == null) {
            return null;
        }
        return interfaceC10375C instanceof C10371A ? ((C10371A) interfaceC10375C).f20853a : new C10373B(interfaceC10375C);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        return m931a(((C10371A) this.f20854a).m935a(C10371A.m932d(doubleUnaryOperator)));
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ double applyAsDouble(double d) {
        return ((C10371A) this.f20854a).m934b(d);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        return m931a(((C10371A) this.f20854a).m933c(C10371A.m932d(doubleUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10375C interfaceC10375C = this.f20854a;
        if (obj instanceof C10373B) {
            obj = ((C10373B) obj).f20854a;
        }
        return interfaceC10375C.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20854a.hashCode();
    }
}
