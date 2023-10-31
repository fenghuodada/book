package p060j$.util.stream;

import p060j$.util.function.C10426e0;
import p060j$.util.function.InterfaceC10432h0;

/* renamed from: j$.util.stream.e0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10617e0 implements InterfaceC10432h0 {

    /* renamed from: a */
    public final /* synthetic */ int f21160a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10634h2 f21161b;

    public /* synthetic */ C10617e0(int i, InterfaceC10634h2 interfaceC10634h2) {
        this.f21160a = i;
        this.f21161b = interfaceC10634h2;
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    public final void accept(long j) {
        int i = this.f21160a;
        InterfaceC10634h2 interfaceC10634h2 = this.f21161b;
        switch (i) {
            case 0:
                interfaceC10634h2.accept(j);
                return;
            default:
                ((C10627g0) interfaceC10634h2).f21150a.accept(j);
                return;
        }
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        switch (this.f21160a) {
            case 0:
                interfaceC10432h0.getClass();
                return new C10426e0(this, interfaceC10432h0);
            default:
                interfaceC10432h0.getClass();
                return new C10426e0(this, interfaceC10432h0);
        }
    }
}
