package p060j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.c0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10422c0 implements LongBinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10424d0 f20901a;

    private /* synthetic */ C10422c0(InterfaceC10424d0 interfaceC10424d0) {
        this.f20901a = interfaceC10424d0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongBinaryOperator m889a(InterfaceC10424d0 interfaceC10424d0) {
        if (interfaceC10424d0 == null) {
            return null;
        }
        return interfaceC10424d0 instanceof C10420b0 ? ((C10420b0) interfaceC10424d0).f20898a : new C10422c0(interfaceC10424d0);
    }

    @Override // java.util.function.LongBinaryOperator
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.f20901a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10424d0 interfaceC10424d0 = this.f20901a;
        if (obj instanceof C10422c0) {
            obj = ((C10422c0) obj).f20901a;
        }
        return interfaceC10424d0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20901a.hashCode();
    }
}
