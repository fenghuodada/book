package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.InterfaceC3583k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bumptech.glide.provider.e */
/* loaded from: classes.dex */
public final class C3817e {

    /* renamed from: a */
    public final ArrayList f9840a = new ArrayList();

    /* renamed from: b */
    public final HashMap f9841b = new HashMap();

    /* renamed from: com.bumptech.glide.provider.e$a */
    /* loaded from: classes.dex */
    public static class C3818a<T, R> {

        /* renamed from: a */
        public final Class<T> f9842a;

        /* renamed from: b */
        public final Class<R> f9843b;

        /* renamed from: c */
        public final InterfaceC3583k<T, R> f9844c;

        public C3818a(@NonNull Class<T> cls, @NonNull Class<R> cls2, InterfaceC3583k<T, R> interfaceC3583k) {
            this.f9842a = cls;
            this.f9843b = cls2;
            this.f9844c = interfaceC3583k;
        }
    }

    @NonNull
    /* renamed from: a */
    public final synchronized List<C3818a<?, ?>> m6474a(@NonNull String str) {
        List<C3818a<?, ?>> list;
        if (!this.f9840a.contains(str)) {
            this.f9840a.add(str);
        }
        list = (List) this.f9841b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f9841b.put(str, list);
        }
        return list;
    }

    @NonNull
    /* renamed from: b */
    public final synchronized ArrayList m6473b(@NonNull Class cls, @NonNull Class cls2) {
        ArrayList arrayList;
        boolean z;
        arrayList = new ArrayList();
        Iterator it = this.f9840a.iterator();
        while (it.hasNext()) {
            List<C3818a> list = (List) this.f9841b.get((String) it.next());
            if (list != null) {
                for (C3818a c3818a : list) {
                    if (c3818a.f9842a.isAssignableFrom(cls) && cls2.isAssignableFrom(c3818a.f9843b)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && !arrayList.contains(c3818a.f9843b)) {
                        arrayList.add(c3818a.f9843b);
                    }
                }
            }
        }
        return arrayList;
    }
}
