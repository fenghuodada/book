package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.j */
/* loaded from: classes.dex */
public final class C3703j extends AbstractC3689f {

    /* renamed from: b */
    public static final byte[] f9664b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC3577g.f9514a);

    @Override // com.bumptech.glide.load.InterfaceC3577g
    /* renamed from: b */
    public final void mo6420b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f9664b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3689f
    /* renamed from: c */
    public final Bitmap mo6534c(@NonNull InterfaceC3485d interfaceC3485d, @NonNull Bitmap bitmap, int i, int i2) {
        Paint paint = C3682c0.f9646a;
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
                return bitmap;
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return C3682c0.m6568b(interfaceC3485d, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final boolean equals(Object obj) {
        return obj instanceof C3703j;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final int hashCode() {
        return -670243078;
    }
}
