package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g0 */
/* loaded from: classes.dex */
public final class C3700g0 extends MediaDataSource {

    /* renamed from: a */
    public final /* synthetic */ ByteBuffer f9661a;

    public C3700g0(ByteBuffer byteBuffer) {
        this.f9661a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f9661a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f9661a;
        if (j >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j);
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }
}
