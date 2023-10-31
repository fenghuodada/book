package p060j$.util.function;

import java.util.function.IntBinaryOperator;

/* renamed from: j$.util.function.E */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10379E implements InterfaceC10383G {

    /* renamed from: a */
    public final /* synthetic */ IntBinaryOperator f20861a;

    private /* synthetic */ C10379E(IntBinaryOperator intBinaryOperator) {
        this.f20861a = intBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10383G m927a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return intBinaryOperator instanceof C10381F ? ((C10381F) intBinaryOperator).f20863a : new C10379E(intBinaryOperator);
    }

    @Override // p060j$.util.function.InterfaceC10383G
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.f20861a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10379E) {
            obj = ((C10379E) obj).f20861a;
        }
        return this.f20861a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20861a.hashCode();
    }
}
