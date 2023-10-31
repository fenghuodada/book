package p060j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10321P;
import p060j$.util.Optional;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.C10421c;
import p060j$.util.function.Consumer;
import p060j$.util.function.Function;
import p060j$.util.function.InterfaceC10394L0;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10427f;
import p060j$.util.function.ToDoubleFunction;
import p060j$.util.function.ToIntFunction;
import p060j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.Z1 */
/* loaded from: classes2.dex */
abstract class AbstractC10594Z1 extends AbstractC10606c implements InterfaceC10575U2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10594Z1(InterfaceC10321P interfaceC10321P, int i, boolean z) {
        super(interfaceC10321P, i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10594Z1(AbstractC10606c abstractC10606c, int i) {
        super(abstractC10606c, i);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: D1 */
    final InterfaceC10509F0 mo669D1(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m580S0(abstractC10707w0, interfaceC10321P, z, interfaceC10397N);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: E1 */
    final void mo668E1(InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2) {
        while (!interfaceC10634h2.mo530i() && interfaceC10321P.mo534a(interfaceC10634h2)) {
        }
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: F1 */
    final EnumC10591Y2 mo667F1() {
        return EnumC10591Y2.REFERENCE;
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: G */
    public final boolean mo753G(InterfaceC10394L0 interfaceC10394L0) {
        return ((Boolean) m725B1(AbstractC10707w0.m547u1(interfaceC10394L0, EnumC10692t0.ANY))).booleanValue();
    }

    /* renamed from: J */
    public void mo752J(Consumer consumer) {
        consumer.getClass();
        m725B1(new C10564S(consumer, true));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: K */
    public final Object mo751K(InterfaceC10400O0 interfaceC10400O0, BiConsumer biConsumer, BiConsumer biConsumer2) {
        interfaceC10400O0.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return m725B1(new C10708w1(EnumC10591Y2.REFERENCE, biConsumer2, biConsumer, interfaceC10400O0, 3));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: M */
    public final IntStream mo750M(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new C10711x(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, toIntFunction, 6);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: N */
    public final InterfaceC10575U2 mo749N(Function function) {
        function.getClass();
        return new C10578V1(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, function, 0);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: P */
    public final InterfaceC10575U2 mo748P(Function function) {
        function.getClass();
        return new C10578V1(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n | EnumC10587X2.f21111t, function, 1);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: P1 */
    final InterfaceC10321P mo666P1(AbstractC10707w0 abstractC10707w0, C10596a c10596a, boolean z) {
        return new C10507E3(abstractC10707w0, c10596a, z);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: Q */
    public final Optional mo747Q(InterfaceC10427f interfaceC10427f) {
        interfaceC10427f.getClass();
        return (Optional) m725B1(new C10485A1(EnumC10591Y2.REFERENCE, interfaceC10427f, 1));
    }

    /* renamed from: a */
    public void mo746a(Consumer consumer) {
        consumer.getClass();
        m725B1(new C10564S(consumer, false));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final long count() {
        return ((AbstractC10647k0) mo740l0(new C10566S1(1))).sum();
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: d */
    public final IntStream mo745d(Function function) {
        function.getClass();
        return new C10711x(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n | EnumC10587X2.f21111t, function, 7);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final InterfaceC10575U2 distinct() {
        return new C10681r(this, EnumC10587X2.f21104m | EnumC10587X2.f21111t);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: e0 */
    public final boolean mo744e0(InterfaceC10394L0 interfaceC10394L0) {
        return ((Boolean) m725B1(AbstractC10707w0.m547u1(interfaceC10394L0, EnumC10692t0.ALL))).booleanValue();
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: f0 */
    public final InterfaceC10662n0 mo743f0(Function function) {
        function.getClass();
        return new C10716y(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n | EnumC10587X2.f21111t, function, 6);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final Optional findAny() {
        return (Optional) m725B1(new C10518H(false, EnumC10591Y2.REFERENCE, Optional.m1027a(), new C10566S1(21), new C10601b(12)));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final Optional findFirst() {
        return (Optional) m725B1(new C10518H(true, EnumC10591Y2.REFERENCE, Optional.m1027a(), new C10566S1(21), new C10601b(12)));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: g */
    public final Object[] mo742g(InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m568e1(m724C1(interfaceC10397N), interfaceC10397N).mo617r(interfaceC10397N);
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final Iterator iterator() {
        return AbstractC10368e0.m941i(spliterator());
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: k0 */
    public final boolean mo741k0(InterfaceC10394L0 interfaceC10394L0) {
        return ((Boolean) m725B1(AbstractC10707w0.m547u1(interfaceC10394L0, EnumC10692t0.NONE))).booleanValue();
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: l0 */
    public final InterfaceC10662n0 mo740l0(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new C10716y(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, toLongFunction, 7);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final InterfaceC10575U2 limit(long j) {
        if (j >= 0) {
            return AbstractC10707w0.m545v1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return mo747Q(new C10421c(comparator, 0));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return mo747Q(new C10421c(comparator, 1));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: n */
    public final Object mo739n(Object obj, BiFunction biFunction, InterfaceC10427f interfaceC10427f) {
        biFunction.getClass();
        interfaceC10427f.getClass();
        return m725B1(new C10708w1(EnumC10591Y2.REFERENCE, interfaceC10427f, biFunction, obj, 2));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: n0 */
    public final InterfaceC10513G mo738n0(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new C10701v(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, toDoubleFunction, 6);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: p */
    public final InterfaceC10513G mo737p(Function function) {
        function.getClass();
        return new C10701v(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n | EnumC10587X2.f21111t, function, 7);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: q0 */
    public final Object mo736q0(Object obj, InterfaceC10427f interfaceC10427f) {
        interfaceC10427f.getClass();
        return m725B1(new C10708w1(EnumC10591Y2.REFERENCE, interfaceC10427f, interfaceC10427f, obj, 2));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final InterfaceC10575U2 skip(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : AbstractC10707w0.m545v1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final InterfaceC10575U2 sorted() {
        return new C10496C2(this);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final InterfaceC10575U2 sorted(Comparator comparator) {
        return new C10496C2(this, comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: t1 */
    public final InterfaceC10484A0 mo549t1(long j, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m581R0(j, interfaceC10397N);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final Object[] toArray() {
        return mo742g(new C10566S1(0));
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final InterfaceC10636i unordered() {
        return !m722H1() ? this : new C10574U1(this, EnumC10587X2.f21109r);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: v */
    public final InterfaceC10575U2 mo735v(InterfaceC10394L0 interfaceC10394L0) {
        interfaceC10394L0.getClass();
        return new C10706w(this, EnumC10587X2.f21111t, interfaceC10394L0, 4);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: x */
    public final InterfaceC10575U2 mo734x(Consumer consumer) {
        consumer.getClass();
        return new C10706w(this, 0, consumer, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo733y(p060j$.util.stream.InterfaceC10656m r8) {
        /*
            r7 = this;
            boolean r0 = r7.isParallel()
            if (r0 == 0) goto L3d
            r0 = r8
            j$.util.stream.k r0 = (p060j$.util.stream.C10646k) r0
            java.util.Set r1 = r0.m674b()
            j$.util.stream.j r2 = p060j$.util.stream.EnumC10641j.CONCURRENT
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L3d
            boolean r1 = r7.m722H1()
            if (r1 == 0) goto L27
            java.util.Set r1 = r0.m674b()
            j$.util.stream.j r2 = p060j$.util.stream.EnumC10641j.UNORDERED
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L3d
        L27:
            j$.util.function.O0 r1 = r0.m670f()
            java.lang.Object r1 = r1.get()
            j$.util.function.BiConsumer r0 = r0.m675a()
            j$.util.stream.o r2 = new j$.util.stream.o
            r3 = 5
            r2.<init>(r3, r0, r1)
            r7.mo746a(r2)
            goto L5c
        L3d:
            r8.getClass()
            r0 = r8
            j$.util.stream.k r0 = (p060j$.util.stream.C10646k) r0
            j$.util.function.O0 r5 = r0.m670f()
            j$.util.function.BiConsumer r4 = r0.m675a()
            j$.util.function.f r3 = r0.m673c()
            j$.util.stream.F1 r0 = new j$.util.stream.F1
            j$.util.stream.Y2 r2 = p060j$.util.stream.EnumC10591Y2.REFERENCE
            r1 = r0
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r7.m725B1(r0)
        L5c:
            j$.util.stream.k r8 = (p060j$.util.stream.C10646k) r8
            java.util.Set r0 = r8.m674b()
            j$.util.stream.j r2 = p060j$.util.stream.EnumC10641j.IDENTITY_FINISH
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L6b
            goto L73
        L6b:
            j$.util.function.Function r8 = r8.m671e()
            java.lang.Object r1 = r8.apply(r1)
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p060j$.util.stream.AbstractC10594Z1.mo733y(j$.util.stream.m):java.lang.Object");
    }
}
