package com.google.common.collect;

/* renamed from: com.google.common.collect.v */
/* loaded from: classes3.dex */
public final class C8026v extends AbstractC8032x0<Object> {

    /* renamed from: a */
    public final AbstractC8032x0 f15831a;

    /* renamed from: b */
    public AbstractC8032x0 f15832b;

    public C8026v(AbstractC8028w abstractC8028w) {
        AbstractC8021u<K, ? extends AbstractC8007q<V>> abstractC8021u = abstractC8028w.f15835d;
        AbstractC8007q abstractC8007q = abstractC8021u.f15828c;
        if (abstractC8007q == null) {
            abstractC8007q = abstractC8021u.mo4231c();
            abstractC8021u.f15828c = abstractC8007q;
        }
        this.f15831a = abstractC8007q.iterator();
        this.f15832b = C8034z.f15843e;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return this.f15832b.hasNext() || this.f15831a.hasNext();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        if (!this.f15832b.hasNext()) {
            this.f15832b = ((AbstractC8007q) this.f15831a.next()).iterator();
        }
        return this.f15832b.next();
    }
}
