package p060j$.util.stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p060j$.util.InterfaceC10321P;
import p060j$.util.concurrent.ConcurrentHashMap;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r */
/* loaded from: classes2.dex */
public final class C10681r extends AbstractC10586X1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10681r(AbstractC10606c abstractC10606c, int i) {
        super(abstractC10606c, i);
    }

    /* renamed from: R1 */
    static C10529J0 m627R1(AbstractC10606c abstractC10606c, InterfaceC10321P interfaceC10321P) {
        C10566S1 c10566s1 = new C10566S1(11);
        C10566S1 c10566s12 = new C10566S1(12);
        return new C10529J0((Collection) new C10708w1(EnumC10591Y2.REFERENCE, new C10566S1(13), c10566s12, c10566s1, 3).mo600A(abstractC10606c, interfaceC10321P));
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: J1 */
    final InterfaceC10509F0 mo526J1(InterfaceC10321P interfaceC10321P, InterfaceC10397N interfaceC10397N, AbstractC10606c abstractC10606c) {
        if (EnumC10587X2.DISTINCT.m759d(abstractC10606c.mo564i1())) {
            return abstractC10606c.m726A1(interfaceC10321P, false, interfaceC10397N);
        }
        if (EnumC10587X2.ORDERED.m759d(abstractC10606c.mo564i1())) {
            return m627R1(abstractC10606c, interfaceC10321P);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new C10564S(new C10666o(0, atomicBoolean, concurrentHashMap), false).mo600A(abstractC10606c, interfaceC10321P);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new C10529J0(keySet);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: K1 */
    final InterfaceC10321P mo628K1(AbstractC10606c abstractC10606c, InterfaceC10321P interfaceC10321P) {
        return EnumC10587X2.DISTINCT.m759d(abstractC10606c.mo564i1()) ? abstractC10606c.m718Q1(interfaceC10321P) : EnumC10587X2.ORDERED.m759d(abstractC10606c.mo564i1()) ? m627R1(abstractC10606c, interfaceC10321P).spliterator() : new C10630g3(abstractC10606c.m718Q1(interfaceC10321P));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: M1 */
    public final InterfaceC10634h2 mo525M1(int i, InterfaceC10634h2 interfaceC10634h2) {
        interfaceC10634h2.getClass();
        return EnumC10587X2.DISTINCT.m759d(i) ? interfaceC10634h2 : EnumC10587X2.SORTED.m759d(i) ? new C10671p(interfaceC10634h2) : new C10676q(this, interfaceC10634h2);
    }
}
