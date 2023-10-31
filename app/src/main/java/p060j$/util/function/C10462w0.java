package p060j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.w0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10462w0 implements LongUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10464x0 f20933a;

    private /* synthetic */ C10462w0(InterfaceC10464x0 interfaceC10464x0) {
        this.f20933a = interfaceC10464x0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongUnaryOperator m853a(InterfaceC10464x0 interfaceC10464x0) {
        if (interfaceC10464x0 == null) {
            return null;
        }
        return interfaceC10464x0 instanceof C10460v0 ? ((C10460v0) interfaceC10464x0).f20932a : new C10462w0(interfaceC10464x0);
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return m853a(this.f20933a.mo728b(C10460v0.m854c(longUnaryOperator)));
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ long applyAsLong(long j) {
        return this.f20933a.applyAsLong(j);
    }

    @Override // java.util.function.LongUnaryOperator
    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return m853a(this.f20933a.mo729a(C10460v0.m854c(longUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10464x0 interfaceC10464x0 = this.f20933a;
        if (obj instanceof C10462w0) {
            obj = ((C10462w0) obj).f20933a;
        }
        return interfaceC10464x0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20933a.hashCode();
    }
}
