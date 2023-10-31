package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C8196a0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.c */
/* loaded from: classes3.dex */
public abstract class AbstractC8205c<E> extends AbstractList<E> implements C8196a0.InterfaceC8199c<E> {

    /* renamed from: a */
    public boolean f15955a = true;

    /* renamed from: a */
    public final void m3923a() {
        if (!this.f15955a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m3923a();
        return super.add(e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        m3923a();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        m3923a();
        return super.addAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c
    /* renamed from: c */
    public final void mo3922c() {
        this.f15955a = false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m3923a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (obj instanceof RandomAccess) {
                List list = (List) obj;
                int size = size();
                if (size != list.size()) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (!get(i).equals(list.get(i))) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c
    /* renamed from: h */
    public final boolean mo3921h() {
        return this.f15955a;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m3923a();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        m3923a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        m3923a();
        return super.retainAll(collection);
    }
}
