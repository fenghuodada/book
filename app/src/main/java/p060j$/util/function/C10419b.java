package p060j$.util.function;

import java.util.function.BiFunction;
import java.util.function.Function;
import p060j$.util.function.BiFunction;
import p060j$.util.function.Function;

/* renamed from: j$.util.function.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10419b implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ BiFunction f20897a;

    private /* synthetic */ C10419b(BiFunction biFunction) {
        this.f20897a = biFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ BiFunction m891a(BiFunction biFunction) {
        if (biFunction == null) {
            return null;
        }
        return biFunction instanceof BiFunction.VivifiedWrapper ? ((BiFunction.VivifiedWrapper) biFunction).f20857a : biFunction instanceof InterfaceC10427f ? C10425e.m887a((InterfaceC10427f) biFunction) : new C10419b(biFunction);
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(Function function) {
        return m891a(this.f20897a.mo622a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f20897a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiFunction biFunction = this.f20897a;
        if (obj instanceof C10419b) {
            obj = ((C10419b) obj).f20897a;
        }
        return biFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20897a.hashCode();
    }
}
