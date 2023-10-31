package p060j$.util.function;

/* renamed from: j$.util.function.ToLongFunction */
/* loaded from: classes2.dex */
public interface ToLongFunction<T> {

    /* renamed from: j$.util.function.ToLongFunction$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements ToLongFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToLongFunction f20891a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToLongFunction toLongFunction) {
            this.f20891a = toLongFunction;
        }

        public static /* synthetic */ ToLongFunction convert(java.util.function.ToLongFunction toLongFunction) {
            if (toLongFunction == null) {
                return null;
            }
            return toLongFunction instanceof C10405R0 ? ((C10405R0) toLongFunction).f20884a : new VivifiedWrapper(toLongFunction);
        }

        @Override // p060j$.util.function.ToLongFunction
        public final /* synthetic */ long applyAsLong(Object obj) {
            return this.f20891a.applyAsLong(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20891a;
            }
            return this.f20891a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20891a.hashCode();
        }
    }

    long applyAsLong(Object obj);
}
