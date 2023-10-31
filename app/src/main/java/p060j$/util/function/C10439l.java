package p060j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10439l implements InterfaceC10443n {

    /* renamed from: a */
    public final /* synthetic */ DoubleConsumer f20915a;

    private /* synthetic */ C10439l(DoubleConsumer doubleConsumer) {
        this.f20915a = doubleConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10443n m879a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return doubleConsumer instanceof C10441m ? ((C10441m) doubleConsumer).f20917a : new C10439l(doubleConsumer);
    }

    @Override // p060j$.util.function.InterfaceC10443n
    public final /* synthetic */ void accept(double d) {
        this.f20915a.accept(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10439l) {
            obj = ((C10439l) obj).f20915a;
        }
        return this.f20915a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20915a.hashCode();
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final /* synthetic */ InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        return m879a(this.f20915a.andThen(C10441m.m873a(interfaceC10443n)));
    }
}
