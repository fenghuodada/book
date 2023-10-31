package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.concurrent.futures.C0484a;
import com.facebook.ads.BuildConfig;

@Keep
/* loaded from: classes.dex */
public class BuildConfigApi {
    static final String UNITY_SHARED_PREFERENCES_SUFIX = ".v2.playerprefs";
    static final String UNITY_TAG = "an_isUnitySDK";
    static final String UNITY_VERSION_SUFIX = "-unity";

    public static String getVersionName(Context context) {
        if (isUnity(context)) {
            return C0484a.m12392a(new StringBuilder(), BuildConfig.VERSION_NAME, UNITY_VERSION_SUFIX);
        }
        return BuildConfig.VERSION_NAME;
    }

    public static boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    private static boolean isUnity(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(UNITY_SHARED_PREFERENCES_SUFIX);
        return context.getSharedPreferences(sb.toString(), 0).contains(UNITY_TAG) || context.getSharedPreferences(context.getPackageName(), 0).contains(UNITY_TAG);
    }
}
