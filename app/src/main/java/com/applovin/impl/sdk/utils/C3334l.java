package com.applovin.impl.sdk.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.utils.l */
/* loaded from: classes.dex */
public class C3334l<T extends Comparable<? super T>> implements RandomAccess, Set<T> {

    /* renamed from: a */
    private final ArrayList<T> f8787a = new ArrayList<>();

    /* renamed from: b */
    private final HashSet<T> f8788b = new HashSet<>();

    /* renamed from: a */
    public T m6928a() {
        return this.f8787a.get(size() - 1);
    }

    /* renamed from: a */
    public T m6927a(int i) {
        return this.f8787a.get(i);
    }

    /* renamed from: a */
    public void m6926a(int i, T t) {
        this.f8788b.remove(this.f8787a.get(i));
        this.f8787a.set(i, t);
        this.f8788b.add(t);
    }

    /* renamed from: a */
    public boolean m6925a(T t) {
        if (contains(t)) {
            return false;
        }
        if (isEmpty() || t.compareTo(m6928a()) > 0) {
            this.f8787a.add(t);
        } else {
            this.f8787a.add(m6922c(t), t);
        }
        return this.f8788b.add(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        return m6925a((C3334l<T>) ((Comparable) obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@NonNull Collection<? extends T> collection) {
        boolean z;
        while (true) {
            for (T t : collection) {
                z = m6925a((C3334l<T>) t) || z;
            }
            return z;
        }
    }

    /* renamed from: b */
    public int m6923b(@Nullable T t) {
        if (t == null || !contains(t)) {
            return -1;
        }
        return m6922c(t);
    }

    /* renamed from: b */
    public T m6924b(int i) {
        T remove = this.f8787a.remove(i);
        this.f8788b.remove(remove);
        return remove;
    }

    /* renamed from: c */
    public int m6922c(T t) {
        int binarySearch = Collections.binarySearch(this.f8787a, t);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        T m6927a = m6927a(binarySearch);
        while (binarySearch >= 0 && m6927a == m6927a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f8787a.clear();
        this.f8788b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(@Nullable Object obj) {
        return this.f8788b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.f8788b.containsAll(collection);
    }

    /* renamed from: d */
    public int m6921d(T t) {
        int binarySearch = Collections.binarySearch(this.f8787a, t);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        T m6927a = m6927a(binarySearch);
        while (binarySearch < size() && m6927a == m6927a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f8787a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NonNull
    public Iterator<T> iterator() {
        return this.f8787a.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(@Nullable Object obj) {
        int m6923b = m6923b((C3334l<T>) ((Comparable) obj));
        if (m6923b == -1) {
            return false;
        }
        this.f8787a.remove(m6923b);
        return this.f8788b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NonNull Collection<?> collection) {
        while (true) {
            for (Object obj : collection) {
                boolean z = z || remove(obj);
            }
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            T t = this.f8787a.get(size);
            if (!collection.contains(t)) {
                this.f8787a.remove(size);
                this.f8788b.remove(t);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f8787a.size();
    }

    @Override // java.util.Set, java.util.Collection
    @NonNull
    public Object[] toArray() {
        return this.f8787a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    @NonNull
    public <T1> T1[] toArray(@NonNull T1[] t1Arr) {
        return (T1[]) this.f8787a.toArray(t1Arr);
    }
}
