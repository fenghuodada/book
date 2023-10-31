package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3576f;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* renamed from: com.bumptech.glide.load.resource.gif.j */
/* loaded from: classes.dex */
public final class C3768j implements InterfaceC3583k<InputStream, C3757c> {

    /* renamed from: a */
    public final List<ImageHeaderParser> f9780a;

    /* renamed from: b */
    public final InterfaceC3583k<ByteBuffer, C3757c> f9781b;

    /* renamed from: c */
    public final InterfaceC3483b f9782c;

    public C3768j(ArrayList arrayList, C3753a c3753a, InterfaceC3483b interfaceC3483b) {
        this.f9780a = arrayList;
        this.f9781b = c3753a;
        this.f9782c = interfaceC3483b;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final boolean mo6504a(@NonNull InputStream inputStream, @NonNull C3581i c3581i) throws IOException {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) c3581i.m6606c(C3767i.f9779b)).booleanValue()) {
            if (C3576f.m6608b(this.f9782c, inputStream2, this.f9780a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: b */
    public final InterfaceC3573x<C3757c> mo6503b(@NonNull InputStream inputStream, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr2 = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f9781b.mo6503b(ByteBuffer.wrap(bArr), i, i2, c3581i);
    }
}
