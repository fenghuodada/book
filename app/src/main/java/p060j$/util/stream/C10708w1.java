package p060j$.util.stream;

import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.InterfaceC10372A0;
import p060j$.util.function.InterfaceC10378D0;
import p060j$.util.function.InterfaceC10384G0;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10427f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w1 */
/* loaded from: classes2.dex */
public final class C10708w1 extends AbstractC10707w0 {

    /* renamed from: h */
    public final /* synthetic */ int f21295h;

    /* renamed from: i */
    final /* synthetic */ Object f21296i;

    /* renamed from: j */
    final /* synthetic */ Object f21297j;

    /* renamed from: k */
    final /* synthetic */ Object f21298k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10708w1(EnumC10591Y2 enumC10591Y2, Object obj, Object obj2, Object obj3, int i) {
        super(enumC10591Y2);
        this.f21295h = i;
        this.f21296i = obj;
        this.f21298k = obj2;
        this.f21297j = obj3;
    }

    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: w1 */
    public final InterfaceC10555P1 mo535w1() {
        int i = this.f21295h;
        Object obj = this.f21296i;
        Object obj2 = this.f21298k;
        Object obj3 = this.f21297j;
        switch (i) {
            case 0:
                return new C10713x1((InterfaceC10400O0) obj3, (InterfaceC10384G0) obj2, (InterfaceC10427f) obj);
            case 1:
                return new C10495C1((InterfaceC10400O0) obj3, (InterfaceC10372A0) obj2, (InterfaceC10427f) obj);
            case 2:
                return new C10500D1(obj3, (BiFunction) obj2, (InterfaceC10427f) obj);
            case 3:
                return new C10520H1((InterfaceC10400O0) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new C10539L1((InterfaceC10400O0) obj3, (InterfaceC10378D0) obj2, (InterfaceC10427f) obj);
        }
    }
}
