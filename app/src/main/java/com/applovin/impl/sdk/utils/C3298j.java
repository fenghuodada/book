package com.applovin.impl.sdk.utils;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.p029ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p029ad.InterfaceC3087g;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.utils.j */
/* loaded from: classes.dex */
public class C3298j {
    /* renamed from: a */
    public static void m6988a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.32
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdViewEventListener.this.adOpenedFullscreen(C3298j.m6956b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6987a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView, final AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdViewEventListener.this.adFailedToDisplay(C3298j.m6956b(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6986a(final AppLovinNativeAdEventListener appLovinNativeAdEventListener, final AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.27
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AppLovinNativeAdEventListener.this.onNativeAdClicked(appLovinNativeAd);
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m6985a(final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, final int i) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.26
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AppLovinNativeAdLoadListener.this.onNativeAdLoadFailed(i);
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m6984a(MaxAdListener maxAdListener, MaxAd maxAd) {
        m6979a(maxAdListener, maxAd, false);
    }

    /* renamed from: a */
    public static void m6983a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        m6982a(maxAdListener, maxAd, maxError, false);
    }

    /* renamed from: a */
    public static void m6982a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxError maxError, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.14
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdDisplayFailed(maxAd, maxError);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to display", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6981a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        m6980a(maxAdListener, maxAd, maxReward, false);
    }

    /* renamed from: a */
    public static void m6980a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxReward maxReward, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.17
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxRewardedAdListener) MaxAdListener.this).onUserRewarded(maxAd, maxReward);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about user being rewarded", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6979a(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdLoaded(maxAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being loaded", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6978a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        m6977a(maxAdListener, str, maxError, false);
    }

    /* renamed from: a */
    public static void m6977a(final MaxAdListener maxAdListener, final String str, final MaxError maxError, boolean z) {
        if (str == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdLoadFailed(str, maxError);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to load", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6976a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        m6975a(maxAdRevenueListener, maxAd, false);
    }

    /* renamed from: a */
    public static void m6975a(final MaxAdRevenueListener maxAdRevenueListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdRevenueListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.13
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdRevenueListener.this.onAdRevenuePaid(maxAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad revenue being paid", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6974a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        m6973a(maxAdReviewListener, str, maxAd, false);
    }

    /* renamed from: a */
    public static void m6973a(final MaxAdReviewListener maxAdReviewListener, final String str, final MaxAd maxAd, boolean z) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.28
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MaxAdReviewListener.this.onCreativeIdGenerated(str, maxAd);
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m6972a(final MaxNativeAdListener maxNativeAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.22
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxNativeAdListener.this.onNativeAdClicked(maxAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad being clicked", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6971a(final MaxNativeAdListener maxNativeAdListener, final MaxNativeAdView maxNativeAdView, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.20
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxNativeAdListener.this.onNativeAdLoaded(maxNativeAdView, maxAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad being loaded", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6970a(final MaxNativeAdListener maxNativeAdListener, final String str, final MaxError maxError, boolean z) {
        if (str == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.21
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxNativeAdListener.this.onNativeAdLoadFailed(str, maxError);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad failing to load", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6968a(final AppLovinAdClickListener appLovinAdClickListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdClickListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.29
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdClickListener.this.adClicked(C3298j.m6956b(appLovinAd));
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6967a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdDisplayListener.this.adDisplayed(C3298j.m6956b(appLovinAd));
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6966a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final String str) {
        if (appLovinAdDisplayListener instanceof InterfaceC3087g) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.1
                @Override // java.lang.Runnable
                public void run() {
                    ((InterfaceC3087g) AppLovinAdDisplayListener.this).onAdDisplayFailed(str);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m6965a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final int i) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdRewardListener.this.validationRequestFailed(C3298j.m6956b(appLovinAd), i);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6964a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdRewardListener.this.userRewardVerified(C3298j.m6956b(appLovinAd), map);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6963a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.30
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdVideoPlaybackListener.this.videoPlaybackBegan(C3298j.m6956b(appLovinAd));
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6962a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd, final double d, final boolean z) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.31
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdVideoPlaybackListener.this.videoPlaybackEnded(C3298j.m6956b(appLovinAd), d, z);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m6961a(final AppLovinPostbackListener appLovinPostbackListener, final String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.24
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AppLovinPostbackListener.this.onPostbackSuccess(str);
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m6960a(final AppLovinPostbackListener appLovinPostbackListener, final String str, final int i) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.25
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AppLovinPostbackListener.this.onPostbackFailure(str, i);
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i + "):", th);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static AppLovinAd m6956b(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    /* renamed from: b */
    public static void m6959b(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.33
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdViewEventListener.this.adClosedFullscreen(C3298j.m6956b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public static void m6958b(MaxAdListener maxAdListener, MaxAd maxAd) {
        m6957b(maxAdListener, maxAd, false);
    }

    /* renamed from: b */
    public static void m6957b(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdDisplayed(maxAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public static void m6955b(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.23
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdDisplayListener.this.adHidden(C3298j.m6956b(appLovinAd));
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public static void m6954b(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdRewardListener.this.userOverQuota(C3298j.m6956b(appLovinAd), map);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public static void m6953c(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.34
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdViewEventListener.this.adLeftApplication(C3298j.m6956b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public static void m6952c(MaxAdListener maxAdListener, MaxAd maxAd) {
        m6951c(maxAdListener, maxAd, false);
    }

    /* renamed from: c */
    public static void m6951c(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdHidden(maxAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public static void m6950c(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.j.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdRewardListener.this.userRewardRejected(C3298j.m6956b(appLovinAd), map);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
                    }
                }
            }
        });
    }

    /* renamed from: d */
    public static void m6949d(MaxAdListener maxAdListener, MaxAd maxAd) {
        m6948d(maxAdListener, maxAd, false);
    }

    /* renamed from: d */
    public static void m6948d(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MaxAdListener.this.onAdClicked(maxAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                    }
                }
            }
        });
    }

    /* renamed from: e */
    public static void m6947e(MaxAdListener maxAdListener, MaxAd maxAd) {
        m6946e(maxAdListener, maxAd, false);
    }

    /* renamed from: e */
    public static void m6946e(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.15
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxRewardedAdListener) MaxAdListener.this).onRewardedVideoStarted(maxAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video starting", th);
                    }
                }
            }
        });
    }

    /* renamed from: f */
    public static void m6945f(MaxAdListener maxAdListener, MaxAd maxAd) {
        m6944f(maxAdListener, maxAd, false);
    }

    /* renamed from: f */
    public static void m6944f(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.16
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxRewardedAdListener) MaxAdListener.this).onRewardedVideoCompleted(maxAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video completing", th);
                    }
                }
            }
        });
    }

    /* renamed from: g */
    public static void m6943g(MaxAdListener maxAdListener, MaxAd maxAd) {
        m6942g(maxAdListener, maxAd, false);
    }

    /* renamed from: g */
    public static void m6942g(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.18
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxAdViewAdListener) MaxAdListener.this).onAdExpanded(maxAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being expanded", th);
                    }
                }
            }
        });
    }

    /* renamed from: h */
    public static void m6941h(MaxAdListener maxAdListener, MaxAd maxAd) {
        m6940h(maxAdListener, maxAd, false);
    }

    /* renamed from: h */
    public static void m6940h(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z, new Runnable() { // from class: com.applovin.impl.sdk.utils.j.19
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((MaxAdViewAdListener) MaxAdListener.this).onAdCollapsed(maxAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being collapsed", th);
                    }
                }
            }
        });
    }
}
