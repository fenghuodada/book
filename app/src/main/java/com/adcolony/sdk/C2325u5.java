package com.adcolony.sdk;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.adcolony.sdk.u5 */
/* loaded from: classes.dex */
public final class C2325u5 extends InputStream {

    /* renamed from: a */
    public final InputStream f5635a;

    /* renamed from: b */
    public int f5636b;

    public C2325u5(FileInputStream fileInputStream, int i, int i2) throws IOException {
        this.f5635a = fileInputStream;
        while (i > 0) {
            i -= (int) fileInputStream.skip(i);
        }
        this.f5636b = i2;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int available = this.f5635a.available();
        int i = this.f5636b;
        return available <= i ? available : i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5635a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f5636b;
        if (i == 0) {
            return -1;
        }
        this.f5636b = i - 1;
        return this.f5635a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f5636b;
        if (i3 == 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int read = this.f5635a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f5636b -= read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int i = (int) j;
        if (i <= 0) {
            return 0L;
        }
        int i2 = this.f5636b;
        if (i > i2) {
            i = i2;
        }
        this.f5636b = i2 - i;
        while (i > 0) {
            i -= (int) this.f5635a.skip(j);
        }
        return j;
    }
}
