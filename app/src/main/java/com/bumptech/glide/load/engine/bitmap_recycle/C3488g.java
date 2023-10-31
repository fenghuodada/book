package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3497l;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.g */
/* loaded from: classes.dex */
public final class C3488g<K extends InterfaceC3497l, V> {

    /* renamed from: a */
    public final C3489a<K, V> f9236a = new C3489a<>();

    /* renamed from: b */
    public final HashMap f9237b = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.g$a */
    /* loaded from: classes.dex */
    public static class C3489a<K, V> {

        /* renamed from: a */
        public final K f9238a;

        /* renamed from: b */
        public ArrayList f9239b;

        /* renamed from: c */
        public C3489a<K, V> f9240c;

        /* renamed from: d */
        public C3489a<K, V> f9241d;

        public C3489a() {
            this(null);
        }

        public C3489a(K k) {
            this.f9241d = this;
            this.f9240c = this;
            this.f9238a = k;
        }
    }

    @Nullable
    /* renamed from: a */
    public final V m6710a(K k) {
        C3489a c3489a;
        int i;
        HashMap hashMap = this.f9237b;
        C3489a c3489a2 = (C3489a) hashMap.get(k);
        if (c3489a2 == null) {
            C3489a c3489a3 = new C3489a(k);
            hashMap.put(k, c3489a3);
            c3489a = c3489a3;
        } else {
            k.mo6682a();
            c3489a = c3489a2;
        }
        C3489a<K, V> c3489a4 = c3489a.f9241d;
        c3489a4.f9240c = c3489a.f9240c;
        c3489a.f9240c.f9241d = c3489a4;
        C3489a<K, V> c3489a5 = this.f9236a;
        c3489a.f9241d = c3489a5;
        C3489a<K, V> c3489a6 = c3489a5.f9240c;
        c3489a.f9240c = c3489a6;
        c3489a6.f9241d = c3489a;
        c3489a.f9241d.f9240c = c3489a;
        ArrayList arrayList = c3489a.f9239b;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            return (V) c3489a.f9239b.remove(i - 1);
        }
        return null;
    }

    /* renamed from: b */
    public final void m6709b(K k, V v) {
        HashMap hashMap = this.f9237b;
        C3489a c3489a = (C3489a) hashMap.get(k);
        if (c3489a == null) {
            c3489a = new C3489a(k);
            C3489a<K, V> c3489a2 = c3489a.f9241d;
            c3489a2.f9240c = c3489a.f9240c;
            c3489a.f9240c.f9241d = c3489a2;
            C3489a<K, V> c3489a3 = this.f9236a;
            c3489a.f9241d = c3489a3.f9241d;
            c3489a.f9240c = c3489a3;
            c3489a3.f9241d = c3489a;
            c3489a.f9241d.f9240c = c3489a;
            hashMap.put(k, c3489a);
        } else {
            k.mo6682a();
        }
        if (c3489a.f9239b == null) {
            c3489a.f9239b = new ArrayList();
        }
        c3489a.f9239b.add(v);
    }

    @Nullable
    /* renamed from: c */
    public final V m6708c() {
        int i;
        C3489a<K, V> c3489a = this.f9236a;
        C3489a c3489a2 = c3489a.f9241d;
        while (true) {
            V v = null;
            if (c3489a2.equals(c3489a)) {
                return null;
            }
            ArrayList arrayList = c3489a2.f9239b;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            if (i > 0) {
                v = (V) c3489a2.f9239b.remove(i - 1);
            }
            if (v != null) {
                return v;
            }
            C3489a<K, V> c3489a3 = c3489a2.f9241d;
            c3489a3.f9240c = c3489a2.f9240c;
            c3489a2.f9240c.f9241d = c3489a3;
            HashMap hashMap = this.f9237b;
            Object obj = c3489a2.f9238a;
            hashMap.remove(obj);
            ((InterfaceC3497l) obj).mo6682a();
            c3489a2 = c3489a2.f9241d;
        }
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C3489a<K, V> c3489a = this.f9236a;
        C3489a c3489a2 = c3489a.f9240c;
        boolean z = false;
        while (!c3489a2.equals(c3489a)) {
            sb.append('{');
            sb.append(c3489a2.f9238a);
            sb.append(':');
            ArrayList arrayList = c3489a2.f9239b;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            sb.append(i);
            sb.append("}, ");
            c3489a2 = c3489a2.f9240c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
