package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.redexgen.X.PE */
/* loaded from: assets/audience_network.dex */
public final class C5415PE extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC4955He A02;
    public final Uri A03;
    public final C5952Xx A04;
    public final InterfaceC4954Hd A05;
    @Nullable
    public final String A06;

    public C5415PE(C5952Xx c5952Xx, Uri uri, InterfaceC4954Hd interfaceC4954Hd) throws IOException {
        this.A04 = c5952Xx;
        this.A05 = interfaceC4954Hd;
        this.A03 = uri;
        this.A06 = C5509Qk.A08(this.A04, this.A03);
        A00(0);
    }

    private void A00(int i) throws IOException {
        InterfaceC4955He interfaceC4955He = this.A02;
        if (interfaceC4955He != null) {
            interfaceC4955He.close();
        }
        this.A02 = this.A05.A4E();
        this.A01 = (int) this.A02.ACw(new C4959Hi(this.A03, i, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return read(new byte[1]);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.A02.read(bArr, i, i2);
        this.A00 += read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.A01 - this.A00;
        if (j2 <= 0) {
            return 0L;
        }
        if (j > j2) {
            j = j2;
        }
        this.A00 = (int) (this.A00 + j);
        A00(this.A00);
        return j;
    }
}
