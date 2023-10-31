package p060j$.util.function;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.function.Z */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10416Z implements IntUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10418a0 f20895a;

    private /* synthetic */ C10416Z(InterfaceC10418a0 interfaceC10418a0) {
        this.f20895a = interfaceC10418a0;
    }

    /* renamed from: a */
    public static /* synthetic */ IntUnaryOperator m893a(InterfaceC10418a0 interfaceC10418a0) {
        if (interfaceC10418a0 == null) {
            return null;
        }
        return interfaceC10418a0 instanceof C10415Y ? ((C10415Y) interfaceC10418a0).f20894a : new C10416Z(interfaceC10418a0);
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return m893a(((C10415Y) this.f20895a).m897a(C10415Y.m894d(intUnaryOperator)));
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ int applyAsInt(int i) {
        return ((C10415Y) this.f20895a).m896b(i);
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return m893a(((C10415Y) this.f20895a).m895c(C10415Y.m894d(intUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10418a0 interfaceC10418a0 = this.f20895a;
        if (obj instanceof C10416Z) {
            obj = ((C10416Z) obj).f20895a;
        }
        return interfaceC10418a0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20895a.hashCode();
    }
}
