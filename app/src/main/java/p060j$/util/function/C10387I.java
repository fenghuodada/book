package p060j$.util.function;

import java.util.function.IntConsumer;

/* renamed from: j$.util.function.I */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10387I implements InterfaceC10391K {

    /* renamed from: a */
    public final /* synthetic */ IntConsumer f20871a;

    private /* synthetic */ C10387I(IntConsumer intConsumer) {
        this.f20871a = intConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10391K m923a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof C10389J ? ((C10389J) intConsumer).f20873a : new C10387I(intConsumer);
    }

    @Override // p060j$.util.function.InterfaceC10391K
    public final /* synthetic */ void accept(int i) {
        this.f20871a.accept(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10387I) {
            obj = ((C10387I) obj).f20871a;
        }
        return this.f20871a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20871a.hashCode();
    }

    @Override // p060j$.util.function.InterfaceC10391K
    /* renamed from: o */
    public final /* synthetic */ InterfaceC10391K mo536o(InterfaceC10391K interfaceC10391K) {
        return m923a(this.f20871a.andThen(C10389J.m922a(interfaceC10391K)));
    }
}
