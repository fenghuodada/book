package com.bumptech.glide.util;

import androidx.annotation.GuardedBy;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* renamed from: com.bumptech.glide.util.d */
/* loaded from: classes.dex */
public final class C3851d extends InputStream {
    @GuardedBy("POOL")

    /* renamed from: c */
    public static final ArrayDeque f9940c;

    /* renamed from: a */
    public InputStream f9941a;

    /* renamed from: b */
    public IOException f9942b;

    static {
        char[] cArr = C3861k.f9956a;
        f9940c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f9941a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9941a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f9941a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f9941a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f9941a.read();
        } catch (IOException e) {
            this.f9942b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f9941a.read(bArr);
        } catch (IOException e) {
            this.f9942b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f9941a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f9942b = e;
            throw e;
        }
    }

    public final void release() {
        this.f9942b = null;
        this.f9941a = null;
        ArrayDeque arrayDeque = f9940c;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f9941a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f9941a.skip(j);
        } catch (IOException e) {
            this.f9942b = e;
            throw e;
        }
    }
}
