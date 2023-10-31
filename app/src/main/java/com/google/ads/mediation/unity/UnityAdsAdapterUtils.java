package com.google.ads.mediation.unity;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class UnityAdsAdapterUtils {

    /* renamed from: com.google.ads.mediation.unity.UnityAdsAdapterUtils$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C63961 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$banners$BannerErrorCode;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[UnityAds.UnityAdsInitializationError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError = iArr3;
            try {
                iArr3[UnityAds.UnityAdsInitializationError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError[UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError[UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr4 = new int[BannerErrorCode.values().length];
            $SwitchMap$com$unity3d$services$banners$BannerErrorCode = iArr4;
            try {
                iArr4[BannerErrorCode.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[BannerErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum AdEvent {
        LOADED,
        OPENED,
        CLICKED,
        CLOSED,
        LEFT_APPLICATION,
        IMPRESSION,
        VIDEO_START,
        REWARD,
        VIDEO_COMPLETE
    }

    private UnityAdsAdapterUtils() {
    }

    @NonNull
    public static AdError createAdError(int i, @NonNull String str) {
        return new AdError(i, str, "com.unity3d.ads");
    }

    @NonNull
    public static AdError createSDKError(@NonNull UnityAds.UnityAdsInitializationError unityAdsInitializationError, @NonNull String str) {
        return createAdError(getMediationErrorCode(unityAdsInitializationError), str);
    }

    @NonNull
    public static AdError createSDKError(@NonNull UnityAds.UnityAdsLoadError unityAdsLoadError, @NonNull String str) {
        return createAdError(getMediationErrorCode(unityAdsLoadError), str);
    }

    @NonNull
    public static AdError createSDKError(@NonNull UnityAds.UnityAdsShowError unityAdsShowError, @NonNull String str) {
        return createAdError(getMediationErrorCode(unityAdsShowError), str);
    }

    public static int getMediationErrorCode(@NonNull UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        int i = C63961.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError[unityAdsInitializationError.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 300 : 303;
            }
            return 302;
        }
        return 301;
    }

    public static int getMediationErrorCode(@NonNull UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i = C63961.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return i != 5 ? 400 : 405;
                    }
                    return 404;
                }
                return 403;
            }
            return 402;
        }
        return 401;
    }

    public static int getMediationErrorCode(@NonNull UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (C63961.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[unityAdsShowError.ordinal()]) {
            case 1:
                return 501;
            case 2:
                return 502;
            case 3:
                return 503;
            case 4:
                return 504;
            case 5:
                return 505;
            case 6:
                return 506;
            case 7:
                return 507;
            default:
                return 500;
        }
    }

    public static int getMediationErrorCode(@NonNull BannerErrorInfo bannerErrorInfo) {
        int i = C63961.$SwitchMap$com$unity3d$services$banners$BannerErrorCode[bannerErrorInfo.errorCode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? 200 : 204;
                }
                return 203;
            }
            return 202;
        }
        return 201;
    }

    @Nullable
    public static UnityBannerSize getUnityBannerSize(@NonNull Context context, @NonNull AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdSize.BANNER);
        arrayList.add(AdSize.LEADERBOARD);
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize != null) {
            return new UnityBannerSize(findClosestSize.getWidth(), findClosestSize.getHeight());
        }
        return null;
    }
}
