package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o1 */
/* loaded from: classes3.dex */
public final class C8266o1 extends AbstractList<String> implements InterfaceC8221g0, RandomAccess {

    /* renamed from: a */
    public final InterfaceC8221g0 f16059a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.o1$a */
    /* loaded from: classes3.dex */
    public class C8267a implements ListIterator<String>, Iterator {

        /* renamed from: a */
        public final ListIterator<String> f16060a;

        public C8267a(C8266o1 c8266o1, int i) {
            this.f16060a = c8266o1.f16059a.listIterator(i);
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
            return this.f16060a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f16060a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator, p060j$.util.Iterator
        public final Object next() {
            return this.f16060a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f16060a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f16060a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f16060a.previousIndex();
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

    /* renamed from: com.google.crypto.tink.shaded.protobuf.o1$b */
    /* loaded from: classes3.dex */
    public class C8268b implements java.util.Iterator<String>, Iterator {

        /* renamed from: a */
        public final java.util.Iterator<String> f16061a;

        public C8268b(C8266o1 c8266o1) {
            this.f16061a = c8266o1.f16059a.iterator();
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
            return this.f16061a.hasNext();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final Object next() {
            return this.f16061a.next();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C8266o1(InterfaceC8221g0 interfaceC8221g0) {
        this.f16059a = interfaceC8221g0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8221g0
    /* renamed from: e */
    public final List<?> mo3618e() {
        return this.f16059a.mo3618e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8221g0
    /* renamed from: f */
    public final InterfaceC8221g0 mo3617f() {
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8221g0
    /* renamed from: g */
    public final Object mo3616g(int i) {
        return this.f16059a.mo3616g(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f16059a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<String> iterator() {
        return new C8268b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C8267a(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16059a.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8221g0
    /* renamed from: x */
    public final void mo3615x(AbstractC8228i abstractC8228i) {
        throw new UnsupportedOperationException();
    }
}
