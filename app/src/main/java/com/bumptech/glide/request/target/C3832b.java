package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.request.target.b */
/* loaded from: classes.dex */
public final class C3832b extends AbstractC3835e<Bitmap> {
    public C3832b(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.target.AbstractC3835e
    /* renamed from: i */
    public final void mo6433i(Bitmap bitmap) {
        ((ImageView) this.f9921a).setImageBitmap(bitmap);
    }
}
