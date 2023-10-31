package p060j$.util.function;

import java.util.function.IntToLongFunction;

/* renamed from: j$.util.function.W */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10413W implements IntToLongFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10414X f20893a;

    private /* synthetic */ C10413W(InterfaceC10414X interfaceC10414X) {
        this.f20893a = interfaceC10414X;
    }

    /* renamed from: a */
    public static /* synthetic */ IntToLongFunction m898a(InterfaceC10414X interfaceC10414X) {
        if (interfaceC10414X == null) {
            return null;
        }
        return interfaceC10414X instanceof C10412V ? ((C10412V) interfaceC10414X).f20892a : new C10413W(interfaceC10414X);
    }

    @Override // java.util.function.IntToLongFunction
    public final /* synthetic */ long applyAsLong(int i) {
        return this.f20893a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10414X interfaceC10414X = this.f20893a;
        if (obj instanceof C10413W) {
            obj = ((C10413W) obj).f20893a;
        }
        return interfaceC10414X.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20893a.hashCode();
    }
}
