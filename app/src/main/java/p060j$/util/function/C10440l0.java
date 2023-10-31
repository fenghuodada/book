package p060j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.l0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10440l0 implements InterfaceC10444n0 {

    /* renamed from: a */
    public final /* synthetic */ LongPredicate f20916a;

    private /* synthetic */ C10440l0(LongPredicate longPredicate) {
        this.f20916a = longPredicate;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10444n0 m877b(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return longPredicate instanceof C10442m0 ? ((C10442m0) longPredicate).f20918a : new C10440l0(longPredicate);
    }

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10444n0 m878a(InterfaceC10444n0 interfaceC10444n0) {
        return m877b(this.f20916a.and(C10442m0.m872a(interfaceC10444n0)));
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10444n0 m876c() {
        return m877b(this.f20916a.negate());
    }

    /* renamed from: d */
    public final /* synthetic */ InterfaceC10444n0 m875d(InterfaceC10444n0 interfaceC10444n0) {
        return m877b(this.f20916a.or(C10442m0.m872a(interfaceC10444n0)));
    }

    /* renamed from: e */
    public final /* synthetic */ boolean m874e(long j) {
        return this.f20916a.test(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10440l0) {
            obj = ((C10440l0) obj).f20916a;
        }
        return this.f20916a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20916a.hashCode();
    }
}
