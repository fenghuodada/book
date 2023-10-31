package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.C7938g;
import java.util.ListIterator;
import java.util.NoSuchElementException;

@GwtCompatible
/* renamed from: com.google.common.collect.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7947a<E> extends AbstractC8032x0<Object> implements ListIterator<Object> {

    /* renamed from: a */
    public final int f15706a;

    /* renamed from: b */
    public int f15707b;

    public AbstractC7947a(int i, int i2) {
        C7938g.m4287c(i2, i);
        this.f15706a = i;
        this.f15707b = i2;
    }

    @Deprecated
    /* renamed from: a */
    public final void m4283a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        m4283a(obj);
        throw null;
    }

    /* renamed from: b */
    public abstract E mo4212b(int i);

    @Deprecated
    /* renamed from: c */
    public final void m4282c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return this.f15707b < this.f15706a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15707b > 0;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final E next() {
        if (hasNext()) {
            int i = this.f15707b;
            this.f15707b = i + 1;
            return mo4212b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15707b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f15707b - 1;
            this.f15707b = i;
            return mo4212b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15707b - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        m4282c(obj);
        throw null;
    }
}
