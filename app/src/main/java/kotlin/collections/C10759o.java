package kotlin.collections;

import androidx.appcompat.view.menu.C0235r;
import androidx.datastore.preferences.protobuf.C1194j;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C10838e;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.collections.o */
/* loaded from: classes3.dex */
public final class C10759o implements List, Serializable, RandomAccess, InterfaceC10847a {
    @NotNull

    /* renamed from: a */
    public static final C10759o f21363a = new C10759o();

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        Void element = (Void) obj;
        C10843j.m430f(element, "element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@NotNull Collection elements) {
        C10843j.m430f(elements, "elements");
        return elements.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List
    public final Object get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        Void element = (Void) obj;
        C10843j.m430f(element, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator iterator() {
        return C10758n.f21362a;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        Void element = (Void) obj;
        C10843j.m430f(element, "element");
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator listIterator() {
        return C10758n.f21362a;
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return C10758n.f21362a;
        }
        throw new IndexOutOfBoundsException(C0235r.m12816a("Index: ", i));
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    @NotNull
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(C1194j.m11060a("fromIndex: ", i, ", toIndex: ", i2));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C10838e.m437a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        C10843j.m430f(array, "array");
        return (T[]) C10838e.m436b(this, array);
    }

    @NotNull
    public final String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
