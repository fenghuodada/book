package com.bumptech.glide.load.resource.transcode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.resource.bitmap.C3733x;

/* renamed from: com.bumptech.glide.load.resource.transcode.b */
/* loaded from: classes.dex */
public final class C3772b implements InterfaceC3775e<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    public final Resources f9787a;

    public C3772b(@NonNull Resources resources) {
        this.f9787a = resources;
    }

    @Override // com.bumptech.glide.load.resource.transcode.InterfaceC3775e
    @Nullable
    /* renamed from: a */
    public final InterfaceC3573x<BitmapDrawable> mo6498a(@NonNull InterfaceC3573x<Bitmap> interfaceC3573x, @NonNull C3581i c3581i) {
        if (interfaceC3573x == null) {
            return null;
        }
        return new C3733x(this.f9787a, interfaceC3573x);
    }
}
