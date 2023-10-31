package p060j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.i */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10433i implements DoubleBinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10435j f20910a;

    private /* synthetic */ C10433i(InterfaceC10435j interfaceC10435j) {
        this.f20910a = interfaceC10435j;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleBinaryOperator m882a(InterfaceC10435j interfaceC10435j) {
        if (interfaceC10435j == null) {
            return null;
        }
        return interfaceC10435j instanceof C10431h ? ((C10431h) interfaceC10435j).f20909a : new C10433i(interfaceC10435j);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.f20910a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10435j interfaceC10435j = this.f20910a;
        if (obj instanceof C10433i) {
            obj = ((C10433i) obj).f20910a;
        }
        return interfaceC10435j.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20910a.hashCode();
    }
}
