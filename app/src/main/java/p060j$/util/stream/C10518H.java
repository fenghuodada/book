package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10394L0;
import p060j$.util.function.InterfaceC10400O0;

/* renamed from: j$.util.stream.H */
/* loaded from: classes2.dex */
final class C10518H implements InterfaceC10517G3 {

    /* renamed from: a */
    final boolean f20998a;

    /* renamed from: b */
    final Object f20999b;

    /* renamed from: c */
    final InterfaceC10394L0 f21000c;

    /* renamed from: d */
    final InterfaceC10400O0 f21001d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10518H(boolean z, EnumC10591Y2 enumC10591Y2, Object obj, C10566S1 c10566s1, C10601b c10601b) {
        this.f20998a = z;
        this.f20999b = obj;
        this.f21000c = c10566s1;
        this.f21001d = c10601b;
    }

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: A */
    public final Object mo600A(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        return new C10545N(this, abstractC10707w0, interfaceC10321P).invoke();
    }

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: R */
    public final int mo582R() {
        return EnumC10587X2.f21112u | (this.f20998a ? 0 : EnumC10587X2.f21109r);
    }

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: p0 */
    public final Object mo557p0(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        InterfaceC10522H3 interfaceC10522H3 = (InterfaceC10522H3) this.f21001d.get();
        abstractC10707w0.mo540y1(interfaceC10321P, interfaceC10522H3);
        Object obj = interfaceC10522H3.get();
        return obj != null ? obj : this.f20999b;
    }
}
