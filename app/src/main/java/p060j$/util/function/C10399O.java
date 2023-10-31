package p060j$.util.function;

import java.util.function.IntPredicate;

/* renamed from: j$.util.function.O */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10399O implements InterfaceC10403Q {

    /* renamed from: a */
    public final /* synthetic */ IntPredicate f20880a;

    private /* synthetic */ C10399O(IntPredicate intPredicate) {
        this.f20880a = intPredicate;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10403Q m914b(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return intPredicate instanceof C10401P ? ((C10401P) intPredicate).f20881a : new C10399O(intPredicate);
    }

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10403Q m915a(InterfaceC10403Q interfaceC10403Q) {
        return m914b(this.f20880a.and(C10401P.m910a(interfaceC10403Q)));
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10403Q m913c() {
        return m914b(this.f20880a.negate());
    }

    /* renamed from: d */
    public final /* synthetic */ InterfaceC10403Q m912d(InterfaceC10403Q interfaceC10403Q) {
        return m914b(this.f20880a.or(C10401P.m910a(interfaceC10403Q)));
    }

    /* renamed from: e */
    public final /* synthetic */ boolean m911e(int i) {
        return this.f20880a.test(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10399O) {
            obj = ((C10399O) obj).f20880a;
        }
        return this.f20880a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20880a.hashCode();
    }
}
