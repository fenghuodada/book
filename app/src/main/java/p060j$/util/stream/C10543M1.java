package p060j$.util.stream;

import p060j$.util.function.InterfaceC10424d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.M1 */
/* loaded from: classes2.dex */
public final class C10543M1 extends AbstractC10707w0 {

    /* renamed from: h */
    final /* synthetic */ InterfaceC10424d0 f21042h;

    /* renamed from: i */
    final /* synthetic */ long f21043i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10543M1(EnumC10591Y2 enumC10591Y2, InterfaceC10424d0 interfaceC10424d0, long j) {
        super(enumC10591Y2);
        this.f21042h = interfaceC10424d0;
        this.f21043i = j;
    }

    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: w1 */
    public final InterfaceC10555P1 mo535w1() {
        return new C10547N1(this.f21043i, this.f21042h);
    }
}
