package kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C10832a;
import kotlin.jvm.internal.C10838e;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,471:1\n1726#2,3:472\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n61#1:472,3\n*E\n"})
/* renamed from: kotlin.collections.d */
/* loaded from: classes3.dex */
public final class C10748d<T> implements Collection<T>, InterfaceC10847a {
    @NotNull

    /* renamed from: a */
    public final T[] f21355a;

    /* renamed from: b */
    public final boolean f21356b;

    public C10748d(@NotNull T[] values, boolean z) {
        C10843j.m430f(values, "values");
        this.f21355a = values;
        this.f21356b = z;
    }

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i;
        T[] tArr = this.f21355a;
        C10843j.m430f(tArr, "<this>");
        if (obj == null) {
            int length = tArr.length;
            i = 0;
            while (i < length) {
                if (tArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = tArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (C10843j.m435a(obj, tArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        C10843j.m430f(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f21355a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        T[] array = this.f21355a;
        C10843j.m430f(array, "array");
        return new C10832a(array);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f21355a.length;
    }

    @Override // java.util.Collection
    @NotNull
    public final Object[] toArray() {
        T[] tArr = this.f21355a;
        C10843j.m430f(tArr, "<this>");
        if (!this.f21356b || !C10843j.m435a(tArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
            C10843j.m431e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
            return copyOf;
        }
        return tArr;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        C10843j.m430f(array, "array");
        return (T[]) C10838e.m436b(this, array);
    }
}
