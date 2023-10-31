package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: com.bumptech.glide.util.h */
/* loaded from: classes.dex */
public final class C3858h extends FilterInputStream {

    /* renamed from: a */
    public int f9952a;

    public C3858h(@NonNull C3851d c3851d) {
        super(c3851d);
        this.f9952a = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final long m6407a(long j) {
        int i = this.f9952a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.f9952a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* renamed from: c */
    public final void m6406c(long j) {
        int i = this.f9952a;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f9952a = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f9952a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m6407a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m6406c(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int m6407a = (int) m6407a(i2);
        if (m6407a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, m6407a);
        m6406c(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        super.reset();
        this.f9952a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long m6407a = m6407a(j);
        if (m6407a == -1) {
            return 0L;
        }
        long skip = super.skip(m6407a);
        m6406c(skip);
        return skip;
    }
}
