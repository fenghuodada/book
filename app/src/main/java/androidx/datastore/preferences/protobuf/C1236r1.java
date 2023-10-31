package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: androidx.datastore.preferences.protobuf.r1 */
/* loaded from: classes.dex */
public final class C1236r1 extends AbstractList<String> implements InterfaceC1181h0, RandomAccess {

    /* renamed from: a */
    public final InterfaceC1181h0 f3074a;

    /* renamed from: androidx.datastore.preferences.protobuf.r1$a */
    /* loaded from: classes.dex */
    public class C1237a implements ListIterator<String>, Iterator {

        /* renamed from: a */
        public final ListIterator<String> f3075a;

        public C1237a(C1236r1 c1236r1, int i) {
            this.f3075a = c1236r1.f3074a.listIterator(i);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // p060j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, p060j$.util.Iterator
        public final boolean hasNext() {
            return this.f3075a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f3075a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator, p060j$.util.Iterator
        public final Object next() {
            return this.f3075a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f3075a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f3075a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f3075a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.r1$b */
    /* loaded from: classes.dex */
    public class C1238b implements java.util.Iterator<String>, Iterator {

        /* renamed from: a */
        public final java.util.Iterator<String> f3076a;

        public C1238b(C1236r1 c1236r1) {
            this.f3076a = c1236r1.f3074a.iterator();
        }

        @Override // p060j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final boolean hasNext() {
            return this.f3076a.hasNext();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final Object next() {
            return this.f3076a.next();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C1236r1(InterfaceC1181h0 interfaceC1181h0) {
        this.f3074a = interfaceC1181h0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1181h0
    /* renamed from: e */
    public final List<?> mo10841e() {
        return this.f3074a.mo10841e();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1181h0
    /* renamed from: f */
    public final InterfaceC1181h0 mo10840f() {
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1181h0
    /* renamed from: g */
    public final Object mo10839g(int i) {
        return this.f3074a.mo10839g(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f3074a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<String> iterator() {
        return new C1238b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C1237a(this, i);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1181h0
    /* renamed from: q */
    public final void mo10838q(AbstractC1183i abstractC1183i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3074a.size();
    }
}
