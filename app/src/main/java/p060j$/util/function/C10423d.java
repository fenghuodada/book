package p060j$.util.function;

import java.util.function.BinaryOperator;
import p060j$.util.function.BiFunction;

/* renamed from: j$.util.function.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10423d implements InterfaceC10427f {

    /* renamed from: a */
    public final /* synthetic */ BinaryOperator f20902a;

    private /* synthetic */ C10423d(BinaryOperator binaryOperator) {
        this.f20902a = binaryOperator;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10427f m888b(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof C10425e ? ((C10425e) binaryOperator).f20903a : new C10423d(binaryOperator);
    }

    @Override // p060j$.util.function.BiFunction
    /* renamed from: a */
    public final /* synthetic */ BiFunction mo622a(Function function) {
        return BiFunction.VivifiedWrapper.convert(this.f20902a.andThen(C10377D.m928a(function)));
    }

    @Override // p060j$.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f20902a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10423d) {
            obj = ((C10423d) obj).f20902a;
        }
        return this.f20902a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20902a.hashCode();
    }
}
