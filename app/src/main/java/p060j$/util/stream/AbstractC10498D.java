package p060j$.util.stream;

import p060j$.util.AbstractC10368e0;
import p060j$.util.C10469g;
import p060j$.util.C10474k;
import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10321P;
import p060j$.util.InterfaceC10480q;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.InterfaceC10372A0;
import p060j$.util.function.InterfaceC10375C;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10435j;
import p060j$.util.function.InterfaceC10443n;
import p060j$.util.function.InterfaceC10449q;
import p060j$.util.function.InterfaceC10455t;
import p060j$.util.function.InterfaceC10461w;
import p060j$.util.function.InterfaceC10467z;

/* renamed from: j$.util.stream.D */
/* loaded from: classes2.dex */
abstract class AbstractC10498D extends AbstractC10606c implements InterfaceC10513G {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10498D(InterfaceC10321P interfaceC10321P, int i) {
        super(interfaceC10321P, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10498D(AbstractC10606c abstractC10606c, int i) {
        super(abstractC10606c, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public static InterfaceC10309D m817S1(InterfaceC10321P interfaceC10321P) {
        if (interfaceC10321P instanceof InterfaceC10309D) {
            return (InterfaceC10309D) interfaceC10321P;
        }
        if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(AbstractC10606c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: D1 */
    final InterfaceC10509F0 mo669D1(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m579T0(abstractC10707w0, interfaceC10321P, z);
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: E1 */
    final void mo668E1(InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2) {
        InterfaceC10443n c10691t;
        InterfaceC10309D m817S1 = m817S1(interfaceC10321P);
        if (interfaceC10634h2 instanceof InterfaceC10443n) {
            c10691t = (InterfaceC10443n) interfaceC10634h2;
        } else if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(AbstractC10606c.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        } else {
            interfaceC10634h2.getClass();
            c10691t = new C10691t(0, interfaceC10634h2);
        }
        while (!interfaceC10634h2.mo530i() && m817S1.mo681p(c10691t)) {
        }
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: F */
    public final IntStream mo814F(InterfaceC10461w interfaceC10461w) {
        interfaceC10461w.getClass();
        return new C10711x(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10461w, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: F1 */
    public final EnumC10591Y2 mo667F1() {
        return EnumC10591Y2.DOUBLE_VALUE;
    }

    /* renamed from: L */
    public void mo813L(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        m725B1(new C10549O(interfaceC10443n, false));
    }

    @Override // p060j$.util.stream.AbstractC10606c
    /* renamed from: P1 */
    final InterfaceC10321P mo666P1(AbstractC10707w0 abstractC10707w0, C10596a c10596a, boolean z) {
        return new C10640i3(abstractC10707w0, c10596a, z);
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: T */
    public final C10474k mo812T(InterfaceC10435j interfaceC10435j) {
        interfaceC10435j.getClass();
        return (C10474k) m725B1(new C10485A1(EnumC10591Y2.DOUBLE_VALUE, interfaceC10435j, 0));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: W */
    public final double mo811W(double d, InterfaceC10435j interfaceC10435j) {
        interfaceC10435j.getClass();
        return ((Double) m725B1(new C10718y1(EnumC10591Y2.DOUBLE_VALUE, interfaceC10435j, d))).doubleValue();
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: X */
    public final boolean mo810X(InterfaceC10455t interfaceC10455t) {
        return ((Boolean) m725B1(AbstractC10707w0.m558o1(interfaceC10455t, EnumC10692t0.NONE))).booleanValue();
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final C10474k average() {
        double[] dArr = (double[]) mo803q(new C10601b(5), new C10601b(6), new C10601b(7));
        if (dArr[2] > 0.0d) {
            int i = AbstractC10661n.f21211a;
            double d = dArr[0] + dArr[1];
            double d2 = dArr[dArr.length - 1];
            if (Double.isNaN(d) && Double.isInfinite(d2)) {
                d = d2;
            }
            return C10474k.m833d(d / dArr[2]);
        }
        return C10474k.m836a();
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: b0 */
    public final boolean mo809b0(InterfaceC10455t interfaceC10455t) {
        return ((Boolean) m725B1(AbstractC10707w0.m558o1(interfaceC10455t, EnumC10692t0.ALL))).booleanValue();
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final InterfaceC10575U2 boxed() {
        return mo801s(new C10566S1(16));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: c */
    public final InterfaceC10513G mo808c(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        return new C10701v(this, 0, interfaceC10443n, 3);
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final long count() {
        return ((AbstractC10647k0) mo805l(new C10601b(4))).sum();
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final InterfaceC10513G distinct() {
        return ((AbstractC10594Z1) ((AbstractC10594Z1) boxed()).distinct()).mo738n0(new C10601b(8));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final C10474k findAny() {
        return (C10474k) m725B1(new C10518H(false, EnumC10591Y2.DOUBLE_VALUE, C10474k.m836a(), new C10566S1(19), new C10601b(10)));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final C10474k findFirst() {
        return (C10474k) m725B1(new C10518H(true, EnumC10591Y2.DOUBLE_VALUE, C10474k.m836a(), new C10566S1(19), new C10601b(10)));
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final InterfaceC10480q iterator() {
        return AbstractC10368e0.m944f(spliterator());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: j */
    public final InterfaceC10513G mo807j(InterfaceC10455t interfaceC10455t) {
        interfaceC10455t.getClass();
        return new C10701v(this, EnumC10587X2.f21111t, interfaceC10455t, 2);
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: k */
    public final InterfaceC10513G mo806k(InterfaceC10449q interfaceC10449q) {
        return new C10701v(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n | EnumC10587X2.f21111t, interfaceC10449q, 1);
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: l */
    public final InterfaceC10662n0 mo805l(InterfaceC10467z interfaceC10467z) {
        interfaceC10467z.getClass();
        return new C10716y(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10467z, 0);
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final InterfaceC10513G limit(long j) {
        if (j >= 0) {
            return AbstractC10707w0.m559n1(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final C10474k max() {
        return mo812T(new C10566S1(15));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final C10474k min() {
        return mo812T(new C10566S1(14));
    }

    /* renamed from: o0 */
    public void mo804o0(InterfaceC10443n interfaceC10443n) {
        interfaceC10443n.getClass();
        m725B1(new C10549O(interfaceC10443n, true));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: q */
    public final Object mo803q(InterfaceC10400O0 interfaceC10400O0, InterfaceC10372A0 interfaceC10372A0, BiConsumer biConsumer) {
        C10686s c10686s = new C10686s(biConsumer, 0);
        interfaceC10400O0.getClass();
        interfaceC10372A0.getClass();
        return m725B1(new C10708w1(EnumC10591Y2.DOUBLE_VALUE, c10686s, interfaceC10372A0, interfaceC10400O0, 1));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: r */
    public final InterfaceC10513G mo802r(InterfaceC10375C interfaceC10375C) {
        interfaceC10375C.getClass();
        return new C10701v(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10375C, 0);
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: s */
    public final InterfaceC10575U2 mo801s(InterfaceC10449q interfaceC10449q) {
        interfaceC10449q.getClass();
        return new C10706w(this, EnumC10587X2.f21107p | EnumC10587X2.f21105n, interfaceC10449q, 0);
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final InterfaceC10513G skip(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : AbstractC10707w0.m559n1(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final InterfaceC10513G sorted() {
        return new C10724z2(this);
    }

    @Override // p060j$.util.stream.AbstractC10606c, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final InterfaceC10309D spliterator() {
        return m817S1(super.spliterator());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final double sum() {
        double[] dArr = (double[]) mo803q(new C10601b(9), new C10601b(2), new C10601b(3));
        int i = AbstractC10661n.f21211a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final C10469g summaryStatistics() {
        return (C10469g) mo803q(new C10566S1(8), new C10566S1(17), new C10566S1(18));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.stream.AbstractC10707w0
    /* renamed from: t1 */
    public final InterfaceC10484A0 mo549t1(long j, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m573Z0(j);
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final double[] toArray() {
        return (double[]) AbstractC10707w0.m567f1((InterfaceC10489B0) m724C1(new C10601b(1))).mo655c();
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final InterfaceC10636i unordered() {
        return !m722H1() ? this : new C10721z(this, EnumC10587X2.f21109r, 0);
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: z */
    public final boolean mo800z(InterfaceC10455t interfaceC10455t) {
        return ((Boolean) m725B1(AbstractC10707w0.m558o1(interfaceC10455t, EnumC10692t0.ANY))).booleanValue();
    }
}
