package p060j$.util.stream;

import p060j$.util.function.C10437k;
import p060j$.util.function.InterfaceC10443n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.O */
/* loaded from: classes2.dex */
public final class C10549O extends AbstractC10568T implements InterfaceC10619e2 {

    /* renamed from: b */
    final InterfaceC10443n f21049b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10549O(InterfaceC10443n interfaceC10443n, boolean z) {
        super(z);
        this.f21049b = interfaceC10443n;
    }

    @Override // p060j$.util.stream.AbstractC10568T, p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        this.f21049b.accept(d);
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo527q((Double) obj);
    }

    @Override // p060j$.util.function.InterfaceC10443n
    /* renamed from: n */
    public final InterfaceC10443n mo528n(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10437k(this, interfaceC10443n);
    }

    @Override // p060j$.util.stream.InterfaceC10619e2
    /* renamed from: q */
    public final /* synthetic */ void mo527q(Double d) {
        AbstractC10707w0.m552s0(this, d);
    }
}
