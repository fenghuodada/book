package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.C7394a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.exoplayer2.upstream.k */
/* loaded from: classes.dex */
public final class C7366k extends InputStream {

    /* renamed from: a */
    public final InterfaceC7363i f13772a;

    /* renamed from: b */
    public final DataSpec f13773b;

    /* renamed from: d */
    public boolean f13775d = false;

    /* renamed from: e */
    public boolean f13776e = false;

    /* renamed from: c */
    public final byte[] f13774c = new byte[1];

    public C7366k(C7349b0 c7349b0, DataSpec dataSpec) {
        this.f13772a = c7349b0;
        this.f13773b = dataSpec;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f13776e) {
            return;
        }
        this.f13772a.close();
        this.f13776e = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f13774c;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C7394a.m5131d(!this.f13776e);
        boolean z = this.f13775d;
        InterfaceC7363i interfaceC7363i = this.f13772a;
        if (!z) {
            interfaceC7363i.mo5146g(this.f13773b);
            this.f13775d = true;
        }
        int read = interfaceC7363i.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
