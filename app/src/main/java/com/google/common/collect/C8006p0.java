package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.p0 */
/* loaded from: classes3.dex */
public final class C8006p0<E> extends AbstractC8031x<E> {

    /* renamed from: i */
    public static final C8006p0<Object> f15803i = new C8006p0<>(new Object[0], 0, null, 0, 0);
    @VisibleForTesting

    /* renamed from: d */
    public final transient Object[] f15804d;
    @VisibleForTesting

    /* renamed from: e */
    public final transient Object[] f15805e;

    /* renamed from: f */
    public final transient int f15806f;

    /* renamed from: g */
    public final transient int f15807g;

    /* renamed from: h */
    public final transient int f15808h;

    public C8006p0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f15804d = objArr;
        this.f15805e = objArr2;
        this.f15806f = i2;
        this.f15807g = i;
        this.f15808h = i3;
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: b */
    public final int mo4225b(int i, Object[] objArr) {
        Object[] objArr2 = this.f15804d;
        int i2 = this.f15808h;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr;
        if (obj == null || (objArr = this.f15805e) == null) {
            return false;
        }
        int m4250b = C8005p.m4250b(obj);
        while (true) {
            int i = m4250b & this.f15806f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m4250b = i + 1;
        }
    }

    @Override // com.google.common.collect.AbstractC8031x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15807g;
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: i */
    public final Object[] mo4240i() {
        return this.f15804d;
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: j */
    public final int mo4239j() {
        return this.f15808h;
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

    @Override // com.google.common.collect.AbstractC8031x, com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final AbstractC8032x0<E> iterator() {
        return mo4217a().listIterator(0);
    }

    @Override // com.google.common.collect.AbstractC8031x
    /* renamed from: r */
    public final AbstractC8013s<E> mo4214r() {
        return AbstractC8013s.m4247o(this.f15808h, this.f15804d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15808h;
    }
}
