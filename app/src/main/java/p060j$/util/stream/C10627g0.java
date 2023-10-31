package p060j$.util.stream;

import p060j$.util.function.C10440l0;
import p060j$.util.function.C10446o0;
import p060j$.util.function.C10452r0;
import p060j$.util.function.InterfaceC10432h0;
import p060j$.util.function.InterfaceC10438k0;
import p060j$.util.function.InterfaceC10444n0;
import p060j$.util.function.InterfaceC10450q0;
import p060j$.util.function.InterfaceC10456t0;
import p060j$.util.function.InterfaceC10464x0;

/* renamed from: j$.util.stream.g0 */
/* loaded from: classes2.dex */
final class C10627g0 extends AbstractC10609c2 {

    /* renamed from: b */
    public final /* synthetic */ int f21173b;

    /* renamed from: c */
    final /* synthetic */ AbstractC10606c f21174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10627g0(AbstractC10606c abstractC10606c, InterfaceC10634h2 interfaceC10634h2, int i) {
        super(interfaceC10634h2);
        this.f21173b = i;
        this.f21174c = abstractC10606c;
    }

    @Override // p060j$.util.stream.InterfaceC10629g2, p060j$.util.stream.InterfaceC10634h2
    public final void accept(long j) {
        int i = this.f21173b;
        AbstractC10606c abstractC10606c = this.f21174c;
        InterfaceC10634h2 interfaceC10634h2 = this.f21150a;
        switch (i) {
            case 0:
                interfaceC10634h2.accept(j);
                return;
            case 1:
                interfaceC10634h2.accept(((InterfaceC10464x0) ((C10716y) abstractC10606c).f21309t).applyAsLong(j));
                return;
            case 2:
                interfaceC10634h2.accept(((InterfaceC10438k0) ((C10706w) abstractC10606c).f21287t).apply(j));
                return;
            case 3:
                interfaceC10634h2.accept(((C10452r0) ((InterfaceC10456t0) ((C10711x) abstractC10606c).f21302t)).m861a(j));
                return;
            case 4:
                interfaceC10634h2.accept(((C10446o0) ((InterfaceC10450q0) ((C10701v) abstractC10606c).f21275t)).m870a(j));
                return;
            case 5:
                InterfaceC10662n0 interfaceC10662n0 = (InterfaceC10662n0) ((InterfaceC10438k0) ((C10716y) abstractC10606c).f21309t).apply(j);
                if (interfaceC10662n0 != null) {
                    try {
                        interfaceC10662n0.sequential().mo643I(new C10617e0(1, this));
                    } catch (Throwable th) {
                        try {
                            interfaceC10662n0.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC10662n0 != null) {
                    interfaceC10662n0.close();
                    return;
                }
                return;
            case 6:
                if (((C10440l0) ((InterfaceC10444n0) ((C10716y) abstractC10606c).f21309t)).m874e(j)) {
                    interfaceC10634h2.accept(j);
                    return;
                }
                return;
            default:
                ((InterfaceC10432h0) ((C10716y) abstractC10606c).f21309t).accept(j);
                interfaceC10634h2.accept(j);
                return;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        int i = this.f21173b;
        InterfaceC10634h2 interfaceC10634h2 = this.f21150a;
        switch (i) {
            case 5:
                interfaceC10634h2.mo531g(-1L);
                return;
            case 6:
                interfaceC10634h2.mo531g(-1L);
                return;
            default:
                interfaceC10634h2.mo531g(j);
                return;
        }
    }
}
