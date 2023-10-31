package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.InterfaceC3568t;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.util.C3860j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.x */
/* loaded from: classes.dex */
public final class C3733x implements InterfaceC3573x<BitmapDrawable>, InterfaceC3568t {

    /* renamed from: a */
    public final Resources f9711a;

    /* renamed from: b */
    public final InterfaceC3573x<Bitmap> f9712b;

    public C3733x(@NonNull Resources resources, @NonNull InterfaceC3573x<Bitmap> interfaceC3573x) {
        C3860j.m6404b(resources);
        this.f9711a = resources;
        C3860j.m6404b(interfaceC3573x);
        this.f9712b = interfaceC3573x;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    /* renamed from: a */
    public final void mo6510a() {
        this.f9712b.mo6510a();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    /* renamed from: c */
    public final Class<BitmapDrawable> mo6509c() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f9711a, this.f9712b.get());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    public final int getSize() {
        return this.f9712b.getSize();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3568t
    public final void initialize() {
        InterfaceC3573x<Bitmap> interfaceC3573x = this.f9712b;
        if (interfaceC3573x instanceof InterfaceC3568t) {
            ((InterfaceC3568t) interfaceC3573x).initialize();
        }
    }
}
