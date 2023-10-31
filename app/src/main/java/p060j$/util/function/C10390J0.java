package p060j$.util.function;

import java.util.function.Predicate;

/* renamed from: j$.util.function.J0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10390J0 implements InterfaceC10394L0 {

    /* renamed from: a */
    public final /* synthetic */ Predicate f20874a;

    private /* synthetic */ C10390J0(Predicate predicate) {
        this.f20874a = predicate;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC10394L0 m921c(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof C10392K0 ? ((C10392K0) predicate).f20875a : new C10390J0(predicate);
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    /* renamed from: a */
    public final /* synthetic */ InterfaceC10394L0 mo772a(InterfaceC10394L0 interfaceC10394L0) {
        return m921c(this.f20874a.and(C10392K0.m920a(interfaceC10394L0)));
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    /* renamed from: b */
    public final /* synthetic */ InterfaceC10394L0 mo771b(InterfaceC10394L0 interfaceC10394L0) {
        return m921c(this.f20874a.or(C10392K0.m920a(interfaceC10394L0)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10390J0) {
            obj = ((C10390J0) obj).f20874a;
        }
        return this.f20874a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20874a.hashCode();
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    public final /* synthetic */ InterfaceC10394L0 negate() {
        return m921c(this.f20874a.negate());
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    public final /* synthetic */ boolean test(Object obj) {
        return this.f20874a.test(obj);
    }
}
