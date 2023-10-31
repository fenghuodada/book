package p060j$.util.stream;

import p060j$.util.function.C10437k;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.stream.t */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10691t implements InterfaceC10443n {

    /* renamed from: a */
    public final /* synthetic */ int f21261a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10634h2 f21262b;

    public /* synthetic */ C10691t(int i, InterfaceC10634h2 interfaceC10634h2) {
        this.f21261a = i;
        this.f21262b = interfaceC10634h2;
    }

    @Override // p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        int i = this.f21261a;
        InterfaceC10634h2 interfaceC10634h2 = this.f21262b;
        switch (i) {
            case 0:
                interfaceC10634h2.accept(d);
                return;
            default:
                ((C10696u) interfaceC10634h2).f21132a.accept(d);
                return;
        }
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        switch (this.f21261a) {
            case 0:
                interfaceC10443n.getClass();
                return new C10437k(this, interfaceC10443n);
            default:
                interfaceC10443n.getClass();
                return new C10437k(this, interfaceC10443n);
        }
    }
}
