package p060j$.util.stream;

import p060j$.util.function.BiConsumer;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10427f;

/* renamed from: j$.util.stream.F1 */
/* loaded from: classes2.dex */
final class C10510F1 extends AbstractC10707w0 {

    /* renamed from: h */
    final /* synthetic */ InterfaceC10427f f20984h;

    /* renamed from: i */
    final /* synthetic */ BiConsumer f20985i;

    /* renamed from: j */
    final /* synthetic */ InterfaceC10400O0 f20986j;

    /* renamed from: k */
    final /* synthetic */ InterfaceC10656m f20987k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10510F1(EnumC10591Y2 enumC10591Y2, InterfaceC10427f interfaceC10427f, BiConsumer biConsumer, InterfaceC10400O0 interfaceC10400O0, InterfaceC10656m interfaceC10656m) {
        super(enumC10591Y2);
        this.f20984h = interfaceC10427f;
        this.f20985i = biConsumer;
        this.f20986j = interfaceC10400O0;
        this.f20987k = interfaceC10656m;
    }

    @Override // p060j$.util.stream.AbstractC10707w0, p060j$.util.stream.InterfaceC10517G3
    /* renamed from: R */
    public final int mo582R() {
        if (((C10646k) this.f20987k).m674b().contains(EnumC10641j.UNORDERED)) {
            return EnumC10587X2.f21109r;
        }
        return 0;
    }

    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: w1 */
    public final InterfaceC10555P1 mo535w1() {
        return new C10515G1(this.f20986j, this.f20985i, this.f20984h);
    }
}
