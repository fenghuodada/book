package p060j$.util.stream;

import java.util.Iterator;
import java.util.stream.DoubleStream;
import p060j$.util.AbstractC10473j;
import p060j$.util.C10307B;
import p060j$.util.C10319N;
import p060j$.util.C10469g;
import p060j$.util.C10474k;
import p060j$.util.C10478o;
import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10321P;
import p060j$.util.InterfaceC10480q;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.C10373B;
import p060j$.util.function.C10398N0;
import p060j$.util.function.C10417a;
import p060j$.util.function.C10433i;
import p060j$.util.function.C10441m;
import p060j$.util.function.C10447p;
import p060j$.util.function.C10453s;
import p060j$.util.function.C10459v;
import p060j$.util.function.C10465y;
import p060j$.util.function.C10468z0;
import p060j$.util.function.InterfaceC10372A0;
import p060j$.util.function.InterfaceC10375C;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10435j;
import p060j$.util.function.InterfaceC10443n;
import p060j$.util.function.InterfaceC10449q;
import p060j$.util.function.InterfaceC10455t;
import p060j$.util.function.InterfaceC10461w;
import p060j$.util.function.InterfaceC10467z;
import p060j$.util.stream.IntStream;

/* renamed from: j$.util.stream.E */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10503E implements InterfaceC10513G {

    /* renamed from: a */
    public final /* synthetic */ DoubleStream f20977a;

    private /* synthetic */ C10503E(DoubleStream doubleStream) {
        this.f20977a = doubleStream;
    }

    /* renamed from: A */
    public static /* synthetic */ InterfaceC10513G m816A(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C10508F ? ((C10508F) doubleStream).f20983a : new C10503E(doubleStream);
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: F */
    public final /* synthetic */ IntStream mo814F(InterfaceC10461w interfaceC10461w) {
        return IntStream.VivifiedWrapper.convert(this.f20977a.mapToInt(C10459v.m855a(interfaceC10461w)));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: L */
    public final /* synthetic */ void mo813L(InterfaceC10443n interfaceC10443n) {
        this.f20977a.forEach(C10441m.m873a(interfaceC10443n));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: T */
    public final /* synthetic */ C10474k mo812T(InterfaceC10435j interfaceC10435j) {
        return AbstractC10473j.m843b(this.f20977a.reduce(C10433i.m882a(interfaceC10435j)));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: W */
    public final /* synthetic */ double mo811W(double d, InterfaceC10435j interfaceC10435j) {
        return this.f20977a.reduce(d, C10433i.m882a(interfaceC10435j));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: X */
    public final /* synthetic */ boolean mo810X(InterfaceC10455t interfaceC10455t) {
        return this.f20977a.noneMatch(C10453s.m859a(interfaceC10455t));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ C10474k average() {
        return AbstractC10473j.m843b(this.f20977a.average());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: b0 */
    public final /* synthetic */ boolean mo809b0(InterfaceC10455t interfaceC10455t) {
        return this.f20977a.allMatch(C10453s.m859a(interfaceC10455t));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10575U2 boxed() {
        return C10567S2.m770A(this.f20977a.boxed());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: c */
    public final /* synthetic */ InterfaceC10513G mo808c(InterfaceC10443n interfaceC10443n) {
        return m816A(this.f20977a.peek(C10441m.m873a(interfaceC10443n)));
    }

    @Override // p060j$.util.stream.InterfaceC10636i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f20977a.close();
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ long count() {
        return this.f20977a.count();
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10513G distinct() {
        return m816A(this.f20977a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10503E) {
            obj = ((C10503E) obj).f20977a;
        }
        return this.f20977a.equals(obj);
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ C10474k findAny() {
        return AbstractC10473j.m843b(this.f20977a.findAny());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ C10474k findFirst() {
        return AbstractC10473j.m843b(this.f20977a.findFirst());
    }

    public final /* synthetic */ int hashCode() {
        return this.f20977a.hashCode();
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ boolean isParallel() {
        return this.f20977a.isParallel();
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10480q iterator() {
        return C10478o.m824a(this.f20977a.iterator());
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ Iterator iterator() {
        return this.f20977a.iterator();
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: j */
    public final /* synthetic */ InterfaceC10513G mo807j(InterfaceC10455t interfaceC10455t) {
        return m816A(this.f20977a.filter(C10453s.m859a(interfaceC10455t)));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: k */
    public final /* synthetic */ InterfaceC10513G mo806k(InterfaceC10449q interfaceC10449q) {
        return m816A(this.f20977a.flatMap(C10447p.m868a(interfaceC10449q)));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: l */
    public final /* synthetic */ InterfaceC10662n0 mo805l(InterfaceC10467z interfaceC10467z) {
        return C10652l0.m659A(this.f20977a.mapToLong(C10465y.m851a(interfaceC10467z)));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10513G limit(long j) {
        return m816A(this.f20977a.limit(j));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ C10474k max() {
        return AbstractC10473j.m843b(this.f20977a.max());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ C10474k min() {
        return AbstractC10473j.m843b(this.f20977a.min());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: o0 */
    public final /* synthetic */ void mo804o0(InterfaceC10443n interfaceC10443n) {
        this.f20977a.forEachOrdered(C10441m.m873a(interfaceC10443n));
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ InterfaceC10636i onClose(Runnable runnable) {
        return C10626g.m691A(this.f20977a.onClose(runnable));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10513G parallel() {
        return m816A(this.f20977a.parallel());
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10636i parallel() {
        return C10626g.m691A(this.f20977a.parallel());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: q */
    public final /* synthetic */ Object mo803q(InterfaceC10400O0 interfaceC10400O0, InterfaceC10372A0 interfaceC10372A0, BiConsumer biConsumer) {
        return this.f20977a.collect(C10398N0.m916a(interfaceC10400O0), C10468z0.m849a(interfaceC10372A0), C10417a.m892a(biConsumer));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: r */
    public final /* synthetic */ InterfaceC10513G mo802r(InterfaceC10375C interfaceC10375C) {
        return m816A(this.f20977a.map(C10373B.m931a(interfaceC10375C)));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: s */
    public final /* synthetic */ InterfaceC10575U2 mo801s(InterfaceC10449q interfaceC10449q) {
        return C10567S2.m770A(this.f20977a.mapToObj(C10447p.m868a(interfaceC10449q)));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10513G sequential() {
        return m816A(this.f20977a.sequential());
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10636i sequential() {
        return C10626g.m691A(this.f20977a.sequential());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10513G skip(long j) {
        return m816A(this.f20977a.skip(j));
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10513G sorted() {
        return m816A(this.f20977a.sorted());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10309D spliterator() {
        return C10307B.m1042e(this.f20977a.spliterator());
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10321P spliterator() {
        return C10319N.m1029e(this.f20977a.spliterator());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ double sum() {
        return this.f20977a.sum();
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final C10469g summaryStatistics() {
        this.f20977a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ double[] toArray() {
        return this.f20977a.toArray();
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ InterfaceC10636i unordered() {
        return C10626g.m691A(this.f20977a.unordered());
    }

    @Override // p060j$.util.stream.InterfaceC10513G
    /* renamed from: z */
    public final /* synthetic */ boolean mo800z(InterfaceC10455t interfaceC10455t) {
        return this.f20977a.anyMatch(C10453s.m859a(interfaceC10455t));
    }
}
