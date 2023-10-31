package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* renamed from: com.google.common.collect.f */
/* loaded from: classes3.dex */
public abstract class AbstractC7973f<K, V> implements InterfaceC7977g0<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: a */
    public transient Set<K> f15746a;
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient Collection<V> f15747b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    public transient Map<K, Collection<V>> f15748c;

    /* renamed from: com.google.common.collect.f$a */
    /* loaded from: classes3.dex */
    public class C7974a extends AbstractCollection<V> {
        public C7974a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AbstractC7973f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@NullableDecl Object obj) {
            return AbstractC7973f.this.mo4221b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return AbstractC7973f.this.mo4218e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return AbstractC7973f.this.size();
        }
    }

    @Override // com.google.common.collect.InterfaceC7977g0
    /* renamed from: a */
    public abstract Map<K, Collection<V>> mo4222a();

    /* renamed from: b */
    public boolean mo4221b(@NullableDecl Object obj) {
        for (Collection<V> collection : mo4222a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public abstract Map<K, Collection<V>> mo4220c();

    /* renamed from: d */
    public abstract Set<K> mo4219d();

    /* renamed from: e */
    public abstract Iterator<V> mo4218e();

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC7977g0) {
            return mo4222a().equals(((InterfaceC7977g0) obj).mo4222a());
        }
        return false;
    }

    public final int hashCode() {
        return mo4222a().hashCode();
    }

    public final String toString() {
        return mo4222a().toString();
    }
}
