package kotlin.collections;

import androidx.datastore.preferences.protobuf.C1169e;
import androidx.datastore.preferences.protobuf.C1194j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

@SinceKotlin(version = "1.1")
@SourceDebugExtension({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n350#2,7:158\n378#2,7:165\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:158,7\n29#1:165,7\n*E\n"})
/* renamed from: kotlin.collections.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10742b<E> extends AbstractC10740a<E> implements List<E> {
    @NotNull
    public static final C10743a Companion = new C10743a();

    /* renamed from: kotlin.collections.b$a */
    /* loaded from: classes3.dex */
    public static final class C10743a {
        /* renamed from: a */
        public static void m501a(int i, int i2) {
            if (i >= 0 && i < i2) {
                return;
            }
            throw new IndexOutOfBoundsException(C1194j.m11060a("index: ", i, ", size: ", i2));
        }

        /* renamed from: b */
        public static void m500b(int i, int i2) {
            if (i >= 0 && i <= i2) {
                return;
            }
            throw new IndexOutOfBoundsException(C1194j.m11060a("index: ", i, ", size: ", i2));
        }
    }

    /* renamed from: kotlin.collections.b$b */
    /* loaded from: classes3.dex */
    public class C10744b implements Iterator<E>, InterfaceC10847a, p060j$.util.Iterator {

        /* renamed from: a */
        public int f21349a;

        public C10744b() {
        }

        @Override // p060j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final boolean hasNext() {
            return this.f21349a < AbstractC10742b.this.size();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final E next() {
            if (hasNext()) {
                int i = this.f21349a;
                this.f21349a = i + 1;
                return AbstractC10742b.this.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$c */
    /* loaded from: classes3.dex */
    public class C10745c extends AbstractC10742b<E>.C10744b implements ListIterator<E> {
        public C10745c(int i) {
            super();
            C10743a c10743a = AbstractC10742b.Companion;
            int size = AbstractC10742b.this.size();
            c10743a.getClass();
            C10743a.m500b(i, size);
            this.f21349a = i;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f21349a > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f21349a;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (hasPrevious()) {
                int i = this.f21349a - 1;
                this.f21349a = i;
                return AbstractC10742b.this.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f21349a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$d */
    /* loaded from: classes3.dex */
    public static final class C10746d<E> extends AbstractC10742b<E> implements RandomAccess {
        @NotNull

        /* renamed from: a */
        public final AbstractC10742b<E> f21352a;

        /* renamed from: b */
        public final int f21353b;

        /* renamed from: c */
        public final int f21354c;

        /* JADX WARN: Multi-variable type inference failed */
        public C10746d(@NotNull AbstractC10742b<? extends E> list, int i, int i2) {
            C10843j.m430f(list, "list");
            this.f21352a = list;
            this.f21353b = i;
            C10743a c10743a = AbstractC10742b.Companion;
            int size = list.size();
            c10743a.getClass();
            if (i >= 0 && i2 <= size) {
                if (i <= i2) {
                    this.f21354c = i2 - i;
                    return;
                }
                throw new IllegalArgumentException(C1194j.m11060a("fromIndex: ", i, " > toIndex: ", i2));
            }
            StringBuilder m11130b = C1169e.m11130b("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            m11130b.append(size);
            throw new IndexOutOfBoundsException(m11130b.toString());
        }

        @Override // kotlin.collections.AbstractC10742b, java.util.List
        public final E get(int i) {
            AbstractC10742b.Companion.getClass();
            C10743a.m501a(i, this.f21354c);
            return this.f21352a.get(this.f21353b + i);
        }

        @Override // kotlin.collections.AbstractC10742b, kotlin.collections.AbstractC10740a
        public final int getSize() {
            return this.f21354c;
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        Companion.getClass();
        C10843j.m430f(other, "other");
        if (size() != other.size()) {
            return false;
        }
        java.util.Iterator<E> it = other.iterator();
        for (E e : this) {
            if (!C10843j.m435a(e, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // kotlin.collections.AbstractC10740a
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int i;
        Companion.getClass();
        int i2 = 1;
        for (E e : this) {
            int i3 = i2 * 31;
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    @Override // java.util.List
    public int indexOf(E e) {
        int i = 0;
        for (E e2 : this) {
            if (C10843j.m435a(e2, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC10740a, java.util.Collection, java.lang.Iterable
    @NotNull
    public java.util.Iterator<E> iterator() {
        return new C10744b();
    }

    @Override // java.util.List
    public int lastIndexOf(E e) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C10843j.m435a(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new C10745c(0);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        return new C10745c(i);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        return new C10746d(this, i, i2);
    }
}
