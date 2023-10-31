package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.resource.bitmap.C3720p;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3729v;
import com.bumptech.glide.util.C3846a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g */
/* loaded from: classes.dex */
public final class C3699g implements InterfaceC3583k<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C3720p f9660a;

    public C3699g(C3720p c3720p) {
        this.f9660a = c3720p;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final boolean mo6504a(@NonNull ByteBuffer byteBuffer, @NonNull C3581i c3581i) throws IOException {
        this.f9660a.getClass();
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: b */
    public final InterfaceC3573x<Bitmap> mo6503b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        AtomicReference<byte[]> atomicReference = C3846a.f9931a;
        C3846a.C3847a c3847a = new C3846a.C3847a(byteBuffer);
        C3720p.C3721a c3721a = C3720p.f9682k;
        C3720p c3720p = this.f9660a;
        return c3720p.m6548a(new InterfaceC3729v.C3730a(c3720p.f9686c, c3847a, c3720p.f9687d), i, i2, c3581i, c3721a);
    }
}
