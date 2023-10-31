package p060j$.util.function;

/* renamed from: j$.util.function.Consumer */
/* loaded from: classes2.dex */
public interface Consumer<T> {

    /* renamed from: j$.util.function.Consumer$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Consumer f20859a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f20859a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof C10429g ? ((C10429g) consumer).f20907a : new VivifiedWrapper(consumer);
        }

        @Override // p060j$.util.function.Consumer
        public final /* synthetic */ void accept(Object obj) {
            this.f20859a.accept(obj);
        }

        @Override // p060j$.util.function.Consumer
        /* renamed from: e */
        public final /* synthetic */ Consumer mo532e(Consumer consumer) {
            return convert(this.f20859a.andThen(C10429g.m885a(consumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20859a;
            }
            return this.f20859a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20859a.hashCode();
        }
    }

    void accept(Object obj);

    /* renamed from: e */
    Consumer mo532e(Consumer consumer);
}
