package p060j$.util.function;

import java.util.function.UnaryOperator;

/* renamed from: j$.util.function.Function */
/* loaded from: classes2.dex */
public interface Function<T, R> {

    /* renamed from: j$.util.function.Function$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Function {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Function f20865a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.f20865a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return function instanceof C10377D ? ((C10377D) function).f20860a : function instanceof UnaryOperator ? C10407S0.m902c((UnaryOperator) function) : new VivifiedWrapper(function);
        }

        @Override // p060j$.util.function.Function
        /* renamed from: a */
        public final /* synthetic */ Function mo904a(Function function) {
            return convert(this.f20865a.andThen(C10377D.m928a(function)));
        }

        @Override // p060j$.util.function.Function
        public final /* synthetic */ Object apply(Object obj) {
            return this.f20865a.apply(obj);
        }

        @Override // p060j$.util.function.Function
        /* renamed from: b */
        public final /* synthetic */ Function mo903b(Function function) {
            return convert(this.f20865a.compose(C10377D.m928a(function)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f20865a;
            }
            return this.f20865a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f20865a.hashCode();
        }
    }

    /* renamed from: a */
    Function mo904a(Function function);

    Object apply(Object obj);

    /* renamed from: b */
    Function mo903b(Function function);
}
