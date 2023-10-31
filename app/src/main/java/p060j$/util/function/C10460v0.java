package p060j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.v0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10460v0 implements InterfaceC10464x0 {

    /* renamed from: a */
    public final /* synthetic */ LongUnaryOperator f20932a;

    private /* synthetic */ C10460v0(LongUnaryOperator longUnaryOperator) {
        this.f20932a = longUnaryOperator;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC10464x0 m854c(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return longUnaryOperator instanceof C10462w0 ? ((C10462w0) longUnaryOperator).f20933a : new C10460v0(longUnaryOperator);
    }

    @Override // p060j$.util.function.InterfaceC10464x0
    /* renamed from: a */
    public final /* synthetic */ InterfaceC10464x0 mo729a(InterfaceC10464x0 interfaceC10464x0) {
        return m854c(this.f20932a.compose(C10462w0.m853a(interfaceC10464x0)));
    }

    @Override // p060j$.util.function.InterfaceC10464x0
    public final /* synthetic */ long applyAsLong(long j) {
        return this.f20932a.applyAsLong(j);
    }

    @Override // p060j$.util.function.InterfaceC10464x0
    /* renamed from: b */
    public final /* synthetic */ InterfaceC10464x0 mo728b(InterfaceC10464x0 interfaceC10464x0) {
        return m854c(this.f20932a.andThen(C10462w0.m853a(interfaceC10464x0)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10460v0) {
            obj = ((C10460v0) obj).f20932a;
        }
        return this.f20932a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20932a.hashCode();
    }
}
