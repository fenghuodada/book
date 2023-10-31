package p060j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
import p060j$.util.Comparator;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10397N;

/* renamed from: j$.util.stream.C2 */
/* loaded from: classes2.dex */
final class C10496C2 extends AbstractC10586X1 {

    /* renamed from: s */
    private final boolean f20965s;

    /* renamed from: t */
    private final Comparator f20966t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10496C2(AbstractC10606c abstractC10606c) {
        super(abstractC10606c, EnumC10587X2.f21108q | EnumC10587X2.f21106o);
        this.f20965s = true;
        this.f20966t = Comparator.CC.m1040a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10496C2(AbstractC10606c abstractC10606c, java.util.Comparator comparator) {
        super(abstractC10606c, EnumC10587X2.f21108q | EnumC10587X2.f21107p);
        this.f20965s = false;
        comparator.getClass();
        this.f20966t = comparator;
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: J1 */
    public final InterfaceC10509F0 mo526J1(InterfaceC10321P interfaceC10321P, InterfaceC10397N interfaceC10397N, AbstractC10606c abstractC10606c) {
        if (EnumC10587X2.SORTED.m759d(abstractC10606c.mo564i1()) && this.f20965s) {
            return abstractC10606c.m726A1(interfaceC10321P, false, interfaceC10397N);
        }
        Object[] mo617r = abstractC10606c.m726A1(interfaceC10321P, true, interfaceC10397N).mo617r(interfaceC10397N);
        Arrays.sort(mo617r, this.f20966t);
        return new C10524I0(mo617r);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: M1 */
    public final InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2) {
        interfaceC10634h2.getClass();
        if (EnumC10587X2.SORTED.m759d(i) && this.f20965s) {
            return interfaceC10634h2;
        }
        boolean m759d = EnumC10587X2.SIZED.m759d(i);
        java.util.Comparator comparator = this.f20966t;
        return m759d ? new C10521H2(interfaceC10634h2, comparator) : new C10501D2(interfaceC10634h2, comparator);
    }
}
