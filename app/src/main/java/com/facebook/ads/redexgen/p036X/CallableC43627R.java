package com.facebook.ads.redexgen.p036X;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.7R */
/* loaded from: assets/audience_network.dex */
public class CallableC43627R implements Callable<Boolean> {
    public static byte[] A02;
    public static String[] A03 = {"4L70rbdc", "PBHhMXx0npnpwTY", "91GJPzFmEyeOW3DYeKz29HPCrWXW0gNC", "umTRidE45okZulrVlJrHIV8", "kRbho3HgdeG0CdJ8rA209tRImftPXEnI", "60YY30c8MY", "ZuHjaYDngPTOcLYvMZdLe8TI8ruUn8GD", "lL0vcWHD5F"};
    public final C43617Q A00;
    public final /* synthetic */ C43657U A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{114, 126, 109, 116, 106, 111, 43, 52, 57, 56, 50};
        if (A03[1].length() != 15) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "XFV0lH04tD";
        strArr[5] = "8rdCtS3Igw";
    }

    static {
        A02();
    }

    public CallableC43627R(C43657U c43657u, C43617Q c43617q) {
        this.A01 = c43657u;
        this.A00 = c43617q;
    }

    private final Boolean A00() {
        String A01;
        C44148U c44148u;
        C44148U c44148u2;
        InterfaceC390600 A032;
        Map map;
        if (C5158L0.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                A01 = A01(0, 6, 63);
            } else {
                A01 = A01(6, 5, 125);
            }
            C391206 c391206 = new C391206(this.A00.A08, this.A00.A07, this.A00.A06, A01, this.A00.A02, this.A00.A05);
            c391206.A04 = this.A00.A03;
            c391206.A02 = this.A00.A01;
            c391206.A05 = this.A00.A04;
            c44148u = this.A01.A04;
            if (C43687X.A06(c44148u)) {
                map = C43657U.A0F;
                map.put(this.A00.A08, c391206);
            }
            c44148u2 = this.A01.A04;
            A032 = C43657U.A03(c44148u2.A00());
            return Boolean.valueOf(A032.AE8(c391206) != null);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (C5158L0.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            return null;
        }
    }
}
