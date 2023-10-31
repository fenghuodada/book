package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.65 */
/* loaded from: assets/audience_network.dex */
public final class C427865 {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C427966 A00;
    public final C428067 A01;
    public final C5952Xx A02;
    public final InterfaceC5552RR A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, Utf8.REPLACEMENT_BYTE};
    }

    static {
        A01();
        A06 = C427865.class.getSimpleName();
    }

    public C427865(C5952Xx c5952Xx, InterfaceC4885GU interfaceC4885GU, C427966 c427966, C428067 c428067) {
        this.A02 = c5952Xx;
        this.A03 = interfaceC4885GU.A4O(EnumC5553RS.A06);
        this.A00 = c427966;
        this.A01 = c428067;
        this.A03.A3F(new C6158bH(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (C5158L0.A02(this)) {
            return;
        }
        if (!this.A03.A8c()) {
            this.A02.A03().A8P();
            return;
        }
        String optString = this.A03.A6J().optString(A00(0, 9, 62));
        if (!TextUtils.isEmpty(optString)) {
            this.A00.A04(this.A02, optString);
            if (!A04 || C5064JR.A0g(this.A02)) {
                A04 = true;
                this.A01.A07();
            }
        }
    }
}
