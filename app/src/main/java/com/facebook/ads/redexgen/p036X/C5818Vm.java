package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vm */
/* loaded from: assets/audience_network.dex */
public final class C5818Vm implements InterfaceC4751EG {
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4751EG
    public final Metadata A4h(C4694DJ c4694dj) {
        ByteBuffer buffer = c4694dj.A01;
        byte[] array = buffer.array();
        int size = buffer.limit();
        C5022Ij c5022Ij = new C5022Ij(array, size);
        String A0Q = c5022Ij.A0Q();
        String A0Q2 = c5022Ij.A0Q();
        long A0M = c5022Ij.A0M();
        long timescale = C5038Iz.A0F(c5022Ij.A0M(), 1000000L, A0M);
        long presentationTimeUs = c5022Ij.A0M();
        long id = C5038Iz.A0F(presentationTimeUs, 1000L, A0M);
        return new Metadata(new EventMessage(A0Q, A0Q2, id, c5022Ij.A0M(), Arrays.copyOfRange(array, c5022Ij.A06(), size), timescale));
    }
}
