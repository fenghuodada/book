package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C10838e;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.collections.q */
/* loaded from: classes3.dex */
public final class C10761q implements Set, Serializable, InterfaceC10847a {
    @NotNull

    /* renamed from: a */
    public static final C10761q f21365a = new C10761q();

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        Void element = (Void) obj;
        C10843j.m430f(element, "element");
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@NotNull Collection elements) {
        C10843j.m430f(elements, "elements");
        return elements.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator iterator() {
        return C10758n.f21362a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C10838e.m437a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        C10843j.m430f(array, "array");
        return (T[]) C10838e.m436b(this, array);
    }

    @NotNull
    public final String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
