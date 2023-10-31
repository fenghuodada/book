package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.e */
/* loaded from: classes.dex */
public class C3486e implements InterfaceC3485d {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d
    /* renamed from: a */
    public final void mo6695a(int i) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d
    /* renamed from: b */
    public final void mo6694b() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d
    @NonNull
    /* renamed from: c */
    public final Bitmap mo6693c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d
    /* renamed from: d */
    public void mo6538d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d
    @NonNull
    /* renamed from: e */
    public final Bitmap mo6692e(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
