package p060j$.util.function;

import java.util.function.LongToDoubleFunction;

/* renamed from: j$.util.function.o0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10446o0 implements InterfaceC10450q0 {

    /* renamed from: a */
    public final /* synthetic */ LongToDoubleFunction f20920a;

    private /* synthetic */ C10446o0(LongToDoubleFunction longToDoubleFunction) {
        this.f20920a = longToDoubleFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10450q0 m869b(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return longToDoubleFunction instanceof C10448p0 ? ((C10448p0) longToDoubleFunction).f20922a : new C10446o0(longToDoubleFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ double m870a(long j) {
        return this.f20920a.applyAsDouble(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10446o0) {
            obj = ((C10446o0) obj).f20920a;
        }
        return this.f20920a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20920a.hashCode();
    }
}
