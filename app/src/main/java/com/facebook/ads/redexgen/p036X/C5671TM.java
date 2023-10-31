package com.facebook.ads.redexgen.p036X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.TM */
/* loaded from: assets/audience_network.dex */
public final class C5671TM implements InterfaceC5270Mr {
    public static byte[] A0C;
    public int A00;
    public C5460Px A01;
    public C439889 A02;
    public final C5953Xy A03;
    public final InterfaceC5080Jh A04;
    public final InterfaceC5269Mq A05;
    public final InterfaceC5291ND A06;
    public final C5483QK A07;
    public final AbstractC5200Lj A0B = new C4550Ai(this);
    public final AbstractC5216Lz A0A = new C4530AN(this);
    public final AbstractC5285N6 A08 = new C4528AL(this);
    public final AbstractC5283N4 A09 = new C4527AK(this);

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0C = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, 24, 11, 6, 7, 17, -11, 7, 7, 13, -10, 11, 15, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public C5671TM(C5953Xy c5953Xy, InterfaceC5291ND interfaceC5291ND, InterfaceC5080Jh interfaceC5080Jh, InterfaceC5269Mq interfaceC5269Mq) {
        this.A03 = c5953Xy;
        this.A04 = interfaceC5080Jh;
        this.A06 = interfaceC5291ND;
        this.A07 = new C5483QK(c5953Xy);
        this.A07.A0c(new C43857u(c5953Xy));
        this.A07.getEventBus().A03(this.A0B, this.A0A, this.A08, this.A09);
        this.A05 = interfaceC5269Mq;
        this.A07.setIsFullScreen(true);
        this.A07.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC5269Mq.A3I(this.A07, layoutParams);
        C5272Mt c5272Mt = new C5272Mt(c5953Xy);
        c5272Mt.setOnClickListener(new View$OnClickListenerC5289NB(this));
        interfaceC5269Mq.A3I(c5272Mt, c5272Mt.getDefaultLayoutParams());
    }

    public final void A04(int i) {
        this.A07.setVideoProgressReportIntervalMs(i);
    }

    public final void A05(View view) {
        this.A07.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void A8n(Intent intent, Bundle bundle, C422159 c422159) {
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C5435PY c5435py = new C5435PY(this.A03, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (16.0f * C5208Lr.A00);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c5435py.setOnClickListener(new View$OnClickListenerC5290NC(this));
            this.A05.A3I(c5435py, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 124), 0);
        C5953Xy c5953Xy = this.A03;
        InterfaceC5080Jh interfaceC5080Jh = this.A04;
        C5483QK c5483qk = this.A07;
        String A02 = A02(8, 11, 102);
        this.A02 = new C439889(c5953Xy, interfaceC5080Jh, c5483qk, intent.getStringExtra(A02), intent.getBundleExtra(A02(58, 11, 1)));
        if (C5064JR.A1J(this.A03)) {
            this.A01 = new C5460Px(this.A03, this.A04, this.A07, intent.getStringExtra(A02), null);
        } else {
            this.A01 = null;
        }
        this.A07.setVideoMPD(intent.getStringExtra(A02(69, 8, 98)));
        this.A07.setVideoURI(intent.getStringExtra(A02(90, 8, 34)));
        int i2 = this.A00;
        if (i2 > 0) {
            this.A07.A0Y(i2);
        }
        if (intent.getBooleanExtra(A02(0, 8, 72), false)) {
            this.A07.A0b(EnumC5469Q6.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void ABj(boolean z) {
        this.A05.A3t(A02(37, 21, 27), new C5243MQ());
        this.A07.A0W();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AC8(boolean z) {
        this.A05.A3t(A02(37, 21, 27), new C5238ML());
        if (!this.A07.A0j()) {
            this.A07.A0b(EnumC5469Q6.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AEI(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void onDestroy() {
        this.A05.A3t(A02(37, 21, 27), new C5159L1(this.A00, this.A07.getCurrentPositionInMillis()));
        this.A02.A0d(this.A07.getCurrentPositionInMillis());
        C5460Px c5460Px = this.A01;
        if (c5460Px != null) {
            c5460Px.A09();
        }
        this.A07.A0Z(1);
        this.A07.A0V();
    }
}
