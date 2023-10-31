package p060j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;
import p060j$.util.AbstractC10473j;
import p060j$.util.C10319N;
import p060j$.util.InterfaceC10321P;
import p060j$.util.Optional;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.C10377D;
import p060j$.util.function.C10392K0;
import p060j$.util.function.C10395M;
import p060j$.util.function.C10398N0;
import p060j$.util.function.C10402P0;
import p060j$.util.function.C10404Q0;
import p060j$.util.function.C10405R0;
import p060j$.util.function.C10417a;
import p060j$.util.function.C10419b;
import p060j$.util.function.C10425e;
import p060j$.util.function.C10429g;
import p060j$.util.function.Consumer;
import p060j$.util.function.Function;
import p060j$.util.function.InterfaceC10394L0;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10427f;
import p060j$.util.function.ToDoubleFunction;
import p060j$.util.function.ToIntFunction;
import p060j$.util.function.ToLongFunction;
import p060j$.util.stream.IntStream;

/* renamed from: j$.util.stream.S2 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10567S2 implements InterfaceC10575U2 {

    /* renamed from: a */
    public final /* synthetic */ Stream f21071a;

    private /* synthetic */ C10567S2(Stream stream) {
        this.f21071a = stream;
    }

    /* renamed from: A */
    public static /* synthetic */ InterfaceC10575U2 m770A(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof C10571T2 ? ((C10571T2) stream).f21075a : new C10567S2(stream);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: G */
    public final /* synthetic */ boolean mo753G(InterfaceC10394L0 interfaceC10394L0) {
        return this.f21071a.anyMatch(C10392K0.m920a(interfaceC10394L0));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: J */
    public final /* synthetic */ void mo752J(Consumer consumer) {
        this.f21071a.forEachOrdered(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: K */
    public final /* synthetic */ Object mo751K(InterfaceC10400O0 interfaceC10400O0, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f21071a.collect(C10398N0.m916a(interfaceC10400O0), C10417a.m892a(biConsumer), C10417a.m892a(biConsumer2));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: M */
    public final /* synthetic */ IntStream mo750M(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f21071a.mapToInt(C10404Q0.m908a(toIntFunction)));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: N */
    public final /* synthetic */ InterfaceC10575U2 mo749N(Function function) {
        return m770A(this.f21071a.map(C10377D.m928a(function)));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: P */
    public final /* synthetic */ InterfaceC10575U2 mo748P(Function function) {
        return m770A(this.f21071a.flatMap(C10377D.m928a(function)));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: Q */
    public final /* synthetic */ Optional mo747Q(InterfaceC10427f interfaceC10427f) {
        return AbstractC10473j.m844a(this.f21071a.reduce(C10425e.m887a(interfaceC10427f)));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: a */
    public final /* synthetic */ void mo746a(Consumer consumer) {
        this.f21071a.forEach(C10429g.m885a(consumer));
    }

    @Override // p060j$.util.stream.InterfaceC10636i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21071a.close();
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final /* synthetic */ long count() {
        return this.f21071a.count();
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: d */
    public final /* synthetic */ IntStream mo745d(Function function) {
        return IntStream.VivifiedWrapper.convert(this.f21071a.flatMapToInt(C10377D.m928a(function)));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final /* synthetic */ InterfaceC10575U2 distinct() {
        return m770A(this.f21071a.distinct());
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: e0 */
    public final /* synthetic */ boolean mo744e0(InterfaceC10394L0 interfaceC10394L0) {
        return this.f21071a.allMatch(C10392K0.m920a(interfaceC10394L0));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10567S2) {
            obj = ((C10567S2) obj).f21071a;
        }
        return this.f21071a.equals(obj);
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: f0 */
    public final /* synthetic */ InterfaceC10662n0 mo743f0(Function function) {
        return C10652l0.m659A(this.f21071a.flatMapToLong(C10377D.m928a(function)));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final /* synthetic */ Optional findAny() {
        return AbstractC10473j.m844a(this.f21071a.findAny());
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final /* synthetic */ Optional findFirst() {
        return AbstractC10473j.m844a(this.f21071a.findFirst());
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: g */
    public final /* synthetic */ Object[] mo742g(InterfaceC10397N interfaceC10397N) {
        return this.f21071a.toArray(C10395M.m918a(interfaceC10397N));
    }

    public final /* synthetic */ int hashCode() {
        return this.f21071a.hashCode();
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ boolean isParallel() {
        return this.f21071a.isParallel();
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ Iterator iterator() {
        return this.f21071a.iterator();
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: k0 */
    public final /* synthetic */ boolean mo741k0(InterfaceC10394L0 interfaceC10394L0) {
        return this.f21071a.noneMatch(C10392K0.m920a(interfaceC10394L0));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: l0 */
    public final /* synthetic */ InterfaceC10662n0 mo740l0(ToLongFunction toLongFunction) {
        return C10652l0.m659A(this.f21071a.mapToLong(C10405R0.m907a(toLongFunction)));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final /* synthetic */ InterfaceC10575U2 limit(long j) {
        return m770A(this.f21071a.limit(j));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC10473j.m844a(this.f21071a.max(comparator));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC10473j.m844a(this.f21071a.min(comparator));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: n */
    public final /* synthetic */ Object mo739n(Object obj, BiFunction biFunction, InterfaceC10427f interfaceC10427f) {
        return this.f21071a.reduce(obj, C10419b.m891a(biFunction), C10425e.m887a(interfaceC10427f));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: n0 */
    public final /* synthetic */ InterfaceC10513G mo738n0(ToDoubleFunction toDoubleFunction) {
        return C10503E.m816A(this.f21071a.mapToDouble(C10402P0.m909a(toDoubleFunction)));
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ InterfaceC10636i onClose(Runnable runnable) {
        return C10626g.m691A(this.f21071a.onClose(runnable));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: p */
    public final /* synthetic */ InterfaceC10513G mo737p(Function function) {
        return C10503E.m816A(this.f21071a.flatMapToDouble(C10377D.m928a(function)));
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10636i parallel() {
        return C10626g.m691A(this.f21071a.parallel());
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: q0 */
    public final /* synthetic */ Object mo736q0(Object obj, InterfaceC10427f interfaceC10427f) {
        return this.f21071a.reduce(obj, C10425e.m887a(interfaceC10427f));
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10636i sequential() {
        return C10626g.m691A(this.f21071a.sequential());
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final /* synthetic */ InterfaceC10575U2 skip(long j) {
        return m770A(this.f21071a.skip(j));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final /* synthetic */ InterfaceC10575U2 sorted() {
        return m770A(this.f21071a.sorted());
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final /* synthetic */ InterfaceC10575U2 sorted(Comparator comparator) {
        return m770A(this.f21071a.sorted(comparator));
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10321P spliterator() {
        return C10319N.m1029e(this.f21071a.spliterator());
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    public final /* synthetic */ Object[] toArray() {
        return this.f21071a.toArray();
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ InterfaceC10636i unordered() {
        return C10626g.m691A(this.f21071a.unordered());
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: v */
    public final /* synthetic */ InterfaceC10575U2 mo735v(InterfaceC10394L0 interfaceC10394L0) {
        return m770A(this.f21071a.filter(C10392K0.m920a(interfaceC10394L0)));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: x */
    public final /* synthetic */ InterfaceC10575U2 mo734x(Consumer consumer) {
        return m770A(this.f21071a.peek(C10429g.m885a(consumer)));
    }

    @Override // p060j$.util.stream.InterfaceC10575U2
    /* renamed from: y */
    public final /* synthetic */ Object mo733y(InterfaceC10656m interfaceC10656m) {
        return this.f21071a.collect(C10651l.m660a(interfaceC10656m));
    }
}
