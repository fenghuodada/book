package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Xd */
/* loaded from: assets/audience_network.dex */
public final class C5932Xd implements InterfaceC44308k {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{0, 5, 16, 5, 27, 20, 22, 11, 7, 1, 23, 23, 13, 10, 3, 27, 11, 20, 16, 13, 11, 10, 23, 27, 7, 11, 17, 10, 16, 22, 29, 27, 15, 1, 29, 39, 34, 55, 34, 60, 51, 49, 44, 32, 38, 48, 48, 42, 45, 36, 60, 44, 51, 55, 42, 44, 45, 48, 60, 40, 38, 58, 36, 33, 52, 33, Utf8.REPLACEMENT_BYTE, 48, 50, 47, 35, 37, 51, 51, 41, 46, 39, Utf8.REPLACEMENT_BYTE, 47, 48, 52, 41, 47, 46, 51, Utf8.REPLACEMENT_BYTE, 51, 52, 33, 52, 37, Utf8.REPLACEMENT_BYTE, 43, 37, 57};
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44308k
    public final void A9b(InterfaceC44298j interfaceC44298j) {
        String[] stringArray;
        Integer integer;
        Integer state;
        if (!AdInternalSettings.sDataProcessingOptionsUpdate.getAndSet(false)) {
            return;
        }
        synchronized (AdInternalSettings.sSettingsBundle) {
            stringArray = AdInternalSettings.sSettingsBundle.getStringArray(A00(35, 27, 93));
            integer = AdInternalSettings.sSettingsBundle.getInteger(A00(0, 35, 122));
            state = AdInternalSettings.sSettingsBundle.getInteger(A00(62, 33, 94));
        }
        interfaceC44298j.ACI(stringArray, integer, state);
    }
}
