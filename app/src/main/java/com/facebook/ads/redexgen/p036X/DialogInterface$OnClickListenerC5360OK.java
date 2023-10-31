package com.facebook.ads.redexgen.p036X;

import android.content.DialogInterface;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.OK */
/* loaded from: assets/audience_network.dex */
public class DialogInterface$OnClickListenerC5360OK implements DialogInterface.OnClickListener {
    public static byte[] A04;
    public final /* synthetic */ C5363ON A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-84, -74, -94, -73, -70, -78, -94, -74, -73, -88, -77, -7, -9, -6, -22};
    }

    public DialogInterface$OnClickListenerC5360OK(C5363ON c5363on, Map map, String str, String str2) {
        this.A00 = c5363on;
        this.A03 = map;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A03.put(A00(0, 11, 0), A00(11, 4, 66));
        this.A00.A06(this.A01, this.A02, this.A03);
    }
}
