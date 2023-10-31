package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.C7938g;
import com.google.common.base.C7945l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* renamed from: com.google.common.primitives.a */
/* loaded from: classes3.dex */
public final class C8035a {

    @GwtCompatible
    /* renamed from: com.google.common.primitives.a$a */
    /* loaded from: classes3.dex */
    public static class C8036a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a */
        public final int[] f15846a;

        /* renamed from: b */
        public final int f15847b;

        /* renamed from: c */
        public final int f15848c;

        public C8036a(int i, int i2, int[] iArr) {
            this.f15846a = iArr;
            this.f15847b = i;
            this.f15848c = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                int i = this.f15847b;
                while (true) {
                    if (i < this.f15848c) {
                        if (this.f15846a[i] == intValue) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C8036a) {
                C8036a c8036a = (C8036a) obj;
                int i = this.f15848c;
                int i2 = this.f15847b;
                int i3 = i - i2;
                if (c8036a.f15848c - c8036a.f15847b != i3) {
                    return false;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    if (this.f15846a[i2 + i4] != c8036a.f15846a[c8036a.f15847b + i4]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            int i2 = this.f15848c;
            int i3 = this.f15847b;
            C7938g.m4288b(i, i2 - i3);
            return Integer.valueOf(this.f15846a[i3 + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i = 1;
            for (int i2 = this.f15847b; i2 < this.f15848c; i2++) {
                i = (i * 31) + this.f15846a[i2];
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                int i = this.f15847b;
                int i2 = i;
                while (true) {
                    if (i2 < this.f15848c) {
                        if (this.f15846a[i2] == intValue) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 >= 0) {
                    return i2 - i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i;
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                int i2 = this.f15848c - 1;
                while (true) {
                    i = this.f15847b;
                    if (i2 >= i) {
                        if (this.f15846a[i2] == intValue) {
                            break;
                        }
                        i2--;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 >= 0) {
                    return i2 - i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            Integer num = (Integer) obj;
            int i2 = this.f15848c;
            int i3 = this.f15847b;
            C7938g.m4288b(i, i2 - i3);
            int i4 = i3 + i;
            int[] iArr = this.f15846a;
            int i5 = iArr[i4];
            num.getClass();
            iArr[i4] = num.intValue();
            return Integer.valueOf(i5);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f15848c - this.f15847b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i, int i2) {
            int i3 = this.f15848c;
            int i4 = this.f15847b;
            C7938g.m4286d(i, i2, i3 - i4);
            if (i == i2) {
                return Collections.emptyList();
            }
            return new C8036a(i + i4, i4 + i2, this.f15846a);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            int i = this.f15848c;
            int i2 = this.f15847b;
            StringBuilder sb = new StringBuilder((i - i2) * 5);
            sb.append('[');
            int[] iArr = this.f15846a;
            int i3 = iArr[i2];
            while (true) {
                sb.append(i3);
                i2++;
                if (i2 < i) {
                    sb.append(", ");
                    i3 = iArr[i2];
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    /* renamed from: a */
    public static int m4211a(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        throw new IllegalArgumentException(C7945l.m4284a("Out of range: %s", Long.valueOf(j)));
    }

    /* renamed from: b */
    public static int[] m4210b(List list) {
        if (list instanceof C8036a) {
            C8036a c8036a = (C8036a) list;
            return Arrays.copyOfRange(c8036a.f15846a, c8036a.f15847b, c8036a.f15848c);
        }
        Object[] array = list.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
