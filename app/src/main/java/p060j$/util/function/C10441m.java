package p060j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10441m implements DoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10443n f20917a;

    private /* synthetic */ C10441m(InterfaceC10443n interfaceC10443n) {
        this.f20917a = interfaceC10443n;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleConsumer m873a(InterfaceC10443n interfaceC10443n) {
        if (interfaceC10443n == null) {
            return null;
        }
        return interfaceC10443n instanceof C10439l ? ((C10439l) interfaceC10443n).f20915a : new C10441m(interfaceC10443n);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        this.f20917a.accept(d);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return m873a(this.f20917a.mo528n(C10439l.m879a(doubleConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10443n interfaceC10443n = this.f20917a;
        if (obj instanceof C10441m) {
            obj = ((C10441m) obj).f20917a;
        }
        return interfaceC10443n.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20917a.hashCode();
    }
}
