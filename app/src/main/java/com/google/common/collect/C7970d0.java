package com.google.common.collect;

import com.google.common.collect.C8023u0;
import com.google.j2objc.annotations.Weak;
import java.util.Map;

/* renamed from: com.google.common.collect.d0 */
/* loaded from: classes3.dex */
public class C7970d0<K, V> extends C8023u0.AbstractC8024a<K> {
    @Weak

    /* renamed from: a */
    public final Map<K, V> f15744a;

    public C7970d0(Map<K, V> map) {
        map.getClass();
        this.f15744a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15744a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f15744a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15744a.size();
    }
}
