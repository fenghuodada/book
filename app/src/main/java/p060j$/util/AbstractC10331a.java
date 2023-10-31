package p060j$.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import p060j$.time.AbstractC10240a;
import p060j$.util.Comparator;
import p060j$.util.Map;
import p060j$.util.concurrent.C10359u;
import p060j$.util.concurrent.InterfaceC10360v;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.Consumer;
import p060j$.util.function.Function;
import p060j$.util.function.InterfaceC10391K;
import p060j$.util.function.InterfaceC10394L0;
import p060j$.util.function.InterfaceC10432h0;
import p060j$.util.function.InterfaceC10443n;
import p060j$.util.stream.AbstractC10707w0;
import p060j$.util.stream.InterfaceC10575U2;

/* renamed from: j$.util.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC10331a {
    /* renamed from: A */
    public static /* synthetic */ boolean m1023A(Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
    }

    /* renamed from: B */
    public static /* synthetic */ Object m1022B(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m1021C(java.util.Map map, Object obj, Object obj2, Object obj3) {
        return map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
    }

    /* renamed from: D */
    public static void m1020D(java.util.Map map, BiFunction biFunction) {
        if (map instanceof Map) {
            ((Map) map).replaceAll(biFunction);
        } else if (!(map instanceof ConcurrentMap)) {
            Map.CC.$default$replaceAll(map, biFunction);
        } else {
            ConcurrentMap concurrentMap = (ConcurrentMap) map;
            biFunction.getClass();
            C10359u c10359u = new C10359u(0, concurrentMap, biFunction);
            if (concurrentMap instanceof InterfaceC10360v) {
                ((InterfaceC10360v) concurrentMap).forEach(c10359u);
            } else {
                AbstractC10240a.m1166a(concurrentMap, c10359u);
            }
        }
    }

    /* renamed from: E */
    public static void m1019E(List list, Comparator comparator) {
        if (DesugarCollections.f20712b.isInstance(list)) {
            DesugarCollections.m1036d(list, comparator);
            return;
        }
        Object[] array = list.toArray();
        Arrays.sort(array, comparator);
        ListIterator listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
    }

    /* renamed from: F */
    public static InterfaceC10321P m1018F(Collection collection) {
        if (collection instanceof InterfaceC10333b) {
            return ((InterfaceC10333b) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) collection;
            linkedHashSet.getClass();
            return new C10336c0(linkedHashSet, 17);
        } else if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C10306A(sortedSet, sortedSet);
        } else if (collection instanceof Set) {
            Set set = (Set) collection;
            set.getClass();
            return new C10336c0(set, 1);
        } else if (!(collection instanceof List)) {
            collection.getClass();
            return new C10336c0(collection, 0);
        } else {
            List list = (List) collection;
            list.getClass();
            return new C10336c0(list, 16);
        }
    }

    /* renamed from: G */
    public static /* synthetic */ Comparator m1017G(Comparator comparator, Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    /* renamed from: e */
    public static void m1016e(InterfaceC10309D interfaceC10309D, Consumer consumer) {
        if (consumer instanceof InterfaceC10443n) {
            interfaceC10309D.mo682d((InterfaceC10443n) consumer);
        } else if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(interfaceC10309D.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            consumer.getClass();
            interfaceC10309D.mo682d(new C10477n(consumer));
        }
    }

    /* renamed from: g */
    public static void m1015g(InterfaceC10312G interfaceC10312G, Consumer consumer) {
        if (consumer instanceof InterfaceC10391K) {
            interfaceC10312G.mo662c((InterfaceC10391K) consumer);
        } else if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(interfaceC10312G.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            consumer.getClass();
            interfaceC10312G.mo662c(new C10481r(consumer));
        }
    }

    /* renamed from: h */
    public static void m1014h(InterfaceC10315J interfaceC10315J, Consumer consumer) {
        if (consumer instanceof InterfaceC10432h0) {
            interfaceC10315J.mo651b((InterfaceC10432h0) consumer);
        } else if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(interfaceC10315J.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            consumer.getClass();
            interfaceC10315J.mo651b(new C10728v(consumer));
        }
    }

    /* renamed from: i */
    public static long m1013i(InterfaceC10321P interfaceC10321P) {
        if ((interfaceC10321P.characteristics() & 64) == 0) {
            return -1L;
        }
        return interfaceC10321P.estimateSize();
    }

    /* renamed from: j */
    public static boolean m1012j(InterfaceC10321P interfaceC10321P, int i) {
        return (interfaceC10321P.characteristics() & i) == i;
    }

    /* renamed from: l */
    public static boolean m1011l(Collection collection, InterfaceC10394L0 interfaceC10394L0) {
        if (DesugarCollections.f20711a.isInstance(collection)) {
            return DesugarCollections.m1037c(collection, interfaceC10394L0);
        }
        interfaceC10394L0.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC10394L0.test(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: m */
    public static InterfaceC10575U2 m1010m(Collection collection) {
        return AbstractC10707w0.m542x1(m1018F(collection), false);
    }

    /* renamed from: n */
    public static boolean m1009n(InterfaceC10309D interfaceC10309D, Consumer consumer) {
        if (consumer instanceof InterfaceC10443n) {
            return interfaceC10309D.mo681p((InterfaceC10443n) consumer);
        }
        if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(interfaceC10309D.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return interfaceC10309D.mo681p(new C10477n(consumer));
    }

    /* renamed from: o */
    public static boolean m1008o(InterfaceC10312G interfaceC10312G, Consumer consumer) {
        if (consumer instanceof InterfaceC10391K) {
            return interfaceC10312G.mo661k((InterfaceC10391K) consumer);
        }
        if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(interfaceC10312G.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return interfaceC10312G.mo661k(new C10481r(consumer));
    }

    /* renamed from: q */
    public static boolean m1007q(InterfaceC10315J interfaceC10315J, Consumer consumer) {
        if (consumer instanceof InterfaceC10432h0) {
            return interfaceC10315J.mo650f((InterfaceC10432h0) consumer);
        }
        if (AbstractC10470g0.f20940a) {
            AbstractC10470g0.m847a(interfaceC10315J.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return interfaceC10315J.mo650f(new C10728v(consumer));
    }

    /* renamed from: r */
    public static Object m1006r(java.util.Map map, Object obj, BiFunction biFunction) {
        Object apply;
        if (map instanceof Map) {
            return ((Map) map).compute(obj, biFunction);
        }
        if (map instanceof ConcurrentMap) {
            ConcurrentMap concurrentMap = (ConcurrentMap) map;
            biFunction.getClass();
            loop0: while (true) {
                Object obj2 = concurrentMap.get(obj);
                while (true) {
                    apply = biFunction.apply(obj, obj2);
                    if (apply != null) {
                        if (obj2 == null) {
                            obj2 = concurrentMap.putIfAbsent(obj, apply);
                            if (obj2 == null) {
                                break loop0;
                            }
                        } else if (concurrentMap.replace(obj, obj2, apply)) {
                            break;
                        }
                    } else {
                        apply = null;
                        if ((obj2 == null && !concurrentMap.containsKey(obj)) || concurrentMap.remove(obj, obj2)) {
                            break;
                        }
                    }
                }
            }
            return apply;
        }
        return Map.CC.$default$compute(map, obj, biFunction);
    }

    /* renamed from: s */
    public static Object m1005s(java.util.Map map, Object obj, Function function) {
        Object apply;
        if (map instanceof Map) {
            return ((Map) map).computeIfAbsent(obj, function);
        }
        if (map instanceof ConcurrentMap) {
            ConcurrentMap concurrentMap = (ConcurrentMap) map;
            function.getClass();
            Object obj2 = concurrentMap.get(obj);
            return (obj2 == null && (apply = function.apply(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, apply)) == null) ? apply : obj2;
        }
        return Map.CC.$default$computeIfAbsent(map, obj, function);
    }

    /* renamed from: t */
    public static Object m1004t(java.util.Map map, Object obj, BiFunction biFunction) {
        if (map instanceof Map) {
            return ((Map) map).computeIfPresent(obj, biFunction);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$computeIfPresent(map, obj, biFunction);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        biFunction.getClass();
        while (true) {
            Object obj2 = concurrentMap.get(obj);
            if (obj2 == null) {
                return obj2;
            }
            Object apply = biFunction.apply(obj, obj2);
            if (apply != null) {
                if (concurrentMap.replace(obj, obj2, apply)) {
                    return apply;
                }
            } else if (concurrentMap.remove(obj, obj2)) {
                return null;
            }
        }
    }

    /* renamed from: u */
    public static boolean m1003u(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: v */
    public static void m1002v(Collection collection, Consumer consumer) {
        if (collection instanceof InterfaceC10333b) {
            ((InterfaceC10333b) collection).mo955a(consumer);
            return;
        }
        consumer.getClass();
        for (Object obj : collection) {
            consumer.accept(obj);
        }
    }

    /* renamed from: w */
    public static /* synthetic */ void m1001w(java.util.Map map, BiConsumer biConsumer) {
        if (map instanceof Map) {
            ((Map) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            AbstractC10240a.m1166a((ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    /* renamed from: x */
    public static Object m1000x(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof Map) {
            return ((Map) map).getOrDefault(obj, obj2);
        }
        if (map instanceof ConcurrentMap) {
            Object obj3 = ((ConcurrentMap) map).get(obj);
            return obj3 != null ? obj3 : obj2;
        }
        Object obj4 = map.get(obj);
        return (obj4 != null || map.containsKey(obj)) ? obj4 : obj2;
    }

    /* renamed from: y */
    public static Object m999y(java.util.Map map, Object obj, Object obj2, BiFunction biFunction) {
        if (map instanceof Map) {
            return ((Map) map).merge(obj, obj2, biFunction);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$merge(map, obj, obj2, biFunction);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        biFunction.getClass();
        obj2.getClass();
        while (true) {
            Object obj3 = concurrentMap.get(obj);
            while (obj3 == null) {
                obj3 = concurrentMap.putIfAbsent(obj, obj2);
                if (obj3 == null) {
                    return obj2;
                }
            }
            Object apply = biFunction.apply(obj3, obj2);
            if (apply != null) {
                if (concurrentMap.replace(obj, obj3, apply)) {
                    return apply;
                }
            } else if (concurrentMap.remove(obj, obj3)) {
                return null;
            }
        }
    }

    /* renamed from: z */
    public static /* synthetic */ Object m998z(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public InterfaceC10321P trySplit() {
        return null;
    }
}
