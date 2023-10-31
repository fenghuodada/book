package com.facebook.ads.redexgen.p036X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.ads.redexgen.X.2Y */
/* loaded from: assets/audience_network.dex */
public final class C40632Y<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final int A03;
    public final /* synthetic */ AbstractC40682d A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    public C40632Y(AbstractC40682d abstractC40682d, int i) {
        this.A04 = abstractC40682d;
        this.A03 = i;
        this.A01 = abstractC40682d.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            T t = (T) this.A04.A07(this.A00, this.A03);
            this.A00++;
            this.A02 = true;
            return t;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Y != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            this.A00--;
            this.A01--;
            this.A02 = false;
            this.A04.A0E(this.A00);
            return;
        }
        throw new IllegalStateException();
    }
}
