package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(serializable = true)
/* renamed from: com.google.common.collect.r0 */
/* loaded from: classes3.dex */
public final class C8012r0<T> extends AbstractC7994m0<T> implements Serializable {

    /* renamed from: a */
    public final AbstractC7994m0<? super T> f15816a;

    public C8012r0(AbstractC7994m0<? super T> abstractC7994m0) {
        abstractC7994m0.getClass();
        this.f15816a = abstractC7994m0;
    }

    @Override // com.google.common.collect.AbstractC7994m0
    /* renamed from: a */
    public final <S extends T> AbstractC7994m0<S> mo4248a() {
        return (AbstractC7994m0<? super T>) this.f15816a;
    }

    @Override // com.google.common.collect.AbstractC7994m0, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f15816a.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8012r0) {
            return this.f15816a.equals(((C8012r0) obj).f15816a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f15816a.hashCode();
    }

    public final String toString() {
        return this.f15816a + ".reverse()";
    }
}
