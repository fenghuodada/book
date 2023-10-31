package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.data.c */
/* loaded from: classes.dex */
public final class C3451c extends OutputStream {
    @NonNull

    /* renamed from: a */
    public final OutputStream f9196a;

    /* renamed from: b */
    public byte[] f9197b;

    /* renamed from: c */
    public final InterfaceC3483b f9198c;

    /* renamed from: d */
    public int f9199d;

    public C3451c(@NonNull FileOutputStream fileOutputStream, @NonNull InterfaceC3483b interfaceC3483b) {
        this.f9196a = fileOutputStream;
        this.f9198c = interfaceC3483b;
        this.f9197b = (byte[]) interfaceC3483b.mo6702c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.f9196a;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f9197b;
            if (bArr != null) {
                this.f9198c.put(bArr);
                this.f9197b = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f9199d;
        OutputStream outputStream = this.f9196a;
        if (i > 0) {
            outputStream.write(this.f9197b, 0, i);
            this.f9199d = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f9197b;
        int i2 = this.f9199d;
        int i3 = i2 + 1;
        this.f9199d = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f9196a.write(bArr, 0, i3);
        this.f9199d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f9199d;
            OutputStream outputStream = this.f9196a;
            if (i6 == 0 && i4 >= this.f9197b.length) {
                outputStream.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.f9197b.length - i6);
            System.arraycopy(bArr, i5, this.f9197b, this.f9199d, min);
            int i7 = this.f9199d + min;
            this.f9199d = i7;
            i3 += min;
            byte[] bArr2 = this.f9197b;
            if (i7 == bArr2.length && i7 > 0) {
                outputStream.write(bArr2, 0, i7);
                this.f9199d = 0;
                continue;
            }
        } while (i3 < i2);
    }
}
