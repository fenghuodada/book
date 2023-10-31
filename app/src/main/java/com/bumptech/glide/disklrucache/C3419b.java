package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.disklrucache.b */
/* loaded from: classes.dex */
public final class C3419b implements Closeable {

    /* renamed from: a */
    public final InputStream f9068a;

    /* renamed from: b */
    public final Charset f9069b;

    /* renamed from: c */
    public byte[] f9070c;

    /* renamed from: d */
    public int f9071d;

    /* renamed from: e */
    public int f9072e;

    /* renamed from: com.bumptech.glide.disklrucache.b$a */
    /* loaded from: classes.dex */
    public class C3420a extends ByteArrayOutputStream {
        public C3420a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, C3419b.this.f9069b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C3419b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(C3421c.f9074a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f9068a = fileInputStream;
        this.f9069b = charset;
        this.f9070c = new byte[8192];
    }

    /* renamed from: a */
    public final String m6765a() throws IOException {
        int i;
        synchronized (this.f9068a) {
            byte[] bArr = this.f9070c;
            if (bArr != null) {
                if (this.f9071d >= this.f9072e) {
                    int read = this.f9068a.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f9071d = 0;
                        this.f9072e = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i2 = this.f9071d; i2 != this.f9072e; i2++) {
                    byte[] bArr2 = this.f9070c;
                    if (bArr2[i2] == 10) {
                        int i3 = this.f9071d;
                        if (i2 != i3) {
                            i = i2 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i3, i - i3, this.f9069b.name());
                                this.f9071d = i2 + 1;
                                return str;
                            }
                        }
                        i = i2;
                        String str2 = new String(bArr2, i3, i - i3, this.f9069b.name());
                        this.f9071d = i2 + 1;
                        return str2;
                    }
                }
                C3420a c3420a = new C3420a((this.f9072e - this.f9071d) + 80);
                while (true) {
                    byte[] bArr3 = this.f9070c;
                    int i4 = this.f9071d;
                    c3420a.write(bArr3, i4, this.f9072e - i4);
                    this.f9072e = -1;
                    byte[] bArr4 = this.f9070c;
                    int read2 = this.f9068a.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f9071d = 0;
                        this.f9072e = read2;
                        for (int i5 = 0; i5 != this.f9072e; i5++) {
                            byte[] bArr5 = this.f9070c;
                            if (bArr5[i5] == 10) {
                                int i6 = this.f9071d;
                                if (i5 != i6) {
                                    c3420a.write(bArr5, i6, i5 - i6);
                                }
                                this.f9071d = i5 + 1;
                                return c3420a.toString();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f9068a) {
            if (this.f9070c != null) {
                this.f9070c = null;
                this.f9068a.close();
            }
        }
    }
}
