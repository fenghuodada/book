package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.util.g */
/* loaded from: classes.dex */
public class C3856g<T, Y> {

    /* renamed from: a */
    public final LinkedHashMap f9947a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f9948b;

    /* renamed from: c */
    public long f9949c;

    /* renamed from: com.bumptech.glide.util.g$a */
    /* loaded from: classes.dex */
    public static final class C3857a<Y> {

        /* renamed from: a */
        public final Y f9950a;

        /* renamed from: b */
        public final int f9951b;

        public C3857a(Y y, int i) {
            this.f9950a = y;
            this.f9951b = i;
        }
    }

    public C3856g(long j) {
        this.f9948b = j;
    }

    @Nullable
    /* renamed from: a */
    public final synchronized Y m6412a(@NonNull T t) {
        C3857a c3857a;
        c3857a = (C3857a) this.f9947a.get(t);
        return c3857a != null ? c3857a.f9950a : null;
    }

    /* renamed from: b */
    public int mo6411b(@Nullable Y y) {
        return 1;
    }

    /* renamed from: c */
    public void mo6410c(@NonNull T t, @Nullable Y y) {
    }

    @Nullable
    /* renamed from: d */
    public final synchronized Y m6409d(@NonNull T t, @Nullable Y y) {
        C3857a c3857a;
        int mo6411b = mo6411b(y);
        long j = mo6411b;
        Y y2 = null;
        if (j >= this.f9948b) {
            mo6410c(t, y);
            return null;
        }
        if (y != null) {
            this.f9949c += j;
        }
        LinkedHashMap linkedHashMap = this.f9947a;
        if (y == null) {
            c3857a = null;
        } else {
            c3857a = new C3857a(y, mo6411b);
        }
        C3857a c3857a2 = (C3857a) linkedHashMap.put(t, c3857a);
        if (c3857a2 != null) {
            this.f9949c -= c3857a2.f9951b;
            if (!c3857a2.f9950a.equals(y)) {
                mo6410c(t, c3857a2.f9950a);
            }
        }
        m6408e(this.f9948b);
        if (c3857a2 != null) {
            y2 = c3857a2.f9950a;
        }
        return y2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final synchronized void m6408e(long j) {
        while (this.f9949c > j) {
            Iterator it = this.f9947a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C3857a c3857a = (C3857a) entry.getValue();
            this.f9949c -= c3857a.f9951b;
            Object key = entry.getKey();
            it.remove();
            mo6410c(key, c3857a.f9950a);
        }
    }
}
