package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.6m */
/* loaded from: assets/audience_network.dex */
public class C43216m {
    public static byte[] A03;
    public static String[] A04 = {"o84FpHzEZxPfIbBPVc3PyJBEasuCfO6c", "JrI1dU8TTdtObirIwzr9PDFTf", "Oz2bxznKOZIoYiu00r0tMjRqahT5L8eX", "WyAMbI9dOM56rsavBzGbIzP4LEeOBa2a", "QAd1wzNDoH5I97BQWX3GR9O2v", "PJ66RTAVo3tttPzwttyvOY4w2twOeZmh", "FZtFZJQ3MyLobIqHR00oY", "wJgkVVpmtRvVSLM2dL7kjEoPPerdmE0p"};
    public final Context A00;
    public final Intent A01;
    public final C42856C A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-114, -101, -111, -97, -100, -106, -111, 91, -106, -101, -95, -110, -101, -95, 91, -114, -112, -95, -106, -100, -101, 91, 111, 110, -127, -127, 114, Byte.MAX_VALUE, -122, -116, 112, 117, 110, 123, 116, 114, 113};
    }

    static {
        A01();
    }

    public C43216m(Context context, C42856C c42856c) {
        this.A00 = context;
        this.A02 = c42856c;
        this.A01 = this.A00.registerReceiver(null, new IntentFilter(A00(0, 37, 37)));
    }

    @Nullable
    public final C434378 A02() {
        if (this.A02.A0a() == EnumC43346z.A0G) {
            return null;
        }
        Context context = this.A00;
        String[] strArr = A04;
        if (strArr[6].length() != strArr[1].length()) {
            A04[2] = "BdLEpYuR7vP7Yavjfaa4glVMZlrsrS6q";
            C434378 signalValueContext = new C434378(context == null ? A00(0, 0, 34) : context.getPackageName());
            return signalValueContext;
        }
        throw new RuntimeException();
    }

    public final AbstractC43457A A03(float f) {
        return new C5967YC(SystemClock.elapsedRealtime(), A02(), f);
    }

    public final AbstractC43457A A04(int i) {
        return new C5965YA(SystemClock.elapsedRealtime(), A02(), i);
    }

    public final AbstractC43457A A05(int i, HashMap<String, String> hashMap) {
        if (this.A01 != null) {
            HashMap<String, Integer> hashMap2 = new HashMap<>();
            for (String str : hashMap.keySet()) {
                String[] strArr = A04;
                if (strArr[7].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                A04[2] = "InQCvX9bMvCeYEwlTxFUxsBs8sRyWh3b";
                Intent intent = this.A01;
                String key = hashMap.get(str);
                hashMap2.put(str, Integer.valueOf(intent.getIntExtra(key, i)));
            }
            return A0C(hashMap2);
        }
        return A07(EnumC434176.A07);
    }

    public final AbstractC43457A A06(long j) {
        return new C5963Y8(SystemClock.elapsedRealtime(), A02(), j);
    }

    public final AbstractC43457A A07(EnumC434176 enumC434176) {
        return new C5968YD(SystemClock.elapsedRealtime(), A02(), new C434277(enumC434176));
    }

    public final AbstractC43457A A08(String str) {
        return new C5960Y5(SystemClock.elapsedRealtime(), A02(), str);
    }

    public final AbstractC43457A A09(String str) {
        Intent intent = this.A01;
        if (intent != null) {
            return A08(intent.getStringExtra(str));
        }
        return A07(EnumC434176.A07);
    }

    public final AbstractC43457A A0A(String str, int i) {
        Intent intent = this.A01;
        if (intent != null) {
            int intExtra = intent.getIntExtra(str, i);
            if (A04[4].length() != 16) {
                A04[2] = "oU3Fbet9HTJlYuGSJV9pu56iNwFexhrg";
                return A04(intExtra);
            }
            throw new RuntimeException();
        }
        return A07(EnumC434176.A07);
    }

    public final AbstractC43457A A0B(String str, boolean z) {
        Intent intent = this.A01;
        if (intent != null) {
            return A0F(intent.getBooleanExtra(str, z));
        }
        return A07(EnumC434176.A07);
    }

    public final AbstractC43457A A0C(HashMap<String, Integer> hashMap) {
        return new C5966YB(SystemClock.elapsedRealtime(), A02(), hashMap);
    }

    public final AbstractC43457A A0D(List<InterfaceC433671> list) {
        return new C5964Y9(SystemClock.elapsedRealtime(), A02(), list, EnumC434479.A03);
    }

    public final AbstractC43457A A0E(List<String> resultList) {
        return new C5964Y9(SystemClock.elapsedRealtime(), A02(), resultList, EnumC434479.A0C);
    }

    public final AbstractC43457A A0F(boolean z) {
        return new C5970YF(SystemClock.elapsedRealtime(), A02(), z);
    }
}
