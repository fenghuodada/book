package p060j$.util.function;

import java.util.function.DoublePredicate;

/* renamed from: j$.util.function.r */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10451r implements InterfaceC10455t {

    /* renamed from: a */
    public final /* synthetic */ DoublePredicate f20923a;

    private /* synthetic */ C10451r(DoublePredicate doublePredicate) {
        this.f20923a = doublePredicate;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10455t m865b(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return doublePredicate instanceof C10453s ? ((C10453s) doublePredicate).f20925a : new C10451r(doublePredicate);
    }

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10455t m866a(InterfaceC10455t interfaceC10455t) {
        return m865b(this.f20923a.and(C10453s.m859a(interfaceC10455t)));
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10455t m864c() {
        return m865b(this.f20923a.negate());
    }

    /* renamed from: d */
    public final /* synthetic */ InterfaceC10455t m863d(InterfaceC10455t interfaceC10455t) {
        return m865b(this.f20923a.or(C10453s.m859a(interfaceC10455t)));
    }

    /* renamed from: e */
    public final /* synthetic */ boolean m862e(double d) {
        return this.f20923a.test(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10451r) {
            obj = ((C10451r) obj).f20923a;
        }
        return this.f20923a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20923a.hashCode();
    }
}
