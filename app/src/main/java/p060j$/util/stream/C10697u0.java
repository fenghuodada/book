package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10400O0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u0 */
/* loaded from: classes2.dex */
public final class C10697u0 implements InterfaceC10517G3 {

    /* renamed from: a */
    final EnumC10692t0 f21269a;

    /* renamed from: b */
    final InterfaceC10400O0 f21270b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10697u0(EnumC10591Y2 enumC10591Y2, EnumC10692t0 enumC10692t0, C10666o c10666o) {
        this.f21269a = enumC10692t0;
        this.f21270b = c10666o;
    }

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: A */
    public final Object mo600A(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        return (Boolean) new C10702v0(this, abstractC10707w0, interfaceC10321P).invoke();
    }

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: R */
    public final int mo582R() {
        return EnumC10587X2.f21112u | EnumC10587X2.f21109r;
    }

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: p0 */
    public final Object mo557p0(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        AbstractC10687s0 abstractC10687s0 = (AbstractC10687s0) this.f21270b.get();
        abstractC10707w0.mo540y1(interfaceC10321P, abstractC10687s0);
        return Boolean.valueOf(abstractC10687s0.f21259b);
    }
}
