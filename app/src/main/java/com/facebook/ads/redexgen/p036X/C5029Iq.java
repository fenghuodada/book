package com.facebook.ads.redexgen.p036X;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.ads.redexgen.X.Iq */
/* loaded from: assets/audience_network.dex */
public final class C5029Iq extends BufferedOutputStream {
    public boolean A00;

    public C5029Iq(OutputStream outputStream) {
        super(outputStream);
    }

    public C5029Iq(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public final void A00(OutputStream outputStream) {
        C4997IK.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00 = true;
        Throwable th = null;
        try {
            flush();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.out.close();
        } catch (Throwable e) {
            if (th == null) {
                th = e;
            }
        }
        if (th != null) {
            C5038Iz.A0Y(th);
        }
    }
}
