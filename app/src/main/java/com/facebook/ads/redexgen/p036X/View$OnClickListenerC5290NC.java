package com.facebook.ads.redexgen.p036X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.NC */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5290NC implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C5671TM A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public View$OnClickListenerC5290NC(C5671TM c5671tm) {
        this.A00 = c5671tm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC5269Mq interfaceC5269Mq;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5269Mq = this.A00.A05;
            interfaceC5269Mq.A3s(A00(0, 15, 9));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
