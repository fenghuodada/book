package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0p */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC39560p {
    public static byte[] A04;
    public static String[] A05 = {"OqcLT37Xtir4oyEfNmT1h4Rk4YkQZZDY", "Uwe5RI", "pL0dXLjcEL0YvPTfwlaTsWSX1DbaAkE5", "xtw7OOYBvYdKgcW8WzcZrKA0PDZy4bwg", "f918FI", "0rYE8aKdqB5alUcDRGHr7byWf0zxjLED", "HJdrWZ0hD1uhwEG", "W2AWehjS6wPr2mpVEIqcODXDVwSDQEbA"};
    public boolean A00;
    public final C5953Xy A01;
    public final AbstractC39570q A02;
    public final C5521Qw A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
            String[] strArr = A05;
            if (strArr[7].charAt(19) == strArr[3].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ralyQsFIfJjHchT6ijaCYOn7xcrh9SYP";
            strArr2[0] = "lf1tsTh5P7IODA8hmkOKCVUdKtrYifbk";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-126, -90, -87, -85, -98, -84, -84, -94, -88, -89, 89, -91, -88, -96, -96, -98, -99};
    }

    public abstract void A06(Map<String, String> map);

    static {
        A01();
    }

    public AbstractC39560p(C5953Xy c5953Xy, AbstractC39570q abstractC39570q, C5521Qw c5521Qw) {
        this.A01 = c5953Xy;
        this.A02 = abstractC39570q;
        this.A03 = c5521Qw;
    }

    public final void A02() {
        if (this.A00) {
            return;
        }
        AbstractC39570q abstractC39570q = this.A02;
        if (abstractC39570q != null) {
            abstractC39570q.A00();
        }
        A06(new C5356OG().A03(this.A03).A05());
        this.A00 = true;
        C5197Lg.A02(this.A01, A00(0, 17, 20));
        AbstractC39570q abstractC39570q2 = this.A02;
    }
}
