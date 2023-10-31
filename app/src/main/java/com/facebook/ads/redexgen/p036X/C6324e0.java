package com.facebook.ads.redexgen.p036X;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.e0 */
/* loaded from: assets/audience_network.dex */
public final class C6324e0 implements InterfaceC39260K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C6324e0(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39260K
    public final void ACx(int i) throws C6323dz {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39260K
    public final void close() throws C6323dz {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39260K
    public final int length() throws C6323dz {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39260K
    public final int read(byte[] bArr) throws C6323dz {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
