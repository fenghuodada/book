package com.google.common.collect;

import androidx.appcompat.view.menu.C0235r;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.AbstractC8013s;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.x */
/* loaded from: classes3.dex */
public abstract class AbstractC8031x<E> extends AbstractC8007q<E> implements Set<E> {

    /* renamed from: c */
    public static final /* synthetic */ int f15839c = 0;
    @RetainedWith
    @NullableDecl
    @LazyInit

    /* renamed from: b */
    public transient AbstractC8013s<E> f15840b;

    @VisibleForTesting
    /* renamed from: o */
    public static int m4216o(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    /* renamed from: p */
    public static <E> AbstractC8031x<E> m4215p(int i, Object... objArr) {
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                int m4216o = m4216o(i);
                Object[] objArr2 = new Object[m4216o];
                int i2 = m4216o - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int m4251a = C8005p.m4251a(hashCode);
                        while (true) {
                            int i6 = m4251a & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                m4251a++;
                            }
                        }
                    } else {
                        throw new NullPointerException(C0235r.m12816a("at index ", i5));
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    return new C8027v0(objArr[0], i3);
                }
                if (m4216o(i4) < m4216o / 2) {
                    return m4215p(i4, objArr);
                }
                int length = objArr.length;
                if (i4 >= (length >> 1) + (length >> 2)) {
                    z = false;
                }
                if (z) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new C8006p0(objArr, i3, objArr2, i2, i4);
            }
            return new C8027v0(objArr[0]);
        }
        return C8006p0.f15803i;
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: a */
    public AbstractC8013s<E> mo4217a() {
        AbstractC8013s<E> abstractC8013s = this.f15840b;
        if (abstractC8013s == null) {
            AbstractC8013s<E> mo4214r = mo4214r();
            this.f15840b = mo4214r;
            return mo4214r;
        }
        return abstractC8013s;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC8031x) && mo4213s() && ((AbstractC8031x) obj).mo4213s() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C8023u0.m4227a(this);
    }

    @Override // com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* renamed from: r */
    public AbstractC8013s<E> mo4214r() {
        Object[] array = toArray();
        AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
        return AbstractC8013s.m4247o(array.length, array);
    }

    /* renamed from: s */
    public boolean mo4213s() {
        return this instanceof C8006p0;
    }
}
