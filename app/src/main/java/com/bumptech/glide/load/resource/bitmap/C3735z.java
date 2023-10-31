package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.z */
/* loaded from: classes.dex */
public final class C3735z extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f9714a;

    /* renamed from: b */
    public int f9715b;

    /* renamed from: c */
    public int f9716c;

    /* renamed from: d */
    public int f9717d;

    /* renamed from: e */
    public int f9718e;

    /* renamed from: f */
    public final InterfaceC3483b f9719f;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.z$a */
    /* loaded from: classes.dex */
    public static class C3736a extends IOException {
        public C3736a(String str) {
            super(str);
        }
    }

    public C3735z(@NonNull InputStream inputStream, @NonNull InterfaceC3483b interfaceC3483b) {
        super(inputStream);
        this.f9717d = -1;
        this.f9719f = interfaceC3483b;
        this.f9714a = (byte[]) interfaceC3483b.mo6702c(65536, byte[].class);
    }

    /* renamed from: c */
    public static void m6527c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int m6528a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f9717d;
        if (i != -1) {
            int i2 = this.f9718e - i;
            int i3 = this.f9716c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f9715b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f9719f.mo6702c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f9714a = bArr2;
                    this.f9719f.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f9718e - this.f9717d;
                this.f9718e = i4;
                this.f9717d = 0;
                this.f9715b = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.f9718e;
                if (read > 0) {
                    i5 += read;
                }
                this.f9715b = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f9717d = -1;
            this.f9718e = 0;
            this.f9715b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f9714a == null || inputStream == null) {
            m6527c();
            throw null;
        }
        return (this.f9715b - this.f9718e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f9714a != null) {
            this.f9719f.put(this.f9714a);
            this.f9714a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f9716c = Math.max(this.f9716c, i);
        this.f9717d = this.f9718e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = this.f9714a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m6527c();
            throw null;
        } else if (this.f9718e < this.f9715b || m6528a(inputStream, bArr) != -1) {
            if (bArr != this.f9714a && (bArr = this.f9714a) == null) {
                m6527c();
                throw null;
            }
            int i = this.f9715b;
            int i2 = this.f9718e;
            if (i - i2 > 0) {
                this.f9718e = i2 + 1;
                return bArr[i2] & 255;
            }
            return -1;
        } else {
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f9714a;
        if (bArr2 == null) {
            m6527c();
            throw null;
        } else if (i2 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                m6527c();
                throw null;
            }
            int i5 = this.f9718e;
            int i6 = this.f9715b;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f9718e += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f9717d == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else if (m6528a(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                } else {
                    if (bArr2 != this.f9714a && (bArr2 = this.f9714a) == null) {
                        m6527c();
                        throw null;
                    }
                    int i8 = this.f9715b;
                    int i9 = this.f9718e;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f9718e += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        }
    }

    public final synchronized void release() {
        if (this.f9714a != null) {
            this.f9719f.put(this.f9714a);
            this.f9714a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (this.f9714a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f9717d;
        if (-1 == i) {
            throw new C3736a("Mark has been invalidated, pos: " + this.f9718e + " markLimit: " + this.f9716c);
        }
        this.f9718e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f9714a;
        if (bArr == null) {
            m6527c();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m6527c();
            throw null;
        }
        int i = this.f9715b;
        int i2 = this.f9718e;
        if (i - i2 >= j) {
            this.f9718e = (int) (i2 + j);
            return j;
        }
        long j2 = i - i2;
        this.f9718e = i;
        if (this.f9717d == -1 || j > this.f9716c) {
            long skip = inputStream.skip(j - j2);
            if (skip > 0) {
                this.f9717d = -1;
            }
            return j2 + skip;
        } else if (m6528a(inputStream, bArr) == -1) {
            return j2;
        } else {
            int i3 = this.f9715b;
            int i4 = this.f9718e;
            if (i3 - i4 >= j - j2) {
                this.f9718e = (int) ((i4 + j) - j2);
                return j;
            }
            long j3 = (j2 + i3) - i4;
            this.f9718e = i3;
            return j3;
        }
    }
}
