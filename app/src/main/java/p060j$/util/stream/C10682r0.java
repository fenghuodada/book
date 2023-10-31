package p060j$.util.stream;

import p060j$.util.function.C10437k;
import p060j$.util.function.C10451r;
import p060j$.util.function.InterfaceC10443n;
import p060j$.util.function.InterfaceC10455t;

/* renamed from: j$.util.stream.r0 */
/* loaded from: classes2.dex */
final class C10682r0 extends AbstractC10687s0 implements InterfaceC10619e2 {

    /* renamed from: c */
    final /* synthetic */ EnumC10692t0 f21240c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC10455t f21241d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10682r0(InterfaceC10455t interfaceC10455t, EnumC10692t0 enumC10692t0) {
        super(enumC10692t0);
        this.f21240c = enumC10692t0;
        this.f21241d = interfaceC10455t;
    }

    @Override // p060j$.util.stream.AbstractC10687s0, p060j$.util.stream.InterfaceC10634h2, p060j$.util.stream.InterfaceC10619e2, p060j$.util.function.InterfaceC10443n
    public final void accept(double d) {
        boolean z;
        boolean z2;
        if (this.f21258a) {
            return;
        }
        boolean m862e = ((C10451r) this.f21241d).m862e(d);
        EnumC10692t0 enumC10692t0 = this.f21240c;
        z = enumC10692t0.f21264a;
        if (m862e == z) {
            this.f21258a = true;
            z2 = enumC10692t0.f21265b;
            this.f21259b = z2;
        }
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
