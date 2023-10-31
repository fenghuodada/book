package p060j$.util.stream;

import okhttp3.internal.http2.Http2;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n2 */
/* loaded from: classes2.dex */
public final class C10664n2 extends AbstractC10637i0 {

    /* renamed from: s */
    final /* synthetic */ long f21213s;

    /* renamed from: t */
    final /* synthetic */ long f21214t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10664n2(AbstractC10606c abstractC10606c, int i, long j, long j2) {
        super(abstractC10606c, i);
        this.f21213s = j;
        this.f21214t = j2;
    }

    /* renamed from: T1 */
    static InterfaceC10315J m631T1(InterfaceC10315J interfaceC10315J, long j, long j2, long j3) {
        long j4;
        long j5;
        if (j <= j3) {
            long j6 = j3 - j;
            j5 = j2 >= 0 ? Math.min(j2, j6) : j6;
            j4 = 0;
        } else {
            j4 = j;
            j5 = j2;
        }
        return new C10720y3(interfaceC10315J, j4, j5);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: J1 */
    final InterfaceC10509F0 mo526J1(InterfaceC10321P interfaceC10321P, InterfaceC10397N interfaceC10397N, AbstractC10606c abstractC10606c) {
        long mo570c1 = abstractC10606c.mo570c1(interfaceC10321P);
        return (mo570c1 <= 0 || !interfaceC10321P.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) ? !EnumC10587X2.ORDERED.m759d(abstractC10606c.mo564i1()) ? AbstractC10707w0.m577V0(this, m631T1((InterfaceC10315J) abstractC10606c.m718Q1(interfaceC10321P), this.f21213s, this.f21214t, mo570c1), true) : (InterfaceC10509F0) new C10684r2(this, abstractC10606c, interfaceC10321P, interfaceC10397N, this.f21213s, this.f21214t).invoke() : AbstractC10707w0.m577V0(abstractC10606c, AbstractC10707w0.m587M0(abstractC10606c.m723G1(), interfaceC10321P, this.f21213s, this.f21214t), true);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: K1 */
    final InterfaceC10321P mo628K1(AbstractC10606c abstractC10606c, InterfaceC10321P interfaceC10321P) {
        long mo570c1 = abstractC10606c.mo570c1(interfaceC10321P);
        if (mo570c1 <= 0 || !interfaceC10321P.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            return !EnumC10587X2.ORDERED.m759d(abstractC10606c.mo564i1()) ? m631T1((InterfaceC10315J) abstractC10606c.m718Q1(interfaceC10321P), this.f21213s, this.f21214t, mo570c1) : ((InterfaceC10509F0) new C10684r2(this, abstractC10606c, interfaceC10321P, new C10566S1(4), this.f21213s, this.f21214t).invoke()).spliterator();
        }
        long j = this.f21213s;
        return new C10690s3((InterfaceC10315J) abstractC10606c.m718Q1(interfaceC10321P), j, AbstractC10707w0.m588L0(j, this.f21214t));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: M1 */
    public final InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2) {
        return new C10659m2(this, interfaceC10634h2);
    }
}
