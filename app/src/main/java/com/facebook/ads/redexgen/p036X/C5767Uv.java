package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Uv */
/* loaded from: assets/audience_network.dex */
public final class C5767Uv implements InterfaceC4955He {
    public final int A00;
    public final InterfaceC4955He A01;
    public final C5026In A02;

    public C5767Uv(InterfaceC4955He interfaceC4955He, C5026In c5026In, int i) {
        this.A01 = (InterfaceC4955He) C4997IK.A01(interfaceC4955He);
        this.A02 = (C5026In) C4997IK.A01(c5026In);
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    @Nullable
    public final Uri A7k() {
        return this.A01.A7k();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final long ACw(C4959Hi c4959Hi) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ACw(c4959Hi);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i2);
    }
}
