package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.RD */
/* loaded from: assets/audience_network.dex */
public enum EnumC5538RD {
    A05(true, false),
    A06(true, true);
    
    public static byte[] A02;
    public static String[] A03 = {"O", "EV50HHvcjD7YLIyebT4WEIV5yebebm0n", "F", "5eKOX", "rITyk", "abzOrFl3CNxf2rC8XtUXLAElYVzjlriN", "oaymDZ7pAEcbNFhv7Y0pKv8En2RbSAw", "1P4e8Svw6pgZkfS1AU7Ku11MIWhAZ0aY"};
    public boolean A00;
    public boolean A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 69);
            if (A03[6].length() != 31) {
                throw new RuntimeException();
            }
            A03[1] = "x5tPmx47tzICoGkmwmxxU8TFYjneGYu3";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{4, 2, 17, -56, -57, -53, -52};
    }

    static {
        A01();
    }

    EnumC5538RD(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public final String A02() {
        return toString();
    }

    public final boolean A03() {
        return this.A00;
    }

    public final boolean A04() {
        return this.A01;
    }
}