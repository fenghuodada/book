package p060j$.util.stream;

import okhttp3.internal.http2.Http2;
import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10312G;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10391K;
import p060j$.util.function.InterfaceC10394L0;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10403Q;
import p060j$.util.function.InterfaceC10432h0;
import p060j$.util.function.InterfaceC10443n;
import p060j$.util.function.InterfaceC10444n0;
import p060j$.util.function.InterfaceC10455t;

/* renamed from: j$.util.stream.w0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC10707w0 implements InterfaceC10517G3 {

    /* renamed from: a */
    private static final C10589Y0 f21288a = new C10589Y0();

    /* renamed from: b */
    private static final InterfaceC10494C0 f21289b = new C10581W0();

    /* renamed from: c */
    private static final InterfaceC10499D0 f21290c = new C10585X0();

    /* renamed from: d */
    private static final InterfaceC10489B0 f21291d = new C10577V0();

    /* renamed from: e */
    private static final int[] f21292e = new int[0];

    /* renamed from: f */
    private static final long[] f21293f = new long[0];

    /* renamed from: g */
    private static final double[] f21294g = new double[0];

    public /* synthetic */ AbstractC10707w0() {
    }

    public /* synthetic */ AbstractC10707w0(EnumC10591Y2 enumC10591Y2) {
    }

    /* renamed from: A0 */
    public static Object[] m599A0(InterfaceC10504E0 interfaceC10504E0, InterfaceC10397N interfaceC10397N) {
        if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(interfaceC10504E0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (interfaceC10504E0.count() < 2147483639) {
            Object[] objArr = (Object[]) interfaceC10397N.apply((int) interfaceC10504E0.count());
            interfaceC10504E0.mo619k(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: B0 */
    public static void m598B0(InterfaceC10489B0 interfaceC10489B0, Double[] dArr, int i) {
        if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(interfaceC10489B0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC10489B0.mo655c();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    /* renamed from: C0 */
    public static void m597C0(InterfaceC10494C0 interfaceC10494C0, Integer[] numArr, int i) {
        if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(interfaceC10494C0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) interfaceC10494C0.mo655c();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    /* renamed from: D0 */
    public static void m596D0(InterfaceC10499D0 interfaceC10499D0, Long[] lArr, int i) {
        if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(interfaceC10499D0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) interfaceC10499D0.mo655c();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    /* renamed from: E0 */
    public static void m595E0(InterfaceC10489B0 interfaceC10489B0, Consumer consumer) {
        if (consumer instanceof InterfaceC10443n) {
            interfaceC10489B0.mo653f((InterfaceC10443n) consumer);
        } else if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(interfaceC10489B0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((InterfaceC10309D) interfaceC10489B0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* renamed from: F0 */
    public static void m594F0(InterfaceC10494C0 interfaceC10494C0, Consumer consumer) {
        if (consumer instanceof InterfaceC10391K) {
            interfaceC10494C0.mo653f((InterfaceC10391K) consumer);
        } else if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(interfaceC10494C0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((InterfaceC10312G) interfaceC10494C0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* renamed from: G0 */
    public static void m593G0(InterfaceC10499D0 interfaceC10499D0, Consumer consumer) {
        if (consumer instanceof InterfaceC10432h0) {
            interfaceC10499D0.mo653f((InterfaceC10432h0) consumer);
        } else if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(interfaceC10499D0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((InterfaceC10315J) interfaceC10499D0.spliterator()).forEachRemaining(consumer);
        }
    }

    /* renamed from: H0 */
    public static InterfaceC10489B0 m592H0(InterfaceC10489B0 interfaceC10489B0, long j, long j2) {
        if (j == 0 && j2 == interfaceC10489B0.count()) {
            return interfaceC10489B0;
        }
        long j3 = j2 - j;
        InterfaceC10309D interfaceC10309D = (InterfaceC10309D) interfaceC10489B0.spliterator();
        InterfaceC10712x0 m573Z0 = m573Z0(j3);
        m573Z0.mo531g(j3);
        for (int i = 0; i < j && interfaceC10309D.mo681p(new C10665n3(1)); i++) {
        }
        for (int i2 = 0; i2 < j3 && interfaceC10309D.mo681p(m573Z0); i2++) {
        }
        m573Z0.end();
        return m573Z0.build();
    }

    /* renamed from: I0 */
    public static InterfaceC10494C0 m591I0(InterfaceC10494C0 interfaceC10494C0, long j, long j2) {
        if (j == 0 && j2 == interfaceC10494C0.count()) {
            return interfaceC10494C0;
        }
        long j3 = j2 - j;
        InterfaceC10312G interfaceC10312G = (InterfaceC10312G) interfaceC10494C0.spliterator();
        InterfaceC10717y0 m563j1 = m563j1(j3);
        m563j1.mo531g(j3);
        for (int i = 0; i < j && interfaceC10312G.mo661k(new C10675p3(1)); i++) {
        }
        for (int i2 = 0; i2 < j3 && interfaceC10312G.mo661k(m563j1); i2++) {
        }
        m563j1.end();
        return m563j1.build();
    }

    /* renamed from: J0 */
    public static InterfaceC10499D0 m590J0(InterfaceC10499D0 interfaceC10499D0, long j, long j2) {
        if (j == 0 && j2 == interfaceC10499D0.count()) {
            return interfaceC10499D0;
        }
        long j3 = j2 - j;
        InterfaceC10315J interfaceC10315J = (InterfaceC10315J) interfaceC10499D0.spliterator();
        InterfaceC10722z0 m561l1 = m561l1(j3);
        m561l1.mo531g(j3);
        for (int i = 0; i < j && interfaceC10315J.mo650f(new C10685r3(1)); i++) {
        }
        for (int i2 = 0; i2 < j3 && interfaceC10315J.mo650f(m561l1); i2++) {
        }
        m561l1.end();
        return m561l1.build();
    }

    /* renamed from: K0 */
    public static InterfaceC10509F0 m589K0(InterfaceC10509F0 interfaceC10509F0, long j, long j2, InterfaceC10397N interfaceC10397N) {
        if (j == 0 && j2 == interfaceC10509F0.count()) {
            return interfaceC10509F0;
        }
        InterfaceC10321P spliterator = interfaceC10509F0.spliterator();
        long j3 = j2 - j;
        InterfaceC10484A0 m581R0 = m581R0(j3, interfaceC10397N);
        m581R0.mo531g(j3);
        for (int i = 0; i < j && spliterator.mo534a(new C10622f0(5)); i++) {
        }
        for (int i2 = 0; i2 < j3 && spliterator.mo534a(m581R0); i2++) {
        }
        m581R0.end();
        return m581R0.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public static long m588L0(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public static InterfaceC10321P m587M0(EnumC10591Y2 enumC10591Y2, InterfaceC10321P interfaceC10321P, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = AbstractC10679q2.f21239a[enumC10591Y2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new C10670o3((InterfaceC10309D) interfaceC10321P, j, j4);
                    }
                    throw new IllegalStateException("Unknown shape " + enumC10591Y2);
                }
                return new C10690s3((InterfaceC10315J) interfaceC10321P, j, j4);
            }
            return new C10680q3((InterfaceC10312G) interfaceC10321P, j, j4);
        }
        return new C10700u3(interfaceC10321P, j, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public static long m586N0(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R0 */
    public static InterfaceC10484A0 m581R0(long j, InterfaceC10397N interfaceC10397N) {
        return (j < 0 || j >= 2147483639) ? new C10688s1() : new C10598a1(j, interfaceC10397N);
    }

    /* renamed from: S0 */
    public static InterfaceC10509F0 m580S0(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z, InterfaceC10397N interfaceC10397N) {
        long mo570c1 = abstractC10707w0.mo570c1(interfaceC10321P);
        if (mo570c1 < 0 || !interfaceC10321P.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            InterfaceC10509F0 interfaceC10509F0 = (InterfaceC10509F0) new C10538L0(interfaceC10321P, interfaceC10397N, abstractC10707w0).invoke();
            return z ? m568e1(interfaceC10509F0, interfaceC10397N) : interfaceC10509F0;
        } else if (mo570c1 < 2147483639) {
            Object[] objArr = (Object[]) interfaceC10397N.apply((int) mo570c1);
            new C10678q1(interfaceC10321P, abstractC10707w0, objArr).invoke();
            return new C10524I0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: T0 */
    public static InterfaceC10489B0 m579T0(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z) {
        long mo570c1 = abstractC10707w0.mo570c1(interfaceC10321P);
        if (mo570c1 < 0 || !interfaceC10321P.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            InterfaceC10489B0 interfaceC10489B0 = (InterfaceC10489B0) new C10538L0(0, interfaceC10321P, abstractC10707w0).invoke();
            return z ? m567f1(interfaceC10489B0) : interfaceC10489B0;
        } else if (mo570c1 < 2147483639) {
            double[] dArr = new double[(int) mo570c1];
            new C10663n1(interfaceC10321P, abstractC10707w0, dArr).invoke();
            return new C10565S0(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: U0 */
    public static InterfaceC10494C0 m578U0(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z) {
        long mo570c1 = abstractC10707w0.mo570c1(interfaceC10321P);
        if (mo570c1 < 0 || !interfaceC10321P.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            InterfaceC10494C0 interfaceC10494C0 = (InterfaceC10494C0) new C10538L0(1, interfaceC10321P, abstractC10707w0).invoke();
            return z ? m566g1(interfaceC10494C0) : interfaceC10494C0;
        } else if (mo570c1 < 2147483639) {
            int[] iArr = new int[(int) mo570c1];
            new C10668o1(interfaceC10321P, abstractC10707w0, iArr).invoke();
            return new C10603b1(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: V0 */
    public static InterfaceC10499D0 m577V0(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z) {
        long mo570c1 = abstractC10707w0.mo570c1(interfaceC10321P);
        if (mo570c1 < 0 || !interfaceC10321P.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            InterfaceC10499D0 interfaceC10499D0 = (InterfaceC10499D0) new C10538L0(2, interfaceC10321P, abstractC10707w0).invoke();
            return z ? m565h1(interfaceC10499D0) : interfaceC10499D0;
        } else if (mo570c1 < 2147483639) {
            long[] jArr = new long[(int) mo570c1];
            new C10673p1(interfaceC10321P, abstractC10707w0, jArr).invoke();
            return new C10648k1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public static AbstractC10519H0 m576W0(EnumC10591Y2 enumC10591Y2, InterfaceC10509F0 interfaceC10509F0, InterfaceC10509F0 interfaceC10509F02) {
        int i = AbstractC10514G0.f20992a[enumC10591Y2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new C10546N0((InterfaceC10489B0) interfaceC10509F0, (InterfaceC10489B0) interfaceC10509F02);
                    }
                    throw new IllegalStateException("Unknown shape " + enumC10591Y2);
                }
                return new C10554P0((InterfaceC10499D0) interfaceC10509F0, (InterfaceC10499D0) interfaceC10509F02);
            }
            return new C10550O0((InterfaceC10494C0) interfaceC10509F0, (InterfaceC10494C0) interfaceC10509F02);
        }
        return new C10561R0(interfaceC10509F0, interfaceC10509F02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public static InterfaceC10712x0 m573Z0(long j) {
        return (j < 0 || j >= 2147483639) ? new C10573U0() : new C10569T0(j);
    }

    /* renamed from: a1 */
    public static InterfaceC10513G m572a1(InterfaceC10309D interfaceC10309D) {
        return new C10483A(interfaceC10309D, EnumC10587X2.m760c(interfaceC10309D));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1 */
    public static AbstractC10593Z0 m571b1(EnumC10591Y2 enumC10591Y2) {
        Object obj;
        int i = AbstractC10514G0.f20992a[enumC10591Y2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                obj = f21289b;
            } else if (i == 3) {
                obj = f21290c;
            } else if (i != 4) {
                throw new IllegalStateException("Unknown shape " + enumC10591Y2);
            } else {
                obj = f21291d;
            }
            return (AbstractC10593Z0) obj;
        }
        return f21288a;
    }

    /* renamed from: d1 */
    private static int m569d1(long j) {
        return (j != -1 ? EnumC10587X2.f21112u : 0) | EnumC10587X2.f21111t;
    }

    /* renamed from: e1 */
    public static InterfaceC10509F0 m568e1(InterfaceC10509F0 interfaceC10509F0, InterfaceC10397N interfaceC10397N) {
        if (interfaceC10509F0.mo618p() > 0) {
            long count = interfaceC10509F0.count();
            if (count < 2147483639) {
                Object[] objArr = (Object[]) interfaceC10397N.apply((int) count);
                new C10698u1(interfaceC10509F0, objArr).invoke();
                return new C10524I0(objArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return interfaceC10509F0;
    }

    /* renamed from: f1 */
    public static InterfaceC10489B0 m567f1(InterfaceC10489B0 interfaceC10489B0) {
        if (interfaceC10489B0.mo618p() > 0) {
            long count = interfaceC10489B0.count();
            if (count < 2147483639) {
                double[] dArr = new double[(int) count];
                new C10693t1(interfaceC10489B0, dArr).invoke();
                return new C10565S0(dArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return interfaceC10489B0;
    }

    /* renamed from: g1 */
    public static InterfaceC10494C0 m566g1(InterfaceC10494C0 interfaceC10494C0) {
        if (interfaceC10494C0.mo618p() > 0) {
            long count = interfaceC10494C0.count();
            if (count < 2147483639) {
                int[] iArr = new int[(int) count];
                new C10693t1(interfaceC10494C0, iArr).invoke();
                return new C10603b1(iArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return interfaceC10494C0;
    }

    /* renamed from: h1 */
    public static InterfaceC10499D0 m565h1(InterfaceC10499D0 interfaceC10499D0) {
        if (interfaceC10499D0.mo618p() > 0) {
            long count = interfaceC10499D0.count();
            if (count < 2147483639) {
                long[] jArr = new long[(int) count];
                new C10693t1(interfaceC10499D0, jArr).invoke();
                return new C10648k1(jArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return interfaceC10499D0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1 */
    public static InterfaceC10717y0 m563j1(long j) {
        return (j < 0 || j >= 2147483639) ? new C10613d1() : new C10608c1(j);
    }

    /* renamed from: k1 */
    public static IntStream m562k1(InterfaceC10312G interfaceC10312G) {
        return new C10597a0(interfaceC10312G, EnumC10587X2.m760c(interfaceC10312G));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1 */
    public static InterfaceC10722z0 m561l1(long j) {
        return (j < 0 || j >= 2147483639) ? new C10658m1() : new C10653l1(j);
    }

    /* renamed from: m1 */
    public static InterfaceC10662n0 m560m1(InterfaceC10315J interfaceC10315J) {
        return new C10632h0(interfaceC10315J, EnumC10587X2.m760c(interfaceC10315J));
    }

    /* renamed from: n1 */
    public static InterfaceC10513G m559n1(AbstractC10606c abstractC10606c, long j, long j2) {
        if (j >= 0) {
            return new C10674p2(abstractC10606c, m569d1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: o1 */
    public static C10697u0 m558o1(InterfaceC10455t interfaceC10455t, EnumC10692t0 enumC10692t0) {
        interfaceC10455t.getClass();
        enumC10692t0.getClass();
        return new C10697u0(EnumC10591Y2.DOUBLE_VALUE, enumC10692t0, new C10666o(3, enumC10692t0, interfaceC10455t));
    }

    /* renamed from: p1 */
    public static IntStream m556p1(AbstractC10606c abstractC10606c, long j, long j2) {
        if (j >= 0) {
            return new C10654l2(abstractC10606c, m569d1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: q1 */
    public static C10697u0 m555q1(InterfaceC10403Q interfaceC10403Q, EnumC10692t0 enumC10692t0) {
        interfaceC10403Q.getClass();
        enumC10692t0.getClass();
        return new C10697u0(EnumC10591Y2.INT_VALUE, enumC10692t0, new C10666o(1, enumC10692t0, interfaceC10403Q));
    }

    /* renamed from: r0 */
    public static void m554r0() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: r1 */
    public static InterfaceC10662n0 m553r1(AbstractC10606c abstractC10606c, long j, long j2) {
        if (j >= 0) {
            return new C10664n2(abstractC10606c, m569d1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: s0 */
    public static void m552s0(InterfaceC10619e2 interfaceC10619e2, Double d) {
        if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(interfaceC10619e2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        } else {
            interfaceC10619e2.accept(d.doubleValue());
        }
    }

    /* renamed from: s1 */
    public static C10697u0 m551s1(InterfaceC10444n0 interfaceC10444n0, EnumC10692t0 enumC10692t0) {
        interfaceC10444n0.getClass();
        enumC10692t0.getClass();
        return new C10697u0(EnumC10591Y2.LONG_VALUE, enumC10692t0, new C10666o(4, enumC10692t0, interfaceC10444n0));
    }

    /* renamed from: u0 */
    public static void m548u0(InterfaceC10624f2 interfaceC10624f2, Integer num) {
        if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(interfaceC10624f2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        } else {
            interfaceC10624f2.accept(num.intValue());
        }
    }

    /* renamed from: u1 */
    public static C10697u0 m547u1(InterfaceC10394L0 interfaceC10394L0, EnumC10692t0 enumC10692t0) {
        interfaceC10394L0.getClass();
        enumC10692t0.getClass();
        return new C10697u0(EnumC10591Y2.REFERENCE, enumC10692t0, new C10666o(2, enumC10692t0, interfaceC10394L0));
    }

    /* renamed from: v1 */
    public static InterfaceC10575U2 m545v1(AbstractC10606c abstractC10606c, long j, long j2) {
        if (j >= 0) {
            return new C10644j2(abstractC10606c, m569d1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: w0 */
    public static void m544w0(InterfaceC10629g2 interfaceC10629g2, Long l) {
        if (AbstractC10532J3.f21027a) {
            AbstractC10532J3.m799a(interfaceC10629g2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        } else {
            interfaceC10629g2.accept(l.longValue());
        }
    }

    /* renamed from: x1 */
    public static InterfaceC10575U2 m542x1(InterfaceC10321P interfaceC10321P, boolean z) {
        interfaceC10321P.getClass();
        return new C10582W1(interfaceC10321P, EnumC10587X2.m760c(interfaceC10321P), z);
    }

    /* renamed from: y0 */
    public static void m541y0() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: z0 */
    public static void m539z0() {
        throw new IllegalStateException("called wrong accept method");
    }

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: A */
    public Object mo600A(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        return ((InterfaceC10555P1) new C10562R1(this, abstractC10707w0, interfaceC10321P).invoke()).get();
    }

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: R */
    public /* synthetic */ int mo582R() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public abstract void mo575X0(InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public abstract void mo574Y0(InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c1 */
    public abstract long mo570c1(InterfaceC10321P interfaceC10321P);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i1 */
    public abstract int mo564i1();

    @Override // p060j$.util.stream.InterfaceC10517G3
    /* renamed from: p0 */
    public Object mo557p0(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        InterfaceC10555P1 mo535w1 = mo535w1();
        abstractC10707w0.mo540y1(interfaceC10321P, mo535w1);
        return mo535w1.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t1 */
    public abstract InterfaceC10484A0 mo549t1(long j, InterfaceC10397N interfaceC10397N);

    /* renamed from: w1 */
    public abstract InterfaceC10555P1 mo535w1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y1 */
    public abstract InterfaceC10634h2 mo540y1(InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z1 */
    public abstract InterfaceC10634h2 mo538z1(InterfaceC10634h2 interfaceC10634h2);
}
