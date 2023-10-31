package p060j$.util.function;

import java.util.function.LongToIntFunction;

/* renamed from: j$.util.function.s0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10454s0 implements LongToIntFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10456t0 f20926a;

    private /* synthetic */ C10454s0(InterfaceC10456t0 interfaceC10456t0) {
        this.f20926a = interfaceC10456t0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongToIntFunction m858a(InterfaceC10456t0 interfaceC10456t0) {
        if (interfaceC10456t0 == null) {
            return null;
        }
        return interfaceC10456t0 instanceof C10452r0 ? ((C10452r0) interfaceC10456t0).f20924a : new C10454s0(interfaceC10456t0);
    }

    @Override // java.util.function.LongToIntFunction
    public final /* synthetic */ int applyAsInt(long j) {
        return ((C10452r0) this.f20926a).m861a(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10456t0 interfaceC10456t0 = this.f20926a;
        if (obj instanceof C10454s0) {
            obj = ((C10454s0) obj).f20926a;
        }
        return interfaceC10456t0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20926a.hashCode();
    }
}
