package p060j$.util.stream;

import java.util.Arrays;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10397N;

/* renamed from: j$.util.stream.B2 */
/* loaded from: classes2.dex */
final class C10491B2 extends AbstractC10637i0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10491B2(AbstractC10606c abstractC10606c) {
        super(abstractC10606c, EnumC10587X2.f21108q | EnumC10587X2.f21106o);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: J1 */
    public final InterfaceC10509F0 mo526J1(InterfaceC10321P interfaceC10321P, InterfaceC10397N interfaceC10397N, AbstractC10606c abstractC10606c) {
        if (EnumC10587X2.SORTED.m759d(abstractC10606c.mo564i1())) {
            return abstractC10606c.m726A1(interfaceC10321P, false, interfaceC10397N);
        }
        long[] jArr = (long[]) ((InterfaceC10499D0) abstractC10606c.m726A1(interfaceC10321P, true, interfaceC10397N)).mo655c();
        Arrays.sort(jArr);
        return new C10648k1(jArr);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: M1 */
    public final InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2) {
        interfaceC10634h2.getClass();
        return EnumC10587X2.SORTED.m759d(i) ? interfaceC10634h2 : EnumC10587X2.SIZED.m759d(i) ? new C10516G2(interfaceC10634h2) : new C10719y2(interfaceC10634h2);
    }
}
