package com.google.common.collect;

import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.y */
/* loaded from: classes3.dex */
public final class C8033y extends AbstractC8032x0<Object> {

    /* renamed from: a */
    public boolean f15841a;

    /* renamed from: b */
    public final /* synthetic */ Object f15842b;

    public C8033y(Object obj) {
        this.f15842b = obj;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return !this.f15841a;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        if (this.f15841a) {
            throw new NoSuchElementException();
        }
        this.f15841a = true;
        return this.f15842b;
    }
}
