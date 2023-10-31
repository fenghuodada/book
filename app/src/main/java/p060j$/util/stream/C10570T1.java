package p060j$.util.stream;

import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10394L0;
import p060j$.util.function.ToDoubleFunction;
import p060j$.util.function.ToIntFunction;
import p060j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.T1 */
/* loaded from: classes2.dex */
final class C10570T1 extends AbstractC10614d2 {

    /* renamed from: b */
    public final /* synthetic */ int f21073b;

    /* renamed from: c */
    final /* synthetic */ AbstractC10606c f21074c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10570T1(AbstractC10606c abstractC10606c, InterfaceC10634h2 interfaceC10634h2, int i) {
        super(interfaceC10634h2);
        this.f21073b = i;
        this.f21074c = abstractC10606c;
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f21073b;
        InterfaceC10634h2 interfaceC10634h2 = this.f21154a;
        AbstractC10606c abstractC10606c = this.f21074c;
        switch (i) {
            case 0:
                ((Consumer) ((C10706w) abstractC10606c).f21287t).accept(obj);
                interfaceC10634h2.accept(obj);
                return;
            case 1:
                if (((InterfaceC10394L0) ((C10706w) abstractC10606c).f21287t).test(obj)) {
                    interfaceC10634h2.accept(obj);
                    return;
                }
                return;
            case 2:
                interfaceC10634h2.accept(((C10578V1) abstractC10606c).f21089t.apply(obj));
                return;
            case 3:
                interfaceC10634h2.accept(((ToIntFunction) ((C10711x) abstractC10606c).f21302t).applyAsInt(obj));
                return;
            case 4:
                interfaceC10634h2.accept(((ToLongFunction) ((C10716y) abstractC10606c).f21309t).applyAsLong(obj));
                return;
            case 5:
                interfaceC10634h2.accept(((ToDoubleFunction) ((C10701v) abstractC10606c).f21275t).applyAsDouble(obj));
                return;
            default:
                InterfaceC10575U2 interfaceC10575U2 = (InterfaceC10575U2) ((C10578V1) abstractC10606c).f21089t.apply(obj);
                if (interfaceC10575U2 != null) {
                    try {
                        ((InterfaceC10575U2) interfaceC10575U2.sequential()).mo746a(interfaceC10634h2);
                    } catch (Throwable th) {
                        try {
                            interfaceC10575U2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC10575U2 != null) {
                    interfaceC10575U2.close();
                    return;
                }
                return;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        int i = this.f21073b;
        InterfaceC10634h2 interfaceC10634h2 = this.f21154a;
        switch (i) {
            case 1:
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
