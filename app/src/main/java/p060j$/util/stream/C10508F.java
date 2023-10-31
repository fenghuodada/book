package p060j$.util.stream;

import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p060j$.util.AbstractC10473j;
import p060j$.util.C10308C;
import p060j$.util.C10320O;
import p060j$.util.C10479p;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.C10371A;
import p060j$.util.function.C10396M0;
import p060j$.util.function.C10431h;
import p060j$.util.function.C10439l;
import p060j$.util.function.C10445o;
import p060j$.util.function.C10451r;
import p060j$.util.function.C10457u;
import p060j$.util.function.C10463x;
import p060j$.util.function.C10466y0;
import p060j$.util.stream.IntStream;

/* renamed from: j$.util.stream.F */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10508F implements DoubleStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10513G f20983a;

    private /* synthetic */ C10508F(InterfaceC10513G interfaceC10513G) {
        this.f20983a = interfaceC10513G;
    }

    /* renamed from: A */
    public static /* synthetic */ DoubleStream m815A(InterfaceC10513G interfaceC10513G) {
        if (interfaceC10513G == null) {
            return null;
        }
        return interfaceC10513G instanceof C10503E ? ((C10503E) interfaceC10513G).f20977a : new C10508F(interfaceC10513G);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return this.f20983a.mo809b0(C10451r.m865b(doublePredicate));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return this.f20983a.mo800z(C10451r.m865b(doublePredicate));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC10473j.m839f(this.f20983a.average());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Stream boxed() {
        return C10571T2.m769A(this.f20983a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f20983a.close();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f20983a.mo803q(C10396M0.m917a(supplier), C10466y0.m850a(objDoubleConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ long count() {
        return this.f20983a.count();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream distinct() {
        return m815A(this.f20983a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10513G interfaceC10513G = this.f20983a;
        if (obj instanceof C10508F) {
            obj = ((C10508F) obj).f20983a;
        }
        return interfaceC10513G.equals(obj);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream filter(DoublePredicate doublePredicate) {
        return m815A(this.f20983a.mo807j(C10451r.m865b(doublePredicate)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findAny() {
        return AbstractC10473j.m839f(this.f20983a.findAny());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findFirst() {
        return AbstractC10473j.m839f(this.f20983a.findFirst());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream flatMap(DoubleFunction doubleFunction) {
        return m815A(this.f20983a.mo806k(C10445o.m871a(doubleFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f20983a.mo813L(C10439l.m879a(doubleConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f20983a.mo804o0(C10439l.m879a(doubleConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f20983a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f20983a.isParallel();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Double> iterator() {
        return this.f20983a.iterator();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator<Double> iterator2() {
        return C10479p.m823a(this.f20983a.iterator());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream limit(long j) {
        return m815A(this.f20983a.limit(j));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        return m815A(this.f20983a.mo802r(C10371A.m932d(doubleUnaryOperator)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        return IntStream.Wrapper.convert(this.f20983a.mo814F(C10457u.m856b(doubleToIntFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C10657m0.m657A(this.f20983a.mo805l(C10463x.m852a(doubleToLongFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C10571T2.m769A(this.f20983a.mo801s(C10445o.m871a(doubleFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble max() {
        return AbstractC10473j.m839f(this.f20983a.max());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble min() {
        return AbstractC10473j.m839f(this.f20983a.min());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return this.f20983a.mo810X(C10451r.m865b(doublePredicate));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream onClose(Runnable runnable) {
        return C10631h.m689A(this.f20983a.onClose(runnable));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream parallel() {
        return C10631h.m689A(this.f20983a.parallel());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: parallel */
    public final /* synthetic */ DoubleStream parallel2() {
        return m815A(this.f20983a.parallel());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream peek(DoubleConsumer doubleConsumer) {
        return m815A(this.f20983a.mo808c(C10439l.m879a(doubleConsumer)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f20983a.mo811W(d, C10431h.m883a(doubleBinaryOperator));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC10473j.m839f(this.f20983a.mo812T(C10431h.m883a(doubleBinaryOperator)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream sequential() {
        return C10631h.m689A(this.f20983a.sequential());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: sequential */
    public final /* synthetic */ DoubleStream sequential2() {
        return m815A(this.f20983a.sequential());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream skip(long j) {
        return m815A(this.f20983a.skip(j));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream sorted() {
        return m815A(this.f20983a.sorted());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Double> spliterator() {
        return C10308C.m1041a(this.f20983a.spliterator());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: spliterator */
    public final /* synthetic */ Spliterator<Double> spliterator2() {
        return C10320O.m1028a(this.f20983a.spliterator());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double sum() {
        return this.f20983a.sum();
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleSummaryStatistics summaryStatistics() {
        this.f20983a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double[] toArray() {
        return this.f20983a.toArray();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream unordered() {
        return C10631h.m689A(this.f20983a.unordered());
    }
}
