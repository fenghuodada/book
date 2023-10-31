package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import com.bumptech.glide.load.resource.bitmap.C3735z;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.f */
/* loaded from: classes.dex */
public final class C3576f {
    /* renamed from: a */
    public static int m6609a(@NonNull InterfaceC3483b interfaceC3483b, @Nullable InputStream inputStream, @NonNull List list) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C3735z(inputStream, interfaceC3483b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int mo6535c = ((ImageHeaderParser) list.get(i)).mo6535c(inputStream, interfaceC3483b);
                if (mo6535c != -1) {
                    return mo6535c;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    @NonNull
    /* renamed from: b */
    public static ImageHeaderParser.ImageType m6608b(@NonNull InterfaceC3483b interfaceC3483b, @Nullable InputStream inputStream, @NonNull List list) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C3735z(inputStream, interfaceC3483b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType mo6536b = ((ImageHeaderParser) list.get(i)).mo6536b(inputStream);
                inputStream.reset();
                if (mo6536b != ImageHeaderParser.ImageType.UNKNOWN) {
                    return mo6536b;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
