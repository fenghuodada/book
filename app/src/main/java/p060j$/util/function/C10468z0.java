package p060j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* renamed from: j$.util.function.z0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10468z0 implements ObjDoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10372A0 f20937a;

    private /* synthetic */ C10468z0(InterfaceC10372A0 interfaceC10372A0) {
        this.f20937a = interfaceC10372A0;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjDoubleConsumer m849a(InterfaceC10372A0 interfaceC10372A0) {
        if (interfaceC10372A0 == null) {
            return null;
        }
        return interfaceC10372A0 instanceof C10466y0 ? ((C10466y0) interfaceC10372A0).f20936a : new C10468z0(interfaceC10372A0);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final /* synthetic */ void accept(Object obj, double d) {
        this.f20937a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10372A0 interfaceC10372A0 = this.f20937a;
        if (obj instanceof C10468z0) {
            obj = ((C10468z0) obj).f20937a;
        }
        return interfaceC10372A0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20937a.hashCode();
    }
}
