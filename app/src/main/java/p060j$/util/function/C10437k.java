package p060j$.util.function;

import p060j$.time.AbstractC10240a;

/* renamed from: j$.util.function.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10437k implements InterfaceC10443n {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10443n f20913a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10443n f20914b;

    public /* synthetic */ C10437k(InterfaceC10443n interfaceC10443n, InterfaceC10443n interfaceC10443n2) {
        this.f20913a = interfaceC10443n;
        this.f20914b = interfaceC10443n2;
    }

    @Override // p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        AbstractC10240a.m1164c(this.f20913a, this.f20914b, d);
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }
}
