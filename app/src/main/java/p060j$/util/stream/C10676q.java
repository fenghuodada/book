package p060j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import p060j$.util.function.Function;
import p060j$.util.function.InterfaceC10391K;
import p060j$.util.function.InterfaceC10432h0;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.util.stream.q */
/* loaded from: classes2.dex */
final class C10676q extends AbstractC10614d2 {

    /* renamed from: b */
    public final /* synthetic */ int f21233b = 0;

    /* renamed from: c */
    Object f21234c;

    /* renamed from: d */
    final /* synthetic */ AbstractC10606c f21235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10676q(C10681r c10681r, InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
        this.f21235d = c10681r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10676q(C10701v c10701v, InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
        this.f21235d = c10701v;
        this.f21234c = new C10691t(0, interfaceC10634h2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10676q(C10711x c10711x, InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
        this.f21235d = c10711x;
        this.f21234c = new C10580W(0, interfaceC10634h2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10676q(C10716y c10716y, InterfaceC10634h2 interfaceC10634h2) {
        super(interfaceC10634h2);
        this.f21235d = c10716y;
        this.f21234c = new C10617e0(0, interfaceC10634h2);
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f21233b;
        AbstractC10606c abstractC10606c = this.f21235d;
        switch (i) {
            case 0:
                if (((Set) this.f21234c).contains(obj)) {
                    return;
                }
                ((Set) this.f21234c).add(obj);
                this.f21154a.accept(obj);
                return;
            case 1:
                InterfaceC10662n0 interfaceC10662n0 = (InterfaceC10662n0) ((Function) ((C10716y) abstractC10606c).f21309t).apply(obj);
                if (interfaceC10662n0 != null) {
                    try {
                        interfaceC10662n0.sequential().mo643I((InterfaceC10432h0) this.f21234c);
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
            case 2:
                IntStream intStream = (IntStream) ((Function) ((C10711x) abstractC10606c).f21302t).apply(obj);
                if (intStream != null) {
                    try {
                        intStream.sequential().mo709c0((InterfaceC10391K) this.f21234c);
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                InterfaceC10513G interfaceC10513G = (InterfaceC10513G) ((Function) ((C10701v) abstractC10606c).f21275t).apply(obj);
                if (interfaceC10513G != null) {
                    try {
                        interfaceC10513G.sequential().mo813L((InterfaceC10443n) this.f21234c);
                    } catch (Throwable th5) {
                        try {
                            interfaceC10513G.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (interfaceC10513G != null) {
                    interfaceC10513G.close();
                    return;
                }
                return;
        }
    }

    @Override // p060j$.util.stream.AbstractC10614d2, p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        switch (this.f21233b) {
            case 0:
                this.f21234c = null;
                this.f21154a.end();
                return;
            default:
                super.end();
                return;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        int i = this.f21233b;
        InterfaceC10634h2 interfaceC10634h2 = this.f21154a;
        switch (i) {
            case 0:
                this.f21234c = new HashSet();
                interfaceC10634h2.mo531g(-1L);
                return;
            case 1:
                interfaceC10634h2.mo531g(-1L);
                return;
            case 2:
                interfaceC10634h2.mo531g(-1L);
                return;
            default:
                interfaceC10634h2.mo531g(-1L);
                return;
        }
    }
}
