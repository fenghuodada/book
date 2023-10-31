package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.function.C10385H;
import p060j$.util.function.InterfaceC10391K;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.o1 */
/* loaded from: classes2.dex */
public final class C10668o1 extends AbstractC10683r1 implements InterfaceC10624f2 {

    /* renamed from: h */
    private final int[] f21221h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10668o1(InterfaceC10321P interfaceC10321P, AbstractC10707w0 abstractC10707w0, int[] iArr) {
        super(iArr.length, interfaceC10321P, abstractC10707w0);
        this.f21221h = iArr;
    }

    C10668o1(C10668o1 c10668o1, InterfaceC10321P interfaceC10321P, long j, long j2) {
        super(c10668o1, interfaceC10321P, j, j2, c10668o1.f21221h.length);
        this.f21221h = c10668o1.f21221h;
    }

    @Override // p060j$.util.stream.AbstractC10683r1
    /* renamed from: a */
    final AbstractC10683r1 mo626a(InterfaceC10321P interfaceC10321P, long j, long j2) {
        return new C10668o1(this, interfaceC10321P, j, j2);
    }

    @Override // p060j$.util.stream.AbstractC10683r1, p060j$.util.stream.InterfaceC10634h2
    public final void accept(int i) {
        int i2 = this.f21247f;
        if (i2 >= this.f21248g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f21247f));
        }
        int[] iArr = this.f21221h;
        this.f21247f = i2 + 1;
        iArr[i2] = i;
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo630h((Integer) obj);
    }

    @Override // p060j$.util.stream.InterfaceC10624f2
    /* renamed from: h */
    public final /* synthetic */ void mo630h(Integer num) {
        AbstractC10707w0.m548u0(this, num);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10385H(this, interfaceC10391K);
    }
}
