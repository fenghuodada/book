package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.resource.bytes.C3739b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.resource.transcode.a */
/* loaded from: classes.dex */
public final class C3771a implements InterfaceC3775e<Bitmap, byte[]> {

    /* renamed from: a */
    public final Bitmap.CompressFormat f9785a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b */
    public final int f9786b = 100;

    @Override // com.bumptech.glide.load.resource.transcode.InterfaceC3775e
    @Nullable
    /* renamed from: a */
    public final InterfaceC3573x<byte[]> mo6498a(@NonNull InterfaceC3573x<Bitmap> interfaceC3573x, @NonNull C3581i c3581i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC3573x.get().compress(this.f9785a, this.f9786b, byteArrayOutputStream);
        interfaceC3573x.mo6510a();
        return new C3739b(byteArrayOutputStream.toByteArray());
    }
}
