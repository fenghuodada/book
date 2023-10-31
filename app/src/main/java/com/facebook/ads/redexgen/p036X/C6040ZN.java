package com.facebook.ads.redexgen.p036X;

import android.app.KeyguardManager;
import android.content.Context;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ZN */
/* loaded from: assets/audience_network.dex */
public final class C6040ZN extends C43216m {
    public static byte[] A01;
    public final KeyguardManager A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-57, -63, -43, -61, -47, -67, -50, -64};
    }

    public C6040ZN(Context context, C42856C c42856c) {
        super(context, c42856c);
        this.A00 = (KeyguardManager) context.getSystemService(A02(0, 8, 85));
    }

    public final InterfaceC43306v A0G() {
        return new C6044ZR(this);
    }

    public final InterfaceC43306v A0H() {
        return new C6043ZQ(this);
    }

    public final InterfaceC43306v A0I() {
        return new C6042ZP(this);
    }

    public final InterfaceC43306v A0J() {
        return new C6041ZO(this);
    }
}
