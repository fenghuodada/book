package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fy */
/* loaded from: assets/audience_network.dex */
public class C4855Fy extends AbstractC5657T8 {
    public static byte[] A02;
    public final /* synthetic */ C6301dd A00;
    public final /* synthetic */ C6292dU A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, 2, -2, -3, 0};
    }

    public C4855Fy(C6301dd c6301dd, C6292dU c6292dU) {
        this.A00 = c6301dd;
        this.A01 = c6292dU;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5349O9
    public final void AA3() {
        boolean z;
        this.A00.A0E = true;
        z = this.A00.A0F;
        if (!z) {
            return;
        }
        this.A00.A09();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5657T8, com.facebook.ads.redexgen.p036X.InterfaceC5349O9
    public final void AAJ(String str, Map<String, String> map) {
        C4780El c4780El;
        C4780El c4780El2;
        InterfaceC5080Jh interfaceC5080Jh;
        String str2;
        C4780El c4780El3;
        InterfaceC39620v interfaceC39620v;
        InterfaceC39620v interfaceC39620v2;
        c4780El = this.A00.A03;
        c4780El.A0D().A3Y();
        Uri A00 = C5191La.A00(str);
        if (A00(22, 4, 82).equals(A00.getScheme()) && C39480g.A04(A00.getAuthority())) {
            interfaceC39620v = this.A00.A00;
            if (interfaceC39620v != null) {
                interfaceC39620v2 = this.A00.A00;
                interfaceC39620v2.AAC(this.A00);
            }
        }
        c4780El2 = this.A00.A03;
        interfaceC5080Jh = this.A00.A04;
        AbstractC39470f A002 = C39480g.A00(c4780El2, interfaceC5080Jh, this.A01.A65(), A00, map);
        if (A002 == null) {
            return;
        }
        try {
            c4780El3 = this.A00.A03;
            c4780El3.A0D().A3V();
            A002.A0C();
        } catch (Exception e) {
            str2 = C6301dd.A0I;
            Log.e(str2, A00(0, 22, 0), e);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5657T8, com.facebook.ads.redexgen.p036X.InterfaceC5349O9
    public final void AAz() {
        C4780El c4780El;
        C6290dS c6290dS;
        C6290dS c6290dS2;
        C6290dS c6290dS3;
        c4780El = this.A00.A03;
        InterfaceC6319dv A0D = c4780El.A0D();
        c6290dS = this.A00.A01;
        A0D.A3Z(c6290dS != null);
        c6290dS2 = this.A00.A01;
        if (c6290dS2 == null) {
            return;
        }
        c6290dS3 = this.A00.A01;
        c6290dS3.A02();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5657T8, com.facebook.ads.redexgen.p036X.InterfaceC5349O9
    public final void ABh() {
        C4780El c4780El;
        C6290dS c6290dS;
        c4780El = this.A00.A03;
        c4780El.A0D().A3b();
        c6290dS = this.A00.A01;
        c6290dS.A07();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5349O9
    public final void ACu() {
    }
}
