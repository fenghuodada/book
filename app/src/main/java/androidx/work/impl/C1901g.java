package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.AbstractC2017r;
import androidx.work.AbstractC2020u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.g */
/* loaded from: classes.dex */
public final class C1901g extends AbstractC2017r {

    /* renamed from: i */
    public static final String f4631i = AbstractC2005l.m9732e("WorkContinuationImpl");

    /* renamed from: a */
    public final C1915l f4632a;

    /* renamed from: b */
    public final String f4633b;

    /* renamed from: c */
    public final int f4634c;

    /* renamed from: d */
    public final List<? extends AbstractC2020u> f4635d;

    /* renamed from: e */
    public final ArrayList f4636e;

    /* renamed from: f */
    public final ArrayList f4637f;

    /* renamed from: g */
    public final List<C1901g> f4638g;

    /* renamed from: h */
    public boolean f4639h;

    public C1901g() {
        throw null;
    }

    public C1901g(@NonNull C1915l c1915l, @NonNull List<? extends AbstractC2020u> list) {
        this.f4632a = c1915l;
        this.f4633b = null;
        this.f4634c = 2;
        this.f4635d = list;
        this.f4638g = null;
        this.f4636e = new ArrayList(list.size());
        this.f4637f = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String uuid = list.get(i).f4886a.toString();
            this.f4636e.add(uuid);
            this.f4637f.add(uuid);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: a */
    public static boolean m9823a(@NonNull C1901g c1901g, @NonNull HashSet hashSet) {
        hashSet.addAll(c1901g.f4636e);
        HashSet m9822b = m9822b(c1901g);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (m9822b.contains((String) it.next())) {
                return true;
            }
        }
        List<C1901g> list = c1901g.f4638g;
        if (list != null && !list.isEmpty()) {
            for (C1901g c1901g2 : list) {
                if (m9823a(c1901g2, hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(c1901g.f4636e);
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: b */
    public static HashSet m9822b(C1901g c1901g) {
        HashSet hashSet = new HashSet();
        List<C1901g> list = c1901g.f4638g;
        if (list != null && !list.isEmpty()) {
            for (C1901g c1901g2 : list) {
                hashSet.addAll(c1901g2.f4636e);
            }
        }
        return hashSet;
    }
}
