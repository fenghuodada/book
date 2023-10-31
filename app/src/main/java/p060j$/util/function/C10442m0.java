package p060j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.m0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10442m0 implements LongPredicate {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10444n0 f20918a;

    private /* synthetic */ C10442m0(InterfaceC10444n0 interfaceC10444n0) {
        this.f20918a = interfaceC10444n0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongPredicate m872a(InterfaceC10444n0 interfaceC10444n0) {
        if (interfaceC10444n0 == null) {
            return null;
        }
        return interfaceC10444n0 instanceof C10440l0 ? ((C10440l0) interfaceC10444n0).f20916a : new C10442m0(interfaceC10444n0);
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return m872a(((C10440l0) this.f20918a).m878a(C10440l0.m877b(longPredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10444n0 interfaceC10444n0 = this.f20918a;
        if (obj instanceof C10442m0) {
            obj = ((C10442m0) obj).f20918a;
        }
        return interfaceC10444n0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20918a.hashCode();
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate negate() {
        return m872a(((C10440l0) this.f20918a).m876c());
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        return m872a(((C10440l0) this.f20918a).m875d(C10440l0.m877b(longPredicate)));
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ boolean test(long j) {
        return ((C10440l0) this.f20918a).m874e(j);
    }
}
