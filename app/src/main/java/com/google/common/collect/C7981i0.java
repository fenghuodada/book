package com.google.common.collect;

import com.google.common.base.InterfaceC7946m;
import com.google.common.collect.AbstractC7953d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.common.collect.i0 */
/* loaded from: classes3.dex */
public final class C7981i0<K, V> extends AbstractC7951c<K, V> {

    /* renamed from: f */
    public final transient InterfaceC7946m<? extends List<V>> f15754f;

    public C7981i0(TreeMap treeMap, C7979h0 c7979h0) {
        super(treeMap);
        this.f15754f = c7979h0;
    }

    @Override // com.google.common.collect.AbstractC7973f
    /* renamed from: c */
    public final Map<K, Collection<V>> mo4220c() {
        Map<K, Collection<V>> map = this.f15712d;
        return map instanceof NavigableMap ? new AbstractC7953d.C7961e((NavigableMap) map) : map instanceof SortedMap ? new AbstractC7953d.C7964h((SortedMap) map) : new AbstractC7953d.C7955b(map);
    }

    @Override // com.google.common.collect.AbstractC7973f
    /* renamed from: d */
    public final Set<K> mo4219d() {
        Map<K, Collection<V>> map = this.f15712d;
        return map instanceof NavigableMap ? new AbstractC7953d.C7962f((NavigableMap) map) : map instanceof SortedMap ? new AbstractC7953d.C7965i((SortedMap) map) : new AbstractC7953d.C7959d(map);
    }
}
