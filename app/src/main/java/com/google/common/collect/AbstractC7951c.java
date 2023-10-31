package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* renamed from: com.google.common.collect.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7951c<K, V> extends AbstractC7953d<K, V> {
    public AbstractC7951c(TreeMap treeMap) {
        super(treeMap);
    }

    @Override // com.google.common.collect.AbstractC7973f, com.google.common.collect.InterfaceC7977g0
    /* renamed from: a */
    public final Map<K, Collection<V>> mo4222a() {
        Map<K, Collection<V>> map = this.f15748c;
        if (map == null) {
            Map<K, Collection<V>> mo4220c = mo4220c();
            this.f15748c = mo4220c;
            return mo4220c;
        }
        return map;
    }

    @Override // com.google.common.collect.AbstractC7973f
    public final boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }
}
