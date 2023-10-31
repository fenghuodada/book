package com.facebook.ads.redexgen.p036X;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.HN */
/* loaded from: assets/audience_network.dex */
public final class C4938HN implements InterfaceC5543RI {
    public static byte[] A01;
    public static String[] A02 = {"pV4qaXw6VxHe7sBZO1Jm7", "tYmmDZR", "QxtgKachTN194eYcwGU9LkTJFmNVHEQq", "xizWbh8OYfs2b3YS4RQSAfdZXrf", "ZGXkvbP8ihMVuHVBPcyrpbYPgwlZhzIP", "8ikrsMyeeixNpMm9GyoBY2XQC58AAuyp", "5oOpXt9UGuRFEd", "RP1a17xo5hy9tsnm95xYo1Dg0S3kboh6"};
    public final boolean A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, 74, 110, 66, 67, 89, 72, 67, 89, 23, 13, 19, 36, 34, 36, 40, 55, 36, 97, 52, 51, 45, 123, 97, 12, 43, 62, 43, 42, 44, 101, Byte.MAX_VALUE};
    }

    static {
        A01();
    }

    public C4938HN(boolean z) {
        this.A00 = z;
    }

    private void A02(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                List<String> headers = map.get(str);
                for (String str2 : headers) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    String header = A00(1, 1, 79);
                    sb.append(header);
                    sb.append(str2);
                    sb.toString();
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5543RI
    public final boolean A8Z() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5543RI
    public final void A9E(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        String str = httpURLConnection.getRequestMethod() + A00(0, 1, 13) + httpURLConnection.getURL().toString();
        if (obj instanceof String) {
            String str2 = A00(2, 9, 18) + ((String) obj);
        }
        Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "GaHF5freueg6l7URhKCrm47FqBCtqYBi";
        strArr2[5] = "OrzNjk0gyiryng1un1TYaQe8BXJyjneo";
        A02(requestProperties);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5543RI
    public final void A9F(InterfaceC5526R1 interfaceC5526R1) {
        if (interfaceC5526R1 != null) {
            String str = A00(11, 13, 126) + interfaceC5526R1.getUrl();
            String str2 = A00(24, 8, 96) + interfaceC5526R1.A7a();
            A02(interfaceC5526R1.A6k());
        }
    }
}
