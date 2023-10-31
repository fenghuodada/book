package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.t */
/* loaded from: classes.dex */
public final class C3727t extends AbstractC3689f {

    /* renamed from: b */
    public static final byte[] f9692b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC3577g.f9514a);

    @Override // com.bumptech.glide.load.InterfaceC3577g
    /* renamed from: b */
    public final void mo6420b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f9692b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3689f
    /* renamed from: c */
    public final Bitmap mo6534c(@NonNull InterfaceC3485d interfaceC3485d, @NonNull Bitmap bitmap, int i, int i2) {
        return C3682c0.m6568b(interfaceC3485d, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final boolean equals(Object obj) {
        return obj instanceof C3727t;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final int hashCode() {
        return 1572326941;
    }
}
