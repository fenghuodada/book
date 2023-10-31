package p060j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p060j$.util.AbstractC10473j;
import p060j$.util.C10320O;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.C10390J0;
import p060j$.util.function.C10393L;
import p060j$.util.function.C10396M0;
import p060j$.util.function.C10423d;
import p060j$.util.function.Consumer;
import p060j$.util.function.Function;
import p060j$.util.function.ToDoubleFunction;
import p060j$.util.function.ToIntFunction;
import p060j$.util.function.ToLongFunction;
import p060j$.util.stream.IntStream;

/* renamed from: j$.util.stream.T2 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10571T2 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10575U2 f21075a;

    private /* synthetic */ C10571T2(InterfaceC10575U2 interfaceC10575U2) {
        this.f21075a = interfaceC10575U2;
    }

    /* renamed from: A */
    public static /* synthetic */ Stream m769A(InterfaceC10575U2 interfaceC10575U2) {
        if (interfaceC10575U2 == null) {
            return null;
        }
        return interfaceC10575U2 instanceof C10567S2 ? ((C10567S2) interfaceC10575U2).f21071a : new C10571T2(interfaceC10575U2);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f21075a.mo744e0(C10390J0.m921c(predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f21075a.mo753G(C10390J0.m921c(predicate));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21075a.close();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f21075a.mo751K(C10396M0.m917a(supplier), BiConsumer.VivifiedWrapper.convert(biConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer2));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        return this.f21075a.mo733y(C10646k.m672d(collector));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f21075a.count();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return m769A(this.f21075a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10575U2 interfaceC10575U2 = this.f21075a;
        if (obj instanceof C10571T2) {
            obj = ((C10571T2) obj).f21075a;
        }
        return interfaceC10575U2.equals(obj);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return m769A(this.f21075a.mo735v(C10390J0.m921c(predicate)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return AbstractC10473j.m840e(this.f21075a.findAny());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return AbstractC10473j.m840e(this.f21075a.findFirst());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream flatMap(Function function) {
        return m769A(this.f21075a.mo748P(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream flatMapToDouble(java.util.function.Function function) {
        return C10508F.m815A(this.f21075a.mo737p(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ IntStream flatMapToInt(java.util.function.Function function) {
        return IntStream.Wrapper.convert(this.f21075a.mo745d(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ LongStream flatMapToLong(java.util.function.Function function) {
        return C10657m0.m657A(this.f21075a.mo743f0(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f21075a.mo746a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
        this.f21075a.mo752J(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f21075a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f21075a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f21075a.iterator();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return m769A(this.f21075a.limit(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream map(java.util.function.Function function) {
        return m769A(this.f21075a.mo749N(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C10508F.m815A(this.f21075a.mo738n0(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.Wrapper.convert(this.f21075a.mo750M(ToIntFunction.VivifiedWrapper.convert(toIntFunction)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
        return C10657m0.m657A(this.f21075a.mo740l0(ToLongFunction.VivifiedWrapper.convert(toLongFunction)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC10473j.m840e(this.f21075a.max(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC10473j.m840e(this.f21075a.min(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f21075a.mo741k0(C10390J0.m921c(predicate));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C10631h.m689A(this.f21075a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return C10631h.m689A(this.f21075a.parallel());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream peek(java.util.function.Consumer consumer) {
        return m769A(this.f21075a.mo734x(Consumer.VivifiedWrapper.convert(consumer)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f21075a.mo739n(obj, BiFunction.VivifiedWrapper.convert(biFunction), C10423d.m888b(binaryOperator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f21075a.mo736q0(obj, C10423d.m888b(binaryOperator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC10473j.m840e(this.f21075a.mo747Q(C10423d.m888b(binaryOperator)));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return C10631h.m689A(this.f21075a.sequential());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return m769A(this.f21075a.skip(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return m769A(this.f21075a.sorted());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return m769A(this.f21075a.sorted(comparator));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return C10320O.m1028a(this.f21075a.spliterator());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f21075a.toArray();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f21075a.mo742g(C10393L.m919a(intFunction));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C10631h.m689A(this.f21075a.unordered());
    }
}
