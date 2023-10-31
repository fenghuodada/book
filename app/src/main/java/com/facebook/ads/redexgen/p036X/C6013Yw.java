package com.facebook.ads.redexgen.p036X;

import android.content.pm.ActivityInfo;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yw */
/* loaded from: assets/audience_network.dex */
public class C6013Yw implements InterfaceC43306v {
    public static byte[] A01;
    public final /* synthetic */ C6012Yv A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Byte.MIN_VALUE, -28, -29, -43, -68, -57};
    }

    public C6013Yw(C6012Yv c6012Yv) {
        this.A00 = c6012Yv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        ActivityInfo[] activityInfoArr;
        ActivityInfo[] activityInfoArr2;
        ActivityInfo[] activityInfoArr3;
        ActivityInfo[] activityInfoArr4;
        activityInfoArr = this.A00.A04;
        if (activityInfoArr != null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                activityInfoArr2 = this.A00.A04;
                int i2 = activityInfoArr2.length;
                if (i < i2) {
                    activityInfoArr3 = this.A00.A04;
                    sb.append(activityInfoArr3[i].name);
                    activityInfoArr4 = this.A00.A04;
                    int i3 = activityInfoArr4.length;
                    if (i != i3 - 1) {
                        sb.append(A00(0, 1, 37));
                    }
                    i++;
                } else {
                    AbstractC43457A signalValueTypeDef = this.A00.A08(C43547J.A08(sb.toString().getBytes(A00(1, 5, 62)), EnumC43537I.A06));
                    return signalValueTypeDef;
                }
            }
        } else {
            return this.A00.A07(EnumC434176.A07);
        }
    }
}
