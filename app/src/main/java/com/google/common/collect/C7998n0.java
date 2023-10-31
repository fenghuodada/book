package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.C7938g;

@GwtCompatible(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.n0 */
/* loaded from: classes3.dex */
public final class C7998n0<E> extends AbstractC8013s<E> {

    /* renamed from: e */
    public static final C7998n0 f15785e = new C7998n0(new Object[0], 0);
    @VisibleForTesting

    /* renamed from: c */
    public final transient Object[] f15786c;

    /* renamed from: d */
    public final transient int f15787d;

    public C7998n0(Object[] objArr, int i) {
        this.f15786c = objArr;
        this.f15787d = i;
    }

    @Override // com.google.common.collect.AbstractC8013s, com.google.common.collect.AbstractC8007q
    /* renamed from: b */
    public final int mo4225b(int i, Object[] objArr) {
        Object[] objArr2 = this.f15786c;
        int i2 = this.f15787d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final E get(int i) {
        C7938g.m4288b(i, this.f15787d);
        return (E) this.f15786c[i];
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: i */
    public final Object[] mo4240i() {
        return this.f15786c;
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: j */
    public final int mo4239j() {
        return this.f15787d;
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: k */
    public final int mo4238k() {
        return 0;
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: m */
    public final boolean mo4224m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15787d;
    }
}
