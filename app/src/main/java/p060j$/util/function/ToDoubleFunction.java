package p060j$.util.function;

/* renamed from: j$.util.function.ToDoubleFunction */
/* loaded from: classes2.dex */
public interface ToDoubleFunction<T> {

    /* renamed from: j$.util.function.ToDoubleFunction$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements ToDoubleFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToDoubleFunction f20889a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToDoubleFunction toDoubleFunction) {
            this.f20889a = toDoubleFunction;
        }

        public static /* synthetic */ ToDoubleFunction convert(java.util.function.ToDoubleFunction toDoubleFunction) {
            if (toDoubleFunction == null) {
                return null;
            }
            return toDoubleFunction instanceof C10402P0 ? ((C10402P0) toDoubleFunction).f20882a : new VivifiedWrapper(toDoubleFunction);
        }

        @Override // p060j$.util.function.ToDoubleFunction
        public final /* synthetic */ double applyAsDouble(Object obj) {
            return this.f20889a.applyAsDouble(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20889a;
            }
            return this.f20889a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20889a.hashCode();
        }
    }

    double applyAsDouble(Object obj);
}
