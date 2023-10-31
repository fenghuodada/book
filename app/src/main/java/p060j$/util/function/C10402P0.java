package p060j$.util.function;

import java.util.function.ToDoubleFunction;
import p060j$.util.function.ToDoubleFunction;

/* renamed from: j$.util.function.P0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10402P0 implements ToDoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ ToDoubleFunction f20882a;

    private /* synthetic */ C10402P0(ToDoubleFunction toDoubleFunction) {
        this.f20882a = toDoubleFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ ToDoubleFunction m909a(ToDoubleFunction toDoubleFunction) {
        if (toDoubleFunction == null) {
            return null;
        }
        return toDoubleFunction instanceof ToDoubleFunction.VivifiedWrapper ? ((ToDoubleFunction.VivifiedWrapper) toDoubleFunction).f20889a : new C10402P0(toDoubleFunction);
    }

    @Override // java.util.function.ToDoubleFunction
    public final /* synthetic */ double applyAsDouble(Object obj) {
        return this.f20882a.applyAsDouble(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToDoubleFunction toDoubleFunction = this.f20882a;
        if (obj instanceof C10402P0) {
            obj = ((C10402P0) obj).f20882a;
        }
        return toDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20882a.hashCode();
    }
}
