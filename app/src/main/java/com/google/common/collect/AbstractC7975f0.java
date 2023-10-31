package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractC7953d;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

@GwtCompatible
/* renamed from: com.google.common.collect.f0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7975f0<K, V> extends AbstractMap<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: a */
    public transient AbstractC7953d.C7955b.C7956a f15750a;
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient C7972e0 f15751b;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        AbstractC7953d.C7955b.C7956a c7956a = this.f15750a;
        if (c7956a == null) {
            AbstractC7953d.C7955b.C7956a c7956a2 = new AbstractC7953d.C7955b.C7956a();
            this.f15750a = c7956a2;
            return c7956a2;
        }
        return c7956a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C7972e0 c7972e0 = this.f15751b;
        if (c7972e0 == null) {
            C7972e0 c7972e02 = new C7972e0(this);
            this.f15751b = c7972e02;
            return c7972e02;
        }
        return c7972e0;
    }
}
