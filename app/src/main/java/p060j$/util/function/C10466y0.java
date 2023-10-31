package p060j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* renamed from: j$.util.function.y0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10466y0 implements InterfaceC10372A0 {

    /* renamed from: a */
    public final /* synthetic */ ObjDoubleConsumer f20936a;

    private /* synthetic */ C10466y0(ObjDoubleConsumer objDoubleConsumer) {
        this.f20936a = objDoubleConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10372A0 m850a(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return objDoubleConsumer instanceof C10468z0 ? ((C10468z0) objDoubleConsumer).f20937a : new C10466y0(objDoubleConsumer);
    }

    @Override // p060j$.util.function.InterfaceC10372A0
    public final /* synthetic */ void accept(Object obj, double d) {
        this.f20936a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10466y0) {
            obj = ((C10466y0) obj).f20936a;
        }
        return this.f20936a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20936a.hashCode();
    }
}
