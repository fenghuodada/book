package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.pool.C3863a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bumptech.glide.load.model.q */
/* loaded from: classes.dex */
public final class C3630q {

    /* renamed from: a */
    public final C3635s f9568a;

    /* renamed from: b */
    public final C3631a f9569b;

    /* renamed from: com.bumptech.glide.load.model.q$a */
    /* loaded from: classes.dex */
    public static class C3631a {

        /* renamed from: a */
        public final HashMap f9570a = new HashMap();

        /* renamed from: com.bumptech.glide.load.model.q$a$a */
        /* loaded from: classes.dex */
        public static class C3632a<Model> {

            /* renamed from: a */
            public final List<InterfaceC3627o<Model, ?>> f9571a;

            public C3632a(List<InterfaceC3627o<Model, ?>> list) {
                this.f9571a = list;
            }
        }
    }

    public C3630q(@NonNull C3863a.C3866c c3866c) {
        C3635s c3635s = new C3635s(c3866c);
        this.f9569b = new C3631a();
        this.f9568a = c3635s;
    }

    @NonNull
    /* renamed from: a */
    public final synchronized ArrayList m6591a(@NonNull Class cls) {
        return this.f9568a.m6583e(cls);
    }
}
