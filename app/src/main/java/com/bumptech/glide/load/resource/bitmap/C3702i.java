package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i */
/* loaded from: classes.dex */
public final class C3702i extends AbstractC3689f {

    /* renamed from: b */
    public static final byte[] f9663b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC3577g.f9514a);

    @Override // com.bumptech.glide.load.InterfaceC3577g
    /* renamed from: b */
    public final void mo6420b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f9663b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3689f
    /* renamed from: c */
    public final Bitmap mo6534c(@NonNull InterfaceC3485d interfaceC3485d, @NonNull Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = C3682c0.f9646a;
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            Matrix matrix = new Matrix();
            float f = 0.0f;
            if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
                width = i2 / bitmap.getHeight();
                f = (i - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i / bitmap.getWidth();
                height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
            if (bitmap.getConfig() != null) {
                config = bitmap.getConfig();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap mo6692e = interfaceC3485d.mo6692e(i, i2, config);
            mo6692e.setHasAlpha(bitmap.hasAlpha());
            C3682c0.m6569a(bitmap, mo6692e, matrix);
            return mo6692e;
        }
        return bitmap;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final boolean equals(Object obj) {
        return obj instanceof C3702i;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final int hashCode() {
        return -599754482;
    }
}
