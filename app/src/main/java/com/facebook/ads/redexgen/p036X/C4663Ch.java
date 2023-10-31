package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ch */
/* loaded from: assets/audience_network.dex */
public final class C4663Ch {
    public final C5022Ij A00 = new C5022Ij(10);

    @Nullable
    public final Metadata A00(InterfaceC4659Cd interfaceC4659Cd, @Nullable InterfaceC4763ES interfaceC4763ES) throws IOException, InterruptedException {
        int i = 0;
        Metadata metadata = null;
        while (true) {
            try {
                interfaceC4659Cd.AD7(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                if (this.A00.A0G() != C5816Vk.A03) {
                    break;
                }
                this.A00.A0Z(3);
                int A0D = this.A00.A0D();
                int i2 = A0D + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    byte[] id3Data = this.A00.A00;
                    System.arraycopy(id3Data, 0, bArr, 0, 10);
                    interfaceC4659Cd.AD7(bArr, 10, A0D);
                    metadata = new C5816Vk(interfaceC4763ES).A0O(bArr, i2);
                } else {
                    interfaceC4659Cd.A3K(A0D);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC4659Cd.AEB();
        interfaceC4659Cd.A3K(i);
        return metadata;
    }
}
