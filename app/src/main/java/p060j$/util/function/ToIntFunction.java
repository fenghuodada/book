package p060j$.util.function;

/* renamed from: j$.util.function.ToIntFunction */
/* loaded from: classes2.dex */
public interface ToIntFunction<T> {

    /* renamed from: j$.util.function.ToIntFunction$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements ToIntFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToIntFunction f20890a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToIntFunction toIntFunction) {
            this.f20890a = toIntFunction;
        }

        public static /* synthetic */ ToIntFunction convert(java.util.function.ToIntFunction toIntFunction) {
            if (toIntFunction == null) {
                return null;
            }
            return toIntFunction instanceof C10404Q0 ? ((C10404Q0) toIntFunction).f20883a : new VivifiedWrapper(toIntFunction);
        }

        @Override // p060j$.util.function.ToIntFunction
        public final /* synthetic */ int applyAsInt(Object obj) {
            return this.f20890a.applyAsInt(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20890a;
            }
            return this.f20890a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20890a.hashCode();
        }
    }

    int applyAsInt(Object obj);
}
