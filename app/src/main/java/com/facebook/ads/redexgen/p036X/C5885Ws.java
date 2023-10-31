package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ws */
/* loaded from: assets/audience_network.dex */
public final class C5885Ws implements InterfaceC4670Co {
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4670Co
    public final void A5V(Format format) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4670Co
    public final int AEF(InterfaceC4659Cd interfaceC4659Cd, int i, boolean z) throws IOException, InterruptedException {
        int AEq = interfaceC4659Cd.AEq(i);
        if (AEq == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return AEq;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4670Co
    public final void AEG(C5022Ij c5022Ij, int i) {
        c5022Ij.A0Z(i);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4670Co
    public final void AEH(long j, int i, int i2, int i3, C4669Cn c4669Cn) {
    }
}
