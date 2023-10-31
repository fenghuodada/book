package p060j$.util.function;

import java.util.function.Function;
import p060j$.util.function.Function;

/* renamed from: j$.util.function.D */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10377D implements Function {

    /* renamed from: a */
    public final /* synthetic */ Function f20860a;

    private /* synthetic */ C10377D(Function function) {
        this.f20860a = function;
    }

    /* renamed from: a */
    public static /* synthetic */ Function m928a(Function function) {
        if (function == null) {
            return null;
        }
        return function instanceof Function.VivifiedWrapper ? ((Function.VivifiedWrapper) function).f20865a : function instanceof InterfaceC10411U0 ? C10409T0.m900a((InterfaceC10411U0) function) : new C10377D(function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return m928a(this.f20860a.mo904a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.f20860a.apply(obj);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return m928a(this.f20860a.mo903b(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Function function = this.f20860a;
        if (obj instanceof C10377D) {
            obj = ((C10377D) obj).f20860a;
        }
        return function.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20860a.hashCode();
    }
}
