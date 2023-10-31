package p060j$.util.stream;

import p060j$.util.function.InterfaceC10435j;

/* renamed from: j$.util.stream.y1 */
/* loaded from: classes2.dex */
final class C10718y1 extends AbstractC10707w0 {

    /* renamed from: h */
    final /* synthetic */ InterfaceC10435j f21310h;

    /* renamed from: i */
    final /* synthetic */ double f21311i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10718y1(EnumC10591Y2 enumC10591Y2, InterfaceC10435j interfaceC10435j, double d) {
        super(enumC10591Y2);
        this.f21310h = interfaceC10435j;
        this.f21311i = d;
    }

    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: w1 */
    public final InterfaceC10555P1 mo535w1() {
        return new C10723z1(this.f21311i, this.f21310h);
    }
}
