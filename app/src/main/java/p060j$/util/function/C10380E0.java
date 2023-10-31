package p060j$.util.function;

import java.util.function.ObjLongConsumer;

/* renamed from: j$.util.function.E0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10380E0 implements InterfaceC10384G0 {

    /* renamed from: a */
    public final /* synthetic */ ObjLongConsumer f20862a;

    private /* synthetic */ C10380E0(ObjLongConsumer objLongConsumer) {
        this.f20862a = objLongConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10384G0 m926a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return objLongConsumer instanceof C10382F0 ? ((C10382F0) objLongConsumer).f20864a : new C10380E0(objLongConsumer);
    }

    @Override // p060j$.util.function.InterfaceC10384G0
    public final /* synthetic */ void accept(Object obj, long j) {
        this.f20862a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10380E0) {
            obj = ((C10380E0) obj).f20862a;
        }
        return this.f20862a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20862a.hashCode();
    }
}
