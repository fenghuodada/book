package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Xh */
/* loaded from: assets/audience_network.dex */
public class C5936Xh implements InterfaceC5171LE {
    public static byte[] A01;
    public final /* synthetic */ C5952Xx A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{68, 64, 67, 119, 102, 107, 103, 108, 97, 103, 76, 103, 118, 117, 109, 112, 105, 15, 52, Utf8.REPLACEMENT_BYTE, 34, 42, Utf8.REPLACEMENT_BYTE, 57, 46, Utf8.REPLACEMENT_BYTE, 62, 122, Utf8.REPLACEMENT_BYTE, 40, 40, 53, 40, 116, 121, 104, 123, 105, 114, 69, 105, 114, 115, Byte.MAX_VALUE, 118, 126};
    }

    public C5936Xh(C5952Xx c5952Xx) {
        this.A00 = c5952Xx;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5171LE
    public final void A8p(int i, Throwable th) {
        Log.e(A00(0, 17, 13), A00(17, 17, 85), th);
        this.A00.A06().A8y(A00(34, 12, 21), i, new C444690(th));
    }
}
