package p060j$.util.function;

import java.util.function.ToLongFunction;
import p060j$.util.function.ToLongFunction;

/* renamed from: j$.util.function.R0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10405R0 implements ToLongFunction {

    /* renamed from: a */
    public final /* synthetic */ ToLongFunction f20884a;

    private /* synthetic */ C10405R0(ToLongFunction toLongFunction) {
        this.f20884a = toLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ ToLongFunction m907a(ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return toLongFunction instanceof ToLongFunction.VivifiedWrapper ? ((ToLongFunction.VivifiedWrapper) toLongFunction).f20891a : new C10405R0(toLongFunction);
    }

    @Override // java.util.function.ToLongFunction
    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.f20884a.applyAsLong(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToLongFunction toLongFunction = this.f20884a;
        if (obj instanceof C10405R0) {
            obj = ((C10405R0) obj).f20884a;
        }
        return toLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20884a.hashCode();
    }
}
