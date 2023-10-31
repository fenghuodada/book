package p060j$.util.stream;

import p060j$.util.function.InterfaceC10383G;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.I1 */
/* loaded from: classes2.dex */
public final class C10525I1 extends AbstractC10707w0 {

    /* renamed from: h */
    final /* synthetic */ InterfaceC10383G f21012h;

    /* renamed from: i */
    final /* synthetic */ int f21013i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10525I1(EnumC10591Y2 enumC10591Y2, InterfaceC10383G interfaceC10383G, int i) {
        super(enumC10591Y2);
        this.f21012h = interfaceC10383G;
        this.f21013i = i;
    }

    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: w1 */
    public final InterfaceC10555P1 mo535w1() {
        return new C10530J1(this.f21013i, this.f21012h);
    }
}
