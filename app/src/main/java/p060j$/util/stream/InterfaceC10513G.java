package p060j$.util.stream;

import p060j$.util.C10469g;
import p060j$.util.C10474k;
import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10480q;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.InterfaceC10372A0;
import p060j$.util.function.InterfaceC10375C;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10435j;
import p060j$.util.function.InterfaceC10443n;
import p060j$.util.function.InterfaceC10449q;
import p060j$.util.function.InterfaceC10455t;
import p060j$.util.function.InterfaceC10461w;
import p060j$.util.function.InterfaceC10467z;

/* renamed from: j$.util.stream.G */
/* loaded from: classes2.dex */
public interface InterfaceC10513G extends InterfaceC10636i {
    /* renamed from: F */
    IntStream mo814F(InterfaceC10461w interfaceC10461w);

    /* renamed from: L */
    void mo813L(InterfaceC10443n interfaceC10443n);

    /* renamed from: T */
    C10474k mo812T(InterfaceC10435j interfaceC10435j);

    /* renamed from: W */
    double mo811W(double d, InterfaceC10435j interfaceC10435j);

    /* renamed from: X */
    boolean mo810X(InterfaceC10455t interfaceC10455t);

    C10474k average();

    /* renamed from: b0 */
    boolean mo809b0(InterfaceC10455t interfaceC10455t);

    InterfaceC10575U2 boxed();

    /* renamed from: c */
    InterfaceC10513G mo808c(InterfaceC10443n interfaceC10443n);

    long count();

    InterfaceC10513G distinct();

    C10474k findAny();

    C10474k findFirst();

    @Override // 
    InterfaceC10480q iterator();

    /* renamed from: j */
    InterfaceC10513G mo807j(InterfaceC10455t interfaceC10455t);

    /* renamed from: k */
    InterfaceC10513G mo806k(InterfaceC10449q interfaceC10449q);

    /* renamed from: l */
    InterfaceC10662n0 mo805l(InterfaceC10467z interfaceC10467z);

    InterfaceC10513G limit(long j);

    C10474k max();

    C10474k min();

    /* renamed from: o0 */
    void mo804o0(InterfaceC10443n interfaceC10443n);

    @Override // 
    InterfaceC10513G parallel();

    /* renamed from: q */
    Object mo803q(InterfaceC10400O0 interfaceC10400O0, InterfaceC10372A0 interfaceC10372A0, BiConsumer biConsumer);

    /* renamed from: r */
    InterfaceC10513G mo802r(InterfaceC10375C interfaceC10375C);

    /* renamed from: s */
    InterfaceC10575U2 mo801s(InterfaceC10449q interfaceC10449q);

    @Override // 
    InterfaceC10513G sequential();

    InterfaceC10513G skip(long j);

    InterfaceC10513G sorted();

    @Override // 
    InterfaceC10309D spliterator();

    double sum();

    C10469g summaryStatistics();

    double[] toArray();

    /* renamed from: z */
    boolean mo800z(InterfaceC10455t interfaceC10455t);
}
