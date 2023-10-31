package com.google.common.collect;

import com.google.common.base.C7937f;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.e0 */
/* loaded from: classes3.dex */
public final class C7972e0<K, V> extends AbstractCollection<V> {
    @Weak

    /* renamed from: a */
    public final Map<K, V> f15745a;

    public C7972e0(Map<K, V> map) {
        map.getClass();
        this.f15745a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f15745a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.f15745a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f15745a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new C7950b0(this.f15745a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            Map<K, V> map = this.f15745a;
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (C7937f.m4290a(obj, entry.getValue())) {
                    map.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            Map<K, V> map = this.f15745a;
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return map.keySet().removeAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            Map<K, V> map = this.f15745a;
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return map.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f15745a.size();
    }
}
