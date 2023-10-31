package p060j$.util.stream;

import p060j$.util.AbstractC10368e0;
import p060j$.util.C10471h;
import p060j$.util.C10474k;
import p060j$.util.C10475l;
import p060j$.util.InterfaceC10312G;
import p060j$.util.InterfaceC10321P;
import p060j$.util.InterfaceC10727u;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.InterfaceC10378D0;
import p060j$.util.function.InterfaceC10383G;
import p060j$.util.function.InterfaceC10391K;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10403Q;
import p060j$.util.function.InterfaceC10410U;
import p060j$.util.function.InterfaceC10414X;
import p060j$.util.function.InterfaceC10418a0;

/* renamed from: j$.util.stream.d0 */
/* loaded from: classes2.dex */
abstract class AbstractC10612d0 extends AbstractC10606c implements IntStream {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10612d0(InterfaceC10321P interfaceC10321P, int i) {
        super(interfaceC10321P, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10612d0(AbstractC10606c abstractC10606c, int i) {
        super(abstractC10606c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public static InterfaceC10312G m713S1(InterfaceC10321P interfaceC10321P) {
        if (interfaceC10321P instanceof InterfaceC10312G) {
            return (InterfaceC10312G) interfaceC10321P;
        }
        if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(AbstractC10606c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: D1 */
    final InterfaceC10509F0 mo669D1(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m578U0(abstractC10707w0, interfaceC10321P, z);
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: E */
    public final Object mo716E(InterfaceC10400O0 interfaceC10400O0, InterfaceC10378D0 interfaceC10378D0, BiConsumer biConsumer) {
        C10686s c10686s = new C10686s(biConsumer, 1);
        interfaceC10400O0.getClass();
        interfaceC10378D0.getClass();
        return m725B1(new C10708w1(EnumC10591Y2.INT_VALUE, c10686s, interfaceC10378D0, interfaceC10400O0, 4));
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: E1 */
    final void mo668E1(InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2) {
        InterfaceC10391K c10580w;
        InterfaceC10312G m713S1 = m713S1(interfaceC10321P);
        if (interfaceC10634h2 instanceof InterfaceC10391K) {
            c10580w = (InterfaceC10391K) interfaceC10634h2;
        } else if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(AbstractC10606c.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        } else {
            interfaceC10634h2.getClass();
            c10580w = new C10580W(0, interfaceC10634h2);
        }
        while (!interfaceC10634h2.mo530i() && m713S1.mo661k(c10580w)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: F1 */
    public final EnumC10591Y2 mo667F1() {
        return EnumC10591Y2.INT_VALUE;
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: H */
    public final boolean mo715H(InterfaceC10403Q interfaceC10403Q) {
        return ((Boolean) m725B1(AbstractC10707w0.m555q1(interfaceC10403Q, EnumC10692t0.ANY))).booleanValue();
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: P1 */
    final InterfaceC10321P mo666P1(AbstractC10707w0 abstractC10707w0, C10596a c10596a, boolean z) {
        return new C10650k3(abstractC10707w0, c10596a, z);
    }

    /* renamed from: U */
    public void mo712U(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        m725B1(new C10553P(interfaceC10391K, true));
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: V */
    public final InterfaceC10575U2 mo711V(InterfaceC10397N interfaceC10397N) {
        interfaceC10397N.getClass();
        return new C10706w(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10397N, 1);
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: Y */
    public final IntStream mo710Y(InterfaceC10397N interfaceC10397N) {
        return new C10711x(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n | EnumC10587X2.f21111t, interfaceC10397N, 3);
    }

    @Override // p060j$.util.stream.IntStream
    public final InterfaceC10513G asDoubleStream() {
        return new C10721z(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, 1);
    }

    @Override // p060j$.util.stream.IntStream
    public final InterfaceC10662n0 asLongStream() {
        return new C10588Y(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, 0);
    }

    @Override // p060j$.util.stream.IntStream
    public final C10474k average() {
        long[] jArr = (long[]) mo716E(new C10601b(17), new C10601b(18), new C10601b(19));
        long j = jArr[0];
        return j > 0 ? C10474k.m833d(jArr[1] / j) : C10474k.m836a();
    }

    @Override // p060j$.util.stream.IntStream
    public final InterfaceC10575U2 boxed() {
        return mo711V(new C10566S1(27));
    }

    /* renamed from: c0 */
    public void mo709c0(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        m725B1(new C10553P(interfaceC10391K, false));
    }

    @Override // p060j$.util.stream.IntStream
    public final long count() {
        return ((AbstractC10647k0) mo707e(new C10601b(16))).sum();
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: d0 */
    public final InterfaceC10513G mo708d0(InterfaceC10410U interfaceC10410U) {
        interfaceC10410U.getClass();
        return new C10701v(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10410U, 4);
    }

    @Override // p060j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC10594Z1) ((AbstractC10594Z1) boxed()).distinct()).mo750M(new C10601b(15));
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: e */
    public final InterfaceC10662n0 mo707e(InterfaceC10414X interfaceC10414X) {
        interfaceC10414X.getClass();
        return new C10716y(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10414X, 1);
    }

    @Override // p060j$.util.stream.IntStream
    public final C10475l findAny() {
        return (C10475l) m725B1(new C10518H(false, EnumC10591Y2.INT_VALUE, C10475l.m832a(), new C10566S1(22), new C10601b(13)));
    }

    @Override // p060j$.util.stream.IntStream
    public final C10475l findFirst() {
        return (C10475l) m725B1(new C10518H(true, EnumC10591Y2.INT_VALUE, C10475l.m832a(), new C10566S1(22), new C10601b(13)));
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: g0 */
    public final IntStream mo706g0(InterfaceC10403Q interfaceC10403Q) {
        interfaceC10403Q.getClass();
        return new C10711x(this, EnumC10587X2.f21111t, interfaceC10403Q, 4);
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: h0 */
    public final C10475l mo705h0(InterfaceC10383G interfaceC10383G) {
        interfaceC10383G.getClass();
        return (C10475l) m725B1(new C10485A1(EnumC10591Y2.INT_VALUE, interfaceC10383G, 2));
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: i0 */
    public final IntStream mo704i0(InterfaceC10391K interfaceC10391K) {
        interfaceC10391K.getClass();
        return new C10711x(this, 0, interfaceC10391K, 1);
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final InterfaceC10727u iterator() {
        return AbstractC10368e0.m943g(spliterator());
    }

    @Override // p060j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return AbstractC10707w0.m556p1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: m */
    public final IntStream mo703m(InterfaceC10418a0 interfaceC10418a0) {
        interfaceC10418a0.getClass();
        return new C10711x(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10418a0, 2);
    }

    @Override // p060j$.util.stream.IntStream
    public final C10475l max() {
        return mo705h0(new C10566S1(28));
    }

    @Override // p060j$.util.stream.IntStream
    public final C10475l min() {
        return mo705h0(new C10566S1(23));
    }

    @Override // p060j$.util.stream.IntStream
    public final IntStream skip(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : AbstractC10707w0.m556p1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p060j$.util.stream.IntStream
    public final IntStream sorted() {
        return new C10486A2(this);
    }

    @Override // p060j$.util.stream.AbstractC10606c, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final InterfaceC10312G spliterator() {
        return m713S1(super.spliterator());
    }

    @Override // p060j$.util.stream.IntStream
    public final int sum() {
        return mo702t(0, new C10566S1(24));
    }

    @Override // p060j$.util.stream.IntStream
    public final C10471h summaryStatistics() {
        return (C10471h) mo716E(new C10566S1(9), new C10566S1(25), new C10566S1(26));
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: t */
    public final int mo702t(int i, InterfaceC10383G interfaceC10383G) {
        interfaceC10383G.getClass();
        return ((Integer) m725B1(new C10525I1(EnumC10591Y2.INT_VALUE, interfaceC10383G, i))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: t1 */
    public final InterfaceC10484A0 mo549t1(long j, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m563j1(j);
    }

    @Override // p060j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC10707w0.m566g1((InterfaceC10494C0) m724C1(new C10601b(20))).mo655c();
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: u */
    public final boolean mo701u(InterfaceC10403Q interfaceC10403Q) {
        return ((Boolean) m725B1(AbstractC10707w0.m555q1(interfaceC10403Q, EnumC10692t0.ALL))).booleanValue();
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final InterfaceC10636i unordered() {
        return !m722H1() ? this : new C10592Z(this, EnumC10587X2.f21109r);
    }

    @Override // p060j$.util.stream.IntStream
    /* renamed from: w */
    public final boolean mo700w(InterfaceC10403Q interfaceC10403Q) {
        return ((Boolean) m725B1(AbstractC10707w0.m555q1(interfaceC10403Q, EnumC10692t0.NONE))).booleanValue();
    }
}
