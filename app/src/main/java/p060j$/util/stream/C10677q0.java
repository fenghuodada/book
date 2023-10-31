package p060j$.util.stream;

import p060j$.util.function.C10426e0;
import p060j$.util.function.C10440l0;
import p060j$.util.function.InterfaceC10432h0;
import p060j$.util.function.InterfaceC10444n0;

/* renamed from: j$.util.stream.q0 */
/* loaded from: classes2.dex */
final class C10677q0 extends AbstractC10687s0 implements InterfaceC10629g2 {

    /* renamed from: c */
    final /* synthetic */ EnumC10692t0 f21236c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC10444n0 f21237d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10677q0(InterfaceC10444n0 interfaceC10444n0, EnumC10692t0 enumC10692t0) {
        super(enumC10692t0);
        this.f21236c = enumC10692t0;
        this.f21237d = interfaceC10444n0;
    }

    @Override // p060j$.util.stream.AbstractC10687s0, p060j$.util.stream.InterfaceC10634h2
    public final void accept(long j) {
        boolean z;
        boolean z2;
        if (this.f21258a) {
            return;
        }
        boolean m874e = ((C10440l0) this.f21237d).m874e(j);
        EnumC10692t0 enumC10692t0 = this.f21236c;
        z = enumC10692t0.f21264a;
        if (m874e == z) {
            this.f21258a = true;
            z2 = enumC10692t0.f21265b;
            this.f21259b = z2;
        }
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo537m((Long) obj);
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }

    @Override // p060j$.util.stream.InterfaceC10629g2
    /* renamed from: m */
    public final /* synthetic */ void mo537m(Long l) {
        AbstractC10707w0.m544w0(this, l);
    }
}
