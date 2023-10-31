package p060j$.util.function;

import java.util.function.ObjLongConsumer;

/* renamed from: j$.util.function.F0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10382F0 implements ObjLongConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10384G0 f20864a;

    private /* synthetic */ C10382F0(InterfaceC10384G0 interfaceC10384G0) {
        this.f20864a = interfaceC10384G0;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjLongConsumer m924a(InterfaceC10384G0 interfaceC10384G0) {
        if (interfaceC10384G0 == null) {
            return null;
        }
        return interfaceC10384G0 instanceof C10380E0 ? ((C10380E0) interfaceC10384G0).f20862a : new C10382F0(interfaceC10384G0);
    }

    @Override // java.util.function.ObjLongConsumer
    public final /* synthetic */ void accept(Object obj, long j) {
        this.f20864a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10384G0 interfaceC10384G0 = this.f20864a;
        if (obj instanceof C10382F0) {
            obj = ((C10382F0) obj).f20864a;
        }
        return interfaceC10384G0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20864a.hashCode();
    }
}
