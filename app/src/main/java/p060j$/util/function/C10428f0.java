package p060j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.f0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10428f0 implements InterfaceC10432h0 {

    /* renamed from: a */
    public final /* synthetic */ LongConsumer f20906a;

    private /* synthetic */ C10428f0(LongConsumer longConsumer) {
        this.f20906a = longConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10432h0 m886a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return longConsumer instanceof C10430g0 ? ((C10430g0) longConsumer).f20908a : new C10428f0(longConsumer);
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    public final /* synthetic */ void accept(long j) {
        this.f20906a.accept(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10428f0) {
            obj = ((C10428f0) obj).f20906a;
        }
        return this.f20906a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20906a.hashCode();
    }

    @Override // p060j$.util.function.InterfaceC10432h0
    /* renamed from: j */
    public final /* synthetic */ InterfaceC10432h0 mo514j(InterfaceC10432h0 interfaceC10432h0) {
        return m886a(this.f20906a.andThen(C10430g0.m884a(interfaceC10432h0)));
    }
}
