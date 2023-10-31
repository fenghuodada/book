package kotlin.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.AbstractC10742b;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
@SourceDebugExtension({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,583:1\n467#1,51:586\n467#1,51:637\n37#2,2:584\n26#3:688\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:586,51\n464#1:637,51\n47#1:584,2\n562#1:688\n*E\n"})
/* renamed from: kotlin.collections.e */
/* loaded from: classes3.dex */
public final class C10749e<E> extends AbstractC10747c<E> {
    @NotNull

    /* renamed from: d */
    public static final Object[] f21357d = new Object[0];

    /* renamed from: a */
    public int f21358a;
    @NotNull

    /* renamed from: b */
    public Object[] f21359b = f21357d;

    /* renamed from: c */
    public int f21360c;

    /* renamed from: a */
    public final void m499a(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f21359b.length;
        while (i < length && it.hasNext()) {
            this.f21359b[i] = it.next();
            i++;
        }
        int i2 = this.f21358a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f21359b[i3] = it.next();
        }
        this.f21360c = collection.size() + this.f21360c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        AbstractC10742b.C10743a c10743a = AbstractC10742b.Companion;
        int i2 = this.f21360c;
        c10743a.getClass();
        AbstractC10742b.C10743a.m500b(i, i2);
        int i3 = this.f21360c;
        if (i == i3) {
            addLast(e);
            return;
        }
        int i4 = i3 + 1;
        if (i == 0) {
            m498b(i4);
            int i5 = this.f21358a;
            if (i5 == 0) {
                Object[] objArr = this.f21359b;
                C10843j.m430f(objArr, "<this>");
                i5 = objArr.length;
            }
            int i6 = i5 - 1;
            this.f21358a = i6;
            this.f21359b[i6] = e;
            this.f21360c++;
            return;
        }
        m498b(i4);
        int m496j = m496j(this.f21358a + i);
        int i7 = this.f21360c;
        if (i < ((i7 + 1) >> 1)) {
            if (m496j == 0) {
                Object[] objArr2 = this.f21359b;
                C10843j.m430f(objArr2, "<this>");
                m496j = objArr2.length;
            }
            int i8 = m496j - 1;
            int i9 = this.f21358a;
            if (i9 == 0) {
                Object[] objArr3 = this.f21359b;
                C10843j.m430f(objArr3, "<this>");
                i9 = objArr3.length;
            }
            int i10 = i9 - 1;
            int i11 = this.f21358a;
            Object[] objArr4 = this.f21359b;
            if (i8 >= i11) {
                objArr4[i10] = objArr4[i11];
                C10751g.m493c(objArr4, i11, objArr4, i11 + 1, i8 + 1);
            } else {
                C10751g.m493c(objArr4, i11 - 1, objArr4, i11, objArr4.length);
                Object[] objArr5 = this.f21359b;
                objArr5[objArr5.length - 1] = objArr5[0];
                C10751g.m493c(objArr5, 0, objArr5, 1, i8 + 1);
            }
            this.f21359b[i8] = e;
            this.f21358a = i10;
        } else {
            int m496j2 = m496j(this.f21358a + i7);
            Object[] objArr6 = this.f21359b;
            if (m496j < m496j2) {
                C10751g.m493c(objArr6, m496j + 1, objArr6, m496j, m496j2);
            } else {
                C10751g.m493c(objArr6, 1, objArr6, 0, m496j2);
                Object[] objArr7 = this.f21359b;
                objArr7[0] = objArr7[objArr7.length - 1];
                C10751g.m493c(objArr7, m496j + 1, objArr7, m496j, objArr7.length - 1);
            }
            this.f21359b[m496j] = e;
        }
        this.f21360c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, @NotNull Collection<? extends E> elements) {
        C10843j.m430f(elements, "elements");
        AbstractC10742b.C10743a c10743a = AbstractC10742b.Companion;
        int i2 = this.f21360c;
        c10743a.getClass();
        AbstractC10742b.C10743a.m500b(i, i2);
        if (elements.isEmpty()) {
            return false;
        }
        int i3 = this.f21360c;
        if (i == i3) {
            return addAll(elements);
        }
        m498b(elements.size() + i3);
        int m496j = m496j(this.f21358a + this.f21360c);
        int m496j2 = m496j(this.f21358a + i);
        int size = elements.size();
        if (i < ((this.f21360c + 1) >> 1)) {
            int i4 = this.f21358a;
            int i5 = i4 - size;
            if (m496j2 < i4) {
                Object[] objArr = this.f21359b;
                C10751g.m493c(objArr, i5, objArr, i4, objArr.length);
                Object[] objArr2 = this.f21359b;
                int length = objArr2.length - size;
                if (size >= m496j2) {
                    C10751g.m493c(objArr2, length, objArr2, 0, m496j2);
                } else {
                    C10751g.m493c(objArr2, length, objArr2, 0, size);
                    Object[] objArr3 = this.f21359b;
                    C10751g.m493c(objArr3, 0, objArr3, size, m496j2);
                }
            } else if (i5 >= 0) {
                Object[] objArr4 = this.f21359b;
                C10751g.m493c(objArr4, i5, objArr4, i4, m496j2);
            } else {
                Object[] objArr5 = this.f21359b;
                i5 += objArr5.length;
                int i6 = m496j2 - i4;
                int length2 = objArr5.length - i5;
                if (length2 >= i6) {
                    C10751g.m493c(objArr5, i5, objArr5, i4, m496j2);
                } else {
                    C10751g.m493c(objArr5, i5, objArr5, i4, i4 + length2);
                    Object[] objArr6 = this.f21359b;
                    C10751g.m493c(objArr6, 0, objArr6, this.f21358a + length2, m496j2);
                }
            }
            this.f21358a = i5;
            m496j2 -= size;
            if (m496j2 < 0) {
                m496j2 += this.f21359b.length;
            }
        } else {
            int i7 = m496j2 + size;
            if (m496j2 < m496j) {
                int i8 = size + m496j;
                Object[] objArr7 = this.f21359b;
                if (i8 > objArr7.length) {
                    if (i7 >= objArr7.length) {
                        i7 -= objArr7.length;
                    } else {
                        int length3 = m496j - (i8 - objArr7.length);
                        C10751g.m493c(objArr7, 0, objArr7, length3, m496j);
                        Object[] objArr8 = this.f21359b;
                        C10751g.m493c(objArr8, i7, objArr8, m496j2, length3);
                    }
                }
                C10751g.m493c(objArr7, i7, objArr7, m496j2, m496j);
            } else {
                Object[] objArr9 = this.f21359b;
                C10751g.m493c(objArr9, size, objArr9, 0, m496j);
                Object[] objArr10 = this.f21359b;
                if (i7 >= objArr10.length) {
                    C10751g.m493c(objArr10, i7 - objArr10.length, objArr10, m496j2, objArr10.length);
                } else {
                    C10751g.m493c(objArr10, 0, objArr10, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f21359b;
                    C10751g.m493c(objArr11, i7, objArr11, m496j2, objArr11.length - size);
                }
            }
        }
        m499a(m496j2, elements);
        return true;
    }

    public final void addLast(E e) {
        m498b(this.f21360c + 1);
        this.f21359b[m496j(this.f21358a + this.f21360c)] = e;
        this.f21360c++;
    }

    /* renamed from: b */
    public final void m498b(int i) {
        if (i >= 0) {
            Object[] objArr = this.f21359b;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == f21357d) {
                if (i < 10) {
                    i = 10;
                }
                this.f21359b = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            C10751g.m493c(objArr, 0, objArr2, this.f21358a, objArr.length);
            Object[] objArr3 = this.f21359b;
            int length2 = objArr3.length;
            int i3 = this.f21358a;
            C10751g.m493c(objArr3, length2 - i3, objArr2, 0, i3);
            this.f21358a = 0;
            this.f21359b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int m496j = m496j(this.f21358a + this.f21360c);
        int i = this.f21358a;
        if (i < m496j) {
            Object[] objArr = this.f21359b;
            C10843j.m430f(objArr, "<this>");
            Arrays.fill(objArr, i, m496j, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f21359b;
            Arrays.fill(objArr2, this.f21358a, objArr2.length, (Object) null);
            Object[] objArr3 = this.f21359b;
            C10843j.m430f(objArr3, "<this>");
            Arrays.fill(objArr3, 0, m496j, (Object) null);
        }
        this.f21358a = 0;
        this.f21360c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        AbstractC10742b.C10743a c10743a = AbstractC10742b.Companion;
        int i2 = this.f21360c;
        c10743a.getClass();
        AbstractC10742b.C10743a.m501a(i, i2);
        return (E) this.f21359b[m496j(this.f21358a + i)];
    }

    /* renamed from: i */
    public final int m497i(int i) {
        Object[] objArr = this.f21359b;
        C10843j.m430f(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int m496j = m496j(this.f21358a + this.f21360c);
        int i = this.f21358a;
        if (i < m496j) {
            while (i < m496j) {
                if (!C10843j.m435a(obj, this.f21359b[i])) {
                    i++;
                }
            }
            return -1;
        } else if (i >= m496j) {
            int length = this.f21359b.length;
            while (true) {
                if (i < length) {
                    if (C10843j.m435a(obj, this.f21359b[i])) {
                        break;
                    }
                    i++;
                } else {
                    for (int i2 = 0; i2 < m496j; i2++) {
                        if (C10843j.m435a(obj, this.f21359b[i2])) {
                            i = i2 + this.f21359b.length;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i - this.f21358a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f21360c == 0;
    }

    /* renamed from: j */
    public final int m496j(int i) {
        Object[] objArr = this.f21359b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int m496j = m496j(this.f21358a + this.f21360c);
        int i = this.f21358a;
        if (i < m496j) {
            length = m496j - 1;
            if (i <= length) {
                while (!C10843j.m435a(obj, this.f21359b[length])) {
                    if (length != i) {
                        length--;
                    }
                }
                return length - this.f21358a;
            }
            return -1;
        }
        if (i > m496j) {
            int i2 = m496j - 1;
            while (true) {
                if (-1 < i2) {
                    if (C10843j.m435a(obj, this.f21359b[i2])) {
                        length = i2 + this.f21359b.length;
                        break;
                    }
                    i2--;
                } else {
                    Object[] objArr = this.f21359b;
                    C10843j.m430f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i3 = this.f21358a;
                    if (i3 <= length) {
                        while (!C10843j.m435a(obj, this.f21359b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                    }
                }
            }
            return length - this.f21358a;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        byte b;
        int m496j;
        C10843j.m430f(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.f21359b.length == 0) {
                b = 1;
            } else {
                b = 0;
            }
            if (b == 0) {
                int m496j2 = m496j(this.f21358a + this.f21360c);
                int i = this.f21358a;
                if (i < m496j2) {
                    m496j = i;
                    while (i < m496j2) {
                        Object obj = this.f21359b[i];
                        if (!elements.contains(obj)) {
                            this.f21359b[m496j] = obj;
                            m496j++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    Object[] objArr = this.f21359b;
                    C10843j.m430f(objArr, "<this>");
                    Arrays.fill(objArr, m496j, m496j2, (Object) null);
                } else {
                    int length = this.f21359b.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr2 = this.f21359b;
                        Object obj2 = objArr2[i];
                        objArr2[i] = null;
                        if (!elements.contains(obj2)) {
                            this.f21359b[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    m496j = m496j(i2);
                    for (int i3 = 0; i3 < m496j2; i3++) {
                        Object[] objArr3 = this.f21359b;
                        Object obj3 = objArr3[i3];
                        objArr3[i3] = null;
                        if (!elements.contains(obj3)) {
                            this.f21359b[m496j] = obj3;
                            m496j = m497i(m496j);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    int i4 = m496j - this.f21358a;
                    if (i4 < 0) {
                        i4 += this.f21359b.length;
                    }
                    this.f21360c = i4;
                }
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f21359b;
            int i = this.f21358a;
            E e = (E) objArr[i];
            objArr[i] = null;
            this.f21358a = m497i(i);
            this.f21360c--;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        byte b;
        int m496j;
        C10843j.m430f(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (this.f21359b.length == 0) {
                b = 1;
            } else {
                b = 0;
            }
            if (b == 0) {
                int m496j2 = m496j(this.f21358a + this.f21360c);
                int i = this.f21358a;
                if (i < m496j2) {
                    m496j = i;
                    while (i < m496j2) {
                        Object obj = this.f21359b[i];
                        if (elements.contains(obj)) {
                            this.f21359b[m496j] = obj;
                            m496j++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    Object[] objArr = this.f21359b;
                    C10843j.m430f(objArr, "<this>");
                    Arrays.fill(objArr, m496j, m496j2, (Object) null);
                } else {
                    int length = this.f21359b.length;
                    boolean z2 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr2 = this.f21359b;
                        Object obj2 = objArr2[i];
                        objArr2[i] = null;
                        if (elements.contains(obj2)) {
                            this.f21359b[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    m496j = m496j(i2);
                    for (int i3 = 0; i3 < m496j2; i3++) {
                        Object[] objArr3 = this.f21359b;
                        Object obj3 = objArr3[i3];
                        objArr3[i3] = null;
                        if (elements.contains(obj3)) {
                            this.f21359b[m496j] = obj3;
                            m496j = m497i(m496j);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    int i4 = m496j - this.f21358a;
                    if (i4 < 0) {
                        i4 += this.f21359b.length;
                    }
                    this.f21360c = i4;
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        AbstractC10742b.C10743a c10743a = AbstractC10742b.Companion;
        int i2 = this.f21360c;
        c10743a.getClass();
        AbstractC10742b.C10743a.m501a(i, i2);
        int m496j = m496j(this.f21358a + i);
        Object[] objArr = this.f21359b;
        E e2 = (E) objArr[m496j];
        objArr[m496j] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final Object[] toArray() {
        return toArray(new Object[this.f21360c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final <T> T[] toArray(@NotNull T[] array) {
        C10843j.m430f(array, "array");
        int length = array.length;
        int i = this.f21360c;
        if (length < i) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i);
            C10843j.m432d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (T[]) ((Object[]) newInstance);
        }
        int m496j = m496j(this.f21358a + this.f21360c);
        int i2 = this.f21358a;
        if (i2 < m496j) {
            C10751g.m493c(this.f21359b, 0, array, i2, m496j);
        } else if (!isEmpty()) {
            Object[] objArr = this.f21359b;
            C10751g.m493c(objArr, 0, array, this.f21358a, objArr.length);
            Object[] objArr2 = this.f21359b;
            C10751g.m493c(objArr2, objArr2.length - this.f21358a, array, 0, m496j);
        }
        int length2 = array.length;
        int i3 = this.f21360c;
        if (length2 > i3) {
            array[i3] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(@NotNull Collection<? extends E> elements) {
        C10843j.m430f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m498b(elements.size() + this.f21360c);
        m499a(m496j(this.f21358a + this.f21360c), elements);
        return true;
    }
}
