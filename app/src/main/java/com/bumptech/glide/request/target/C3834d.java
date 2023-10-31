package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* renamed from: com.bumptech.glide.request.target.d */
/* loaded from: classes.dex */
public final class C3834d extends AbstractC3835e<Drawable> {
    public C3834d(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.request.target.AbstractC3835e
    /* renamed from: i */
    public final void mo6433i(@Nullable Drawable drawable) {
        ((ImageView) this.f9921a).setImageDrawable(drawable);
    }
}
