package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.RJ */
/* loaded from: assets/audience_network.dex */
public final class C5544RJ {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{4, 30, 0, 30, 3, 60, 39, 46, 66, 94, 11, 48, Utf8.REPLACEMENT_BYTE, 60, 50, 59, 126, 42, 49, 126, 56, 55, 48, 58, 126, 40, Utf8.REPLACEMENT_BYTE, 50, 55, 58, 126, 61, 59, 44, 42, 55, 56, 55, 61, Utf8.REPLACEMENT_BYTE, 42, 59, 126, 49, 44, 126, 46, 43, 60, 50, 55, 61, 126, 53, 59, 39, 112};
    }

    public static String A01(byte[] bArr, String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.reset();
        return Base64.encodeToString(messageDigest.digest(bArr), 0);
    }

    public static void A03(HttpsURLConnection httpsURLConnection, Set<String> set, Set<String> set2) throws Exception {
        Certificate[] serverCertificates;
        String certSha1 = A00(5, 5, 110);
        if (Build.VERSION.SDK_INT == 15) {
            if (A00(0, 5, 49).equals(Build.VERSION.RELEASE)) {
                return;
            }
        }
        try {
            for (Certificate cert : httpsURLConnection.getServerCertificates()) {
                X509Certificate x509Certificate = (X509Certificate) cert;
                String A01 = A01(x509Certificate.getEncoded(), certSha1);
                if (set == null || !set.contains(A01)) {
                    String A012 = A01(x509Certificate.getPublicKey().getEncoded(), certSha1);
                    if (set2 != null && set2.contains(A012)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new CertificateException(A00(10, 47, 95));
        } catch (Exception e) {
            throw e;
        }
    }
}
