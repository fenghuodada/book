package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7J */
/* loaded from: assets/audience_network.dex */
public final class C43547J {
    @Nullable
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"ezGqyoPIPKHN83WiKVVevBWkG3P1qDlE", "bHUhqeCZStL3hoLiFuX7aDXMTtUO4SRK", "6mH", "l35BhcLqTpkfPgrTHobWQpDf1vW4Njv0", "2S1uYpKXPbyDBdggYjHCHIIoGx5rp2pm", "U07LIPTAxvw3Yt20DQWphksDXSc1ydWN", "nWa8vBGdC70OTVh7jsXfRaHUkJPGOS0P", "NNhGFPrdPRblbbvf05CBiQrYmSBt33Cu"};

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{117, 96, 98, 40, 109, 86, 91, 74, 15, 110, 93, 93, 78, 86, 15, 70, 92, 15, 65, 90, 67, 67, 87, 81, 4, 2, 47};
    }

    static {
        A0A();
        A00 = null;
    }

    public static float A00(float f) {
        return new BigDecimal(f).setScale(3, RoundingMode.HALF_UP).floatValue();
    }

    public static long A01() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String[] strArr = A02;
        if (strArr[5].charAt(11) != strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "oi1AWXaprIq3DsGdE2VtVNFOHzfK44CR";
        strArr2[1] = "VDiC0kXnWwp3KFPy20II1epcnqCnwjCl";
        return elapsedRealtime;
    }

    public static long A02(long j) {
        return j - (j % 1048576);
    }

    @SuppressLint({"CatchGeneralException"})
    public static EnumC43316w A03(@Nullable String str) {
        JSONObject bdObject;
        String A06 = A06(24, 2, 121);
        if (str == null || str.isEmpty()) {
            return EnumC43316w.A04;
        }
        try {
            bdObject = new JSONObject(str).getJSONObject(A06(22, 2, 58));
        } catch (Throwable unused) {
        }
        if (bdObject == null) {
            return EnumC43316w.A04;
        }
        if (bdObject.has(A06)) {
            return EnumC43316w.A00(bdObject.getInt(A06));
        }
        return EnumC43316w.A04;
    }

    public static C5968YD A04(String str, Throwable th) {
        if (th instanceof NullPointerException) {
            return new C5968YD(A01(), new C434378(str), new C434277(EnumC434176.A07));
        }
        boolean z = th instanceof SecurityException;
        if (A02[3].charAt(27) != 'P') {
            A02[7] = "UmchuACFheILBJlaih7XmvNlXQtm6iWO";
            if (z) {
                return new C5968YD(A01(), new C434378(str), new C434277(EnumC434176.A06));
            }
            if (!(th instanceof UnsupportedOperationException)) {
                boolean z2 = th instanceof NoSuchAlgorithmException;
                if (A02[0].charAt(9) != 'T') {
                    A02[3] = "x60dR1TMPSfTuY8uuU5k4CgjQFfD2Ly1";
                    if (!z2) {
                        return new C5968YD(A01(), new C434378(str), new C434277(th));
                    }
                }
            }
            return new C5968YD(A01(), new C434378(str), new C434277(EnumC434176.A05));
        }
        throw new RuntimeException();
    }

    @SuppressLint({"BadMethodUse-java.util.UUID.randomUUID"})
    public static String A05() {
        if (A00 == null) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                A00 = UUID.randomUUID().toString();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return A00;
    }

    @Nullable
    @SuppressLint({"EmptyCatchBlock"})
    public static String A07(String str) {
        String A06 = A06(26, 1, 84);
        String str2 = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(A06)) {
                str2 = Integer.toString(jSONObject.getInt(A06));
                return str2;
            }
            return null;
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0015 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A08(byte[] r7, com.facebook.ads.redexgen.p036X.EnumC43537I r8) throws java.security.NoSuchAlgorithmException {
        /*
            if (r7 == 0) goto L3c
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            java.lang.String r0 = r8.A02()
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r5 = r0.digest(r7)
            r4 = 0
        L14:
            int r0 = r5.length
            if (r4 >= r0) goto L37
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r1 = 0
            r0 = r5[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r1] = r0
            r2 = 0
            r1 = 4
            r0 = 95
            java.lang.String r0 = A06(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r6.append(r0)
            int r4 = r4 + 1
            goto L14
        L37:
            java.lang.String r0 = r6.toString()
            return r0
        L3c:
            r2 = 4
            r1 = 18
            r0 = 32
            java.lang.String r1 = A06(r2, r1, r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C43547J.A08(byte[], com.facebook.ads.redexgen.X.7I):java.lang.String");
    }

    public static Map<String, String> A09(C42856C c42856c) {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC42936K.A04.A02(), A05());
        hashMap.put(EnumC42936K.A0A.A02(), Long.toString(TimeUnit.SECONDS.toMillis(c42856c.A0T())));
        hashMap.put(EnumC42936K.A06.A02(), Long.toString(C43326x.A00()));
        hashMap.put(EnumC42936K.A07.A02(), Integer.toString(c42856c.A0S()));
        hashMap.put(EnumC42936K.A09.A02(), Integer.toString(c42856c.A0V()));
        hashMap.put(EnumC42936K.A05.A02(), Integer.toString(c42856c.A0R()));
        hashMap.put(EnumC42936K.A08.A02(), A07(c42856c.A0h()));
        return hashMap;
    }

    public static void A0B(C42856C c42856c, String str, @Nullable String str2) {
        InterfaceC42946L A0X = c42856c.A0X();
        if (A0X == null) {
            return;
        }
        A0X.A9A(EnumC42916I.A05.A02(), str, A09(c42856c), str2, null, null, null);
    }

    public static boolean A0C() {
        int i = Build.VERSION.SDK_INT;
        if (A02[6].charAt(4) != 'v') {
            throw new RuntimeException();
        }
        A02[4] = "tyMFX1CpOJYUV0MeMpbopAmdAMzcot7c";
        return i >= 29;
    }

    public static boolean A0D() {
        ActivityManager.RunningAppProcessInfo appProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(appProcessInfo);
        return appProcessInfo.importance != 100;
    }

    public static boolean A0E(EnumC43316w enumC43316w) {
        int reputationTierValue = enumC43316w.A03();
        return reputationTierValue == EnumC43316w.A05.A03() || reputationTierValue == EnumC43316w.A07.A03() || reputationTierValue == EnumC43316w.A06.A03();
    }

    public static boolean A0F(@Nullable String str, @Nullable String str2) {
        if (str != null || str2 != null) {
            if (str == null || str2 == null) {
                return false;
            }
            return str.equals(str2);
        } else if (A02[2].length() != 3) {
            throw new RuntimeException();
        } else {
            String[] strArr = A02;
            strArr[5] = "CRUhUvJCPqF3o50vaOZhXgSSPBMouYyY";
            strArr[1] = "Hcx4PZUYJ7P3vk50CiSuOhi8dLkBnJKe";
            return true;
        }
    }
}
