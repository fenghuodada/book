package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import com.bumptech.glide.load.resource.bitmap.C3687e;
import com.bumptech.glide.load.resource.gif.C3757c;

/* renamed from: com.bumptech.glide.load.resource.transcode.c */
/* loaded from: classes.dex */
public final class C3773c implements InterfaceC3775e<Drawable, byte[]> {

    /* renamed from: a */
    public final InterfaceC3485d f9788a;

    /* renamed from: b */
    public final InterfaceC3775e<Bitmap, byte[]> f9789b;

    /* renamed from: c */
    public final InterfaceC3775e<C3757c, byte[]> f9790c;

    public C3773c(@NonNull InterfaceC3485d interfaceC3485d, @NonNull C3771a c3771a, @NonNull C3774d c3774d) {
        this.f9788a = interfaceC3485d;
        this.f9789b = c3771a;
        this.f9790c = c3774d;
    }

    @Override // com.bumptech.glide.load.resource.transcode.InterfaceC3775e
    @Nullable
    /* renamed from: a */
    public final InterfaceC3573x<byte[]> mo6498a(@NonNull InterfaceC3573x<Drawable> interfaceC3573x, @NonNull C3581i c3581i) {
        InterfaceC3775e interfaceC3775e;
        Drawable drawable = interfaceC3573x.get();
        if (drawable instanceof BitmapDrawable) {
            interfaceC3573x = C3687e.m6567b(((BitmapDrawable) drawable).getBitmap(), this.f9788a);
            interfaceC3775e = this.f9789b;
        } else if (!(drawable instanceof C3757c)) {
            return null;
        } else {
            interfaceC3775e = this.f9790c;
        }
        return interfaceC3775e.mo6498a(interfaceC3573x, c3581i);
    }
}
