package p060j$.util.stream;

import p060j$.util.AbstractC10368e0;
import p060j$.util.C10472i;
import p060j$.util.C10474k;
import p060j$.util.C10476m;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10321P;
import p060j$.util.InterfaceC10731y;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.InterfaceC10384G0;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10424d0;
import p060j$.util.function.InterfaceC10432h0;
import p060j$.util.function.InterfaceC10438k0;
import p060j$.util.function.InterfaceC10444n0;
import p060j$.util.function.InterfaceC10450q0;
import p060j$.util.function.InterfaceC10456t0;
import p060j$.util.function.InterfaceC10464x0;

/* renamed from: j$.util.stream.k0 */
/* loaded from: classes2.dex */
abstract class AbstractC10647k0 extends AbstractC10606c implements InterfaceC10662n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10647k0(InterfaceC10321P interfaceC10321P, int i) {
        super(interfaceC10321P, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10647k0(AbstractC10606c abstractC10606c, int i) {
        super(abstractC10606c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public static InterfaceC10315J m664S1(InterfaceC10321P interfaceC10321P) {
        if (interfaceC10321P instanceof InterfaceC10315J) {
            return (InterfaceC10315J) interfaceC10321P;
        }
        if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(AbstractC10606c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* renamed from: B */
    public void mo646B(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        m725B1(new C10557Q(interfaceC10432h0, true));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: C */
    public final Object mo645C(InterfaceC10400O0 interfaceC10400O0, InterfaceC10384G0 interfaceC10384G0, BiConsumer biConsumer) {
        C10686s c10686s = new C10686s(biConsumer, 2);
        interfaceC10400O0.getClass();
        interfaceC10384G0.getClass();
        return m725B1(new C10708w1(EnumC10591Y2.LONG_VALUE, c10686s, interfaceC10384G0, interfaceC10400O0, 0));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: D */
    public final boolean mo644D(InterfaceC10444n0 interfaceC10444n0) {
        return ((Boolean) m725B1(AbstractC10707w0.m551s1(interfaceC10444n0, EnumC10692t0.ALL))).booleanValue();
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: D1 */
    final InterfaceC10509F0 mo669D1(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m577V0(abstractC10707w0, interfaceC10321P, z);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: E1 */
    final void mo668E1(InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2) {
        InterfaceC10432h0 c10617e0;
        InterfaceC10315J m664S1 = m664S1(interfaceC10321P);
        if (interfaceC10634h2 instanceof InterfaceC10432h0) {
            c10617e0 = (InterfaceC10432h0) interfaceC10634h2;
        } else if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(AbstractC10606c.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        } else {
            interfaceC10634h2.getClass();
            c10617e0 = new C10617e0(0, interfaceC10634h2);
        }
        while (!interfaceC10634h2.mo530i() && m664S1.mo650f(c10617e0)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: F1 */
    public final EnumC10591Y2 mo667F1() {
        return EnumC10591Y2.LONG_VALUE;
    }

    /* renamed from: I */
    public void mo643I(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        m725B1(new C10557Q(interfaceC10432h0, false));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: O */
    public final InterfaceC10513G mo642O(InterfaceC10450q0 interfaceC10450q0) {
        interfaceC10450q0.getClass();
        return new C10701v(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10450q0, 5);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: P1 */
    final InterfaceC10321P mo666P1(AbstractC10707w0 abstractC10707w0, C10596a c10596a, boolean z) {
        return new C10660m3(abstractC10707w0, c10596a, z);
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: S */
    public final InterfaceC10662n0 mo641S(InterfaceC10464x0 interfaceC10464x0) {
        interfaceC10464x0.getClass();
        return new C10716y(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10464x0, 2);
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: Z */
    public final IntStream mo640Z(InterfaceC10456t0 interfaceC10456t0) {
        interfaceC10456t0.getClass();
        return new C10711x(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10456t0, 5);
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: a0 */
    public final InterfaceC10575U2 mo639a0(InterfaceC10438k0 interfaceC10438k0) {
        interfaceC10438k0.getClass();
        return new C10706w(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10438k0, 2);
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final InterfaceC10513G asDoubleStream() {
        return new C10721z(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, 2);
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final C10474k average() {
        long[] jArr = (long[]) mo645C(new C10601b(24), new C10601b(25), new C10601b(26));
        long j = jArr[0];
        return j > 0 ? C10474k.m833d(jArr[1] / j) : C10474k.m836a();
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: b */
    public final boolean mo638b(InterfaceC10444n0 interfaceC10444n0) {
        return ((Boolean) m725B1(AbstractC10707w0.m551s1(interfaceC10444n0, EnumC10692t0.NONE))).booleanValue();
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final InterfaceC10575U2 boxed() {
        return mo639a0(new C10622f0(1));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final long count() {
        return ((AbstractC10647k0) mo641S(new C10601b(21))).sum();
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final InterfaceC10662n0 distinct() {
        return ((AbstractC10594Z1) ((AbstractC10594Z1) boxed()).distinct()).mo740l0(new C10601b(22));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: f */
    public final C10476m mo637f(InterfaceC10424d0 interfaceC10424d0) {
        interfaceC10424d0.getClass();
        return (C10476m) m725B1(new C10485A1(EnumC10591Y2.LONG_VALUE, interfaceC10424d0, 3));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final C10476m findAny() {
        return (C10476m) m725B1(new C10518H(false, EnumC10591Y2.LONG_VALUE, C10476m.m828a(), new C10566S1(20), new C10601b(11)));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final C10476m findFirst() {
        return (C10476m) m725B1(new C10518H(true, EnumC10591Y2.LONG_VALUE, C10476m.m828a(), new C10566S1(20), new C10601b(11)));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: h */
    public final InterfaceC10662n0 mo636h(InterfaceC10432h0 interfaceC10432h0) {
        interfaceC10432h0.getClass();
        return new C10716y(this, 0, interfaceC10432h0, 5);
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: i */
    public final InterfaceC10662n0 mo635i(InterfaceC10438k0 interfaceC10438k0) {
        return new C10716y(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n | EnumC10587X2.f21111t, interfaceC10438k0, 3);
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final InterfaceC10731y iterator() {
        return AbstractC10368e0.m942h(spliterator());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: j0 */
    public final boolean mo634j0(InterfaceC10444n0 interfaceC10444n0) {
        return ((Boolean) m725B1(AbstractC10707w0.m551s1(interfaceC10444n0, EnumC10692t0.ANY))).booleanValue();
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final InterfaceC10662n0 limit(long j) {
        if (j >= 0) {
            return AbstractC10707w0.m553r1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: m0 */
    public final InterfaceC10662n0 mo633m0(InterfaceC10444n0 interfaceC10444n0) {
        interfaceC10444n0.getClass();
        return new C10716y(this, EnumC10587X2.f21111t, interfaceC10444n0, 4);
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final C10476m max() {
        return mo637f(new C10622f0(0));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final C10476m min() {
        return mo637f(new C10566S1(29));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: o */
    public final long mo632o(long j, InterfaceC10424d0 interfaceC10424d0) {
        interfaceC10424d0.getClass();
        return ((Long) m725B1(new C10543M1(EnumC10591Y2.LONG_VALUE, interfaceC10424d0, j))).longValue();
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final InterfaceC10662n0 skip(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : AbstractC10707w0.m553r1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final InterfaceC10662n0 sorted() {
        return new C10491B2(this);
    }

    @Override // p060j$.util.stream.AbstractC10606c, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final InterfaceC10315J spliterator() {
        return m664S1(super.spliterator());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final long sum() {
        return mo632o(0L, new C10622f0(2));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final C10472i summaryStatistics() {
        return (C10472i) mo645C(new C10566S1(10), new C10622f0(3), new C10622f0(4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: t1 */
    public final InterfaceC10484A0 mo549t1(long j, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m561l1(j);
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final long[] toArray() {
        return (long[]) AbstractC10707w0.m565h1((InterfaceC10499D0) m724C1(new C10601b(23))).mo655c();
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final InterfaceC10636i unordered() {
        return !m722H1() ? this : new C10588Y(this, EnumC10587X2.f21109r, 1);
    }
}
