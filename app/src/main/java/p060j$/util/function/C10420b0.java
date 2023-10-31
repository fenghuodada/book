package p060j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.b0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10420b0 implements InterfaceC10424d0 {

    /* renamed from: a */
    public final /* synthetic */ LongBinaryOperator f20898a;

    private /* synthetic */ C10420b0(LongBinaryOperator longBinaryOperator) {
        this.f20898a = longBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC10424d0 m890a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return longBinaryOperator instanceof C10422c0 ? ((C10422c0) longBinaryOperator).f20901a : new C10420b0(longBinaryOperator);
    }

    @Override // p060j$.util.function.InterfaceC10424d0
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.f20898a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10420b0) {
            obj = ((C10420b0) obj).f20898a;
        }
        return this.f20898a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20898a.hashCode();
    }
}
