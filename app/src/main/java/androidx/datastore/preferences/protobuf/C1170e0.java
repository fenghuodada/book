package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: androidx.datastore.preferences.protobuf.e0 */
/* loaded from: classes.dex */
public final class C1170e0 extends C1175f0 {

    /* renamed from: androidx.datastore.preferences.protobuf.e0$a */
    /* loaded from: classes.dex */
    public static class C1171a<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public final Map.Entry<K, C1170e0> f2965a;

        public C1171a() {
            throw null;
        }

        public C1171a(Map.Entry entry) {
            this.f2965a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f2965a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C1170e0 value = this.f2965a.getValue();
            if (value == null) {
                return null;
            }
            return value.m11125a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof InterfaceC1240s0) {
                C1170e0 value = this.f2965a.getValue();
                InterfaceC1240s0 interfaceC1240s0 = value.f2972a;
                value.f2973b = null;
                value.f2972a = (InterfaceC1240s0) obj;
                return interfaceC1240s0;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.e0$b */
    /* loaded from: classes.dex */
    public static class C1172b<K> implements Iterator<Map.Entry<K, Object>>, p060j$.util.Iterator {

        /* renamed from: a */
        public final Iterator<Map.Entry<K, Object>> f2966a;

        public C1172b(Iterator<Map.Entry<K, Object>> it) {
            this.f2966a = it;
        }

        @Override // p060j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final boolean hasNext() {
            return this.f2966a.hasNext();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f2966a.next();
            return next.getValue() instanceof C1170e0 ? new C1171a(next) : next;
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            this.f2966a.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C1175f0
    public final boolean equals(Object obj) {
        return m11125a(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.C1175f0
    public final int hashCode() {
        return m11125a(null).hashCode();
    }

    public final String toString() {
        return m11125a(null).toString();
    }
}
