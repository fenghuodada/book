package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: a */
        public final boolean f9177a;

        ImageType(boolean z) {
            this.f9177a = z;
        }

        public boolean hasAlpha() {
            return this.f9177a;
        }
    }

    @NonNull
    /* renamed from: a */
    ImageType mo6537a(@NonNull ByteBuffer byteBuffer) throws IOException;

    @NonNull
    /* renamed from: b */
    ImageType mo6536b(@NonNull InputStream inputStream) throws IOException;

    /* renamed from: c */
    int mo6535c(@NonNull InputStream inputStream, @NonNull InterfaceC3483b interfaceC3483b) throws IOException;
}
