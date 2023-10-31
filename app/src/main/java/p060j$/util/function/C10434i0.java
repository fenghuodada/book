package p060j$.util.function;

import java.util.function.LongFunction;

/* renamed from: j$.util.function.i0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10434i0 implements InterfaceC10438k0 {

    /* renamed from: a */
    public final /* synthetic */ LongFunction f20911a;

    private /* synthetic */ C10434i0(LongFunction longFunction) {
        this.f20911a = longFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10438k0 m881a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return longFunction instanceof C10436j0 ? ((C10436j0) longFunction).f20912a : new C10434i0(longFunction);
    }

    @Override // p060j$.util.function.InterfaceC10438k0
    public final /* synthetic */ Object apply(long j) {
        return this.f20911a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10434i0) {
            obj = ((C10434i0) obj).f20911a;
        }
        return this.f20911a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20911a.hashCode();
    }
}
