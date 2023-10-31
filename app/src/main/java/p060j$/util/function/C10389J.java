package p060j$.util.function;

import java.util.function.IntConsumer;

/* renamed from: j$.util.function.J */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10389J implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10391K f20873a;

    private /* synthetic */ C10389J(InterfaceC10391K interfaceC10391K) {
        this.f20873a = interfaceC10391K;
    }

    /* renamed from: a */
    public static /* synthetic */ IntConsumer m922a(InterfaceC10391K interfaceC10391K) {
        if (interfaceC10391K == null) {
            return null;
        }
        return interfaceC10391K instanceof C10387I ? ((C10387I) interfaceC10391K).f20871a : new C10389J(interfaceC10391K);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        this.f20873a.accept(i);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return m922a(this.f20873a.mo536o(C10387I.m923a(intConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10391K interfaceC10391K = this.f20873a;
        if (obj instanceof C10389J) {
            obj = ((C10389J) obj).f20873a;
        }
        return interfaceC10391K.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20873a.hashCode();
    }
}
