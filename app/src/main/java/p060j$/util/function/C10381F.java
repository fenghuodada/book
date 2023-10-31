package p060j$.util.function;

import java.util.function.IntBinaryOperator;

/* renamed from: j$.util.function.F */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10381F implements IntBinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10383G f20863a;

    private /* synthetic */ C10381F(InterfaceC10383G interfaceC10383G) {
        this.f20863a = interfaceC10383G;
    }

    /* renamed from: a */
    public static /* synthetic */ IntBinaryOperator m925a(InterfaceC10383G interfaceC10383G) {
        if (interfaceC10383G == null) {
            return null;
        }
        return interfaceC10383G instanceof C10379E ? ((C10379E) interfaceC10383G).f20861a : new C10381F(interfaceC10383G);
    }

    @Override // java.util.function.IntBinaryOperator
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.f20863a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10383G interfaceC10383G = this.f20863a;
        if (obj instanceof C10381F) {
            obj = ((C10381F) obj).f20863a;
        }
        return interfaceC10383G.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20863a.hashCode();
    }
}
