package com.google.common.collect;

import com.google.common.collect.C8023u0;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.collect.t0 */
/* loaded from: classes3.dex */
public final class C8020t0 extends C8023u0.AbstractC8025b<Object> {

    /* renamed from: a */
    public final /* synthetic */ Set f15824a;

    /* renamed from: b */
    public final /* synthetic */ Set f15825b;

    public C8020t0(AbstractC8031x abstractC8031x, AbstractC8031x abstractC8031x2) {
        this.f15824a = abstractC8031x;
        this.f15825b = abstractC8031x2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15824a.contains(obj) && this.f15825b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f15824a.containsAll(collection) && this.f15825b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f15825b, this.f15824a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8017s0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = 0;
        for (Object obj : this.f15824a) {
            if (this.f15825b.contains(obj)) {
                i++;
            }
        }
        return i;
    }
}
