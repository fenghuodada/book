package p060j$.util.stream;

import java.util.Iterator;
import java.util.stream.LongStream;
import p060j$.util.AbstractC10473j;
import p060j$.util.C10313H;
import p060j$.util.C10319N;
import p060j$.util.C10472i;
import p060j$.util.C10474k;
import p060j$.util.C10476m;
import p060j$.util.C10729w;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10321P;
import p060j$.util.InterfaceC10731y;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.C10382F0;
import p060j$.util.function.C10398N0;
import p060j$.util.function.C10417a;
import p060j$.util.function.C10422c0;
import p060j$.util.function.C10430g0;
import p060j$.util.function.C10436j0;
import p060j$.util.function.C10442m0;
import p060j$.util.function.C10448p0;
import p060j$.util.function.C10454s0;
import p060j$.util.function.C10462w0;
import p060j$.util.function.InterfaceC10384G0;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10424d0;
import p060j$.util.function.InterfaceC10432h0;
import p060j$.util.function.InterfaceC10438k0;
import p060j$.util.function.InterfaceC10444n0;
import p060j$.util.function.InterfaceC10450q0;
import p060j$.util.function.InterfaceC10456t0;
import p060j$.util.function.InterfaceC10464x0;
import p060j$.util.stream.IntStream;

/* renamed from: j$.util.stream.l0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10652l0 implements InterfaceC10662n0 {

    /* renamed from: a */
    public final /* synthetic */ LongStream f21202a;

    private /* synthetic */ C10652l0(LongStream longStream) {
        this.f21202a = longStream;
    }

    /* renamed from: A */
    public static /* synthetic */ InterfaceC10662n0 m659A(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C10657m0 ? ((C10657m0) longStream).f21207a : new C10652l0(longStream);
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: B */
    public final /* synthetic */ void mo646B(InterfaceC10432h0 interfaceC10432h0) {
        this.f21202a.forEachOrdered(C10430g0.m884a(interfaceC10432h0));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: C */
    public final /* synthetic */ Object mo645C(InterfaceC10400O0 interfaceC10400O0, InterfaceC10384G0 interfaceC10384G0, BiConsumer biConsumer) {
        return this.f21202a.collect(C10398N0.m916a(interfaceC10400O0), C10382F0.m924a(interfaceC10384G0), C10417a.m892a(biConsumer));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: D */
    public final /* synthetic */ boolean mo644D(InterfaceC10444n0 interfaceC10444n0) {
        return this.f21202a.allMatch(C10442m0.m872a(interfaceC10444n0));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: I */
    public final /* synthetic */ void mo643I(InterfaceC10432h0 interfaceC10432h0) {
        this.f21202a.forEach(C10430g0.m884a(interfaceC10432h0));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: O */
    public final /* synthetic */ InterfaceC10513G mo642O(InterfaceC10450q0 interfaceC10450q0) {
        return C10503E.m816A(this.f21202a.mapToDouble(C10448p0.m867a(interfaceC10450q0)));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: S */
    public final /* synthetic */ InterfaceC10662n0 mo641S(InterfaceC10464x0 interfaceC10464x0) {
        return m659A(this.f21202a.map(C10462w0.m853a(interfaceC10464x0)));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: Z */
    public final /* synthetic */ IntStream mo640Z(InterfaceC10456t0 interfaceC10456t0) {
        return IntStream.VivifiedWrapper.convert(this.f21202a.mapToInt(C10454s0.m858a(interfaceC10456t0)));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: a0 */
    public final /* synthetic */ InterfaceC10575U2 mo639a0(InterfaceC10438k0 interfaceC10438k0) {
        return C10567S2.m770A(this.f21202a.mapToObj(C10436j0.m880a(interfaceC10438k0)));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ InterfaceC10513G asDoubleStream() {
        return C10503E.m816A(this.f21202a.asDoubleStream());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ C10474k average() {
        return AbstractC10473j.m843b(this.f21202a.average());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: b */
    public final /* synthetic */ boolean mo638b(InterfaceC10444n0 interfaceC10444n0) {
        return this.f21202a.noneMatch(C10442m0.m872a(interfaceC10444n0));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ InterfaceC10575U2 boxed() {
        return C10567S2.m770A(this.f21202a.boxed());
    }

    @Override // p060j$.util.stream.InterfaceC10636i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21202a.close();
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ long count() {
        return this.f21202a.count();
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ InterfaceC10662n0 distinct() {
        return m659A(this.f21202a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10652l0) {
            obj = ((C10652l0) obj).f21202a;
        }
        return this.f21202a.equals(obj);
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: f */
    public final /* synthetic */ C10476m mo637f(InterfaceC10424d0 interfaceC10424d0) {
        return AbstractC10473j.m841d(this.f21202a.reduce(C10422c0.m889a(interfaceC10424d0)));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ C10476m findAny() {
        return AbstractC10473j.m841d(this.f21202a.findAny());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ C10476m findFirst() {
        return AbstractC10473j.m841d(this.f21202a.findFirst());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: h */
    public final /* synthetic */ InterfaceC10662n0 mo636h(InterfaceC10432h0 interfaceC10432h0) {
        return m659A(this.f21202a.peek(C10430g0.m884a(interfaceC10432h0)));
    }

    public final /* synthetic */ int hashCode() {
        return this.f21202a.hashCode();
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: i */
    public final /* synthetic */ InterfaceC10662n0 mo635i(InterfaceC10438k0 interfaceC10438k0) {
        return m659A(this.f21202a.flatMap(C10436j0.m880a(interfaceC10438k0)));
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ boolean isParallel() {
        return this.f21202a.isParallel();
    }

    @Override // p060j$.util.stream.InterfaceC10662n0, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10731y iterator() {
        return C10729w.m513a(this.f21202a.iterator());
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ Iterator iterator() {
        return this.f21202a.iterator();
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: j0 */
    public final /* synthetic */ boolean mo634j0(InterfaceC10444n0 interfaceC10444n0) {
        return this.f21202a.anyMatch(C10442m0.m872a(interfaceC10444n0));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ InterfaceC10662n0 limit(long j) {
        return m659A(this.f21202a.limit(j));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: m0 */
    public final /* synthetic */ InterfaceC10662n0 mo633m0(InterfaceC10444n0 interfaceC10444n0) {
        return m659A(this.f21202a.filter(C10442m0.m872a(interfaceC10444n0)));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ C10476m max() {
        return AbstractC10473j.m841d(this.f21202a.max());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ C10476m min() {
        return AbstractC10473j.m841d(this.f21202a.min());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    /* renamed from: o */
    public final /* synthetic */ long mo632o(long j, InterfaceC10424d0 interfaceC10424d0) {
        return this.f21202a.reduce(j, C10422c0.m889a(interfaceC10424d0));
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ InterfaceC10636i onClose(Runnable runnable) {
        return C10626g.m691A(this.f21202a.onClose(runnable));
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10636i parallel() {
        return C10626g.m691A(this.f21202a.parallel());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10662n0 parallel() {
        return m659A(this.f21202a.parallel());
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10636i sequential() {
        return C10626g.m691A(this.f21202a.sequential());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10662n0 sequential() {
        return m659A(this.f21202a.sequential());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ InterfaceC10662n0 skip(long j) {
        return m659A(this.f21202a.skip(j));
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ InterfaceC10662n0 sorted() {
        return m659A(this.f21202a.sorted());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0, p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10315J spliterator() {
        return C10313H.m1033e(this.f21202a.spliterator());
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10321P spliterator() {
        return C10319N.m1029e(this.f21202a.spliterator());
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ long sum() {
        return this.f21202a.sum();
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final C10472i summaryStatistics() {
        this.f21202a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // p060j$.util.stream.InterfaceC10662n0
    public final /* synthetic */ long[] toArray() {
        return this.f21202a.toArray();
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ InterfaceC10636i unordered() {
        return C10626g.m691A(this.f21202a.unordered());
    }
}
