package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.concurrent.LazyInit;

@GwtCompatible(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.v0 */
/* loaded from: classes3.dex */
public final class C8027v0<E> extends AbstractC8031x<E> {

    /* renamed from: d */
    public final transient E f15833d;
    @LazyInit

    /* renamed from: e */
    public transient int f15834e;

    public C8027v0(E e) {
        e.getClass();
        this.f15833d = e;
    }

    public C8027v0(E e, int i) {
        this.f15833d = e;
        this.f15834e = i;
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: b */
    public final int mo4225b(int i, Object[] objArr) {
        objArr[i] = this.f15833d;
        return i + 1;
    }

    @Override // com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15833d.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC8031x, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f15834e;
        if (i == 0) {
            int hashCode = this.f15833d.hashCode();
            this.f15834e = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: m */
    public final boolean mo4224m() {
        return false;
    }

    @Override // com.google.common.collect.AbstractC8031x, com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final AbstractC8032x0<E> iterator() {
        return new C8033y(this.f15833d);
    }

    @Override // com.google.common.collect.AbstractC8031x
    /* renamed from: r */
    public final AbstractC8013s<E> mo4214r() {
        return AbstractC8013s.m4243t(this.f15833d);
    }

    @Override // com.google.common.collect.AbstractC8031x
    /* renamed from: s */
    public final boolean mo4213s() {
        return this.f15834e != 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f15833d.toString() + ']';
    }
}
