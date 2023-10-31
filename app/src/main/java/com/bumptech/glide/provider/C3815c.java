package com.bumptech.glide.provider;

import androidx.annotation.Nullable;
import androidx.collection.C0470b;
import com.bumptech.glide.load.engine.C3542l;
import com.bumptech.glide.load.engine.C3570v;
import com.bumptech.glide.load.resource.transcode.C3778g;
import com.bumptech.glide.util.C3859i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.provider.c */
/* loaded from: classes.dex */
public final class C3815c {

    /* renamed from: c */
    public static final C3570v<?, ?, ?> f9835c = new C3570v<>(Object.class, Object.class, Object.class, Collections.singletonList(new C3542l(Object.class, Object.class, Object.class, Collections.emptyList(), new C3778g(), null)), null);

    /* renamed from: a */
    public final C0470b<C3859i, C3570v<?, ?, ?>> f9836a = new C0470b<>();

    /* renamed from: b */
    public final AtomicReference<C3859i> f9837b = new AtomicReference<>();

    /* renamed from: a */
    public final void m6476a(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable C3570v<?, ?, ?> c3570v) {
        synchronized (this.f9836a) {
            C0470b<C3859i, C3570v<?, ?, ?>> c0470b = this.f9836a;
            C3859i c3859i = new C3859i(cls, cls2, cls3);
            if (c3570v == null) {
                c3570v = f9835c;
            }
            c0470b.put(c3859i, c3570v);
        }
    }
}
