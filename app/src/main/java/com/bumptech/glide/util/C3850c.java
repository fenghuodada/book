package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.C0486c;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.util.c */
/* loaded from: classes.dex */
public final class C3850c extends FilterInputStream {

    /* renamed from: a */
    public final long f9938a;

    /* renamed from: b */
    public int f9939b;

    public C3850c(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.f9938a = j;
    }

    /* renamed from: a */
    public final void m6414a(int i) throws IOException {
        int i2 = this.f9939b;
        if (i >= 0) {
            this.f9939b = i2 + i;
            return;
        }
        long j = this.f9938a;
        if (j - i2 <= 0) {
            return;
        }
        StringBuilder m12390a = C0486c.m12390a("Failed to read all expected data, expected: ", j, ", but read: ");
        m12390a.append(this.f9939b);
        throw new IOException(m12390a.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        return (int) Math.max(this.f9938a - this.f9939b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        int read;
        read = super.read();
        m6414a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        m6414a(read);
        return read;
    }
}
