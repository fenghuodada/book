package p060j$.util.function;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.function.Y */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10415Y implements InterfaceC10418a0 {

    /* renamed from: a */
    public final /* synthetic */ IntUnaryOperator f20894a;

    private /* synthetic */ C10415Y(IntUnaryOperator intUnaryOperator) {
        this.f20894a = intUnaryOperator;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC10418a0 m894d(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return intUnaryOperator instanceof C10416Z ? ((C10416Z) intUnaryOperator).f20895a : new C10415Y(intUnaryOperator);
    }

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10418a0 m897a(InterfaceC10418a0 interfaceC10418a0) {
        return m894d(this.f20894a.andThen(C10416Z.m893a(interfaceC10418a0)));
    }

    /* renamed from: b */
    public final /* synthetic */ int m896b(int i) {
        return this.f20894a.applyAsInt(i);
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10418a0 m895c(InterfaceC10418a0 interfaceC10418a0) {
        return m894d(this.f20894a.compose(C10416Z.m893a(interfaceC10418a0)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10415Y) {
            obj = ((C10415Y) obj).f20894a;
        }
        return this.f20894a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20894a.hashCode();
    }
}
