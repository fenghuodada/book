package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import java.util.Arrays;

@SuppressLint({"BadMethodUse-android.os.HandlerThread._Constructor", "BadMethodUse-java.lang.Thread.start"})
/* renamed from: com.facebook.ads.redexgen.X.7G */
/* loaded from: assets/audience_network.dex */
public final class C43517G {
    @Nullable
    public static C43517G A01;
    public static byte[] A02;
    public static String[] A03 = {"UJwQpjf1O", "S7UdxYvdt6eFqSzfuqfdhKkG5fTcE86n", "W78BPxXfK8rmPtex2UpgUOA4EPabdg1o", "Ih0sAmpXrxuJlQxxXXd37zEDxuSYzw7I", "Iygfnm9JTOPQLVxzgBxd3gVL6k52LPVL", "TprgYI", "hMidux", "2We8O"};
    public final HandlerThread A00 = new HandlerThread(A01(0, 17, 18), 10);

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{64, 70, 125, 74, 67, 76, 70, 78, 71, 80, 125, 86, 74, 80, 71, 67, 70};
        String[] strArr = A03;
        if (strArr[7].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[2] = "0nmMWQrUqPP9YK8fXSZAXpfkVfmXzLEd";
        strArr2[3] = "QQPULwNyBmE6z7ehguJldYqP934Toq3j";
    }

    static {
        A02();
        A01 = null;
    }

    public C43517G() {
        this.A00.start();
    }

    public static C43517G A00() {
        if (A01 == null) {
            A01 = new C43517G();
        }
        return A01;
    }

    public final HandlerThread A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.quit();
        A01 = null;
    }
}
