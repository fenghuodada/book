package p060j$.util.function;

import java.util.function.ObjIntConsumer;

/* renamed from: j$.util.function.B0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10374B0 implements InterfaceC10378D0 {

    /* renamed from: a */
    public final /* synthetic */ ObjIntConsumer f20855a;

    private /* synthetic */ C10374B0(ObjIntConsumer objIntConsumer) {
        this.f20855a = objIntConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10378D0 m930a(ObjIntConsumer objIntConsumer) {
        if (objIntConsumer == null) {
            return null;
        }
        return objIntConsumer instanceof C10376C0 ? ((C10376C0) objIntConsumer).f20858a : new C10374B0(objIntConsumer);
    }

    @Override // p060j$.util.function.InterfaceC10378D0
    public final /* synthetic */ void accept(Object obj, int i) {
        this.f20855a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10374B0) {
            obj = ((C10374B0) obj).f20855a;
        }
        return this.f20855a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20855a.hashCode();
    }
}
