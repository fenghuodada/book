package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.PD */
/* loaded from: assets/audience_network.dex */
public final class C5414PD {
    public static byte[] A00;
    public static String[] A01 = {"CXRchRuqobcH0303RF", "0PvsG2xJSmQLgGTcWH9EYe7sEgRs7pRt", "Ep2muPcKb5OPprn584rkOKVS7ZwPor7u", "ESdTFl6hgzo0PrNou", "ifIc3126Iu24LMQAqXU9MKX3mrrg1qWL", "gYyPZy3RrUjZ7", "cRp6DEQTFSLuVCLvwOm8", "Iag0U1Rq9Q0ZydVPffrz8fjunI2ky4CH"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 91);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-119, -68, -8, -14, -50, -16, -16, -14, -3, 1, -70, -33, -18, -5, -12, -14, 0, -46, -2, -3, 3, -12, -3, 3, -68, -37, -12, -3, -10, 3, -9, -17, 27, 26, 32, 17, 26, 32, -39, -2, 13, 26, 19, 17, -71, -75, -49, -32, -15, -13, -24, -32, -21, -97, -62, -18, -19, -13, -28, -19, -13, 9, 30, 9, 17, 20, 9, 10, 20, 13, -7, 16, 11, -4, 10, -50, -27, -32, -47, -33, -116, 4, 16, 5, 6, -15, -2, -2, -5, -2, 21, 28, 19, 19, -7, -24, -11, -18, -20};
    }

    static {
        A04();
    }

    @Nullable
    @RequiresApi(api = 21)
    public static WebResourceResponse A00(C5953Xy c5953Xy, WebResourceRequest webResourceRequest, Uri uri, String str, HashMap<String, String> hashMap) throws IOException {
        String A02;
        String A022 = A02(85, 5, 49);
        C5509Qk exoPlayerCacheManager = C5509Qk.A05(c5953Xy.A00());
        InterfaceC4954Hd dataSourceFactory = exoPlayerCacheManager.A0F(c5953Xy);
        C43657U.A0H(c5953Xy, uri.toString());
        try {
            C5415PE c5415pe = new C5415PE(c5953Xy.A00(), uri, dataSourceFactory);
            int available = c5415pe.available();
            if (available <= 0) {
                A05(c5953Xy, 1, new Pair[]{new Pair(A02(61, 9, 77), String.valueOf(available))});
                return null;
            }
            String A03 = A03(webResourceRequest.getRequestHeaders());
            if (A03 != null) {
                try {
                    C5413PC A012 = A01(A03);
                    if (!A012.A03) {
                        Pair[] pairArr = new Pair[1];
                        if (A012.A02 != null) {
                            A02 = A012.A02;
                        } else if (A01[2].charAt(11) != 'P') {
                            throw new RuntimeException();
                        } else {
                            A01[0] = "OMRpqA07uUbGIz9l3e";
                            A02 = A02(90, 4, 76);
                        }
                        pairArr[0] = new Pair(A02(94, 5, 44), A02);
                        A05(c5953Xy, 0, pairArr);
                        return null;
                    }
                    int i = A012.A01;
                    int rangeEnd = A012.A00 == -1 ? available - 1 : A012.A00;
                    A06(hashMap, available);
                    hashMap.put(A02(31, 13, 81), A02(75, 6, 17) + i + A02(1, 1, 52) + rangeEnd + A02(2, 1, 110) + available);
                    c5953Xy.A0D().A53();
                    return new WebResourceResponse(str, null, 206, A02(46, 15, 36), hashMap, c5415pe);
                } catch (NumberFormatException e) {
                    A05(c5953Xy, 3, new Pair[]{new Pair(A022, e.toString())});
                    return null;
                }
            }
            c5953Xy.A0D().A53();
            A06(hashMap, available);
            return new WebResourceResponse(str, null, 200, A02(44, 2, 15), hashMap, c5415pe);
        } catch (IOException e2) {
            A05(c5953Xy, 2, new Pair[]{new Pair(A022, e2.toString())});
            return null;
        }
    }

    @RequiresApi(api = 21)
    public static C5413PC A01(String str) {
        if (str == null) {
            C5413PC c5413pc = new C5413PC();
            c5413pc.A03 = false;
            c5413pc.A02 = null;
            return c5413pc;
        }
        String[] split = str.split(A02(3, 1, 90));
        if (split.length >= 2) {
            if (A02(70, 5, 60).equals(split[0].toLowerCase(Locale.US).trim())) {
                String[] ranges = split[1].trim().split(A02(0, 1, 2));
                if (ranges.length != 1) {
                    C5413PC c5413pc2 = new C5413PC();
                    c5413pc2.A03 = false;
                    c5413pc2.A02 = str;
                    return c5413pc2;
                }
                String[] split2 = split[1].trim().split(A02(1, 1, 52));
                C5413PC c5413pc3 = new C5413PC();
                c5413pc3.A03 = true;
                c5413pc3.A02 = str;
                c5413pc3.A01 = TextUtils.isEmpty(split2[0]) ? 0 : Integer.parseInt(split2[0]);
                if (split2.length > 1) {
                    c5413pc3.A00 = TextUtils.isEmpty(split2[1]) ? -1 : Integer.parseInt(split2[1]);
                } else {
                    c5413pc3.A00 = -1;
                }
                return c5413pc3;
            }
        }
        C5413PC c5413pc4 = new C5413PC();
        c5413pc4.A03 = false;
        c5413pc4.A02 = str;
        return c5413pc4;
    }

    @Nullable
    public static String A03(Map<String, String> map) {
        for (String str : map.keySet()) {
            String lowerCase = str.toLowerCase(Locale.US);
            String header = A02(94, 5, 44);
            if (header.equals(lowerCase)) {
                String header2 = map.get(str);
                return header2;
            }
        }
        return null;
    }

    public static void A05(C5953Xy c5953Xy, int i, Pair<String, String>[] pairArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(81, 4, 70), i);
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        c5953Xy.A0D().A52(jSONObject.toString());
    }

    public static void A06(HashMap<String, String> hashMap, int i) {
        hashMap.put(A02(4, 13, 50), A02(70, 5, 60));
        hashMap.put(A02(17, 14, 52), String.valueOf(i));
    }
}
