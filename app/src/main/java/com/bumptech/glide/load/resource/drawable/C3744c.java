package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* renamed from: com.bumptech.glide.load.resource.drawable.c */
/* loaded from: classes.dex */
public final class C3744c extends AbstractC3743b<Drawable> {
    public C3744c(Drawable drawable) {
        super(drawable);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    /* renamed from: a */
    public final void mo6510a() {
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    /* renamed from: c */
    public final Class<Drawable> mo6509c() {
        return this.f9723a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    public final int getSize() {
        T t = this.f9723a;
        return Math.max(1, t.getIntrinsicHeight() * t.getIntrinsicWidth() * 4);
    }
}
