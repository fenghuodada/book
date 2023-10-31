package com.facebook.ads.redexgen.p036X;

import android.provider.Settings;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ZZ */
/* loaded from: assets/audience_network.dex */
public class C6052ZZ implements InterfaceC43306v {
    public static byte[] A01;
    public final /* synthetic */ C6051ZY A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-77, -93, -78, -91, -91, -82, -97, -94, -78, -87, -89, -88, -76, -82, -91, -77, -77};
    }

    public C6052ZZ(C6051ZY c6051zy) {
        this.A00 = c6051zy;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        C6051ZY c6051zy = this.A00;
        return c6051zy.A03(Settings.System.getInt(c6051zy.A00, A00(0, 17, 62), -1) / 255.0f);
    }
}
