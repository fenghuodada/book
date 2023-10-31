package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.C0 */
/* loaded from: assets/audience_network.dex */
public final class C4630C0 extends AbstractC5811Vd implements InterfaceC4826FV {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC4661Cf A05;
    public final InterfaceC4954Hd A06;
    @Nullable
    public final Object A07;
    public final String A08;

    public C4630C0(Uri uri, InterfaceC4954Hd interfaceC4954Hd, InterfaceC4661Cf interfaceC4661Cf, int i, @Nullable String str, int i2, @Nullable Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC4954Hd;
        this.A05 = interfaceC4661Cf;
        this.A03 = i;
        this.A08 = str;
        this.A02 = i2;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
        A01(new C5802VU(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5811Vd
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5811Vd
    public final void A03(InterfaceC5910XH interfaceC5910XH, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4831Fa
    public final InterfaceC5804VW A4Q(C4829FY c4829fy, InterfaceC4947HW interfaceC4947HW) {
        C4997IK.A03(c4829fy.A02 == 0);
        return new C4644CE(this.A04, this.A06.A4E(), this.A05.A4I(), this.A03, A00(c4829fy), this, interfaceC4947HW, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4831Fa
    public final void A9Z() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4826FV
    public final void ACL(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 == j && this.A01 == z) {
            return;
        }
        A00(j, z);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4831Fa
    public final void ADr(InterfaceC5804VW interfaceC5804VW) {
        ((C4644CE) interfaceC5804VW).A0R();
    }
}
