package p060j$.util;

import p060j$.util.function.C10437k;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.n */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10477n implements InterfaceC10443n {

    /* renamed from: a */
    public final /* synthetic */ Consumer f20950a;

    public /* synthetic */ C10477n(Consumer consumer) {
        this.f20950a = consumer;
    }

    @Override // p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        this.f20950a.accept(Double.valueOf(d));
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }
}
