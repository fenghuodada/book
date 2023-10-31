package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.C3424g;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.load.InterfaceC3585m;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import com.bumptech.glide.util.C3861k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f */
/* loaded from: classes.dex */
public abstract class AbstractC3689f implements InterfaceC3585m<Bitmap> {
    @Override // com.bumptech.glide.load.InterfaceC3585m
    @NonNull
    /* renamed from: a */
    public final InterfaceC3573x mo6501a(@NonNull C3424g c3424g, @NonNull InterfaceC3573x interfaceC3573x, int i, int i2) {
        if (C3861k.m6397g(i, i2)) {
            InterfaceC3485d interfaceC3485d = ComponentCallbacks2C3409b.m6786b(c3424g).f9033a;
            Bitmap bitmap = (Bitmap) interfaceC3573x.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap mo6534c = mo6534c(interfaceC3485d, bitmap, i, i2);
            if (!bitmap.equals(mo6534c)) {
                return C3687e.m6567b(mo6534c, interfaceC3485d);
            }
            return interfaceC3573x;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* renamed from: c */
    public abstract Bitmap mo6534c(@NonNull InterfaceC3485d interfaceC3485d, @NonNull Bitmap bitmap, int i, int i2);
}
