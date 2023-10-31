package p060j$.util.function;

import java.util.function.LongToIntFunction;

/* renamed from: j$.util.function.r0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10452r0 implements InterfaceC10456t0 {

    /* renamed from: a */
    public final /* synthetic */ LongToIntFunction f20924a;

    private /* synthetic */ C10452r0(LongToIntFunction longToIntFunction) {
        this.f20924a = longToIntFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10456t0 m860b(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        return longToIntFunction instanceof C10454s0 ? ((C10454s0) longToIntFunction).f20926a : new C10452r0(longToIntFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ int m861a(long j) {
        return this.f20924a.applyAsInt(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10452r0) {
            obj = ((C10452r0) obj).f20924a;
        }
        return this.f20924a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20924a.hashCode();
    }
}
