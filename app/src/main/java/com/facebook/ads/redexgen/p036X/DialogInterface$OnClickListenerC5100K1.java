package com.facebook.ads.redexgen.p036X;

import android.content.DialogInterface;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.K1 */
/* loaded from: assets/audience_network.dex */
public class DialogInterface$OnClickListenerC5100K1 implements DialogInterface.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ View$OnClickListenerC5723UD A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, 17, -3, 18, 21, 13, -3, 17, 18, 3, 14, -12, -14, -11, -27};
    }

    public DialogInterface$OnClickListenerC5100K1(View$OnClickListenerC5723UD view$OnClickListenerC5723UD) {
        this.A00 = view$OnClickListenerC5723UD;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Map A012;
        A012 = this.A00.A01();
        A012.put(A00(0, 11, 119), A00(11, 4, 89));
        this.A00.A05(A012);
    }
}
