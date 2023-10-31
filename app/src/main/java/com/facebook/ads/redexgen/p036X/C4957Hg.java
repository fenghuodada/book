package com.facebook.ads.redexgen.p036X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Hg */
/* loaded from: assets/audience_network.dex */
public final class C4957Hg implements InterfaceC5527R2 {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public InterfaceC44448y A00;
    public Executor A01;
    public boolean A02;
    public C5532R7 A03;
    public final InterfaceC5537RC A04 = new C4975Hy();
    public final InterfaceC5542RH A05;
    public final InterfaceC5543RI A06;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{16, 18, 55, 58, 95, 55, 53, 74, 71, 14, 74, 72, 15, 76, 90, 93, 67, 15, 14, 71, 93, 14, 64, 65, 90, 14, 79, 14, 88, 79, 66, 71, 74, 14, 123, 124, 98, 14, 65, 72, 14, 94, 102, 106, 9, 30, 106, 119, 106, 28, 16, 98, 100, 16, 13, 16, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, Utf8.REPLACEMENT_BYTE, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, 13, 28, 31, 7, 26, 3, 72, 13, 26, 26, 7, 26, 34, 35, 49, 90, 79, 122, 107, 107, 119, 114, 120, 122, 111, 114, 116, 117, 52, 99, 54, 108, 108, 108, 54, 125, 116, 105, 118, 54, 110, 105, 119, 126, 117, 120, 116, Byte.MAX_VALUE, 126, Byte.MAX_VALUE, 32, 120, 115, 122, 105, 104, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, 108, 97, 39, 108, 97, 37, 24, 4, 4, 0, 94, 0, 2, 31, 8, 9, 56, 31, 3, 4, Byte.MAX_VALUE, 99, 99, 103, 57, 103, 101, 120, 111, 110, 71, 120, 101, 99, 52, Utf8.REPLACEMENT_BYTE, 46, 45, 53, 40, 49};
    }

    static {
        A0A();
        A09 = InterfaceC5527R2.class.getSimpleName();
    }

    public C4957Hg(C5532R7 c5532r7, InterfaceC44448y interfaceC44448y, Executor executor) {
        A0B();
        this.A03 = c5532r7;
        this.A06 = new C4938HN(c5532r7.A04());
        final InterfaceC5543RI interfaceC5543RI = this.A06;
        this.A05 = new AbstractC4972Hv(interfaceC5543RI) { // from class: com.facebook.ads.redexgen.X.4M
        };
        this.A01 = executor;
        this.A00 = interfaceC44448y;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.AD1(httpURLConnection);
            if (outputStream != null) {
                this.A05.AFk(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC5526R1 A01(AbstractC5539RE abstractC5539RE) throws C5540RF {
        InterfaceC5526R1 c4958Hh;
        String A072 = A07(220, 7, 7);
        HttpURLConnection httpURLConnection = null;
        InterfaceC5526R1 interfaceC5526R1 = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                boolean isE2E = C5193Lc.A04();
                HttpURLConnection A082 = A08(abstractC5539RE.A05(), isE2E ? A09() : null);
                A0H(A082, abstractC5539RE);
                A0G(A082, abstractC5539RE);
                boolean isE2E2 = this.A06.A8Z();
                if (isE2E2) {
                    this.A06.A9E(A082, abstractC5539RE.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean pinKeys = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (pinKeys || z)) {
                    try {
                        C5544RJ.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e) {
                        this.A00.A9I(A072, C44458z.A1y, new C444690(e));
                    } catch (Exception e2) {
                        this.A00.A9I(A072, C44458z.A1x, new C444690(e2));
                    }
                }
                if (A082.getDoOutput() && abstractC5539RE.A06() != null) {
                    A00(A082, abstractC5539RE.A06());
                }
                if (A082.getDoInput()) {
                    c4958Hh = A06(A082);
                } else {
                    c4958Hh = new C4958Hh(A082, null);
                }
                if (this.A06.A8Z()) {
                    this.A06.A9F(c4958Hh);
                }
                A082.disconnect();
                return c4958Hh;
            } catch (Exception e3) {
                try {
                    interfaceC5526R1 = A05(null);
                    if (interfaceC5526R1 == null || interfaceC5526R1.A7a() <= 0) {
                        throw new C5540RF(e3, interfaceC5526R1);
                    }
                    if (this.A06.A8Z()) {
                        this.A06.A9F(interfaceC5526R1);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return interfaceC5526R1;
                } catch (Exception unused) {
                    Log.e(getClass().getSimpleName(), A07(117, 13, 53), e3);
                    if (interfaceC5526R1 != null && interfaceC5526R1.A7a() > 0) {
                        if (this.A06.A8Z()) {
                            this.A06.A9F(interfaceC5526R1);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return interfaceC5526R1;
                    }
                    throw new C5540RF(e3, interfaceC5526R1);
                }
            }
        } catch (Throwable th) {
            if (this.A06.A8Z()) {
                this.A06.A9F(null);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Nullable
    private final InterfaceC5526R1 A02(AbstractC5539RE abstractC5539RE) {
        if (this.A03.A04()) {
            A0C(abstractC5539RE);
        }
        InterfaceC5526R1 interfaceC5526R1 = null;
        try {
            interfaceC5526R1 = A01(abstractC5539RE);
            return interfaceC5526R1;
        } catch (C5540RF e) {
            this.A05.AAl(e);
            return interfaceC5526R1;
        } catch (Exception e2) {
            this.A05.AAl(new C5540RF(e2, interfaceC5526R1));
            return interfaceC5526R1;
        }
    }

    @Nullable
    private final InterfaceC5526R1 A03(String str, C5541RG c5541rg, C5535RA c5535ra) {
        return A02(new C4963Hm(str, c5541rg, c5535ra));
    }

    @Nullable
    private final InterfaceC5526R1 A04(String str, String str2, byte[] bArr, C5535RA c5535ra) {
        return A02(new C4961Hk(str, null, str2, bArr, c5535ra));
    }

    private final InterfaceC5526R1 A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                bArr = this.A05.ADe(inputStream);
            }
            C4958Hh c4958Hh = new C4958Hh(httpURLConnection, bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c4958Hh;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC5526R1 A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            inputStream = this.A05.AD0(httpURLConnection);
            if (inputStream != null) {
                bArr = this.A05.ADe(inputStream);
            }
            C4958Hh c4958Hh = new C4958Hh(httpURLConnection, bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c4958Hh;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, @Nullable Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.ACz(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 45));
        String property2 = System.getProperty(A07(206, 14, 74));
        int i = -1;
        if (property2 != null) {
            try {
                i = Integer.parseInt(property2);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String portStr = strArr[0];
        String proxyAddress = strArr[2];
        if (portStr.charAt(28) != proxyAddress.charAt(28)) {
            String[] strArr2 = A08;
            strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
            strArr2[6] = "26yRDH09B";
            if (!isEmpty && i > 0 && i <= 65535) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i));
            }
            return proxy;
        }
        throw new RuntimeException();
    }

    public static synchronized void A0B() {
        synchronized (C4957Hg.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(AbstractC5539RE abstractC5539RE) {
        StringBuilder sb = new StringBuilder(A07(182, 10, 17));
        boolean equals = abstractC5539RE.A03().equals(EnumC5538RD.A06);
        String A072 = A07(41, 1, 33);
        if (equals && abstractC5539RE.A06() != null) {
            sb.append(A07(7, 5, 55));
            sb.append(new String(abstractC5539RE.A06(), Charset.forName(A07(130, 5, 42))));
            sb.append(A072);
        }
        Map<String, String> A06 = abstractC5539RE.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : A06.entrySet()) {
            sb.append(A07(2, 5, 74));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 118));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, 109));
        sb.append(abstractC5539RE.A05());
        sb.append(A072);
        String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / 4000) + 1);
    }

    private void A0D(AbstractC5539RE abstractC5539RE, InterfaceC5528R3 interfaceC5528R3) {
        this.A04.A5k(this, interfaceC5528R3, this.A01).A5H(abstractC5539RE);
        if (this.A03.A04()) {
            A0C(abstractC5539RE);
        }
    }

    private void A0E(String str, int i, int i2) {
        String str2 = A09 + A07(12, 6, 114) + i + A07(65, 1, 35) + i2;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i + 1, i2);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC5528R3 interfaceC5528R3, C5535RA c5535ra) {
        A0D(new C4961Hk(str, null, str2, bArr, c5535ra), interfaceC5528R3);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC5539RE abstractC5539RE) {
        Map<String, String> A06 = abstractC5539RE.A02().A06();
        InterfaceC5525R0 A05 = abstractC5539RE.A02().A05();
        for (String str : A06.keySet()) {
            String name = A06.get(str);
            httpURLConnection.setRequestProperty(str, name);
        }
        if (A05 != null) {
            Map<String, String> A5W = A05.A5W(this.A03.A03());
            for (String str2 : A5W.keySet()) {
                String value = A5W.get(str2);
                httpURLConnection.setRequestProperty(str2, value);
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC5539RE abstractC5539RE) throws IOException {
        C5535RA A02 = abstractC5539RE.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.ADI(httpURLConnection, abstractC5539RE.A03(), abstractC5539RE.A04());
    }

    private final boolean A0I(Throwable th, long j, AbstractC5539RE abstractC5539RE) {
        C5535RA A02 = abstractC5539RE.A02();
        long currentTimeMillis = (System.currentTimeMillis() - j) + 10;
        if (this.A06.A8Z()) {
            String str = A07(67, 15, 35) + currentTimeMillis + A07(42, 7, 23) + A02.A00() + A07(49, 7, 109) + A02.A02();
        }
        if (this.A02) {
            return currentTimeMillis >= ((long) A02.A02());
        }
        long A00 = A02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return currentTimeMillis >= A00;
    }

    public final InterfaceC5526R1 A0J(AbstractC5539RE abstractC5539RE) throws C5540RF {
        long j;
        long j2;
        long endTimeMillis;
        InterfaceC5526R1 A01;
        long startTime = System.currentTimeMillis();
        int A012 = abstractC5539RE.A02().A01();
        long A03 = abstractC5539RE.A02().A03();
        long currentTimeMillis = System.currentTimeMillis() + abstractC5539RE.A02().A04();
        for (int i = 0; i < A012; i++) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (A08[5].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "w7CndVwumsN";
            strArr[7] = "Wx3tR5uVNB4";
            if (currentTimeMillis <= currentTimeMillis2) {
                break;
            }
            try {
                if (this.A06.A8Z()) {
                    String str = (i + 1) + A07(37, 4, 115) + A012 + A07(56, 9, 70) + abstractC5539RE.A05();
                }
                startTime = System.currentTimeMillis();
            } catch (C5540RF e) {
                e = e;
                if (A08[4].length() == 10) {
                    throw new RuntimeException();
                }
                A08[5] = "aIX15CFtbyRTCgSwX4E1qAS9DeUF";
            }
            try {
                A01 = A01(abstractC5539RE);
            } catch (C5540RF e2) {
                e = e2;
                if (!A0I(e, startTime, abstractC5539RE) || i >= A012 - 1) {
                    boolean isRecoverable = this.A05.AAl(e);
                    if (isRecoverable && i < A012 - 1) {
                        long j3 = 0;
                        if (A03 > 0) {
                            try {
                                Thread.sleep(A03);
                            } catch (InterruptedException e3) {
                                InterfaceC44448y interfaceC44448y = this.A00;
                                long currentTimeMillis3 = System.currentTimeMillis() - startTime;
                                if (abstractC5539RE.A04 != null) {
                                    int numTries = abstractC5539RE.A04.length;
                                    j3 = numTries;
                                }
                                interfaceC44448y.A98(startTime, currentTimeMillis3, 0L, j3, 0, e3);
                                throw e;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        InterfaceC5526R1 A00 = e.A00();
                        InterfaceC44448y interfaceC44448y2 = this.A00;
                        long currentTimeMillis4 = System.currentTimeMillis() - startTime;
                        if (A00 == null || A00.A5o() == null) {
                            j2 = 0;
                        } else {
                            j2 = A00.A5o().length;
                        }
                        if (abstractC5539RE.A04 == null) {
                            endTimeMillis = 0;
                        } else {
                            int numTries2 = abstractC5539RE.A04.length;
                            endTimeMillis = numTries2;
                        }
                        long startTime2 = j2;
                        interfaceC44448y2.A98(startTime, currentTimeMillis4, startTime2, endTimeMillis, A00 == null ? 0 : A00.A7a(), e);
                        throw e;
                    }
                } else {
                    continue;
                }
            }
            if (A01 != null) {
                this.A00.A98(startTime, System.currentTimeMillis() - startTime, A01.A5o().length, abstractC5539RE.A04 == null ? 0L : abstractC5539RE.A04.length, A01.A7a(), null);
                return A01;
            }
            continue;
        }
        InterfaceC44448y interfaceC44448y3 = this.A00;
        long currentTimeMillis5 = System.currentTimeMillis() - startTime;
        if (abstractC5539RE.A04 == null) {
            j = 0;
        } else {
            int numTries3 = abstractC5539RE.A04.length;
            j = numTries3;
        }
        interfaceC44448y3.A98(startTime, currentTimeMillis5, 0L, j, 0, new TimeoutException(A07(82, 35, 27)));
        return null;
    }

    public final C5532R7 A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5527R2
    @Nullable
    @Deprecated
    public final InterfaceC5526R1 ADA(String str, Map<String, String> map) {
        return A03(str, new C5541RG(map), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5527R2
    @Nullable
    @Deprecated
    public final InterfaceC5526R1 ADB(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5527R2
    public final void ADC(String str, byte[] bArr, InterfaceC5528R3 interfaceC5528R3) {
        A0F(str, A07(135, 47, 70), bArr, interfaceC5528R3, this.A03.A00());
    }
}
