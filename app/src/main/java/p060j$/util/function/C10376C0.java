package p060j$.util.function;

import java.util.function.ObjIntConsumer;

/* renamed from: j$.util.function.C0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10376C0 implements ObjIntConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10378D0 f20858a;

    private /* synthetic */ C10376C0(InterfaceC10378D0 interfaceC10378D0) {
        this.f20858a = interfaceC10378D0;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjIntConsumer m929a(InterfaceC10378D0 interfaceC10378D0) {
        if (interfaceC10378D0 == null) {
            return null;
        }
        return interfaceC10378D0 instanceof C10374B0 ? ((C10374B0) interfaceC10378D0).f20855a : new C10376C0(interfaceC10378D0);
    }

    @Override // java.util.function.ObjIntConsumer
    public final /* synthetic */ void accept(Object obj, int i) {
        this.f20858a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10378D0 interfaceC10378D0 = this.f20858a;
        if (obj instanceof C10376C0) {
            obj = ((C10376C0) obj).f20858a;
        }
        return interfaceC10378D0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20858a.hashCode();
    }
}
