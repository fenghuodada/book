package com.facebook.ads.redexgen.p036X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Lb */
/* loaded from: assets/audience_network.dex */
public final class C5192Lb {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{121, 123, 110, 111, -120, 119, 126, 118, -120, 106, 109, 124, -120, 119, 120, -120, 108, 113, 106, 114, 119, -71, -73, -55, -71, -73, -70, -69, -70, -75, -73, -70, -25, -6, -10, -12, -29, -31, -26, -29, -10, -29, -82, -81, -76, -70, -71, -58, -57, -58, -69, -64, -71, -63, -58, -67, -68, -73, -71, -68, -53, -8, -6};
    }

    public static int A00(C5953Xy c5953Xy, int i) {
        SharedPreferences sharedPreferences = C5151Kt.A00(c5953Xy);
        return sharedPreferences.getInt(A01(0, 21, 2), i);
    }

    @Nullable
    public static String A02(C5953Xy c5953Xy, @Nullable String str) {
        int A002 = A00(c5953Xy, -1);
        if (A002 == -1) {
            return null;
        }
        try {
            return new ExtraHints.Builder().extraData(A03(str, A01(47, 14, 49), Integer.valueOf(A002))).build().getHints();
        } catch (JSONException unused) {
            return null;
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static String A03(@Nullable String extraData, String str, Object obj) throws JSONException {
        String A01 = A01(61, 2, 86);
        if (extraData != null) {
            A01 = new JSONObject(extraData).getJSONObject(A01(42, 5, 31)).optString(A01(32, 10, 91), A01);
        }
        JSONObject jSONObject = new JSONObject(A01);
        jSONObject.put(str, obj);
        return jSONObject.toString();
    }

    public static boolean A05(@Nullable String str) throws JSONException {
        return str != null && new JSONObject(new JSONObject(str).getJSONObject(A01(42, 5, 31)).optString(A01(32, 10, 91), A01(61, 2, 86))).optBoolean(A01(21, 11, 47), false);
    }

    public final InterstitialAd A06(C5953Xy c5953Xy, String str, @Nullable String str2) {
        if (c5953Xy == null) {
            return null;
        }
        try {
            InterstitialAd interstitialAd = new InterstitialAd(c5953Xy, str);
            interstitialAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 47), true)).build());
            return interstitialAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final RewardedVideoAd A07(C5953Xy c5953Xy, String str, @Nullable String str2) {
        if (c5953Xy == null) {
            return null;
        }
        try {
            RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(c5953Xy, str);
            rewardedVideoAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 47), true)).build());
            return rewardedVideoAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void A08(C5953Xy c5953Xy, boolean z) {
        int i = 0;
        String A01 = A01(0, 21, 2);
        if (!z) {
            i = C5151Kt.A00(c5953Xy).getInt(A01, 0) + 1;
        }
        C5151Kt.A00(c5953Xy).edit().putInt(A01, i).apply();
    }

    public final boolean A09(C5953Xy c5953Xy, @Nullable String str, int i) {
        if (i <= 0) {
            return false;
        }
        try {
            if (!A05(str)) {
                return A00(c5953Xy, i + (-1)) >= i + (-1);
            }
        } catch (JSONException unused) {
        }
        return false;
    }
}
