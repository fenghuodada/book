package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.bumptech.glide.request.target.e */
/* loaded from: classes.dex */
public abstract class AbstractC3835e<Z> extends AbstractC3838h<ImageView, Z> {
    @Nullable

    /* renamed from: c */
    public Animatable f9920c;

    public AbstractC3835e(ImageView imageView) {
        super(imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    /* renamed from: b */
    public final void mo6431b(@NonNull Object obj) {
        mo6433i(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f9920c = animatable;
            animatable.start();
            return;
        }
        this.f9920c = null;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    /* renamed from: d */
    public final void mo6430d(@Nullable Drawable drawable) {
        mo6433i(null);
        this.f9920c = null;
        ((ImageView) this.f9921a).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    /* renamed from: e */
    public final void mo6429e(@Nullable Drawable drawable) {
        mo6433i(null);
        this.f9920c = null;
        ((ImageView) this.f9921a).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.AbstractC3838h, com.bumptech.glide.request.target.InterfaceC3837g
    /* renamed from: g */
    public final void mo6425g(@Nullable Drawable drawable) {
        super.mo6425g(drawable);
        Animatable animatable = this.f9920c;
        if (animatable != null) {
            animatable.stop();
        }
        mo6433i(null);
        this.f9920c = null;
        ((ImageView) this.f9921a).setImageDrawable(drawable);
    }

    /* renamed from: i */
    public abstract void mo6433i(@Nullable Z z);

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final void onStart() {
        Animatable animatable = this.f9920c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final void onStop() {
        Animatable animatable = this.f9920c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
