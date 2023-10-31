package p060j$.util.stream;

import java.util.Comparator;
import p060j$.util.Optional;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.Consumer;
import p060j$.util.function.Function;
import p060j$.util.function.InterfaceC10394L0;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10427f;
import p060j$.util.function.ToDoubleFunction;
import p060j$.util.function.ToIntFunction;
import p060j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.U2 */
/* loaded from: classes2.dex */
public interface InterfaceC10575U2 extends InterfaceC10636i {
    /* renamed from: G */
    boolean mo753G(InterfaceC10394L0 interfaceC10394L0);

    /* renamed from: J */
    void mo752J(Consumer consumer);

    /* renamed from: K */
    Object mo751K(InterfaceC10400O0 interfaceC10400O0, BiConsumer biConsumer, BiConsumer biConsumer2);

    /* renamed from: M */
    IntStream mo750M(ToIntFunction toIntFunction);

    /* renamed from: N */
    InterfaceC10575U2 mo749N(Function function);

    /* renamed from: P */
    InterfaceC10575U2 mo748P(Function function);

    /* renamed from: Q */
    Optional mo747Q(InterfaceC10427f interfaceC10427f);

    /* renamed from: a */
    void mo746a(Consumer consumer);

    long count();

    /* renamed from: d */
    IntStream mo745d(Function function);

    InterfaceC10575U2 distinct();

    /* renamed from: e0 */
    boolean mo744e0(InterfaceC10394L0 interfaceC10394L0);

    /* renamed from: f0 */
    InterfaceC10662n0 mo743f0(Function function);

    Optional findAny();

    Optional findFirst();

    /* renamed from: g */
    Object[] mo742g(InterfaceC10397N interfaceC10397N);

    /* renamed from: k0 */
    boolean mo741k0(InterfaceC10394L0 interfaceC10394L0);

    /* renamed from: l0 */
    InterfaceC10662n0 mo740l0(ToLongFunction toLongFunction);

    InterfaceC10575U2 limit(long j);

    Optional max(Comparator comparator);

    Optional min(Comparator comparator);

    /* renamed from: n */
    Object mo739n(Object obj, BiFunction biFunction, InterfaceC10427f interfaceC10427f);

    /* renamed from: n0 */
    InterfaceC10513G mo738n0(ToDoubleFunction toDoubleFunction);

    /* renamed from: p */
    InterfaceC10513G mo737p(Function function);

    /* renamed from: q0 */
    Object mo736q0(Object obj, InterfaceC10427f interfaceC10427f);

    InterfaceC10575U2 skip(long j);

    InterfaceC10575U2 sorted();

    InterfaceC10575U2 sorted(Comparator comparator);

    Object[] toArray();

    /* renamed from: v */
    InterfaceC10575U2 mo735v(InterfaceC10394L0 interfaceC10394L0);

    /* renamed from: x */
    InterfaceC10575U2 mo734x(Consumer consumer);

    /* renamed from: y */
    Object mo733y(InterfaceC10656m interfaceC10656m);
}
