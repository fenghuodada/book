package com.bumptech.glide.load.resource;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.C3578h;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3445b;
import com.bumptech.glide.load.EnumC3582j;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.resource.bitmap.AbstractC3710l;
import com.bumptech.glide.load.resource.bitmap.C3684d;
import com.bumptech.glide.load.resource.bitmap.C3687e;
import com.bumptech.glide.load.resource.bitmap.C3720p;
import com.bumptech.glide.load.resource.bitmap.C3728u;
import java.io.IOException;

@RequiresApi(api = 28)
/* renamed from: com.bumptech.glide.load.resource.h */
/* loaded from: classes.dex */
public abstract class AbstractC3769h<T> implements InterfaceC3583k<ImageDecoder.Source, T> {

    /* renamed from: a */
    public final C3728u f9783a;

    public AbstractC3769h() {
        if (C3728u.f9696j == null) {
            synchronized (C3728u.class) {
                if (C3728u.f9696j == null) {
                    C3728u.f9696j = new C3728u();
                }
            }
        }
        this.f9783a = C3728u.f9696j;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6504a(@NonNull ImageDecoder.Source source, @NonNull C3581i c3581i) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    @Nullable
    /* renamed from: c */
    public final C3687e mo6503b(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        boolean z;
        Bitmap decodeBitmap;
        EnumC3445b enumC3445b = (EnumC3445b) c3581i.m6606c(C3720p.f9677f);
        AbstractC3710l abstractC3710l = (AbstractC3710l) c3581i.m6606c(AbstractC3710l.f9675f);
        C3578h<Boolean> c3578h = C3720p.f9680i;
        if (c3581i.m6606c(c3578h) != null && ((Boolean) c3581i.m6606c(c3578h)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        C3684d c3684d = (C3684d) this;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new C3751g(this, i, i2, z, enumC3445b, abstractC3710l, (EnumC3582j) c3581i.m6606c(C3720p.f9678g)));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C3687e(decodeBitmap, c3684d.f9648b);
    }
}
