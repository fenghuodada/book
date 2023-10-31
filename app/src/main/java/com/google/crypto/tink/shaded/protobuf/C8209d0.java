package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d0 */
/* loaded from: classes3.dex */
public final class C8209d0 extends C8215e0 {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.d0$a */
    /* loaded from: classes3.dex */
    public static class C8210a<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public final Map.Entry<K, C8209d0> f15973a;

        public C8210a() {
            throw null;
        }

        public C8210a(Map.Entry entry) {
            this.f15973a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f15973a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C8209d0 value = this.f15973a.getValue();
            if (value == null) {
                return null;
            }
            return value.m3878a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof InterfaceC8287r0) {
                C8209d0 value = this.f15973a.getValue();
                InterfaceC8287r0 interfaceC8287r0 = value.f15983a;
                value.f15984b = null;
                value.f15983a = (InterfaceC8287r0) obj;
                return interfaceC8287r0;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.d0$b */
    /* loaded from: classes3.dex */
    public static class C8211b<K> implements Iterator<Map.Entry<K, Object>>, p060j$.util.Iterator {

        /* renamed from: a */
        public final Iterator<Map.Entry<K, Object>> f15974a;

        public C8211b(Iterator<Map.Entry<K, Object>> it) {
            this.f15974a = it;
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
            return this.f15974a.hasNext();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f15974a.next();
            return next.getValue() instanceof C8209d0 ? new C8210a(next) : next;
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            this.f15974a.remove();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8215e0
    public final boolean equals(Object obj) {
        return m3878a(null).equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8215e0
    public final int hashCode() {
        return m3878a(null).hashCode();
    }

    public final String toString() {
        return m3878a(null).toString();
    }
}
