package com.google.common.collect;

import com.google.common.collect.AbstractC7953d;
import com.google.common.collect.C8023u0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.collect.c0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7952c0<K, V> extends C8023u0.AbstractC8024a<Map.Entry<K, V>> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC7953d.C7955b.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return AbstractC7953d.C7955b.this.isEmpty();
    }

    @Override // com.google.common.collect.C8023u0.AbstractC8024a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator<?> it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= ((AbstractC7953d.C7955b.C7956a) this).remove(it.next());
            }
            return z;
        }
    }

    @Override // com.google.common.collect.C8023u0.AbstractC8024a, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        int i;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                C7978h.m4265b(size, "expectedSize");
                i = size + 1;
            } else if (size < 1073741824) {
                i = (int) ((size / 0.75f) + 1.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return AbstractC7953d.C7955b.this.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return AbstractC7953d.C7955b.this.size();
    }
}
