package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import java.io.IOException;
import java.nio.ByteBuffer;

@RequiresApi(api = 28)
/* renamed from: com.bumptech.glide.load.resource.bitmap.h */
/* loaded from: classes.dex */
public final class C3701h implements InterfaceC3583k<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C3684d f9662a = new C3684d();

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6504a(@NonNull ByteBuffer byteBuffer, @NonNull C3581i c3581i) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    @Nullable
    /* renamed from: b */
    public final InterfaceC3573x<Bitmap> mo6503b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f9662a.mo6503b(createSource, i, i2, c3581i);
    }
}
