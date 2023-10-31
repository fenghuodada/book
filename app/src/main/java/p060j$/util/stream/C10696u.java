package p060j$.util.stream;

import p060j$.util.function.C10371A;
import p060j$.util.function.C10451r;
import p060j$.util.function.C10457u;
import p060j$.util.function.InterfaceC10375C;
import p060j$.util.function.InterfaceC10443n;
import p060j$.util.function.InterfaceC10449q;
import p060j$.util.function.InterfaceC10455t;
import p060j$.util.function.InterfaceC10461w;
import p060j$.util.function.InterfaceC10467z;

/* renamed from: j$.util.stream.u */
/* loaded from: classes2.dex */
final class C10696u extends AbstractC10599a2 {

    /* renamed from: b */
    public final /* synthetic */ int f21267b;

    /* renamed from: c */
    final /* synthetic */ AbstractC10606c f21268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10696u(AbstractC10606c abstractC10606c, InterfaceC10634h2 interfaceC10634h2, int i) {
        super(interfaceC10634h2);
        this.f21267b = i;
        this.f21268c = abstractC10606c;
    }

    @Override // p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        int i = this.f21267b;
        InterfaceC10634h2 interfaceC10634h2 = this.f21132a;
        AbstractC10606c abstractC10606c = this.f21268c;
        switch (i) {
            case 0:
                interfaceC10634h2.accept(((C10371A) ((InterfaceC10375C) ((C10701v) abstractC10606c).f21275t)).m934b(d));
                return;
            case 1:
                interfaceC10634h2.accept(((InterfaceC10449q) ((C10706w) abstractC10606c).f21287t).apply(d));
                return;
            case 2:
                interfaceC10634h2.accept(((C10457u) ((InterfaceC10461w) ((C10711x) abstractC10606c).f21302t)).m857a(d));
                return;
            case 3:
                interfaceC10634h2.accept(((InterfaceC10467z) ((C10716y) abstractC10606c).f21309t).applyAsLong(d));
                return;
            case 4:
                InterfaceC10513G interfaceC10513G = (InterfaceC10513G) ((InterfaceC10449q) ((C10701v) abstractC10606c).f21275t).apply(d);
                if (interfaceC10513G != null) {
                    try {
                        interfaceC10513G.sequential().mo813L(new C10691t(1, this));
                    } catch (Throwable th) {
                        try {
                            interfaceC10513G.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC10513G != null) {
                    interfaceC10513G.close();
                    return;
                }
                return;
            case 5:
                if (((C10451r) ((InterfaceC10455t) ((C10701v) abstractC10606c).f21275t)).m862e(d)) {
                    interfaceC10634h2.accept(d);
                    return;
                }
                return;
            default:
                ((InterfaceC10443n) ((C10701v) abstractC10606c).f21275t).accept(d);
                interfaceC10634h2.accept(d);
                return;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        int i = this.f21267b;
        InterfaceC10634h2 interfaceC10634h2 = this.f21132a;
        switch (i) {
            case 4:
                interfaceC10634h2.mo531g(-1L);
                return;
            case 5:
                interfaceC10634h2.mo531g(-1L);
                return;
            default:
                interfaceC10634h2.mo531g(j);
                return;
        }
    }
}
