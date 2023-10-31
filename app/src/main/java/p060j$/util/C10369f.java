package p060j$.util;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.f */
/* loaded from: classes2.dex */
public final class C10369f implements Map, Serializable, Map {

    /* renamed from: a */
    private final Map f20848a;

    /* renamed from: b */
    final Object f20849b;

    /* renamed from: c */
    private transient Set f20850c;

    /* renamed from: d */
    private transient Set f20851d;

    /* renamed from: e */
    private transient Collection f20852e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10369f(Map map) {
        map.getClass();
        this.f20848a = map;
        this.f20849b = this;
    }

    /* renamed from: a */
    private static Set m936a(Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.f20716f;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.f20716f;
            return (Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new Error("Unable to instantiate a synchronized list.", e);
        }
    }

    @Override // java.util.Map, p060j$.util.Map
    public final void clear() {
        synchronized (this.f20849b) {
            this.f20848a.clear();
        }
    }

    @Override // p060j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        Object m1006r;
        synchronized (this.f20849b) {
            m1006r = AbstractC10331a.m1006r(this.f20848a, obj, biFunction);
        }
        return m1006r;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p060j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object m1005s;
        synchronized (this.f20849b) {
            m1005s = AbstractC10331a.m1005s(this.f20848a, obj, function);
        }
        return m1005s;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // p060j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object m1004t;
        synchronized (this.f20849b) {
            m1004t = AbstractC10331a.m1004t(this.f20848a, obj, biFunction);
        }
        return m1004t;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f20849b) {
            containsKey = this.f20848a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f20849b) {
            containsValue = this.f20848a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.f20849b) {
            if (this.f20851d == null) {
                this.f20851d = m936a(this.f20848a.entrySet(), this.f20849b);
            }
            set = this.f20851d;
        }
        return set;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f20849b) {
            equals = this.f20848a.equals(obj);
        }
        return equals;
    }

    @Override // p060j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f20849b) {
            AbstractC10331a.m1001w(this.f20848a, biConsumer);
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f20849b) {
            obj2 = this.f20848a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object m1000x;
        synchronized (this.f20849b) {
            m1000x = AbstractC10331a.m1000x(this.f20848a, obj, obj2);
        }
        return m1000x;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f20849b) {
            hashCode = this.f20848a.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f20849b) {
            isEmpty = this.f20848a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.f20849b) {
            if (this.f20850c == null) {
                this.f20850c = m936a(this.f20848a.keySet(), this.f20849b);
            }
            set = this.f20850c;
        }
        return set;
    }

    @Override // p060j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object m999y;
        synchronized (this.f20849b) {
            m999y = AbstractC10331a.m999y(this.f20848a, obj, obj2, biFunction);
        }
        return m999y;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f20849b) {
            put = this.f20848a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final void putAll(Map map) {
        synchronized (this.f20849b) {
            this.f20848a.putAll(map);
        }
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object m998z;
        synchronized (this.f20849b) {
            m998z = AbstractC10331a.m998z(this.f20848a, obj, obj2);
        }
        return m998z;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f20849b) {
            remove = this.f20848a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean m1023A;
        synchronized (this.f20849b) {
            m1023A = AbstractC10331a.m1023A(this.f20848a, obj, obj2);
        }
        return m1023A;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object m1022B;
        synchronized (this.f20849b) {
            m1022B = AbstractC10331a.m1022B(this.f20848a, obj, obj2);
        }
        return m1022B;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean m1021C;
        synchronized (this.f20849b) {
            m1021C = AbstractC10331a.m1021C(this.f20848a, obj, obj2, obj3);
        }
        return m1021C;
    }

    @Override // p060j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f20849b) {
            AbstractC10331a.m1020D(this.f20848a, biFunction);
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p060j$.util.Map
    public final int size() {
        int size;
        synchronized (this.f20849b) {
            size = this.f20848a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f20849b) {
            obj = this.f20848a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Collection values() {
        Collection collection;
        Constructor constructor;
        Constructor constructor2;
        Collection collection2;
        synchronized (this.f20849b) {
            if (this.f20852e == null) {
                Collection values = this.f20848a.values();
                Object obj = this.f20849b;
                constructor = DesugarCollections.f20715e;
                if (constructor == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        constructor2 = DesugarCollections.f20715e;
                        collection2 = (Collection) constructor2.newInstance(values, obj);
                    } catch (IllegalAccessException e) {
                        e = e;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InstantiationException e2) {
                        e = e2;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f20852e = collection2;
            }
            collection = this.f20852e;
        }
        return collection;
    }
}
