package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.core.util.C0803g;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC3447d;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.InterfaceC3584l;
import com.bumptech.glide.load.data.C3456f;
import com.bumptech.glide.load.data.InterfaceC3454e;
import com.bumptech.glide.load.engine.C3542l;
import com.bumptech.glide.load.model.C3630q;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.load.model.InterfaceC3629p;
import com.bumptech.glide.load.resource.transcode.C3776f;
import com.bumptech.glide.load.resource.transcode.InterfaceC3775e;
import com.bumptech.glide.provider.C3812a;
import com.bumptech.glide.provider.C3814b;
import com.bumptech.glide.provider.C3815c;
import com.bumptech.glide.provider.C3816d;
import com.bumptech.glide.provider.C3817e;
import com.bumptech.glide.provider.C3819f;
import com.bumptech.glide.util.pool.C3863a;
import com.bumptech.glide.util.pool.C3869b;
import com.bumptech.glide.util.pool.C3870c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bumptech.glide.j */
/* loaded from: classes.dex */
public final class C3433j {

    /* renamed from: a */
    public final C3630q f9139a;

    /* renamed from: b */
    public final C3812a f9140b;

    /* renamed from: c */
    public final C3817e f9141c;

    /* renamed from: d */
    public final C3819f f9142d;

    /* renamed from: e */
    public final C3456f f9143e;

    /* renamed from: f */
    public final C3776f f9144f;

    /* renamed from: g */
    public final C3814b f9145g;

    /* renamed from: h */
    public final C3816d f9146h = new C3816d();

    /* renamed from: i */
    public final C3815c f9147i = new C3815c();

    /* renamed from: j */
    public final C3863a.C3866c f9148j;

    /* renamed from: com.bumptech.glide.j$a */
    /* loaded from: classes.dex */
    public static class C3434a extends RuntimeException {
        public C3434a(@NonNull String str) {
            super(str);
        }
    }

    /* renamed from: com.bumptech.glide.j$b */
    /* loaded from: classes.dex */
    public static final class C3435b extends C3434a {
        public C3435b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: com.bumptech.glide.j$c */
    /* loaded from: classes.dex */
    public static class C3436c extends C3434a {
        public C3436c(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public C3436c(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> C3436c(@NonNull M m, @NonNull List<InterfaceC3627o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }
    }

    /* renamed from: com.bumptech.glide.j$d */
    /* loaded from: classes.dex */
    public static class C3437d extends C3434a {
        public C3437d(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* renamed from: com.bumptech.glide.j$e */
    /* loaded from: classes.dex */
    public static class C3438e extends C3434a {
        public C3438e(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public C3433j() {
        C3863a.C3866c c3866c = new C3863a.C3866c(new C0803g(20), new C3869b(), new C3870c());
        this.f9148j = c3866c;
        this.f9139a = new C3630q(c3866c);
        this.f9140b = new C3812a();
        this.f9141c = new C3817e();
        this.f9142d = new C3819f();
        this.f9143e = new C3456f();
        this.f9144f = new C3776f();
        this.f9145g = new C3814b();
        List<String> asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String str : asList) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        C3817e c3817e = this.f9141c;
        synchronized (c3817e) {
            ArrayList arrayList2 = new ArrayList(c3817e.f9840a);
            c3817e.f9840a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c3817e.f9840a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (!arrayList.contains(str2)) {
                    c3817e.f9840a.add(str2);
                }
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public final void m6747a(@NonNull InterfaceC3583k interfaceC3583k, @NonNull Class cls, @NonNull Class cls2, @NonNull String str) {
        C3817e c3817e = this.f9141c;
        synchronized (c3817e) {
            c3817e.m6474a(str).add(new C3817e.C3818a<>(cls, cls2, interfaceC3583k));
        }
    }

    @NonNull
    /* renamed from: b */
    public final void m6746b(@NonNull Class cls, @NonNull InterfaceC3447d interfaceC3447d) {
        C3812a c3812a = this.f9140b;
        synchronized (c3812a) {
            c3812a.f9831a.add(new C3812a.C3813a(cls, interfaceC3447d));
        }
    }

    @NonNull
    /* renamed from: c */
    public final void m6745c(@NonNull Class cls, @NonNull InterfaceC3584l interfaceC3584l) {
        C3819f c3819f = this.f9142d;
        synchronized (c3819f) {
            c3819f.f9845a.add(new C3819f.C3820a(cls, interfaceC3584l));
        }
    }

    @NonNull
    /* renamed from: d */
    public final void m6744d(@NonNull Class cls, @NonNull Class cls2, @NonNull InterfaceC3629p interfaceC3629p) {
        C3630q c3630q = this.f9139a;
        synchronized (c3630q) {
            c3630q.f9568a.m6587a(cls, cls2, interfaceC3629p);
            c3630q.f9569b.f9570a.clear();
        }
    }

    @NonNull
    /* renamed from: e */
    public final ArrayList m6743e(@NonNull Class cls, @NonNull Class cls2, @NonNull Class cls3) {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f9141c.m6473b(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = this.f9144f.m6499b(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                C3817e c3817e = this.f9141c;
                synchronized (c3817e) {
                    arrayList = new ArrayList();
                    Iterator it3 = c3817e.f9840a.iterator();
                    while (it3.hasNext()) {
                        List<C3817e.C3818a> list = (List) c3817e.f9841b.get((String) it3.next());
                        if (list != null) {
                            for (C3817e.C3818a c3818a : list) {
                                if (c3818a.f9842a.isAssignableFrom(cls) && cls4.isAssignableFrom(c3818a.f9843b)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    arrayList.add(c3818a.f9844c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new C3542l(cls, cls4, cls5, arrayList, this.f9144f.m6500a(cls4, cls5), this.f9148j));
            }
        }
        return arrayList2;
    }

    @NonNull
    /* renamed from: f */
    public final ArrayList m6742f() {
        ArrayList arrayList;
        C3814b c3814b = this.f9145g;
        synchronized (c3814b) {
            arrayList = c3814b.f9834a;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new C3435b();
    }

    @NonNull
    /* renamed from: g */
    public final <Model> List<InterfaceC3627o<Model, ?>> m6741g(@NonNull Model model) {
        List<InterfaceC3627o<Model, ?>> list;
        C3630q c3630q = this.f9139a;
        c3630q.getClass();
        Class<?> cls = model.getClass();
        synchronized (c3630q) {
            C3630q.C3631a.C3632a c3632a = (C3630q.C3631a.C3632a) c3630q.f9569b.f9570a.get(cls);
            if (c3632a == null) {
                list = null;
            } else {
                list = c3632a.f9571a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(c3630q.f9568a.m6584d(cls));
                if (((C3630q.C3631a.C3632a) c3630q.f9569b.f9570a.put(cls, new C3630q.C3631a.C3632a(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<InterfaceC3627o<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                InterfaceC3627o<Model, ?> interfaceC3627o = list.get(i);
                if (interfaceC3627o.mo6574a(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(interfaceC3627o);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new C3436c(model, list);
        }
        throw new C3436c(model);
    }

    @NonNull
    /* renamed from: h */
    public final void m6740h(@NonNull ImageHeaderParser imageHeaderParser) {
        C3814b c3814b = this.f9145g;
        synchronized (c3814b) {
            c3814b.f9834a.add(imageHeaderParser);
        }
    }

    @NonNull
    /* renamed from: i */
    public final void m6739i(@NonNull InterfaceC3454e.InterfaceC3455a interfaceC3455a) {
        C3456f c3456f = this.f9143e;
        synchronized (c3456f) {
            c3456f.f9201a.put(interfaceC3455a.mo6524a(), interfaceC3455a);
        }
    }

    @NonNull
    /* renamed from: j */
    public final void m6738j(@NonNull Class cls, @NonNull Class cls2, @NonNull InterfaceC3775e interfaceC3775e) {
        C3776f c3776f = this.f9144f;
        synchronized (c3776f) {
            c3776f.f9791a.add(new C3776f.C3777a(cls, cls2, interfaceC3775e));
        }
    }
}
