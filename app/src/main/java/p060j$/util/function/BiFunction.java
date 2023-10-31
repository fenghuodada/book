package p060j$.util.function;

import java.util.function.BinaryOperator;

/* renamed from: j$.util.function.BiFunction */
/* loaded from: classes2.dex */
public interface BiFunction<T, U, R> {

    /* renamed from: j$.util.function.BiFunction$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.BiFunction f20857a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f20857a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof C10419b ? ((C10419b) biFunction).f20897a : biFunction instanceof BinaryOperator ? C10423d.m888b((BinaryOperator) biFunction) : new VivifiedWrapper(biFunction);
        }

        @Override // p060j$.util.function.BiFunction
        /* renamed from: a */
        public final /* synthetic */ BiFunction mo622a(Function function) {
            return convert(this.f20857a.andThen(C10377D.m928a(function)));
        }

        @Override // p060j$.util.function.BiFunction
        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.f20857a.apply(obj, obj2);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20857a;
            }
            return this.f20857a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20857a.hashCode();
        }
    }

    /* renamed from: a */
    BiFunction mo622a(Function function);

    Object apply(Object obj, Object obj2);
}
