package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(serializable = true)
/* renamed from: com.google.common.collect.m */
/* loaded from: classes3.dex */
public final class C7993m<T> extends AbstractC7994m0<T> implements Serializable {

    /* renamed from: a */
    public final Comparator<T> f15780a;

    public C7993m(Comparator<T> comparator) {
        this.f15780a = comparator;
    }

    @Override // com.google.common.collect.AbstractC7994m0, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f15780a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7993m) {
            return this.f15780a.equals(((C7993m) obj).f15780a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15780a.hashCode();
    }

    public final String toString() {
        return this.f15780a.toString();
    }
}
