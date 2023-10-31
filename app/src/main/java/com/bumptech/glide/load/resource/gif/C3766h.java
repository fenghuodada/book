package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import com.bumptech.glide.load.resource.bitmap.C3687e;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.gif.h */
/* loaded from: classes.dex */
public final class C3766h implements InterfaceC3583k<GifDecoder, Bitmap> {

    /* renamed from: a */
    public final InterfaceC3485d f9777a;

    public C3766h(InterfaceC3485d interfaceC3485d) {
        this.f9777a = interfaceC3485d;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6504a(@NonNull GifDecoder gifDecoder, @NonNull C3581i c3581i) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: b */
    public final InterfaceC3573x<Bitmap> mo6503b(@NonNull GifDecoder gifDecoder, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        return C3687e.m6567b(gifDecoder.mo6756a(), this.f9777a);
    }
}
