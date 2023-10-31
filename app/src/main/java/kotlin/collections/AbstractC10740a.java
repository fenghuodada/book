package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10838e;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.1")
@SourceDebugExtension({"SMAP\nAbstractCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1747#2,3:43\n1726#2,3:46\n*S KotlinDebug\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n*L\n19#1:43,3\n22#1:46,3\n*E\n"})
/* renamed from: kotlin.collections.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10740a<E> implements Collection<E>, InterfaceC10847a {

    /* renamed from: kotlin.collections.a$a */
    /* loaded from: classes3.dex */
    public static final class C10741a extends AbstractC10844k implements InterfaceC10820l<E, CharSequence> {

        /* renamed from: a */
        public final /* synthetic */ AbstractC10740a<E> f21348a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10741a(AbstractC10740a<? extends E> abstractC10740a) {
            super(1);
            this.f21348a = abstractC10740a;
        }

        @Override // kotlin.jvm.functions.InterfaceC10820l
        public final CharSequence invoke(Object obj) {
            return obj == this.f21348a ? "(this Collection)" : String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (E e2 : this) {
            if (C10843j.m435a(e2, e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        C10843j.m430f(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public abstract int getSize();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    @NotNull
    public Object[] toArray() {
        return C10838e.m437a(this);
    }

    @Override // java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        C10843j.m430f(array, "array");
        return (T[]) C10838e.m436b(this, array);
    }

    @NotNull
    public String toString() {
        return C10757m.m475n(this, ", ", "[", "]", new C10741a(this), 24);
    }
}
