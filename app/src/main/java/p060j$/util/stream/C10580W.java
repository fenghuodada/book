package p060j$.util.stream;

import p060j$.util.function.C10385H;
import p060j$.util.function.InterfaceC10391K;

/* renamed from: j$.util.stream.W */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10580W implements InterfaceC10391K {

    /* renamed from: a */
    public final /* synthetic */ int f21091a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10634h2 f21092b;

    public /* synthetic */ C10580W(int i, InterfaceC10634h2 interfaceC10634h2) {
        this.f21091a = i;
        this.f21092b = interfaceC10634h2;
    }

    @Override // p060j$.util.function.InterfaceC10391K
    public final void accept(int i) {
        int i2 = this.f21091a;
        InterfaceC10634h2 interfaceC10634h2 = this.f21092b;
        switch (i2) {
            case 0:
                interfaceC10634h2.accept(i);
                return;
            default:
                ((C10584X) interfaceC10634h2).f21137a.accept(i);
                return;
        }
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        switch (this.f21091a) {
            case 0:
                interfaceC10391K.getClass();
                return new C10385H(this, interfaceC10391K);
            default:
                interfaceC10391K.getClass();
                return new C10385H(this, interfaceC10391K);
        }
    }
}
