package p060j$.util.stream;

import p060j$.util.function.C10399O;
import p060j$.util.function.C10406S;
import p060j$.util.function.C10415Y;
import p060j$.util.function.InterfaceC10391K;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10403Q;
import p060j$.util.function.InterfaceC10410U;
import p060j$.util.function.InterfaceC10414X;
import p060j$.util.function.InterfaceC10418a0;

/* renamed from: j$.util.stream.X */
/* loaded from: classes2.dex */
final class C10584X extends AbstractC10604b2 {

    /* renamed from: b */
    public final /* synthetic */ int f21095b;

    /* renamed from: c */
    final /* synthetic */ AbstractC10606c f21096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10584X(AbstractC10606c abstractC10606c, InterfaceC10634h2 interfaceC10634h2, int i) {
        super(interfaceC10634h2);
        this.f21095b = i;
        this.f21096c = abstractC10606c;
    }

    @Override // p060j$.util.stream.InterfaceC10624f2, p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        int i2 = this.f21095b;
        AbstractC10606c abstractC10606c = this.f21096c;
        InterfaceC10634h2 interfaceC10634h2 = this.f21137a;
        switch (i2) {
            case 0:
                interfaceC10634h2.accept(i);
                return;
            case 1:
                ((InterfaceC10391K) ((C10711x) abstractC10606c).f21302t).accept(i);
                interfaceC10634h2.accept(i);
                return;
            case 2:
                interfaceC10634h2.accept(i);
                return;
            case 3:
                interfaceC10634h2.accept(((C10415Y) ((InterfaceC10418a0) ((C10711x) abstractC10606c).f21302t)).m896b(i));
                return;
            case 4:
                interfaceC10634h2.accept(((InterfaceC10397N) ((C10706w) abstractC10606c).f21287t).apply(i));
                return;
            case 5:
                interfaceC10634h2.accept(((InterfaceC10414X) ((C10716y) abstractC10606c).f21309t).applyAsLong(i));
                return;
            case 6:
                interfaceC10634h2.accept(((C10406S) ((InterfaceC10410U) ((C10701v) abstractC10606c).f21275t)).m906a(i));
                return;
            case 7:
                IntStream intStream = (IntStream) ((InterfaceC10397N) ((C10711x) abstractC10606c).f21302t).apply(i);
                if (intStream != null) {
                    try {
                        intStream.sequential().mo709c0(new C10580W(1, this));
                    } catch (Throwable th) {
                        try {
                            intStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                if (((C10399O) ((InterfaceC10403Q) ((C10711x) abstractC10606c).f21302t)).m911e(i)) {
                    interfaceC10634h2.accept(i);
                    return;
                }
                return;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        int i = this.f21095b;
        InterfaceC10634h2 interfaceC10634h2 = this.f21137a;
        switch (i) {
            case 7:
                interfaceC10634h2.mo531g(-1L);
                return;
            case 8:
                interfaceC10634h2.mo531g(-1L);
                return;
            default:
                interfaceC10634h2.mo531g(j);
                return;
        }
    }
}
