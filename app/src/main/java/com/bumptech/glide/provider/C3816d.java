package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.collection.C0470b;
import com.bumptech.glide.util.C3859i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.provider.d */
/* loaded from: classes.dex */
public final class C3816d {

    /* renamed from: a */
    public final AtomicReference<C3859i> f9838a = new AtomicReference<>();

    /* renamed from: b */
    public final C0470b<C3859i, List<Class<?>>> f9839b = new C0470b<>();

    /* renamed from: a */
    public final void m6475a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f9839b) {
            this.f9839b.put(new C3859i(cls, cls2, cls3), list);
        }
    }
}
