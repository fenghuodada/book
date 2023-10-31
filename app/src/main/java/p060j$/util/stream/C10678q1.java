package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q1 */
/* loaded from: classes2.dex */
public final class C10678q1 extends AbstractC10683r1 {

    /* renamed from: h */
    private final Object[] f21238h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10678q1(InterfaceC10321P interfaceC10321P, AbstractC10707w0 abstractC10707w0, Object[] objArr) {
        super(objArr.length, interfaceC10321P, abstractC10707w0);
        this.f21238h = objArr;
    }

    C10678q1(C10678q1 c10678q1, InterfaceC10321P interfaceC10321P, long j, long j2) {
        super(c10678q1, interfaceC10321P, j, j2, c10678q1.f21238h.length);
        this.f21238h = c10678q1.f21238h;
    }

    @Override // p060j$.util.stream.AbstractC10683r1
    /* renamed from: a */
    final AbstractC10683r1 mo626a(InterfaceC10321P interfaceC10321P, long j, long j2) {
        return new C10678q1(this, interfaceC10321P, j, j2);
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f21247f;
        if (i >= this.f21248g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f21247f));
        }
        Object[] objArr = this.f21238h;
        this.f21247f = i + 1;
        objArr[i] = obj;
    }
}
