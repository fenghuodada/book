package p060j$.util.stream;

import p060j$.util.function.InterfaceC10383G;
import p060j$.util.function.InterfaceC10424d0;
import p060j$.util.function.InterfaceC10427f;
import p060j$.util.function.InterfaceC10435j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.A1 */
/* loaded from: classes2.dex */
public final class C10485A1 extends AbstractC10707w0 {

    /* renamed from: h */
    public final /* synthetic */ int f20955h;

    /* renamed from: i */
    final /* synthetic */ Object f20956i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10485A1(EnumC10591Y2 enumC10591Y2, Object obj, int i) {
        super(enumC10591Y2);
        this.f20955h = i;
        this.f20956i = obj;
    }

    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: w1 */
    public final InterfaceC10555P1 mo535w1() {
        int i = this.f20955h;
        Object obj = this.f20956i;
        switch (i) {
            case 0:
                return new C10490B1((InterfaceC10435j) obj);
            case 1:
                return new C10505E1((InterfaceC10427f) obj);
            case 2:
                return new C10535K1((InterfaceC10383G) obj);
            default:
                return new C10551O1((InterfaceC10424d0) obj);
        }
    }
}
