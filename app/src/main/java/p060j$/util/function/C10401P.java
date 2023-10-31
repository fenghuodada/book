package p060j$.util.function;

import java.util.function.IntPredicate;

/* renamed from: j$.util.function.P */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10401P implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10403Q f20881a;

    private /* synthetic */ C10401P(InterfaceC10403Q interfaceC10403Q) {
        this.f20881a = interfaceC10403Q;
    }

    /* renamed from: a */
    public static /* synthetic */ IntPredicate m910a(InterfaceC10403Q interfaceC10403Q) {
        if (interfaceC10403Q == null) {
            return null;
        }
        return interfaceC10403Q instanceof C10399O ? ((C10399O) interfaceC10403Q).f20880a : new C10401P(interfaceC10403Q);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return m910a(((C10399O) this.f20881a).m915a(C10399O.m914b(intPredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10403Q interfaceC10403Q = this.f20881a;
        if (obj instanceof C10401P) {
            obj = ((C10401P) obj).f20881a;
        }
        return interfaceC10403Q.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20881a.hashCode();
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate negate() {
        return m910a(((C10399O) this.f20881a).m913c());
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return m910a(((C10399O) this.f20881a).m912d(C10399O.m914b(intPredicate)));
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return ((C10399O) this.f20881a).m911e(i);
    }
}
