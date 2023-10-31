package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.load.resource.transcode.f */
/* loaded from: classes.dex */
public final class C3776f {

    /* renamed from: a */
    public final ArrayList f9791a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.resource.transcode.f$a */
    /* loaded from: classes.dex */
    public static final class C3777a<Z, R> {

        /* renamed from: a */
        public final Class<Z> f9792a;

        /* renamed from: b */
        public final Class<R> f9793b;

        /* renamed from: c */
        public final InterfaceC3775e<Z, R> f9794c;

        public C3777a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull InterfaceC3775e<Z, R> interfaceC3775e) {
            this.f9792a = cls;
            this.f9793b = cls2;
            this.f9794c = interfaceC3775e;
        }
    }

    @NonNull
    /* renamed from: a */
    public final synchronized <Z, R> InterfaceC3775e<Z, R> m6500a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        boolean z;
        if (cls2.isAssignableFrom(cls)) {
            return C3778g.f9795a;
        }
        Iterator it = this.f9791a.iterator();
        while (it.hasNext()) {
            C3777a c3777a = (C3777a) it.next();
            if (c3777a.f9792a.isAssignableFrom(cls) && cls2.isAssignableFrom(c3777a.f9793b)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return c3777a.f9794c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    /* renamed from: b */
    public final synchronized ArrayList m6499b(@NonNull Class cls, @NonNull Class cls2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f9791a.iterator();
        while (it.hasNext()) {
            C3777a c3777a = (C3777a) it.next();
            if (c3777a.f9792a.isAssignableFrom(cls) && cls2.isAssignableFrom(c3777a.f9793b)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
