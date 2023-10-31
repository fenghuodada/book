package p060j$.util.stream;

import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p060j$.util.AbstractC10473j;
import p060j$.util.C10314I;
import p060j$.util.C10320O;
import p060j$.util.C10730x;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.C10380E0;
import p060j$.util.function.C10396M0;
import p060j$.util.function.C10420b0;
import p060j$.util.function.C10428f0;
import p060j$.util.function.C10434i0;
import p060j$.util.function.C10440l0;
import p060j$.util.function.C10446o0;
import p060j$.util.function.C10452r0;
import p060j$.util.function.C10460v0;
import p060j$.util.stream.IntStream;

/* renamed from: j$.util.stream.m0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10657m0 implements LongStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10662n0 f21207a;

    private /* synthetic */ C10657m0(InterfaceC10662n0 interfaceC10662n0) {
        this.f21207a = interfaceC10662n0;
    }

    /* renamed from: A */
    public static /* synthetic */ LongStream m657A(InterfaceC10662n0 interfaceC10662n0) {
        if (interfaceC10662n0 == null) {
            return null;
        }
        return interfaceC10662n0 instanceof C10652l0 ? ((C10652l0) interfaceC10662n0).f21202a : new C10657m0(interfaceC10662n0);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.f21207a.mo644D(C10440l0.m877b(longPredicate));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.f21207a.mo634j0(C10440l0.m877b(longPredicate));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C10508F.m815A(this.f21207a.asDoubleStream());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC10473j.m839f(this.f21207a.average());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        return C10571T2.m769A(this.f21207a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21207a.close();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f21207a.mo645C(C10396M0.m917a(supplier), C10380E0.m926a(objLongConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.f21207a.count();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        return m657A(this.f21207a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10662n0 interfaceC10662n0 = this.f21207a;
        if (obj instanceof C10657m0) {
            obj = ((C10657m0) obj).f21207a;
        }
        return interfaceC10662n0.equals(obj);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream filter(LongPredicate longPredicate) {
        return m657A(this.f21207a.mo633m0(C10440l0.m877b(longPredicate)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findAny() {
        return AbstractC10473j.m837h(this.f21207a.findAny());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findFirst() {
        return AbstractC10473j.m837h(this.f21207a.findFirst());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream flatMap(LongFunction longFunction) {
        return m657A(this.f21207a.mo635i(C10434i0.m881a(longFunction)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f21207a.mo643I(C10428f0.m886a(longConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f21207a.mo646B(C10428f0.m886a(longConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f21207a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f21207a.isParallel();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Long> iterator() {
        return this.f21207a.iterator();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator<Long> iterator2() {
        return C10730x.m512a(this.f21207a.iterator());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j) {
        return m657A(this.f21207a.limit(j));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream map(LongUnaryOperator longUnaryOperator) {
        return m657A(this.f21207a.mo641S(C10460v0.m854c(longUnaryOperator)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        return C10508F.m815A(this.f21207a.mo642O(C10446o0.m869b(longToDoubleFunction)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ IntStream mapToInt(LongToIntFunction longToIntFunction) {
        return IntStream.Wrapper.convert(this.f21207a.mo640Z(C10452r0.m860b(longToIntFunction)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C10571T2.m769A(this.f21207a.mo639a0(C10434i0.m881a(longFunction)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong max() {
        return AbstractC10473j.m837h(this.f21207a.max());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong min() {
        return AbstractC10473j.m837h(this.f21207a.min());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.f21207a.mo638b(C10440l0.m877b(longPredicate));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream onClose(Runnable runnable) {
        return C10631h.m689A(this.f21207a.onClose(runnable));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream parallel() {
        return C10631h.m689A(this.f21207a.parallel());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: parallel */
    public final /* synthetic */ LongStream parallel2() {
        return m657A(this.f21207a.parallel());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return m657A(this.f21207a.mo636h(C10428f0.m886a(longConsumer)));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.f21207a.mo632o(j, C10420b0.m890a(longBinaryOperator));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC10473j.m837h(this.f21207a.mo637f(C10420b0.m890a(longBinaryOperator)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream sequential() {
        return C10631h.m689A(this.f21207a.sequential());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: sequential */
    public final /* synthetic */ LongStream sequential2() {
        return m657A(this.f21207a.sequential());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j) {
        return m657A(this.f21207a.skip(j));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return m657A(this.f21207a.sorted());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Long> spliterator() {
        return C10314I.m1032a(this.f21207a.spliterator());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: spliterator */
    public final /* synthetic */ Spliterator<Long> spliterator2() {
        return C10320O.m1028a(this.f21207a.spliterator());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.f21207a.sum();
    }

    @Override // java.util.stream.LongStream
    public final LongSummaryStatistics summaryStatistics() {
        this.f21207a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.f21207a.toArray();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream unordered() {
        return C10631h.m689A(this.f21207a.unordered());
    }
}
