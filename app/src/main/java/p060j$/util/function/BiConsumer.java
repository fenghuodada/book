package p060j$.util.function;

/* renamed from: j$.util.function.BiConsumer */
/* loaded from: classes2.dex */
public interface BiConsumer<T, U> {

    /* renamed from: j$.util.function.BiConsumer$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.BiConsumer f20856a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f20856a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return biConsumer instanceof C10417a ? ((C10417a) biConsumer).f20896a : new VivifiedWrapper(biConsumer);
        }

        @Override // p060j$.util.function.BiConsumer
        public final /* synthetic */ void accept(Object obj, Object obj2) {
            this.f20856a.accept(obj, obj2);
        }

        @Override // p060j$.util.function.BiConsumer
        /* renamed from: c */
        public final /* synthetic */ BiConsumer mo692c(BiConsumer biConsumer) {
            return convert(this.f20856a.andThen(C10417a.m892a(biConsumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20856a;
            }
            return this.f20856a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20856a.hashCode();
        }
    }

    void accept(Object obj, Object obj2);

    /* renamed from: c */
    BiConsumer mo692c(BiConsumer biConsumer);
}
