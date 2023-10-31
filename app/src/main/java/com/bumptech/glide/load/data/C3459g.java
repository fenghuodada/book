package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.C0235r;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.g */
/* loaded from: classes.dex */
public final class C3459g extends FilterInputStream {

    /* renamed from: c */
    public static final byte[] f9203c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d */
    public static final int f9204d = 31;

    /* renamed from: a */
    public final byte f9205a;

    /* renamed from: b */
    public int f9206b;

    public C3459g(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.f9205a = (byte) i;
            return;
        }
        throw new IllegalArgumentException(C0235r.m12816a("Cannot add invalid orientation: ", i));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2 = this.f9206b;
        int read = (i2 < 2 || i2 > (i = f9204d)) ? super.read() : i2 == i ? this.f9205a : f9203c[i2 - 2] & 255;
        if (read != -1) {
            this.f9206b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f9206b;
        int i5 = f9204d;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f9205a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f9203c, this.f9206b - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f9206b += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f9206b = (int) (this.f9206b + skip);
        }
        return skip;
    }
}
