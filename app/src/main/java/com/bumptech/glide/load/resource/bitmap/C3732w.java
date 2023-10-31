package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.util.C3846a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2;

@RequiresApi(api = 28)
/* renamed from: com.bumptech.glide.load.resource.bitmap.w */
/* loaded from: classes.dex */
public final class C3732w implements InterfaceC3583k<InputStream, Bitmap> {

    /* renamed from: a */
    public final C3684d f9710a = new C3684d();

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6504a(@NonNull InputStream inputStream, @NonNull C3581i c3581i) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    @Nullable
    /* renamed from: b */
    public final InterfaceC3573x<Bitmap> mo6503b(@NonNull InputStream inputStream, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        ImageDecoder.Source createSource;
        InputStream inputStream2 = inputStream;
        AtomicReference<byte[]> atomicReference = C3846a.f9931a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        AtomicReference<byte[]> atomicReference2 = C3846a.f9931a;
        byte[] andSet = atomicReference2.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        }
        while (true) {
            int read = inputStream2.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                atomicReference2.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                createSource = ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0));
                return this.f9710a.mo6503b(createSource, i, i2, c3581i);
            }
        }
    }
}
