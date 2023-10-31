package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* renamed from: com.google.common.collect.w */
/* loaded from: classes3.dex */
public abstract class AbstractC8028w<K, V> extends AbstractC7976g<K, V> implements Serializable {

    /* renamed from: d */
    public final transient AbstractC8021u<K, ? extends AbstractC8007q<V>> f15835d;

    /* renamed from: e */
    public final transient int f15836e;

    /* renamed from: com.google.common.collect.w$a */
    /* loaded from: classes3.dex */
    public static class C8029a<K, V> {

        /* renamed from: a */
        public final C7986l f15837a = new C7986l();
    }

    public AbstractC8028w(C8000o0 c8000o0, int i) {
        this.f15835d = c8000o0;
        this.f15836e = i;
    }

    @Override // com.google.common.collect.AbstractC7973f, com.google.common.collect.InterfaceC7977g0
    /* renamed from: a */
    public final Map mo4222a() {
        return this.f15835d;
    }

    @Override // com.google.common.collect.AbstractC7973f
    /* renamed from: b */
    public final boolean mo4221b(@NullableDecl Object obj) {
        return obj != null && super.mo4221b(obj);
    }

    @Override // com.google.common.collect.AbstractC7973f
    /* renamed from: c */
    public final Map<K, Collection<V>> mo4220c() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.InterfaceC7977g0
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC7973f
    /* renamed from: d */
    public final Set<K> mo4219d() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractC7973f
    /* renamed from: e */
    public final Iterator mo4218e() {
        return new C8026v(this);
    }

    @Override // com.google.common.collect.InterfaceC7977g0
    public final int size() {
        return this.f15836e;
    }
}
