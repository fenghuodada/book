package com.applovin.mediation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.C0235r;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AppLovinUtils {
    private static final String DEFAULT_ZONE = "";

    /* loaded from: classes.dex */
    public static class ServerParameterKeys {
        public static final String SDK_KEY = "sdkKey";
        public static final String ZONE_ID = "zone_id";

        private ServerParameterKeys() {
        }
    }

    @Nullable
    public static AppLovinAdSize appLovinAdSizeFromAdMobAdSize(@NonNull Context context, @NonNull AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        AdSize adSize2 = AdSize.BANNER;
        arrayList.add(adSize2);
        AdSize adSize3 = AdSize.LEADERBOARD;
        arrayList.add(adSize3);
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSize2.equals(findClosestSize)) {
            return AppLovinAdSize.BANNER;
        }
        if (adSize3.equals(findClosestSize)) {
            return AppLovinAdSize.LEADER;
        }
        return null;
    }

    public static AdError getAdError(int i) {
        String m12816a = C0235r.m12816a("AppLovin error code ", i);
        if (i != -8) {
            if (i != -7) {
                if (i != -6) {
                    switch (i) {
                        case -1009:
                            m12816a = "NO_NETWORK";
                            break;
                        case -1001:
                            m12816a = "FETCH_AD_TIMEOUT";
                            break;
                        case AppLovinErrorCodes.INVALID_URL /* -900 */:
                            m12816a = "INVALID_URL";
                            break;
                        case AppLovinErrorCodes.INVALID_RESPONSE /* -800 */:
                            m12816a = "INVALID_RESPONSE";
                            break;
                        case AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO /* -600 */:
                            m12816a = "INCENTIVIZED_USER_CLOSED_VIDEO";
                            break;
                        case AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT /* -500 */:
                            m12816a = "INCENTIVIZED_SERVER_TIMEOUT";
                            break;
                        case AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR /* -400 */:
                            m12816a = "INCENTIVIZED_UNKNOWN_SERVER_ERROR";
                            break;
                        case AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED /* -300 */:
                            m12816a = "INCENTIVIZED_NO_AD_PRELOADED";
                            break;
                        case AppLovinErrorCodes.SDK_DISABLED /* -22 */:
                            m12816a = "SDK_DISABLED";
                            break;
                        case -1:
                            m12816a = "UNSPECIFIED_ERROR";
                            break;
                        case 204:
                            m12816a = "NO_FILL";
                            break;
                        default:
                            switch (i) {
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES /* -202 */:
                                    m12816a = "UNABLE_TO_PRECACHE_VIDEO_RESOURCES";
                                    break;
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES /* -201 */:
                                    m12816a = "UNABLE_TO_PRECACHE_IMAGE_RESOURCES";
                                    break;
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES /* -200 */:
                                    m12816a = "UNABLE_TO_PRECACHE_RESOURCES";
                                    break;
                            }
                    }
                } else {
                    m12816a = "UNABLE_TO_RENDER_AD";
                }
            } else {
                m12816a = "INVALID_ZONE";
            }
        } else {
            m12816a = "INVALID_AD_TOKEN";
        }
        return new AdError(i, C0552c.m12192b("AppLovin SDK returned a load failure callback with reason: ", m12816a), AppLovinMediationAdapter.ERROR_DOMAIN);
    }

    private static Bundle retrieveMetadata(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static AppLovinSdk retrieveSdk(Bundle bundle, Context context) {
        String string = bundle != null ? bundle.getString(ServerParameterKeys.SDK_KEY) : null;
        AppLovinSdkSettings sdkSettings = AppLovinMediationAdapter.getSdkSettings(context);
        AppLovinSdk appLovinSdk = !TextUtils.isEmpty(string) ? AppLovinSdk.getInstance(string, sdkSettings, context) : AppLovinSdk.getInstance(sdkSettings, context);
        appLovinSdk.setPluginVersion(BuildConfig.ADAPTER_VERSION);
        appLovinSdk.setMediationProvider(AppLovinMediationProvider.ADMOB);
        return appLovinSdk;
    }

    @Nullable
    public static String retrieveSdkKey(@NonNull Context context, @Nullable Bundle bundle) {
        Bundle retrieveMetadata;
        String string = bundle != null ? bundle.getString(ServerParameterKeys.SDK_KEY) : null;
        return (!TextUtils.isEmpty(string) || (retrieveMetadata = retrieveMetadata(context)) == null) ? string : retrieveMetadata.getString("applovin.sdk.key");
    }

    public static String retrieveZoneId(Bundle bundle) {
        return bundle.containsKey("zone_id") ? bundle.getString("zone_id") : "";
    }

    public static boolean shouldMuteAudio(Bundle bundle) {
        return bundle != null && bundle.getBoolean("mute_audio");
    }
}
