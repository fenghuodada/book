package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.model.C3625n;
import com.bumptech.glide.util.C3856g;
import java.util.ArrayDeque;

/* renamed from: com.bumptech.glide.load.model.m */
/* loaded from: classes.dex */
public final class C3624m extends C3856g<C3625n.C3626a<Object>, Object> {
    public C3624m() {
        super(500L);
    }

    @Override // com.bumptech.glide.util.C3856g
    /* renamed from: c */
    public final void mo6410c(@NonNull C3625n.C3626a<Object> c3626a, @Nullable Object obj) {
        C3625n.C3626a<Object> c3626a2 = c3626a;
        c3626a2.getClass();
        ArrayDeque arrayDeque = C3625n.C3626a.f9561d;
        synchronized (arrayDeque) {
            arrayDeque.offer(c3626a2);
        }
    }
}
