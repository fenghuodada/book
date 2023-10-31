package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@RequiresApi(27)
/* renamed from: com.bumptech.glide.load.resource.bitmap.s */
/* loaded from: classes.dex */
public final class C3726s implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* renamed from: a */
    public final ImageHeaderParser.ImageType mo6537a(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* renamed from: b */
    public final ImageHeaderParser.ImageType mo6536b(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public final int mo6535c(@NonNull InputStream inputStream, @NonNull InterfaceC3483b interfaceC3483b) throws IOException {
        ExifInterface exifInterface = new ExifInterface(inputStream);
        ExifInterface.C1346c m10640e = exifInterface.m10640e("Orientation");
        int i = 1;
        if (m10640e != null) {
            try {
                i = m10640e.m10613f(exifInterface.f3288f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }
}
