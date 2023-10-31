package p060j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.g0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10430g0 implements LongConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10432h0 f20908a;

    private /* synthetic */ C10430g0(InterfaceC10432h0 interfaceC10432h0) {
        this.f20908a = interfaceC10432h0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongConsumer m884a(InterfaceC10432h0 interfaceC10432h0) {
        if (interfaceC10432h0 == null) {
            return null;
        }
        return interfaceC10432h0 instanceof C10428f0 ? ((C10428f0) interfaceC10432h0).f20906a : new C10430g0(interfaceC10432h0);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        this.f20908a.accept(j);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return m884a(this.f20908a.mo514j(C10428f0.m886a(longConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10432h0 interfaceC10432h0 = this.f20908a;
        if (obj instanceof C10430g0) {
            obj = ((C10430g0) obj).f20908a;
        }
        return interfaceC10432h0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20908a.hashCode();
    }
}
