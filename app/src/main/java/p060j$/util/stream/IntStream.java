package p060j$.util.stream;

import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p060j$.util.AbstractC10473j;
import p060j$.util.C10310E;
import p060j$.util.C10311F;
import p060j$.util.C10319N;
import p060j$.util.C10320O;
import p060j$.util.C10471h;
import p060j$.util.C10474k;
import p060j$.util.C10475l;
import p060j$.util.C10482s;
import p060j$.util.C10726t;
import p060j$.util.InterfaceC10312G;
import p060j$.util.InterfaceC10321P;
import p060j$.util.InterfaceC10727u;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.C10374B0;
import p060j$.util.function.C10376C0;
import p060j$.util.function.C10379E;
import p060j$.util.function.C10381F;
import p060j$.util.function.C10387I;
import p060j$.util.function.C10389J;
import p060j$.util.function.C10393L;
import p060j$.util.function.C10395M;
import p060j$.util.function.C10396M0;
import p060j$.util.function.C10398N0;
import p060j$.util.function.C10399O;
import p060j$.util.function.C10401P;
import p060j$.util.function.C10406S;
import p060j$.util.function.C10408T;
import p060j$.util.function.C10412V;
import p060j$.util.function.C10413W;
import p060j$.util.function.C10415Y;
import p060j$.util.function.C10416Z;
import p060j$.util.function.C10417a;
import p060j$.util.function.InterfaceC10378D0;
import p060j$.util.function.InterfaceC10383G;
import p060j$.util.function.InterfaceC10391K;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10403Q;
import p060j$.util.function.InterfaceC10410U;
import p060j$.util.function.InterfaceC10414X;
import p060j$.util.function.InterfaceC10418a0;

/* renamed from: j$.util.stream.IntStream */
/* loaded from: classes2.dex */
public interface IntStream extends InterfaceC10636i {

    /* renamed from: j$.util.stream.IntStream$VivifiedWrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* renamed from: a */
        public final /* synthetic */ java.util.stream.IntStream f21020a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f21020a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: E */
        public final /* synthetic */ Object mo716E(InterfaceC10400O0 interfaceC10400O0, InterfaceC10378D0 interfaceC10378D0, BiConsumer biConsumer) {
            return this.f21020a.collect(C10398N0.m916a(interfaceC10400O0), C10376C0.m929a(interfaceC10378D0), C10417a.m892a(biConsumer));
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: H */
        public final /* synthetic */ boolean mo715H(InterfaceC10403Q interfaceC10403Q) {
            return this.f21020a.anyMatch(C10401P.m910a(interfaceC10403Q));
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: U */
        public final /* synthetic */ void mo712U(InterfaceC10391K interfaceC10391K) {
            this.f21020a.forEachOrdered(C10389J.m922a(interfaceC10391K));
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: V */
        public final /* synthetic */ InterfaceC10575U2 mo711V(InterfaceC10397N interfaceC10397N) {
            return C10567S2.m770A(this.f21020a.mapToObj(C10395M.m918a(interfaceC10397N)));
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: Y */
        public final /* synthetic */ IntStream mo710Y(InterfaceC10397N interfaceC10397N) {
            return convert(this.f21020a.flatMap(C10395M.m918a(interfaceC10397N)));
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC10513G asDoubleStream() {
            return C10503E.m816A(this.f21020a.asDoubleStream());
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC10662n0 asLongStream() {
            return C10652l0.m659A(this.f21020a.asLongStream());
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ C10474k average() {
            return AbstractC10473j.m843b(this.f21020a.average());
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC10575U2 boxed() {
            return C10567S2.m770A(this.f21020a.boxed());
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: c0 */
        public final /* synthetic */ void mo709c0(InterfaceC10391K interfaceC10391K) {
            this.f21020a.forEach(C10389J.m922a(interfaceC10391K));
        }

        @Override // p060j$.util.stream.InterfaceC10636i, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.f21020a.close();
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.f21020a.count();
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: d0 */
        public final /* synthetic */ InterfaceC10513G mo708d0(InterfaceC10410U interfaceC10410U) {
            return C10503E.m816A(this.f21020a.mapToDouble(C10408T.m901a(interfaceC10410U)));
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.f21020a.distinct());
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: e */
        public final /* synthetic */ InterfaceC10662n0 mo707e(InterfaceC10414X interfaceC10414X) {
            return C10652l0.m659A(this.f21020a.mapToLong(C10413W.m898a(interfaceC10414X)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f21020a;
            }
            return this.f21020a.equals(obj);
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ C10475l findAny() {
            return AbstractC10473j.m842c(this.f21020a.findAny());
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ C10475l findFirst() {
            return AbstractC10473j.m842c(this.f21020a.findFirst());
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: g0 */
        public final /* synthetic */ IntStream mo706g0(InterfaceC10403Q interfaceC10403Q) {
            return convert(this.f21020a.filter(C10401P.m910a(interfaceC10403Q)));
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: h0 */
        public final /* synthetic */ C10475l mo705h0(InterfaceC10383G interfaceC10383G) {
            return AbstractC10473j.m842c(this.f21020a.reduce(C10381F.m925a(interfaceC10383G)));
        }

        public final /* synthetic */ int hashCode() {
            return this.f21020a.hashCode();
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: i0 */
        public final /* synthetic */ IntStream mo704i0(InterfaceC10391K interfaceC10391K) {
            return convert(this.f21020a.peek(C10389J.m922a(interfaceC10391K)));
        }

        @Override // p060j$.util.stream.InterfaceC10636i
        public final /* synthetic */ boolean isParallel() {
            return this.f21020a.isParallel();
        }

        @Override // p060j$.util.stream.IntStream, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
        public final /* synthetic */ InterfaceC10727u iterator() {
            return C10482s.m821a(this.f21020a.iterator());
        }

        @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
        public final /* synthetic */ Iterator iterator() {
            return this.f21020a.iterator();
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j) {
            return convert(this.f21020a.limit(j));
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: m */
        public final /* synthetic */ IntStream mo703m(InterfaceC10418a0 interfaceC10418a0) {
            return convert(this.f21020a.map(C10416Z.m893a(interfaceC10418a0)));
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ C10475l max() {
            return AbstractC10473j.m842c(this.f21020a.max());
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ C10475l min() {
            return AbstractC10473j.m842c(this.f21020a.min());
        }

        @Override // p060j$.util.stream.InterfaceC10636i
        public final /* synthetic */ InterfaceC10636i onClose(Runnable runnable) {
            return C10626g.m691A(this.f21020a.onClose(runnable));
        }

        @Override // p060j$.util.stream.IntStream, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
        public final /* synthetic */ IntStream parallel() {
            return convert(this.f21020a.parallel());
        }

        @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
        public final /* synthetic */ InterfaceC10636i parallel() {
            return C10626g.m691A(this.f21020a.parallel());
        }

        @Override // p060j$.util.stream.IntStream, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
        public final /* synthetic */ IntStream sequential() {
            return convert(this.f21020a.sequential());
        }

        @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
        public final /* synthetic */ InterfaceC10636i sequential() {
            return C10626g.m691A(this.f21020a.sequential());
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j) {
            return convert(this.f21020a.skip(j));
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.f21020a.sorted());
        }

        @Override // p060j$.util.stream.IntStream, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
        public final /* synthetic */ InterfaceC10312G spliterator() {
            return C10310E.m1035e(this.f21020a.spliterator());
        }

        @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
        public final /* synthetic */ InterfaceC10321P spliterator() {
            return C10319N.m1029e(this.f21020a.spliterator());
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.f21020a.sum();
        }

        @Override // p060j$.util.stream.IntStream
        public final C10471h summaryStatistics() {
            this.f21020a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: t */
        public final /* synthetic */ int mo702t(int i, InterfaceC10383G interfaceC10383G) {
            return this.f21020a.reduce(i, C10381F.m925a(interfaceC10383G));
        }

        @Override // p060j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.f21020a.toArray();
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: u */
        public final /* synthetic */ boolean mo701u(InterfaceC10403Q interfaceC10403Q) {
            return this.f21020a.allMatch(C10401P.m910a(interfaceC10403Q));
        }

        @Override // p060j$.util.stream.InterfaceC10636i
        public final /* synthetic */ InterfaceC10636i unordered() {
            return C10626g.m691A(this.f21020a.unordered());
        }

        @Override // p060j$.util.stream.IntStream
        /* renamed from: w */
        public final /* synthetic */ boolean mo700w(InterfaceC10403Q interfaceC10403Q) {
            return this.f21020a.noneMatch(C10401P.m910a(interfaceC10403Q));
        }
    }

    /* renamed from: j$.util.stream.IntStream$Wrapper */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
            IntStream.this = r1;
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f21020a : new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.mo701u(C10399O.m914b(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.mo715H(C10399O.m914b(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return C10508F.m815A(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C10657m0.m657A(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC10473j.m839f(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return C10571T2.m769A(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
            return IntStream.this.mo716E(C10396M0.m917a(supplier), C10374B0.m930a(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.mo706g0(C10399O.m914b(intPredicate)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC10473j.m838g(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC10473j.m838g(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream flatMap(IntFunction intFunction) {
            return convert(IntStream.this.mo710Y(C10393L.m919a(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.mo709c0(C10387I.m923a(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.mo712U(C10387I.m923a(intConsumer));
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: iterator */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            return C10726t.m516a(IntStream.this.iterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j) {
            return convert(IntStream.this.limit(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.mo703m(C10415Y.m894d(intUnaryOperator)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return C10508F.m815A(IntStream.this.mo708d0(C10406S.m905b(intToDoubleFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C10657m0.m657A(IntStream.this.mo707e(C10412V.m899a(intToLongFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            return C10571T2.m769A(IntStream.this.mo711V(C10393L.m919a(intFunction)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC10473j.m838g(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC10473j.m838g(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.mo700w(C10399O.m914b(intPredicate));
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream onClose(Runnable runnable) {
            return C10631h.m689A(IntStream.this.onClose(runnable));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return C10631h.m689A(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: parallel */
        public final /* synthetic */ java.util.stream.IntStream parallel2() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.mo704i0(C10387I.m923a(intConsumer)));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.mo702t(i, C10379E.m927a(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC10473j.m838g(IntStream.this.mo705h0(C10379E.m927a(intBinaryOperator)));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return C10631h.m689A(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: sequential */
        public final /* synthetic */ java.util.stream.IntStream sequential2() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j) {
            return convert(IntStream.this.skip(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Spliterator<Integer> spliterator() {
            return C10311F.m1034a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* renamed from: spliterator */
        public final /* synthetic */ Spliterator<Integer> spliterator2() {
            return C10320O.m1028a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
        @Override // java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream unordered() {
            return C10631h.m689A(IntStream.this.unordered());
        }
    }

    /* renamed from: E */
    Object mo716E(InterfaceC10400O0 interfaceC10400O0, InterfaceC10378D0 interfaceC10378D0, BiConsumer biConsumer);

    /* renamed from: H */
    boolean mo715H(InterfaceC10403Q interfaceC10403Q);

    /* renamed from: U */
    void mo712U(InterfaceC10391K interfaceC10391K);

    /* renamed from: V */
    InterfaceC10575U2 mo711V(InterfaceC10397N interfaceC10397N);

    /* renamed from: Y */
    IntStream mo710Y(InterfaceC10397N interfaceC10397N);

    InterfaceC10513G asDoubleStream();

    InterfaceC10662n0 asLongStream();

    C10474k average();

    InterfaceC10575U2 boxed();

    /* renamed from: c0 */
    void mo709c0(InterfaceC10391K interfaceC10391K);

    long count();

    /* renamed from: d0 */
    InterfaceC10513G mo708d0(InterfaceC10410U interfaceC10410U);

    IntStream distinct();

    /* renamed from: e */
    InterfaceC10662n0 mo707e(InterfaceC10414X interfaceC10414X);

    C10475l findAny();

    C10475l findFirst();

    /* renamed from: g0 */
    IntStream mo706g0(InterfaceC10403Q interfaceC10403Q);

    /* renamed from: h0 */
    C10475l mo705h0(InterfaceC10383G interfaceC10383G);

    /* renamed from: i0 */
    IntStream mo704i0(InterfaceC10391K interfaceC10391K);

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    InterfaceC10727u iterator();

    IntStream limit(long j);

    /* renamed from: m */
    IntStream mo703m(InterfaceC10418a0 interfaceC10418a0);

    C10475l max();

    C10475l min();

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    IntStream parallel();

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    IntStream sequential();

    IntStream skip(long j);

    IntStream sorted();

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    InterfaceC10312G spliterator();

    int sum();

    C10471h summaryStatistics();

    /* renamed from: t */
    int mo702t(int i, InterfaceC10383G interfaceC10383G);

    int[] toArray();

    /* renamed from: u */
    boolean mo701u(InterfaceC10403Q interfaceC10403Q);

    /* renamed from: w */
    boolean mo700w(InterfaceC10403Q interfaceC10403Q);
}
