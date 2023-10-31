package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.exoplayer2.util.f */
/* loaded from: classes.dex */
public final class C7405f<E> implements Iterable<E> {

    /* renamed from: a */
    public final Object f13900a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    public final HashMap f13901b = new HashMap();
    @GuardedBy("lock")

    /* renamed from: c */
    public Set<E> f13902c = Collections.emptySet();
    @GuardedBy("lock")

    /* renamed from: d */
    public List<E> f13903d = Collections.emptyList();

    /* renamed from: a */
    public final int m5107a(E e) {
        int intValue;
        synchronized (this.f13900a) {
            intValue = this.f13901b.containsKey(e) ? ((Integer) this.f13901b.get(e)).intValue() : 0;
        }
        return intValue;
    }

    /* renamed from: b */
    public final void m5106b(E e) {
        synchronized (this.f13900a) {
            Integer num = (Integer) this.f13901b.get(e);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f13903d);
            arrayList.remove(e);
            this.f13903d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f13901b.remove(e);
                HashSet hashSet = new HashSet(this.f13902c);
                hashSet.remove(e);
                this.f13902c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f13901b.put(e, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f13900a) {
            it = this.f13903d.iterator();
        }
        return it;
    }
}
