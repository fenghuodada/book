package p060j$.util.function;

import java.util.function.Predicate;

/* renamed from: j$.util.function.K0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10392K0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10394L0 f20875a;

    private /* synthetic */ C10392K0(InterfaceC10394L0 interfaceC10394L0) {
        this.f20875a = interfaceC10394L0;
    }

    /* renamed from: a */
    public static /* synthetic */ Predicate m920a(InterfaceC10394L0 interfaceC10394L0) {
        if (interfaceC10394L0 == null) {
            return null;
        }
        return interfaceC10394L0 instanceof C10390J0 ? ((C10390J0) interfaceC10394L0).f20874a : new C10392K0(interfaceC10394L0);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return m920a(this.f20875a.mo772a(C10390J0.m921c(predicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10394L0 interfaceC10394L0 = this.f20875a;
        if (obj instanceof C10392K0) {
            obj = ((C10392K0) obj).f20875a;
        }
        return interfaceC10394L0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20875a.hashCode();
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        return m920a(this.f20875a.negate());
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        return m920a(this.f20875a.mo771b(C10390J0.m921c(predicate)));
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return this.f20875a.test(obj);
    }
}
