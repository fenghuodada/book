package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.InterfaceC3568t;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import com.bumptech.glide.util.C3861k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e */
/* loaded from: classes.dex */
public final class C3687e implements InterfaceC3573x<Bitmap>, InterfaceC3568t {

    /* renamed from: a */
    public final Bitmap f9650a;

    /* renamed from: b */
    public final InterfaceC3485d f9651b;

    public C3687e(@NonNull Bitmap bitmap, @NonNull InterfaceC3485d interfaceC3485d) {
        if (bitmap != null) {
            this.f9650a = bitmap;
            if (interfaceC3485d != null) {
                this.f9651b = interfaceC3485d;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @Nullable
    /* renamed from: b */
    public static C3687e m6567b(@Nullable Bitmap bitmap, @NonNull InterfaceC3485d interfaceC3485d) {
        if (bitmap == null) {
            return null;
        }
        return new C3687e(bitmap, interfaceC3485d);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    /* renamed from: a */
    public final void mo6510a() {
        this.f9651b.mo6538d(this.f9650a);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    /* renamed from: c */
    public final Class<Bitmap> mo6509c() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    public final Bitmap get() {
        return this.f9650a;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    public final int getSize() {
        return C3861k.m6401c(this.f9650a);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3568t
    public final void initialize() {
        this.f9650a.prepareToDraw();
    }
}
