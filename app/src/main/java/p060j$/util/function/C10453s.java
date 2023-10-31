package p060j$.util.function;

import java.util.function.DoublePredicate;

/* renamed from: j$.util.function.s */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10453s implements DoublePredicate {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10455t f20925a;

    private /* synthetic */ C10453s(InterfaceC10455t interfaceC10455t) {
        this.f20925a = interfaceC10455t;
    }

    /* renamed from: a */
    public static /* synthetic */ DoublePredicate m859a(InterfaceC10455t interfaceC10455t) {
        if (interfaceC10455t == null) {
            return null;
        }
        return interfaceC10455t instanceof C10451r ? ((C10451r) interfaceC10455t).f20923a : new C10453s(interfaceC10455t);
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        return m859a(((C10451r) this.f20925a).m866a(C10451r.m865b(doublePredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10455t interfaceC10455t = this.f20925a;
        if (obj instanceof C10453s) {
            obj = ((C10453s) obj).f20925a;
        }
        return interfaceC10455t.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20925a.hashCode();
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate negate() {
        return m859a(((C10451r) this.f20925a).m864c());
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate or(DoublePredicate doublePredicate) {
        return m859a(((C10451r) this.f20925a).m863d(C10451r.m865b(doublePredicate)));
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ boolean test(double d) {
        return ((C10451r) this.f20925a).m862e(d);
    }
}
