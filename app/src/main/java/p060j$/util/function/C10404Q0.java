package p060j$.util.function;

import java.util.function.ToIntFunction;
import p060j$.util.function.ToIntFunction;

/* renamed from: j$.util.function.Q0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10404Q0 implements ToIntFunction {

    /* renamed from: a */
    public final /* synthetic */ ToIntFunction f20883a;

    private /* synthetic */ C10404Q0(ToIntFunction toIntFunction) {
        this.f20883a = toIntFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ ToIntFunction m908a(ToIntFunction toIntFunction) {
        if (toIntFunction == null) {
            return null;
        }
        return toIntFunction instanceof ToIntFunction.VivifiedWrapper ? ((ToIntFunction.VivifiedWrapper) toIntFunction).f20890a : new C10404Q0(toIntFunction);
    }

    @Override // java.util.function.ToIntFunction
    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.f20883a.applyAsInt(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToIntFunction toIntFunction = this.f20883a;
        if (obj instanceof C10404Q0) {
            obj = ((C10404Q0) obj).f20883a;
        }
        return toIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20883a.hashCode();
    }
}
