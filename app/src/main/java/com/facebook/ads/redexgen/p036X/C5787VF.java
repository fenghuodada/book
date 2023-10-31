package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.VF */
/* loaded from: assets/audience_network.dex */
public final class C5787VF implements InterfaceC4940HP {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC4950HZ A06;
    public final InterfaceC5000IN A07;

    public C5787VF(InterfaceC4950HZ interfaceC4950HZ) {
        this(interfaceC4950HZ, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC5000IN.A00);
    }

    public C5787VF(InterfaceC4950HZ interfaceC4950HZ, int i, int i2, int i3, float f, float f2, long j, InterfaceC5000IN interfaceC5000IN) {
        this.A06 = interfaceC4950HZ;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = j;
        this.A07 = interfaceC5000IN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4940HP
    /* renamed from: A00 */
    public final C4617Bn A4U(TrackGroup trackGroup, int... iArr) {
        return new C4617Bn(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
