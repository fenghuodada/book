package com.google.ads.mediation.adcolony;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adcolony.sdk.C2124h;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AdColonyAdapterUtils {
    public static final String KEY_ADCOLONY_BID_RESPONSE = "adm";
    public static final String KEY_APP_ID = "app_id";
    public static final String KEY_ZONE_ID = "zone_id";
    public static final String KEY_ZONE_IDS = "zone_ids";

    @Nullable
    public static C2124h adColonyAdSizeFromAdMobAdSize(@NonNull Context context, @NonNull AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        AdSize adSize2 = AdSize.BANNER;
        arrayList.add(adSize2);
        AdSize adSize3 = AdSize.LEADERBOARD;
        arrayList.add(adSize3);
        AdSize adSize4 = AdSize.MEDIUM_RECTANGLE;
        arrayList.add(adSize4);
        AdSize adSize5 = AdSize.WIDE_SKYSCRAPER;
        arrayList.add(adSize5);
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSize2.equals(findClosestSize)) {
            return C2124h.f5157d;
        }
        if (adSize4.equals(findClosestSize)) {
            return C2124h.f5156c;
        }
        if (adSize3.equals(findClosestSize)) {
            return C2124h.f5158e;
        }
        if (adSize5.equals(findClosestSize)) {
            return C2124h.f5159f;
        }
        return null;
    }

    public static int convertPixelsToDp(int i) {
        return (int) (i / Resources.getSystem().getDisplayMetrics().density);
    }
}
