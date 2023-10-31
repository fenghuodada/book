package com.bumptech.glide.util;

import androidx.collection.C0470b;
import androidx.collection.C0482i;

/* renamed from: com.bumptech.glide.util.b */
/* loaded from: classes.dex */
public final class C3849b<K, V> extends C0470b<K, V> {

    /* renamed from: i */
    public int f9937i;

    @Override // androidx.collection.C0482i, java.util.Map, p060j$.util.Map
    public final void clear() {
        this.f9937i = 0;
        super.clear();
    }

    @Override // androidx.collection.C0482i, java.util.Map, p060j$.util.Map
    public final int hashCode() {
        if (this.f9937i == 0) {
            this.f9937i = super.hashCode();
        }
        return this.f9937i;
    }

    @Override // androidx.collection.C0482i
    /* renamed from: i */
    public final void mo6417i(C0482i<? extends K, ? extends V> c0482i) {
        this.f9937i = 0;
        super.mo6417i(c0482i);
    }

    @Override // androidx.collection.C0482i
    /* renamed from: j */
    public final V mo6416j(int i) {
        this.f9937i = 0;
        return (V) super.mo6416j(i);
    }

    @Override // androidx.collection.C0482i
    /* renamed from: k */
    public final V mo6415k(int i, V v) {
        this.f9937i = 0;
        return (V) super.mo6415k(i, v);
    }

    @Override // androidx.collection.C0482i, java.util.Map, p060j$.util.Map
    public final V put(K k, V v) {
        this.f9937i = 0;
        return (V) super.put(k, v);
    }
}
