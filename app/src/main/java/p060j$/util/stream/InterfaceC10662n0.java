package p060j$.util.stream;

import p060j$.util.C10472i;
import p060j$.util.C10474k;
import p060j$.util.C10476m;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10731y;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.InterfaceC10384G0;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10424d0;
import p060j$.util.function.InterfaceC10432h0;
import p060j$.util.function.InterfaceC10438k0;
import p060j$.util.function.InterfaceC10444n0;
import p060j$.util.function.InterfaceC10450q0;
import p060j$.util.function.InterfaceC10456t0;
import p060j$.util.function.InterfaceC10464x0;

/* renamed from: j$.util.stream.n0 */
/* loaded from: classes2.dex */
public interface InterfaceC10662n0 extends InterfaceC10636i {
    /* renamed from: B */
    void mo646B(InterfaceC10432h0 interfaceC10432h0);

    /* renamed from: C */
    Object mo645C(InterfaceC10400O0 interfaceC10400O0, InterfaceC10384G0 interfaceC10384G0, BiConsumer biConsumer);

    /* renamed from: D */
    boolean mo644D(InterfaceC10444n0 interfaceC10444n0);

    /* renamed from: I */
    void mo643I(InterfaceC10432h0 interfaceC10432h0);

    /* renamed from: O */
    InterfaceC10513G mo642O(InterfaceC10450q0 interfaceC10450q0);

    /* renamed from: S */
    InterfaceC10662n0 mo641S(InterfaceC10464x0 interfaceC10464x0);

    /* renamed from: Z */
    IntStream mo640Z(InterfaceC10456t0 interfaceC10456t0);

    /* renamed from: a0 */
    InterfaceC10575U2 mo639a0(InterfaceC10438k0 interfaceC10438k0);

    InterfaceC10513G asDoubleStream();

    C10474k average();

    /* renamed from: b */
    boolean mo638b(InterfaceC10444n0 interfaceC10444n0);

    InterfaceC10575U2 boxed();

    long count();

    InterfaceC10662n0 distinct();

    /* renamed from: f */
    C10476m mo637f(InterfaceC10424d0 interfaceC10424d0);

    C10476m findAny();

    C10476m findFirst();

    /* renamed from: h */
    InterfaceC10662n0 mo636h(InterfaceC10432h0 interfaceC10432h0);

    /* renamed from: i */
    InterfaceC10662n0 mo635i(InterfaceC10438k0 interfaceC10438k0);

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    InterfaceC10731y iterator();

    /* renamed from: j0 */
    boolean mo634j0(InterfaceC10444n0 interfaceC10444n0);

    InterfaceC10662n0 limit(long j);

    /* renamed from: m0 */
    InterfaceC10662n0 mo633m0(InterfaceC10444n0 interfaceC10444n0);

    C10476m max();

    C10476m min();

    /* renamed from: o */
    long mo632o(long j, InterfaceC10424d0 interfaceC10424d0);

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    InterfaceC10662n0 parallel();

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    InterfaceC10662n0 sequential();

    InterfaceC10662n0 skip(long j);

    InterfaceC10662n0 sorted();

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    InterfaceC10315J spliterator();

    long sum();

    C10472i summaryStatistics();

    long[] toArray();
}
