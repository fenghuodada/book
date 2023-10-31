package p060j$.util.stream;

import p060j$.util.InterfaceC10321P;
import p060j$.util.function.C10426e0;
import p060j$.util.function.InterfaceC10432h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.p1 */
/* loaded from: classes2.dex */
public final class C10673p1 extends AbstractC10683r1 implements InterfaceC10629g2 {

    /* renamed from: h */
    private final long[] f21229h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10673p1(InterfaceC10321P interfaceC10321P, AbstractC10707w0 abstractC10707w0, long[] jArr) {
        super(jArr.length, interfaceC10321P, abstractC10707w0);
        this.f21229h = jArr;
    }

    C10673p1(C10673p1 c10673p1, InterfaceC10321P interfaceC10321P, long j, long j2) {
        super(c10673p1, interfaceC10321P, j, j2, c10673p1.f21229h.length);
        this.f21229h = c10673p1.f21229h;
    }

    @Override // p060j$.util.stream.AbstractC10683r1
    /* renamed from: a */
    final AbstractC10683r1 mo626a(InterfaceC10321P interfaceC10321P, long j, long j2) {
        return new C10673p1(this, interfaceC10321P, j, j2);
    }

    @Override // p060j$.util.stream.AbstractC10683r1, p060j$.util.stream.InterfaceC10634h2
    public final void accept(long j) {
        int i = this.f21247f;
        if (i >= this.f21248g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f21247f));
        }
        long[] jArr = this.f21229h;
        this.f21247f = i + 1;
        jArr[i] = j;
    }

    @Override // p060j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo537m((Long) obj);
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10426e0(this, interfaceC10432h0);
    }

    @Override // p060j$.util.stream.InterfaceC10629g2
    /* renamed from: m */
    public final /* synthetic */ void mo537m(Long l) {
        AbstractC10707w0.m544w0(this, l);
    }
}
