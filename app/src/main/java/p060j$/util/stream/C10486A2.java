package p060j$.util.stream;

import java.util.Arrays;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10397N;

/* renamed from: j$.util.stream.A2 */
/* loaded from: classes2.dex */
final class C10486A2 extends AbstractC10602b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10486A2(AbstractC10606c abstractC10606c) {
        super(abstractC10606c, EnumC10587X2.f21108q | EnumC10587X2.f21106o);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: J1 */
    public final InterfaceC10509F0 mo526J1(InterfaceC10321P interfaceC10321P, InterfaceC10397N interfaceC10397N, AbstractC10606c abstractC10606c) {
        if (EnumC10587X2.SORTED.m759d(abstractC10606c.mo564i1())) {
            return abstractC10606c.m726A1(interfaceC10321P, false, interfaceC10397N);
        }
        int[] iArr = (int[]) ((InterfaceC10494C0) abstractC10606c.m726A1(interfaceC10321P, true, interfaceC10397N)).mo655c();
        Arrays.sort(iArr);
        return new C10603b1(iArr);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: M1 */
    public final InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2) {
        interfaceC10634h2.getClass();
        return EnumC10587X2.SORTED.m759d(i) ? interfaceC10634h2 : EnumC10587X2.SIZED.m759d(i) ? new C10511F2(interfaceC10634h2) : new C10714x2(interfaceC10634h2);
    }
}
